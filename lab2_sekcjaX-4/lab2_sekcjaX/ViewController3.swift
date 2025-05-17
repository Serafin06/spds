//
//  ViewController3.swift
//  lab2_sekcjaX
//
//  Created by Student on 17/05/2025.
//

import UIKit

protocol myProt{
    func smileToSend(smile: Float)
}

class ViewController3: UIViewController{
    
    var delegate : myProt?
    
    var s:Float = 100.0
    

    override func viewDidLoad() {
        super.viewDidLoad()
        happyS.value = s
            
        
    }
    
    
    @IBOutlet weak var happyS: UISlider!
    
    @IBAction func back(_ sender: UIButton) {
        
        delegate?.smileToSend(smile: happyS.value)
        
    }
    
  

}
