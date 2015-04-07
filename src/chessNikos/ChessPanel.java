/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 *
 * @author nikos
 */
public class ChessPanel extends JPanel {

    public int getPirgosready() {
        return pirgosready;
    }

    public void setPirgosready(int pirgosready) {
        this.pirgosready = pirgosready;
    }

    private int pirgosready = 0;
    private ChessPanel[][] pan;
    private int row;
    private int column;
    private Pionia p;
    private Pionia pire = null;

    public Pionia getPire() {
        return pire;
    }

    public void setPire(Pionia pire) {
        this.pire = pire;
    }
    private int xx = 0;
    int i = 0;
    //private int colo;

    public int getXx() {
        if (p != null) {
        }
        if (p == null) {
            return 0;
        } else if (p.getColor() == Color.BLACK) {

            return 2;
        } else if (p.getColor() == Color.WHITE) {
            return 1;
        } else {
            System.out.println("plaka kaneis!");
            return -1;
        }


    }

    public void setXx(int xx) {
        this.xx = xx;
    }

    public ChessPanel() {
        row = 0;
        column = 0;


    }
    private ChessBoard board = (ChessBoard) getParent();
  
    public ChessPanel(int row, int column, Color backround, ChessPanel[][] slotsTable, ChessBoard boar) {

        this.row = row;
        this.column = column;
        this.setBackground(backround);
        pan = slotsTable;
        board = boar;
        p = null;
        this.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                //     System.out.println(getXx());
       

            }

            public void mousePressed(MouseEvent e) {
                Pionia readyToMove = board.getPionio();

                if (getBackground() == Color.yellow||getBackground()==Color.DARK_GRAY||getBackground()==Color.GRAY) {
                    if (getBackground()==Color.DARK_GRAY&&readyToMove.getColor()==Color.BLACK) {
                       pan[getRow()][getColumn()-1].add(board.getPirgos4());
                       board.getPirgos4().setRow(getRow());
                        board.getPirgos4().setColum(getColumn()-1);
                    }
                    else if(getBackground()==Color.DARK_GRAY&&readyToMove.getColor()==Color.white){
              
                       pan[getRow()][getColumn()-1].add(board.getPirgos2());
                       board.getPirgos2().setRow(getRow());
                        board.getPirgos2().setColum(getColumn()-1);
                    
                    }
                 else if(getBackground()==Color.GRAY&&readyToMove.getColor()==Color.white){
              
                       pan[getRow()][getColumn()+1].add(board.getPirgos1());
                       board.getPirgos1().setRow(getRow());
                        board.getPirgos1().setColum(getColumn()+1);
                    
                    }
                    else if(getBackground()==Color.GRAY&&readyToMove.getColor()==Color.black){
              
                       pan[getRow()][getColumn()+1].add(board.getPirgos3());
                       board.getPirgos3().setRow(getRow());
                        board.getPirgos3().setColum(getColumn()+1);
                    
                    }
                    if(getBackground()==Color.GRAY){
                  pirgosready=2;

                    }

                    System.out.println();
                    System.out.print(" goto " + getRow() + " " + getColumn());


                    pan[readyToMove.getRow()][readyToMove.getColum()].setP(null);


                    setNewP(readyToMove);

                    readyToMove.setI(1);

                    board.setWhiteTurn(!board.getWhiteTurn());
                }





            }

            public void mouseReleased(MouseEvent e) {
                reDrawBoard();
                board.repaint();
                board.setPionio(null);

                // setP(null);
//qu=null;

            }

            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.BLACK));


            }

            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.white));

            }
        });




    }

    public void setP(Pionia p) {
        this.p = p;
    }

    public void setNewP(Pionia p) {


        this.removeAll();
        this.p = p;
        this.add(p);
        p.setColum(column);
        p.setRow(row);
        System.out.println("");
        if (p.getRow() == 7 && p instanceof Pionakia) {
            System.out.println("on your turn press on to become a queen");

        }
        if (p.getRow() == 0 && p instanceof Pionakia) {
            System.out.println("on your turn press on to become a queen");

        }


    }

    public Pionia getP() {


        return p;
    }

    public void reDrawBoard() {
        for (int num = 0; num <= 7; num++) {
            for (int j = 0; j <= 7; j++) {
                if (((num * 7) + j) % 2 == 0) {

                    pan[num][j].setBackground((new Color(107, 66, 38)));
                } else {
                    pan[num][j].setBackground((Color.WHITE));
                }

            }
        }
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
