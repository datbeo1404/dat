/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

public class FenUtilites {
    
    public String createGameFromFEN(String a){
        String [] ar = a.split(" ");
                for(int i = 0; i < ar.length; i++){
                    System.out.println(ar[i]);
                }
        return "a";
    }
    
    public String sidetoMove(String turn){
        if(turn == "w"){
           return "White to move.";
        }
        else{
        return "Black to move.";
        }
    }
    
    public String [] castlingAvailability(String character){
        String array [] = new String[character.length()];
        
        if(character == "-"){
            array[0] = "none";
            return array;
        }
        else{
            for(int i = 0; i < character.length(); i++){
                if(character.charAt(i) == 'K'){
                    array[i] = "White kingside";
                }
                else if(character.charAt(i) == 'Q'){
                    array[i] = "White queenside";
                }
                else if(character.charAt(i) == 'k'){
                    array[i] = "Black kingside";
                }
                else if(character.charAt(i) == 'q'){
                    array[i] = "Black queenside";
                }
            }
        }
        return array;
    }
    
    public String enPassant(String eP){
        if(eP == "-"){
            return "none";
        }
        else{
            return eP;
        }
    }
    
}
