/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Vasilias extends Pionia {

    public Vasilias() {
        super();
    }
Pirgos pirgos1,pirgos2;

    public Vasilias(Color color, int row, int colum ,Pirgos pi1,Pirgos pi2) {
        super(color, row, colum);
pirgos1=pi1;
pirgos2=pi2;
        if (color == Color.BLACK) {
            this.setIcon((new ImageIcon("icons/king_black_unp.png")));

        } else {
            this.setIcon((new ImageIcon("icons/king_white_unp.png")));

        }
        this.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae) {
                System.out.println("βασιλιαs ");
            
            }

});
    }

    public void move(int x, int y, ChessPanel[][] slotsTable) {
         if (getI()==0&&pirgos1.getI()==0) {
              if (slotsTable[x ][y +1].getXx() == 0&&slotsTable[x ][y+2 ].getXx() == 0) {
                slotsTable[x ][y+2].setBackground(Color.DARK_GRAY);
              }}
               if (getI()==0&&pirgos2.getI()==0)
               {
          if (slotsTable[x ][y - 1].getXx() == 0&&slotsTable[x ][y-2 ].getXx() == 0&&slotsTable[x ][y-3 ].getXx() == 0) {
               slotsTable[x][y - 2].setBackground(Color.GRAY);
              
           }
        }
if(this.getColor()==Color.black){

    
    
    
    
    
    
        if (x - 1 >= 0 && y - 1 >= 0) {
              if (slotsTable[x - 1][y - 1].getXx() == 1) {
                slotsTable[x - 1][y - 1].setBackground(Color.yellow);
        
            }

            if (slotsTable[x - 1][y - 1].getXx() == 0) {
                slotsTable[x - 1][y - 1].setBackground(Color.yellow);
               
            }
        }




        if (x + 1 < 8 && y - 1 >= 0) {
             if (slotsTable[x + 1][y - 1].getXx() ==1) {
                slotsTable[x + 1][y - 1].setBackground(Color.yellow);
         
            }
            if (slotsTable[x + 1][y - 1].getXx() == 0) {
                slotsTable[x + 1][y - 1].setBackground(Color.yellow);
           
            }
        }



        if (x - 1 >= 0 && y + 1 < 8) {
            if (slotsTable[x - 1][y + 1].getXx() == 1) {
                slotsTable[x - 1][y + 1].setBackground(Color.yellow);
          
            }
            if (slotsTable[x - 1][y + 1].getXx() == 0) {
                slotsTable[x - 1][y + 1].setBackground(Color.yellow);
            
            }
        }

        if (x + 1 < 8 && y + 1 < 8) {
             if (slotsTable[x + 1][y + 1].getXx() == 1) {
                slotsTable[x + 1][y + 1].setBackground(Color.yellow);
          
            }
            if (slotsTable[x + 1][y + 1].getXx() == 0) {
                slotsTable[x + 1][y + 1].setBackground(Color.yellow);
           
            }
        }



        if (y - 1 >= 0) {
            if (slotsTable[x][y - 1].getXx() == 1) {
                slotsTable[x][y - 1].setBackground(Color.yellow);
           
            }
            if (slotsTable[x][y - 1].getXx() == 0) {
                slotsTable[x][y - 1].setBackground(Color.yellow);
             
            }
        }


        if (y + 1 < 8) {
             if (slotsTable[x][y + 1].getXx() == 1) {
                slotsTable[x][y + 1].setBackground(Color.yellow);
          
            }
            if (slotsTable[x][y + 1].getXx() == 0) {
                slotsTable[x][y + 1].setBackground(Color.yellow);
             
            }
        }


        if (x - 1 >= 0) {
            if (slotsTable[x - 1][y].getXx() == 1) {
                slotsTable[x - 1][y].setBackground(Color.yellow);
           
            }
            if (slotsTable[x - 1][y].getXx() == 0) {
                slotsTable[x - 1][y].setBackground(Color.yellow);
            
            }
        }
        if (x + 1 < 8) {
            if (slotsTable[x + 1][y].getXx() == 1) {
                slotsTable[x + 1][y].setBackground(Color.yellow);
         
            }
            if (slotsTable[x + 1][y].getXx() == 0) {
                slotsTable[x + 1][y].setBackground(Color.yellow);
           
            }
        }

}

else{
//   if (getI()==0) {
//              if (slotsTable[x ][y +1].getXx() == 0&&slotsTable[x ][y+2 ].getXx() == 0) {
//                slotsTable[x ][y+2].setBackground(Color.GRAY);
//        
//            }
//          if (slotsTable[x ][y - 1].getXx() == 0&&slotsTable[x ][y-2 ].getXx() == 0&&slotsTable[x ][y-3 ].getXx() == 0) {
//               slotsTable[x][y - 2].setBackground(Color.darkGray);
//              
//           }
//        }
    
    
    
if (x - 1 >= 0 && y - 1 >= 0) {
              if (slotsTable[x - 1][y - 1].getXx() == 2) {
                slotsTable[x - 1][y - 1].setBackground(Color.yellow);
           
            }

            if (slotsTable[x - 1][y - 1].getXx() == 0) {
                slotsTable[x - 1][y - 1].setBackground(Color.yellow);
              
            }
        }




        if (x + 1 < 8 && y - 1 >= 0) {
             if (slotsTable[x + 1][y - 1].getXx() ==2) {
                slotsTable[x + 1][y - 1].setBackground(Color.yellow);
 
            }
            if (slotsTable[x + 1][y - 1].getXx() == 0) {
                slotsTable[x + 1][y - 1].setBackground(Color.yellow);
         
            }
        }



        if (x - 1 >= 0 && y + 1 < 8) {
            if (slotsTable[x - 1][y + 1].getXx() == 2) {
                slotsTable[x - 1][y + 1].setBackground(Color.yellow);
   
            }
            if (slotsTable[x - 1][y + 1].getXx() == 0) {
                slotsTable[x - 1][y + 1].setBackground(Color.yellow);
         
            }
        }

        if (x + 1 < 8 && y + 1 < 8) {
             if (slotsTable[x + 1][y + 1].getXx() == 2) {
                slotsTable[x + 1][y + 1].setBackground(Color.yellow);
        
            }
            if (slotsTable[x + 1][y + 1].getXx() == 0) {
                slotsTable[x + 1][y + 1].setBackground(Color.yellow);
       
            }
        }



        if (y - 1 >= 0) {
            if (slotsTable[x][y - 1].getXx() == 2) {
                slotsTable[x][y - 1].setBackground(Color.yellow);
        
            }
            if (slotsTable[x][y - 1].getXx() == 0) {
                slotsTable[x][y - 1].setBackground(Color.yellow);
      
            }
        }


        if (y + 1 < 8) {
             if (slotsTable[x][y + 1].getXx() == 2) {
                slotsTable[x][y + 1].setBackground(Color.yellow);
      
            }
            if (slotsTable[x][y + 1].getXx() == 0) {
                slotsTable[x][y + 1].setBackground(Color.yellow);
          
            }
        }


        if (x - 1 >= 0) {
            if (slotsTable[x - 1][y].getXx() == 2) {
                slotsTable[x - 1][y].setBackground(Color.yellow);
            
            }
            if (slotsTable[x - 1][y].getXx() == 0) {
                slotsTable[x - 1][y].setBackground(Color.yellow);
            
            }
        }
        if (x + 1 < 8) {
            if (slotsTable[x + 1][y].getXx() == 2) {
                slotsTable[x + 1][y].setBackground(Color.yellow);
          
            }
            if (slotsTable[x + 1][y].getXx() == 0) {
                slotsTable[x + 1][y].setBackground(Color.yellow);
              
            }
        }



}
    }
}
