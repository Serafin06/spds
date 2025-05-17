//
//  ViewController2.swift
//  lab2_sekcjaX
//
//  Created by Student on 17/05/2025.
//

import UIKit

class ViewController2: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        redB.value = red
        greenB.value = green
        blueB.value = blue
    }
    
     
    @IBOutlet weak var redB: UISlider!
    
    @IBOutlet weak var greenB: UISlider!
    
    @IBOutlet weak var blueB: UISlider!
    
    var red:Float = 0.0
    var green:Float = 0.0
    var blue:Float = 0.0
    
       

}
