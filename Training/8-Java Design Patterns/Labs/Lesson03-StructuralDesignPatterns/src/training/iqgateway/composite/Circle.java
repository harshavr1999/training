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
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a Circle with "+fillColor);
    }
    
}
