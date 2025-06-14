//
//  ViewController.swift
//  lab4_s4
//
//  Created by Student on 14/06/2025.
//

import UIKit

class ViewController: UIViewController {
      
       @IBOutlet weak var counterLabel: UILabel!
        
        var timer = Timer()
        var counter = 0

        override func viewDidLoad() {
            super.viewDidLoad()
            
            counterLabel.text = "0"
            
            
            let singleTap = UITapGestureRecognizer(target: self, action: #selector(handleSingleTap))
            singleTap.numberOfTouchesRequired = 1
            view.addGestureRecognizer(singleTap)

            let doubleTap = UITapGestureRecognizer(target: self, action: #selector(handleDoubleFingerTap))
            doubleTap.numberOfTouchesRequired = 2
            view.addGestureRecognizer(doubleTap)

            let swipeRight = UISwipeGestureRecognizer(target: self, action: #selector(handleSwipeRight))
            swipeRight.direction = .right
            view.addGestureRecognizer(swipeRight)
        }

        @objc func handleSingleTap() {
            if !timer.isValid {
                timer = Timer.scheduledTimer(timeInterval: 1,
                                             target: self,
                                             selector: #selector(updateCounter),
                                             userInfo: nil,
                                             repeats: true)
            }
        }

        @objc func handleDoubleFingerTap() {
            timer.invalidate()
        }

        @objc func handleSwipeRight() {
            timer.invalidate()
            counter = 0
            counterLabel.text = "0"
        }

        @objc func updateCounter() {
            counter += 1
            counterLabel.text = "\(counter)"
        }

}

