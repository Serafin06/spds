//
//  FaceView.swift
//  lab2_sekcjaX
//
//  Created by MM on 21/11/2022.
//

import UIKit

class FaceView: UIView {
    
    var redColour:Float = 0.12
    var greenColour:Float = 0.12
    var blueColour:Float = 1.0
    
    var x:CGFloat = 100.0
    
    var redC:Float = 0
    var greenC:Float = 0
    var blueC:Float = 0
    
    var redCo:Float = 0
    var greenCo:Float = 0
    var blueCo:Float = 0
    
    

     
    override func draw(_ rect: CGRect) {
        // Drawing code
        let bounds:CGRect = self.bounds
        
        var midPoint=CGPoint() // center of our bounds in our coordinate system
        midPoint.x = bounds.origin.x + bounds.size.width/2
        midPoint.y = bounds.origin.y + bounds.size.height/2
        
     
        var point1=CGPoint()
        point1.x = midPoint.x
        point1.y = midPoint.y
        
        var point2=CGPoint()
        point2.x = midPoint.x + bounds.size.width/8
        point2.y = midPoint.y - bounds.size.height/8
        
        var point3=CGPoint()
        point3.x = midPoint.x - bounds.size.width/8
        point3.y = midPoint.y - bounds.size.height/8
        
                
        var point4=CGPoint()
        point4.x = midPoint.x - bounds.size.width/6
        point4.y = midPoint.y + bounds.size.height/10
        
        var point5=CGPoint()
        point5.x = midPoint.x + bounds.size.width/6
        point5.y = midPoint.y + bounds.size.height/10
        
        var point6=CGPoint()
        point6.x = midPoint.x
        point6.y = midPoint.y + x
      
        
        
        
        
        let path:UIBezierPath=UIBezierPath()
        path.addArc(withCenter: point1, radius: 110, startAngle: 0, endAngle: CGFloat(2 * Double.pi), clockwise: true)
        path.lineWidth=10
        let color = UIColor(red:CGFloat(redColour), green:CGFloat(greenColour), blue: CGFloat(blueColour), alpha: alpha)
        color.setFill()
        path.stroke()
        path.fill()

        
        let path1:UIBezierPath=UIBezierPath()
        path1.addArc(withCenter: point2, radius: 15, startAngle: 0, endAngle: CGFloat(2 * Double.pi), clockwise: true)
        let color2 = UIColor(red:CGFloat(redC), green:CGFloat(greenC), blue: CGFloat(blueC), alpha: alpha)
        color2.setFill()
        path1.lineWidth=5
        path1.stroke()
        path1.fill()
        
        let path2:UIBezierPath=UIBezierPath()
        path2.addArc(withCenter: point3, radius: 15, startAngle: 0, endAngle: CGFloat(2 * Double.pi), clockwise: true)
        let color3 = UIColor(red:CGFloat(redCo), green:CGFloat(greenCo), blue: CGFloat(blueCo), alpha: alpha)
        color3.setFill()
        path2.lineWidth=5
        path2.stroke()
        path2.fill()
        
        let path3:UIBezierPath=UIBezierPath()
        path3.move(to: point4)
        path3.addQuadCurve(to: point5, controlPoint: point6)
        path3.lineWidth=8
        path3.stroke()
        
  
    }
    

}
