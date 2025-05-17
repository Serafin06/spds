//
//  ViewController.swift
//  lab2_sekcjaX
//
//  Created by MM on 21/11/2022.
//

import UIKit
import AVFAudio

class ViewController: UIViewController, myProt{
    
    
    func smileToSend(smile: Float) {
        face.x = CGFloat(smile)
        face.setNeedsDisplay()
        dismiss(animated: true, completion: nil)
    }
    

    @IBOutlet weak var face: FaceView!
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        face.setNeedsDisplay()
        // Do any additional setup after loading the view, typically from a nib.
        //becomeFirstResponder()
    }
    
    @IBAction func returnV(_ segue: UIStoryboardSegue){
        let sourceView = segue.source as! ViewController2
        
        face.redColour = sourceView.redB.value
        face.greenColour = sourceView.greenB.value
        face.blueColour = sourceView.blueB.value
        
        face.setNeedsDisplay()
        
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "toView2"{
            let destView = segue.destination as! ViewController2
            
            destView.red = face.redColour
            destView.green = face.greenColour
            destView.blue = face.blueColour            
            
            
        }else if segue.identifier == "toView3"{
            let destView3 = segue.destination as! ViewController3
            destView3.delegate = self
            destView3.s = Float(face.x)
            
        }
                
    }
    
    @IBAction func returnV3(_ segue: UIStoryboardSegue){
        let sourceView = segue.source as! ViewController3
        face.x = CGFloat(sourceView.happyS.value)
                
        face.setNeedsDisplay()
        
    }
    
    override func becomeFirstResponder() -> Bool {
        return true
    }
    override func motionEnded(_ motion: UIEvent.EventSubtype, with event: UIEvent?) {
        face.blueC = Float.random(in: 0.0...1.0)
        face.greenC = Float.random(in: 0.0...1.0)
        face.redC = Float.random(in: 0.0...1.0)
                
        face.blueCo = Float.random(in: 0.0...1.0)
        face.greenCo = Float.random(in: 0.0...1.0)
        face.redCo = Float.random(in: 0.0...1.0)
        face.setNeedsDisplay()
                
    }
    
   
    
}
