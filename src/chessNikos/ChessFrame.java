/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessNikos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChessFrame extends JFrame {
private ChessBoard ch2;
    public ChessFrame() {






        this.setSize(830, 700);
        this.setTitle("ChessGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        ChessBoard ch1 = new ChessBoard(this);
ch2=ch1;








      ChessPanel[][] x = ch1.getSlotsTable();
        this.add(ch1, BorderLayout.CENTER);


        this.setVisible(true);










    }
public void mat(JPanel loser){

this.remove(ch2);

this.add(loser,BorderLayout.CENTER);
this.setSize(831,700);

}




}
