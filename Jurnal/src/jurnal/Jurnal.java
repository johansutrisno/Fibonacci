/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int first = 0;
        int last = 1;
        int x;
        
        System.out.println("Input :");
        x = in.nextInt();
        
        System.out.println("Output:");
        if (x > 0) {
            int sum=0;
            for (int i = 0; i < x; i++) {
//                System.out.print(last + " ");
                int temp = last;
                last += first;
                first = temp;
//                sum = last + temp;
            }
//            System.out.println(sum-1);
            
            for (int i = 0; i < x; i++) {
                int temp = first;
                first = last - temp;
                last = temp;
                System.out.print(last + " ");
            }
        }
    }
    
}
