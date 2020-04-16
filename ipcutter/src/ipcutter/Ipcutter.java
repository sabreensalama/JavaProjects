/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipcutter;

import java.util.StringTokenizer;

/**
 *
 * @author hp
 */
public class Ipcutter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringTokenizer st=new StringTokenizer(args[0], ".");
        while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
 
    }
    
}
