/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.composite;

/**
 *
 * @author harshavardhan.reddy
 */
public class CompositePatternTester {
    public static void main(String[] args) {
        Shape traingleShape1 = new Traingle();
        Shape traingleShape2 = new Traingle();
        
        Shape circleShape1 = new Circle();
        Shape circleShape2 = new Circle();
        
        Drawing drawingRef = new Drawing();
        drawingRef.add(traingleShape1);
        drawingRef.add(traingleShape2);
        drawingRef.add(circleShape1);
        drawingRef.add(circleShape2);
        
        drawingRef.draw("Blue");
        
        drawingRef.clear();
        
        drawingRef.add(traingleShape1);
        drawingRef.add(traingleShape2);
        drawingRef.add(circleShape1);
        drawingRef.add(circleShape2);
        
        drawingRef.draw("Green");
        
        
    }
}
