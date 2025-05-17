//
//  ViewController2.swift
//  lab3_s4
//
//  Created by Student on 17/05/2025.
//

import UIKit

class ViewController2: UIViewController, UIImagePickerControllerDelegate, UINavigationControllerDelegate, UIGestureRecognizerDelegate {

    override func viewDidLoad() {
        super.viewDidLoad()
        
    }
  
    
    @IBOutlet weak var imagePick: UIImageView!
    var newPhoto = false
    
    @IBAction func openCameraSender(_ sender: Any) {
        if UIImagePickerController.isSourceTypeAvailable(.camera) {
        let imagePicker = UIImagePickerController()
        imagePicker.delegate = self
        imagePicker.sourceType = .camera
            imagePicker.cameraDevice = .rear
        imagePicker.allowsEditing = false
        self.present(imagePicker, animated: true, completion: nil)
        newPhoto = true
        }
    }
    
    @IBAction func openGaleria(_ sender: Any) {
        if UIImagePickerController.isSourceTypeAvailable(.photoLibrary) {
        let imagePicker = UIImagePickerController()
        imagePicker.delegate = self
        imagePicker.sourceType = .photoLibrary
        imagePicker.allowsEditing = false
        self.present(imagePicker, animated: true, completion: nil)
        }
    }
    
    func imagePickerController(_ picker: UIImagePickerController, didFinishPickingMediaWithInfo info: [UIImagePickerController.InfoKey : Any]) {
    let image = info[UIImagePickerController.InfoKey.originalImage] as! UIImage
    imagePick.image = image
    dismiss(animated:true, completion: nil)
    
    if (newPhoto == true) {
    UIImageWriteToSavedPhotosAlbum(image, nil, nil, nil)
    newPhoto = false
    }
    }
    
    @IBAction func handlePinch(recognizer : UIPinchGestureRecognizer)
    {
        recognizer.view!.transform =
    recognizer.view!.transform.scaledBy(
    x: recognizer.scale, y: recognizer.scale)
    recognizer.scale = 1
    }
    
    @IBAction func handleRotate(recognizer :
    UIRotationGestureRecognizer) {
    recognizer.view!.transform =
    recognizer.view!.transform.rotated(by: recognizer.rotation)
    recognizer.rotation = 0
    }
    
    func gestureRecognizer(_ gestureRecognizer:
    UIGestureRecognizer, shouldRecognizeSimultaneouslyWith
    otherGestureRecognizer: UIGestureRecognizer) -> Bool {
    return true
    }
    
}
