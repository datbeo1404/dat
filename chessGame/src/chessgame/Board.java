/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

public class Board {

    public void Board(String [] arg){
        int num = 8;
        
        for(int k = 0; k < 9; k++){
            System.out.print(" +");
            for(int i = 0; i < 8; i++){
                System.out.print("-+");
            }
            System.out.println();
            
            if(k<8)
            {
                System.out.print(num + "| ");
                num--;
            }
            for(int j =0;j<8;j++){
                if(k<8){
                    System.out.print(" | ");
                }
            }
            if(k<8){
                System.out.println();
            }
            System.out.printf("%4s%4s%4s%4s%4s%4s%4s%4s", "a","b","c","d","e","f","g","h");
        }
    }

}
