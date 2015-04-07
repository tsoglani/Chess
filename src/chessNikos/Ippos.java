/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ippos extends Pionia {

    public Ippos() {
        super();

    }

    public Ippos(Color color, int row, int colum) {
        super(color, row, colum);

        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/knight_black_unp.png")));

        } else {
            this.setIcon((new ImageIcon("icons/knight_white_unp.png")));
        }
        this.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
 System.out.print(" ιπποs ");
            }

});

    }

    public void move(int x, int y, ChessPanel[][] slotsTable) {
if(this.getColor()==Color.BLACK){
    
        if (y + 2 < 8 && x - 1 >= 0) {
            if(slotsTable[x-1][y+2].getXx()==1)
            {slotsTable[x - 1][y + 2].setBackground(Color.yellow);
           }
            if(slotsTable[x-1][y+2].getXx()==0){
            slotsTable[x - 1][y + 2].setBackground(Color.yellow);
      
        }
        }
 
        if (y + 1 < 8 && x - 2 >= 0) {
              
            if(slotsTable[x-2][y+1].getXx()==1){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          

        }
            if(slotsTable[x-2][y+1].getXx()==0){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          
        }}
    





   
        if (y - 2 >= 0 && x - 1 >= 0) {
         
            if(slotsTable[x-1][y-2].getXx()==1){
            slotsTable[x - 1][y - 2].setBackground(Color.yellow);
        
        }
            if(slotsTable[x-1][y-2].getXx()==0){
                 
            slotsTable[x - 1][y - 2].setBackground(Color.yellow);
           
        }}





        if (y + 1 < 8 && x - 2 >= 0) {
             
            if(slotsTable[x-2][y+1].getXx()==1){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          
        }
            if(slotsTable[x-2][y+1].getXx()==0){
           
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          
        }}

        if (y - 1 >= 0 && x + 2 <= 7) {
              
            if(slotsTable[x+2][y-1].getXx()==1){
            slotsTable[x + 2][y - 1].setBackground(Color.yellow);
          
        }
            if(slotsTable[x+2][y-1].getXx()==0){

            slotsTable[x + 2][y - 1].setBackground(Color.yellow);
          
        }}





        if (x + 1 < 8 && y - 2 >= 0) {
              
            if(slotsTable[x+1][y-2].getXx()==1){
            slotsTable[x + 1][y - 2].setBackground(Color.yellow);
            
        }
            if(slotsTable[x+1][y-2].getXx()==0){
            slotsTable[x + 1][y - 2].setBackground(Color.yellow);
            slotsTable[x + 1][y - 2].setP(this);
        }}
        if (x + 2 < 8 && y + 2 < 8) {
        
            if(slotsTable[x+1][y+2].getXx()==1){
            slotsTable[x + 1][y + 2].setBackground(Color.yellow);
       
        }
             if(slotsTable[x+1][y+2].getXx()==0){
            slotsTable[x + 1][y + 2].setBackground(Color.yellow);
         
        }}
   
        if (x - 2 >= 0 && y - 1 >= 0) {
          
            if(slotsTable[x-2][y-1].getXx()==1){
            slotsTable[x - 2][y - 1].setBackground(Color.yellow);
         
        }
            if(slotsTable[x-2][y-1].getXx()==0){
            slotsTable[x - 2][y - 1].setBackground(Color.yellow);
      
        }}
   
        if (x + 2 < 8 && y + 1 < 8) {
            
            if(slotsTable[x+2][y+1].getXx()==1){
            slotsTable[x + 2][y + 1].setBackground(Color.yellow);
         
        }
            if(slotsTable[x+2][y+1].getXx()==0){
            slotsTable[x + 2][y + 1].setBackground(Color.yellow);
            
        }}
    }
    
else{

        if (y + 2 < 8 && x - 1 >= 0) {
            if(slotsTable[x-1][y+2].getXx()==2)
            {slotsTable[x - 1][y + 2].setBackground(Color.yellow);
        }
            if(slotsTable[x-1][y+2].getXx()==0){
            slotsTable[x - 1][y + 2].setBackground(Color.yellow);
         
            
        }
        }

        if (y + 1 < 8 && x - 2 >= 0) {
            
            if(slotsTable[x-2][y+1].getXx()==2){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
       
        }
            if(slotsTable[x-2][y+1].getXx()==0){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          
        }}







        if (y - 2 >= 0 && x - 1 >= 0) {
             
            if(slotsTable[x-1][y-2].getXx()==2){
            slotsTable[x - 1][y - 2].setBackground(Color.yellow);
    
        }
            if(slotsTable[x-1][y-2].getXx()==0){
            slotsTable[x - 1][y - 2].setBackground(Color.yellow);
            
        }}





        if (y + 1 < 8 && x - 2 >= 0) {
             
            if(slotsTable[x-2][y+1].getXx()==2){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
         
        }
            if(slotsTable[x-2][y+1].getXx()==0){
            slotsTable[x - 2][y + 1].setBackground(Color.yellow);
          
        }}

        if (y - 1 >= 0 && x + 2 <= 7) {
            
            if(slotsTable[x+2][y-1].getXx()==2){
            slotsTable[x + 2][y - 1].setBackground(Color.yellow);
  
        }
            if(slotsTable[x+2][y-1].getXx()==0){

            slotsTable[x + 2][y - 1].setBackground(Color.yellow);

        }}





        if (x + 1 < 8 && y - 2 >= 0) {
              
            if(slotsTable[x+1][y-2].getXx()==2){
            slotsTable[x + 1][y - 2].setBackground(Color.yellow);
         
        }
            if(slotsTable[x+1][y-2].getXx()==0){
            slotsTable[x + 1][y - 2].setBackground(Color.yellow);
 
        }}
        if (x + 2 < 8 && y + 2 < 8) {
   
            if(slotsTable[x+1][y+2].getXx()==2){
            slotsTable[x + 1][y + 2].setBackground(Color.yellow);
   
        }
             if(slotsTable[x+1][y+2].getXx()==0){
            slotsTable[x + 1][y + 2].setBackground(Color.yellow);

        }}

        if (x - 2 >= 0 && y - 1 >= 0) {

            if(slotsTable[x-2][y-1].getXx()==2){
            slotsTable[x - 2][y - 1].setBackground(Color.yellow);

        }
            if(slotsTable[x-2][y-1].getXx()==0){
            slotsTable[x - 2][y - 1].setBackground(Color.yellow);

        }}

        if (x + 2 < 8 && y + 1 < 8) {
    
            if(slotsTable[x+2][y+1].getXx()==2){
            slotsTable[x + 2][y + 1].setBackground(Color.yellow);

        }
            if(slotsTable[x+2][y+1].getXx()==0){

            slotsTable[x + 2][y + 1].setBackground(Color.yellow);

        }}








}
    
    
    
    
    
    }
}
