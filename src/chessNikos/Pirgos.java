/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Pirgos extends Pionia {

    ChessPanel[][] slotstable;

    public Pirgos() {

        super();


    }

    public Pirgos(Color color, int row, int colum) {
        super(color, row, colum);


        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/rook_black_unp.png")));
            this.setBackground(new Color(107, 66, 38));
        } else {
            this.setIcon((new ImageIcon("icons/rook_white_unp.png")));
            this.setBackground(Color.WHITE);

        }

 this.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent ae) {
                            System.out.print("πυργοs ");
                        }
                    });
    }

    public void move(int x, int y, ChessPanel[][] slotstable) {
        int h = 0, j = 0, k = 0, l = 0;

        if (this.getColor() == Color.black) {
            for (int i = 1; i < 8; i++) {
                slotstable[x][y].setXx(0);
                if (y + i < 8) {

                    if (slotstable[x][y + i].getXx() == 1) {

                        if (h == 0) {
                            h = 1;
                            slotstable[x][y + i].setBackground(Color.yellow);
                      
                        }
                    }


                    if (slotstable[x][y + i].getXx() != 0) {
                        h = 1;
                    }
                    if (h == 0) {
                        slotstable[x][y + i].setBackground(Color.yellow);
               
                    }
                   
                }





                if (y - i >= 0) {

                    if (slotstable[x][y - i].getXx() == 1) {
                        if (j == 0) {
                            j = 1;
                            slotstable[x][y - i].setBackground(Color.yellow);
          
                        }
                    }
                    if (slotstable[x][y - i].getXx() != 0) {
                        j = 1;
                    }
                    if (j == 0) {
                        slotstable[x][y - i].setBackground(Color.yellow);
         
                    }


                }


                if (x + i < 8) {
                    if (slotstable[x + i][y].getXx() == 1) {
                        if (k == 0) {
                            k = 1;
                            slotstable[x + i][y].setBackground(Color.yellow);
              

                        }
                    }
                    if (slotstable[x + i][y].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotstable[x + i][y].setBackground(Color.yellow);
             
                    }
                }



                if (x - i >= 0) {
                    if (slotstable[x - i][y].getXx() == 1) {
                        if (l == 0) {
                            l = 1;
                            slotstable[x - i][y].setBackground(Color.yellow);
                        

                        }
                    }
                    if (slotstable[x - i][y].getXx() != 0) {
                        l = 1;
                    }
                    if (l == 0) {

                        slotstable[x - i][y].setBackground(Color.yellow);
                  

                    }
                }

            }

        } else {
            for (int i = 1; i < 8; i++) {
                if (y + i < 8) {

                    if (slotstable[x][y + i].getXx() == 2) {

                        if (h == 0) {
                            h = 1;
                            slotstable[x][y + i].setBackground(Color.yellow);
                     
                        }
                    }


                    if (slotstable[x][y + i].getXx() != 0) {
                        h = 1;
                    }
                    if (h == 0) {
                        slotstable[x][y + i].setBackground(Color.yellow);
                     
                    }
                }





                if (y - i >= 0) {

                    if (slotstable[x][y - i].getXx() == 2) {
                        if (j == 0) {
                            j = 1;
                            slotstable[x][y - i].setBackground(Color.yellow);
                      
                        }
                    }
                    if (slotstable[x][y - i].getXx() != 0) {
                        j = 1;
                    }
                    if (j == 0) {
                        slotstable[x][y - i].setBackground(Color.yellow);
                 
                    }


                }


                if (x + i < 8) {
                    if (slotstable[x + i][y].getXx() == 2) {
                        if (k == 0) {
                            k = 1;
                            slotstable[x + i][y].setBackground(Color.yellow);
                         

                        }
                    }
                    if (slotstable[x + i][y].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotstable[x + i][y].setBackground(Color.yellow);
                  

                    }
                }



                if (x - i >= 0) {
                    if (slotstable[x - i][y].getXx() == 2) {
                        if (l == 0) {
                            l = 1;
                            slotstable[x - i][y].setBackground(Color.yellow);
                          

                        }
                    }
                    if (slotstable[x - i][y].getXx() != 0) {
                        l = 1;
                    }
                    if (l == 0) {

                        slotstable[x - i][y].setBackground(Color.yellow);
                    

                    }
                }






            }
        }



    }
}
