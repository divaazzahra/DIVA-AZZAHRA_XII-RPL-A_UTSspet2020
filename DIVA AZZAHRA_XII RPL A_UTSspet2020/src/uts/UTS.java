/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author HP
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Huruf ="ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
            int y=11;
            int z[]={3,8,21,0,27,0,25,25,0,7,17,0};
            
            for (int i= 0 ; i<=y ; i++){
                System.out.print(Huruf.charAt(z[i]));
            }
           
        }
    }
    
