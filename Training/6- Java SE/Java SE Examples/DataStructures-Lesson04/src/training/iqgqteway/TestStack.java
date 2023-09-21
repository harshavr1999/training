/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgqteway;

import java.util.*;

/**
 *
 * @author harshavardhan.reddy
 */
public class TestStack {
    
    public static void main(String[] args) {
        
        Deque<String> stack = new ArrayDeque<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        
        int size = stack.size()-1;
        while(size>=0){
            System.out.println(stack.pop());
            size--;
        }
    }
}
