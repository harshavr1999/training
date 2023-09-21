/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.bridge;

/**
 *
 * @author harshavardhan.reddy
 */
public class BridgePatternTester {
    public static void main(String[] args) {
        Shape traingleRef = new Triangle(new RedColor());
        traingleRef.applyColor();
        Shape circleRef = new Circle(new BlueColor());
        circleRef.applyColor();
    }
}
