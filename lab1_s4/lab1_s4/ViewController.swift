//
//  ViewController.swift
//  lab1_s4
//
//  Created by Student on 10/05/2025.
//

import UIKit
import AVFoundation

class ViewController: UIViewController {
    
    /*@IBOutlet weak var label: UILabel!
    
    @IBOutlet weak var text1: UITextField!
    @IBOutlet weak var text2: UITextField!
    
        
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    @IBAction func compare(_ sender: UIButton){
        let string1 = text1.text ?? " "
        let string2 = text2.text ?? " "
        
        let message = (string1 == string2) ? "Stringi takie same" : "Stringi rozne"
        
        let alert = UIAlertController(title: "Zielone pojecie", message: message, preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "OK", style: .default, handler: nil))
        
        present(alert, animated: true, completion: nil)
    }
    
    @IBAction func resignKeyb(_ sender: UITextField){
        sender.resignFirstResponder()
    }*/

   
    
        @IBOutlet weak var targetLabel: UILabel!
        @IBOutlet weak var roundLabel: UILabel!
        @IBOutlet weak var scoreLabel: UILabel!
        @IBOutlet weak var slider: UISlider!
        
        var targetValue = 0
        var currentRound = 1
        var totalScore = 0
        
        override func viewDidLoad() {
            super.viewDidLoad()
            startNewGame()
        }

        func startNewGame() {
            totalScore = 0
            currentRound = 1
            startNewRound()
        }
        
        func startNewRound() {
            targetValue = Int.random(in: 1...100)
            targetLabel.text = "\(targetValue)"
            roundLabel.text = "\(currentRound)"
            scoreLabel.text = "\(totalScore)"
            slider.value = 50 // wartość początkowa
        }

        @IBAction func checkButtonTapped(_ sender: UIButton) {
            let guess = Int(slider.value.rounded())
            let difference = abs(targetValue - guess)
            let points = 100 - difference
            totalScore += points
            
            if points>95{
                playSound2()
            }
            
            let alert = UIAlertController(title: "Wynik", message: "Uzyskałeś \(points) punktów!", preferredStyle: .alert)
            
            let playAction = UIAlertAction(title: "Graj", style: .default) { _ in
                self.currentRound += 1
                if self.currentRound > 10 {
                    self.showGameOver()
                } else {
                    self.startNewRound()
                }
            }
            
            alert.addAction(playAction)
            present(alert, animated: true)
        }
    
    @IBAction func infoButton(_ sender: UIButton){
        let alert2 = UIAlertController(title: "Prawa do gry", message: "Prawa do gry zastrzezone! Tworcy Kamil Mazur i Rafal Grabowski", preferredStyle: .alert)
        
        let action = UIAlertAction(title: "OK", style: .default, handler: nil)
        
        alert2.addAction(action)
        present(alert2, animated: true, completion: nil)
    }
        
        func showGameOver() {
            let alert = UIAlertController(title: "GAME OVER", message: "Zdobyłeś \(totalScore) punktów!", preferredStyle: .alert)
            let restartAction = UIAlertAction(title: "Graj ponownie", style: .default) { _ in
                self.startNewGame()
            }
            if totalScore>700{
                playSound3()
            }
            alert.addAction(restartAction)
            present(alert, animated: true)
        }
        
        @IBAction func restartButtonTapped(_ sender: UIButton) {
            playSound()
            startNewGame()
            
        }
    
    let sound = Bundle.main.url(forResource: "restart", withExtension: "mp3")
    var audioPlayer = AVAudioPlayer()
    
    func playSound() {
                
        do {
            audioPlayer = try AVAudioPlayer(contentsOf: sound!)
            audioPlayer.play()
        } catch {
            print("Błąd podczas odtwarzania dźwięku: \(error)")
        }
    }
    
    let sound2 = Bundle.main.url(forResource: "nice_shot", withExtension: "mp3")
    var audioPlayer2 = AVAudioPlayer()
    
    func playSound2() {
                
        do {
            audioPlayer2 = try AVAudioPlayer(contentsOf: sound2!)
            audioPlayer2.play()
        } catch {
            print("Błąd podczas odtwarzania dźwięku: \(error)")
        }
    }
    
    let sound3 = Bundle.main.url(forResource: "win", withExtension: "mp3")
    var audioPlayer3 = AVAudioPlayer()
    
    func playSound3() {
                
        do {
            audioPlayer3 = try AVAudioPlayer(contentsOf: sound3!)
            audioPlayer3.play()
        } catch {
            print("Błąd podczas odtwarzania dźwięku: \(error)")
        }
    }

    
    
    
    
    }

    
    
    
    
    


