/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inputFile {
    
    String array[][] = new String[8][8];
    
    public char[][] rFile(){
        File file = new File("chessBoardsFEN.txt");
        FenUtilites b = new FenUtilites();
            Scanner sc;
        try {
            sc = new Scanner(file);
            sc.nextLine();
             while(sc.hasNextLine()){
                String i = sc.nextLine();
                b.createGameFromFEN(i);
                
            }
             sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(inputFile.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return null;
        }
}
