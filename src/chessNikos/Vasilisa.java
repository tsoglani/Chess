/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

/**
 *
 * @author nikos
 */
public class Vasilisa extends Pionia {

    public Vasilisa() {
        super();

    }
    ChessPanel[][] slotsTable;

    public Vasilisa(Color color, int row, int colum ) {
        super(color, row, colum);


        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/queen_black_unp.png")));

        } else {
            this.setIcon((new ImageIcon("icons/queen_white_unp.png")));

        }
        this.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
                System.out.print(" βασιλισα ");
               // queen.move(getRow(), getColum(), slotsTable);
            }

});
    }

    public void move(int x, int y, ChessPanel[][] slotsTable) {
        int a = 0, s = 0, d = 0, f = 0, g = 0, h = 0, j = 0, k = 0;
        if (this.getColor() == Color.black) {
            for (int i = 1; i < 8; i++) {
    

                if (y + i < 8) {
                    if (slotsTable[x][y + i].getXx() == 1) {
                        if (a == 0) {

                            slotsTable[x][y + i].setBackground(Color.yellow);

                      
                            a = 1;
                        }

                    }

                    if (slotsTable[x][y + i].getXx() != 0) {
                        a = 1;
                    }
                    if (a == 0) {

                        slotsTable[x][y + i].setBackground(Color.yellow);

                     

                    }
                }









                if (y - i >= 0) {
                    if (slotsTable[x][y - i].getXx() == 1) {
                        if (s == 0) {

                            slotsTable[x][y - i].setBackground(Color.yellow);
                            
                            s = 1;
                        }


                    }
                    if (slotsTable[x][y - i].getXx() != 0) {
                        s = 1;
                    }
                    if (s == 0) {

                        slotsTable[x][y - i].setBackground(Color.yellow);
                      
                    }
                }










                if (y + i < 8 && x + i < 8) {
                    if (slotsTable[x + i][y + i].getXx() == 1) {
                        if (d == 0) {


                            slotsTable[x + i][y + i].setBackground(Color.yellow);
                        
                            d = 1;
                        }


                    }
                    if (slotsTable[x + i][y + i].getXx() != 0) {
                        d = 1;
                    }
                    if (d == 0) {


                        slotsTable[x + i][y + i].setBackground(Color.yellow);
                
                    }
                }








                if (x + i < 8) {

                    if (slotsTable[x + i][y].getXx() != 0) {
                        if (slotsTable[x + i][y].getXx() == 1) {
                            if (f == 0) {
                                slotsTable[x + i][y].setBackground(Color.yellow);
                           
                                f = 1;
                            }

                        }
                        f = 1;
                    }
                    if (f == 0) {
                        slotsTable[x + i][y].setBackground(Color.yellow);
                    
                    }
                }






                if (x - i >= 0) {
                    if (slotsTable[x - i][y].getXx() == 1) {
                        if (g == 0) {
                            slotsTable[x - i][y].setBackground(Color.yellow);
                        
                            g = 1;
                        }

                    }


                    if (slotsTable[x - i][y].getXx() != 0) {
                        g = 1;
                    }
                    if (g == 0) {
                        slotsTable[x - i][y].setBackground(Color.yellow);
                   
                    }
                }







                if (y - i >= 0 && x - i >= 0) {

                    if (slotsTable[x - i][y - i].getXx() == 1) {
                        if (h == 0) {
                            slotsTable[x - i][y - i].setBackground(Color.yellow);
                 
                            h = 1;
                        }

                    }
                    if (slotsTable[x - i][y - i].getXx() != 0) {
                        h = 1;
                    }
                    if (h == 0) {
                        slotsTable[x - i][y - i].setBackground(Color.yellow);
               
                    }
                }






                if (y + i < 8 && x - i >= 0) {
                    if (slotsTable[x - i][y + i].getXx() == 1) {
                        if (j == 0) {
                            slotsTable[x - i][y + i].setBackground(Color.yellow);
                   
                            j = 1;
                        }


                    }

                    if (slotsTable[x - i][y + i].getXx() != 0) {
                        j = 1;
                    }
                    if (j == 0) {
                        slotsTable[x - i][y + i].setBackground(Color.yellow);
                
                    }
                }








                if (y - i >= 0 && x + i < 8) {
                    if (slotsTable[x + i][y - i].getXx() == 1) {

                        if (k == 0) {
                            slotsTable[x + i][y - i].setBackground(Color.yellow);
                      
                            k = 1;
                        }
                    }

                    if (slotsTable[x + i][y - i].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotsTable[x + i][y - i].setBackground(Color.yellow);
                   
                    }
                }
            }



        } else {


            for (int i = 1; i < 8; i++) {
                slotsTable[x][y].setXx(0);

                if (y + i < 8) {
                    if (slotsTable[x][y + i].getXx() == 2) {

                        if (a == 0) {

                            slotsTable[x][y + i].setBackground(Color.yellow);

                    
                            a = 1;
                        }

                    }

                    if (slotsTable[x][y + i].getXx() != 0) {
                        a = 1;
                    }
                    if (a == 0) {

                        slotsTable[x][y + i].setBackground(Color.yellow);

                    

                    }
                }









                if (y - i >= 0) {
                    if (slotsTable[x][y - i].getXx() == 2) {
                        if (s == 0) {

                            slotsTable[x][y - i].setBackground(Color.yellow);
                
                            s = 1;
                        }


                    }
                    if (slotsTable[x][y - i].getXx() != 0) {
                        s = 1;
                    }
                    if (s == 0) {

                        slotsTable[x][y - i].setBackground(Color.yellow);
               
                    }
                }










                if (y + i < 8 && x + i < 8) {
                    if (slotsTable[x + i][y + i].getXx() == 2) {
                        if (d == 0) {


                            slotsTable[x + i][y + i].setBackground(Color.yellow);
                   
                            d = 1;
                        }


                    }
                    if (slotsTable[x + i][y + i].getXx() != 0) {
                        d = 1;
                    }
                    if (d == 0) {


                        slotsTable[x + i][y + i].setBackground(Color.yellow);
                     
                    }
                }






                if (x + i < 8) {

                    if (slotsTable[x + i][y].getXx() == 2) {


                        if (f == 0) {
                            slotsTable[x + i][y].setBackground(Color.yellow);
                        
                            f = 1;
                        }}
                        if (slotsTable[x + i][y].getXx() != 0) {
                            f = 1;
                        }


                    if (f == 0) {
                        slotsTable[x + i][y].setBackground(Color.yellow);
                 
                    }
                }





                if (x - i >= 0) {
                    if (slotsTable[x - i][y].getXx() == 2) {
                        if (g == 0) {
                            slotsTable[x - i][y].setBackground(Color.yellow);
                       
                            g = 1;
                        }

                    }


                    if (slotsTable[x - i][y].getXx() != 0) {
                        g = 1;
                    }
                    if (g == 0) {
                        slotsTable[x - i][y].setBackground(Color.yellow);
                       
                    }
                }







                if (y - i >= 0 && x - i >= 0) {

                    if (slotsTable[x - i][y - i].getXx() == 2) {
                        if (h == 0) {
                            slotsTable[x - i][y - i].setBackground(Color.yellow);
                     
                            h = 1;
                        }

                    }
                    if (slotsTable[x - i][y - i].getXx() != 0) {
                        h = 1;
                    }
                    if (h == 0) {
                        slotsTable[x - i][y - i].setBackground(Color.yellow);
              
                    }
                }






                if (y + i < 8 && x - i >= 0) {
                    if (slotsTable[x - i][y + i].getXx() == 2) {
                        if (j == 0) {
                            slotsTable[x - i][y + i].setBackground(Color.yellow);
                        
                            j = 1;
                        }


                    }

                    if (slotsTable[x - i][y + i].getXx() != 0) {
                        j = 1;
                    }
                    if (j == 0) {
                        slotsTable[x - i][y + i].setBackground(Color.yellow);
                    
                    }
                }








                if (y - i >= 0 && x + i < 8) {
                    if (slotsTable[x + i][y - i].getXx() == 2) {

                        if (k == 0) {
                            slotsTable[x + i][y - i].setBackground(Color.yellow);
                      
                            k = 1;
                        }
                    }

                    if (slotsTable[x + i][y - i].getXx() != 0) {
                        k = 1;
                    }
                    if (k == 0) {
                        slotsTable[x + i][y - i].setBackground(Color.yellow);
              
                    }
                }
            }



        }


    }
}
