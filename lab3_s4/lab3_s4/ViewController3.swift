import UIKit
import AVFoundation

class ViewController3: UIViewController, UIPickerViewDelegate, UIPickerViewDataSource {

    @IBOutlet weak var customPicker: UIPickerView!
    @IBOutlet weak var speedSegment: UISegmentedControl!
    @IBOutlet weak var pitchSegment: UISegmentedControl!

    var pickerDataSource = ["Song 1", "Song 2", "Song 3", "Song 4", "Song 5"]

    let engine = AVAudioEngine()
    let player = AVAudioPlayerNode()
    let speedControl = AVAudioUnitVarispeed()
    let pitchControl = AVAudioUnitTimePitch()
    var audioFile: AVAudioFile?

    override func viewDidLoad() {
        super.viewDidLoad()

        customPicker.delegate = self
        customPicker.dataSource = self

        speedSegment.selectedSegmentIndex = 2
        pitchSegment.selectedSegmentIndex = 2

        setupAudioEngine()
    }

    func setupAudioEngine() {
        engine.attach(player)
        engine.attach(speedControl)
        engine.attach(pitchControl)

        engine.connect(player, to: speedControl, format: nil)
        engine.connect(speedControl, to: pitchControl, format: nil)
        engine.connect(pitchControl, to: engine.mainMixerNode, format: nil)

        do {
            try engine.start()
        } catch {
            print("Audio engine failed to start: \(error.localizedDescription)")
        }
    }

    
    func numberOfComponents(in pickerView: UIPickerView) -> Int { return 1 }

    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return pickerDataSource.count
    }

    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
        return pickerDataSource[row]
    }

    // MARK: Play button
    @IBAction func keyPressed(_ sender: Any) {
        player.stop()

        let selectedRow = customPicker.selectedRow(inComponent: 0)
        let songName = pickerDataSource[selectedRow]

        guard let url = Bundle.main.url(forResource: songName, withExtension: "mp3") else {
            print("File not found: \(songName).mp3")
            return
        }

        do {
            audioFile = try AVAudioFile(forReading: url)
        } catch {
            print("Failed to load audio file: \(error)")
            return
        }

        
        let speedValues: [Float] = [0.5, 0.75, 1.0, 1.5, 2]
        speedControl.rate = speedValues[speedSegment.selectedSegmentIndex]

        let pitchValues: [Float] = [-400, -200, 0, 200, 400]
        pitchControl.pitch = pitchValues[pitchSegment.selectedSegmentIndex]

        if let file = audioFile {
            player.scheduleFile(file, at: nil)
            player.play()
        }
    }
}
