/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway;

/**
 *
 * @author Sai Baba
 */
public class RecursiveBubbleSort 
{
    public static void bubbleSort(int[] a,int n)
    {
        boolean sorted=true;
      //we are assuming that array is sorted
         
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                 
                sorted=false;
              //now array is not sorted
            }
          //if there are no swaps then we can
          //say that array is sorted.
             
        }
        if(sorted==false)
        {
            //recursively calling until it was sorted.
            bubbleSort(a,n);
        }
    }
    
    public static void main(String[] args) {
         
        int[] ar={5,4,8,2,9,7,3};
        bubbleSort(ar,ar.length);
         
        System.out.print("Sorted array : ");
        for(int ele:ar)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
         
    }
}
    

