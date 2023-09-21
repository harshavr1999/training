/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgqteway;

/**
 *
 * @author harshavardhan.reddy
 */

import java.io.*;
public class ArrayQueue {
    
    static class Queue{
        int front, rear, size;
        int cap;
        int arr[];
        
    }
    
    Queue createQueue(int cap){
        Queue queue = new Queue();
        queue.cap = cap;
        queue.front=0;
        queue.size=0;
        queue.rear=cap-1;
        queue.arr=new int[queue.cap];
        return queue;
    }
    
}
