/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;

/**
 *
 * @author khafi
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        for (int i = 1; i <= n; i++){
            for (int j = n; j > i; j--){
                System.out.print("");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println("");
        }
        System.out.print("");
        System.out.println("Line : " + n);
    }
    
}
