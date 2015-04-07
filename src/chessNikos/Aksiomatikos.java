/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Aksiomatikos extends Pionia {

    public Aksiomatikos() {
        super();

    }

    public Aksiomatikos(Color color, int row, int colum) {
        super(color, row, colum);

        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/bishop_black_unp.png")));

        } else {
            this.setIcon((new ImageIcon("icons/bishop_white_unp.png")));
        }
this.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
                System.out.println("πατησες τον αξιοματικο");
            }

});
    }

    public void move(int x, int y, ChessPanel[][] slotsTable) {
        int h = 0, j = 0, k = 0, ll = 0;
        if (getColor() == Color.BLACK) {
                
            for (int i = 1; i < 8; i++) {

                if ((y + i) < 8 && (x + i) < 8) {
           
                    if (slotsTable[x + i][y + i].getXx() == 1) {
                            
                        if (h == 0) {
                            h = 1;
                            slotsTable[x + i][y + i].setBackground(Color.yellow);
                     
                        }
                    }
                    if (slotsTable[x + i][y + i].getXx() != 0) {
                        
                        h = 1;
                    }
                    if (h == 0) {
                        slotsTable[x + i][y + i].setBackground(Color.yellow);
                    
                    }
                }


                if ((y - i) >= 0 && (x + i) < 8) {
               
                    if (slotsTable[x + i][y - i].getXx() == 1) {

                        if (j == 0) {
                            j = 1;
                            slotsTable[x + i][y - i].setBackground(Color.yellow);
                

                        }
                    }

                    if (slotsTable[x + i][y - i].getXx() != 0) {
                        j = 1;
                    }

                    if (j == 0) {
                        slotsTable[x + i][y - i].setBackground(Color.yellow);
                 
                    }
                }



                if ((y - i) >= 0 && (x - i) >= 0) {
                      
                    if (slotsTable[x - i][y - i].getXx() == 1) {
                        if (k == 0) {
                            k = 1;
                            slotsTable[x - i][y - i].setBackground(Color.yellow);
                 

                        }
                    }

                    if (slotsTable[x - i][y - i].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotsTable[x - i][y - i].setBackground(Color.yellow);
                  
                    }
                }


                if (((y + i) < 8) && (x - i) >= 0) {
                     
                    if (slotsTable[x - i][y + i].getXx() == 1) {
                        if (ll == 0) {
                            ll = 1;
                            slotsTable[x - i][y + i].setBackground(Color.yellow);
                         
                        }
                    }

                    if (slotsTable[x - i][y + i].getXx() != 0) {
                        ll = 1;
                    }
                    if (ll == 0) {
                        slotsTable[x - i][y + i].setBackground(Color.yellow);
                   
                    }
                }

            }
        } else {
                
            for (int i = 1; i < 8; i++) {
slotsTable[x ][y].setXx(0) ;
                if ((y + i) < 8 && (x + i) < 8) {
                     
                    if (slotsTable[x + i][y + i].getXx() == 2) {
                        if (h == 0) {
                            h = 1;
                            slotsTable[x + i][y + i].setBackground(Color.yellow);
                 
                        }
                    }
                    if (slotsTable[x + i][y + i].getXx() != 0) {
                        h = 1;
                    }
                    if (h == 0) {
                        slotsTable[x + i][y + i].setBackground(Color.yellow);
                  
                    }
                }


                if ((y - i) >= 0 && (x + i) < 8) {
                    if (slotsTable[x + i][y - i].getXx() == 2) {

                        if (j == 0) {
                            j = 1;
                            slotsTable[x + i][y - i].setBackground(Color.yellow);
                 

                        }
                    }

                    if (slotsTable[x + i][y - i].getXx() != 0) {
                        j = 1;
                    }

                    if (j == 0) {
                        slotsTable[x + i][y - i].setBackground(Color.yellow);
                    
                    }
                }



                if ((y - i) >= 0 && (x - i) >= 0) {
                    if (slotsTable[x - i][y - i].getXx() == 2) {
                        if (k == 0) {
                            k = 1;
                            slotsTable[x - i][y - i].setBackground(Color.yellow);
                     

                        }
                    }

                    if (slotsTable[x - i][y - i].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotsTable[x - i][y - i].setBackground(Color.yellow);
                
                    }
                }


                if (((y + i) < 8) && (x - i) >= 0) {
                    if (slotsTable[x - i][y + i].getXx() == 2) {
                        if (ll == 0) {
                            ll= 1;
                            slotsTable[x - i][y + i].setBackground(Color.yellow);
                      
                        }
                    }

                    if (slotsTable[x - i][y + i].getXx() == 1) {
                        ll = 1;
                    }
                    if (ll == 0) {
                        slotsTable[x - i][y + i].setBackground(Color.yellow);
                     
                    }
                }


            }
        }
    }
}


