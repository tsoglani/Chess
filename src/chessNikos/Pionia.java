/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nikos
 */
public abstract class Pionia extends JButton {

    private Color color;
    private int row;
    private int colum;
int ii=0;

    public int getI() {
        return ii;
    }

    public void setI(int i) {
        this.ii = i;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Pionia() {
        color = Color.WHITE;
        row = 0;
        colum = 0;
             
    }

    public Pionia(Color color, int row, int colum) {
        this.color = color;
        this.row = row;
        this.colum = colum;
        this.setOpaque(false);
this.setBackground(Color.WHITE);
//        this.addActionListener(actionListener);
    }

   
//pionia pionio=null;
//
//    public pionia getPionio() {
//        return pionio;
//    }
//
//    public void setPionio(pionia pionio) {
//        this.pionio = pionio;
//    }

    public abstract void move(int x, int z,ChessPanel[][] slotstable);


}
