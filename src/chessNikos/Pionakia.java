/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Pionakia extends Pionia {

    Pionia pion;
 ChessPanel [][] pane;
    public void setI(int i) {
        this.ii = i;

    }

    public int getI() {
        return ii;
    }

    public Pionakia() {
        super();

    }
String ab;


    public Pionakia(Color color, int row, int colum, ChessPanel [][] pan) {
        
        super(color, row, colum);

this.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
                System.out.print(" πιονι  "+getRow()+", "+getColum());

            }

});


        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/pawn_black_unp.png")));

        } else {
            this.setIcon((new ImageIcon("icons/pawn_white_unp.png")));


        }

     

    }

    public void move(int k, int j, ChessPanel[][] slotsTable) {


        if (getColor() == Color.black) {
            if (k - 1 >= 0 && j + 1 < 8) {
                if (slotsTable[k - 1][j + 1].getXx() == 1) {
                    slotsTable[k - 1][j + 1].setBackground(Color.yellow);
             
                }
            }
            if (k - 1 >= 0 && j - 1 >= 0) {
                if (slotsTable[k - 1][j - 1].getXx() == 1) {
                    slotsTable[k - 1][j - 1].setBackground(Color.yellow);
                }
           
            }

            if (k-1 >=0) {
                if (slotsTable[k - 1][j].getXx() == 0) {
                    slotsTable[k - 1][j].setBackground(Color.yellow);
    


                    if (ii == 0) {



                        if (slotsTable[k - 2][j].getXx() == 0) {
                            slotsTable[k - 2][j].setBackground(Color.yellow);
                  
 
                        }
                    }
                }

            }

        } else {//white


            if (k + 1 < 8 && j + 1 < 8) {
                if (slotsTable[k + 1][j + 1].getXx() == 2) {
                    slotsTable[k + 1][j + 1].setBackground(Color.yellow);
             
               
                }
            }
            if (k + 1 < 8 && j - 1 >= 0) {
                if (slotsTable[k + 1][j - 1].getXx() == 2) {
                    slotsTable[k + 1][j - 1].setBackground(Color.yellow);
             
 
                }
            }
            





                if (k + 1 < 8) {

                    if (slotsTable[k + 1][j].getXx() == 0) {
                    slotsTable[k + 1][j].setBackground(Color.yellow);
               
                    if (ii == 0) {

                        slotsTable[k + 2][j].setBackground(Color.yellow);
     
                      

                    }
                }


                
               
            }




        }
    }

    /**
     * @return the pion
     */
    public Pionia getPion() {
        return pion;
    }

    /**
     * @param pion the pion to set
     */
    public void setPion(Pionia pion) {
        this.pion = pion;
    }
   
}
