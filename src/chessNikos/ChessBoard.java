package chessNikos;

//import com.sun.corba.se.impl.interceptors.SlotTable;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChessBoard extends JPanel {

    private Vasilisa queen, qu;
    private ChessPanel[][] slotsTable = new ChessPanel[8][8];
    private ChessPanel currentPanel;
    private ChessFrame frame;
    private Pirgos pirgos1, pirgos2, pirgos3, pirgos4;
    private Ippos ippos1, ippos2, ippos3, ippos4;
    private Aksiomatikos aksiomatikos1, aksiomatikos2, aksiomatikos3, aksiomatikos4;
    private Pionakia[] pionakia1 = new Pionakia[8];
    private Pionakia[] pionakia2 = new Pionakia[8];
    private Vasilisa vasilisa1, vasilisa2;
    private Vasilias vasilias1, vasilias2;
    private JLabel matIcon = new JLabel();
    private ChessBoard board = (ChessBoard) getParent();
    private Pionia pionio = null;
    private JPanel panelw = new JPanel();

    public Pirgos getPirgos1() {
        return pirgos1;
    }

    public void setPirgos1(Pirgos pirgos1) {
        this.pirgos1 = pirgos1;
    }

    public Pirgos getPirgos2() {
        return pirgos2;
    }

    public void setPirgos2(Pirgos pirgos2) {
        this.pirgos2 = pirgos2;
    }

    public Pirgos getPirgos3() {
        return pirgos3;
    }

    public void setPirgos3(Pirgos pirgos3) {
        this.pirgos3 = pirgos3;
    }

    public Pirgos getPirgos4() {
        return pirgos4;
    }

    public void setPirgos4(Pirgos pirgos4) {
        this.pirgos4 = pirgos4;
    }
    private JPanel panelb = new JPanel();
    private JLabel winer;
    private JLabel image;
    private boolean whiteTurn = true;

    public Pionia getPionio() {
        return pionio;
    }

    public boolean getWhiteTurn() {
        return whiteTurn;
    }

    public void setWhiteTurn(boolean whiteTurn) {
        this.whiteTurn = whiteTurn;
    }

    public void setPionio(Pionia pionio) {
        this.pionio = pionio;
    }

    public ChessBoard(ChessFrame fra) {
        JLabel eatenwhite = new JLabel("eaten white");
        JLabel eatenbl = new JLabel("eaten black");
        boolean black = true;
        frame = fra;
        this.setLayout(new BorderLayout());
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(8, 8));
        board = this;
        panelw.add(eatenwhite);
        panelb.add(eatenbl);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {



                if (black) {

                    currentPanel = new ChessPanel(i, j, (new Color(107, 66, 38)), getSlotsTable(), this);
                } else {
                    currentPanel = new ChessPanel(i, j, (Color.WHITE), getSlotsTable(), this );
                }
                pan.add(currentPanel);
                slotsTable[i][j] = currentPanel;

                black = !black;
            }
            black = !black;
        }
        this.add(pan, BorderLayout.CENTER);
        board.repaint();
        JPanel newG = new JPanel();
        JButton newGame = new JButton("new game");

        newG.add(newGame);
        this.add(newG, BorderLayout.BEFORE_FIRST_LINE);

        slotsTable[7][7].setNewP(pirgos4 = new Pirgos(Color.BLACK, 7, 7));
        slotsTable[7][0].setNewP(pirgos3 = new Pirgos(Color.BLACK, 7, 0));
        slotsTable[0][7].setNewP(pirgos2 = new Pirgos(Color.WHITE, 0, 7));
        slotsTable[0][0].setNewP(pirgos1 = new Pirgos(Color.WHITE, 0, 0));






        slotsTable[7][6].setNewP(ippos4 = new Ippos(Color.BLACK, 7, 6));
        slotsTable[7][1].setNewP(ippos3 = new Ippos(Color.BLACK, 7, 1));

        slotsTable[0][6].setNewP(ippos2 = new Ippos(Color.WHITE, 0, 6));


        slotsTable[0][1].setNewP(ippos1 = new Ippos(Color.WHITE, 0, 1));




        //aksiomatikoi


        slotsTable[0][5].setNewP(aksiomatikos4 = new Aksiomatikos(Color.WHITE, 0, 5));
        slotsTable[0][2].setNewP(aksiomatikos3 = new Aksiomatikos(Color.WHITE, 0, 2));
        slotsTable[7][5].setNewP(aksiomatikos2 = new Aksiomatikos(Color.BLACK, 7, 5));
        slotsTable[7][2].setNewP(aksiomatikos1 = new Aksiomatikos(Color.BLACK, 7, 2));

        //vasilises
        slotsTable[7][3].setNewP(vasilisa2 = new Vasilisa(Color.BLACK, 7, 3));
        slotsTable[0][3].setNewP(vasilisa1 = new Vasilisa(Color.WHITE, 0, 3));

        //vasiliades
        slotsTable[7][4].setNewP(vasilias2 = new Vasilias(Color.BLACK, 7, 4,pirgos3,pirgos4));
        slotsTable[0][4].setNewP(vasilias1 = new Vasilias(Color.WHITE, 0, 4,pirgos1,pirgos2));
        //pawn

        for (int i = 0; i < 8; i++) {

            slotsTable[1][i].setNewP(pionakia1[i] = new Pionakia(Color.white, 1, i, this.getSlotsTable()));

        }

        for (int i = 0; i < 8; i++) {

            slotsTable[6][i].setNewP(pionakia2[i] = new Pionakia(Color.BLACK, 6, i, this.getSlotsTable()));

        }

        newGame.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                JButton ne = (JButton) ae.getSource();
                for (int i = 0; i < 7; i++) {
                    System.out.println("");
                }
                System.out.println(ne.getText());

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {


                        getSlotsTable()[i][j].setP(null);
                        panelb.removeAll();
                        frame.remove(panelb);
                        panelw.removeAll();
                        frame.remove(panelw);
                        setWhiteTurn(true);
                    }
                }
                reDrawBoard();
                remove(pirgos1);
                getSlotsTable()[0][0].setNewP(pirgos1);


                getSlotsTable()[0][7].setNewP(pirgos2);

                getSlotsTable()[7][0].setNewP(pirgos3);

                getSlotsTable()[7][7].setNewP(pirgos4);



                pirgos1.setRow(0);
                pirgos1.setColum(0);
                pirgos2.setRow(0);
                pirgos2.setColum(7);
                pirgos3.setRow(7);
                pirgos3.setColum(0);
                pirgos4.setRow(7);
                pirgos4.setColum(7);




                getSlotsTable()[0][1].setNewP(ippos1);

                getSlotsTable()[0][6].setNewP(ippos2);

                getSlotsTable()[7][1].setNewP(ippos3);

                getSlotsTable()[7][6].setNewP(ippos4);





                ippos1.setRow(0);
                ippos1.setColum(1);
                ippos2.setRow(0);
                ippos2.setColum(6);
                ippos3.setRow(7);
                ippos3.setColum(1);
                ippos4.setRow(7);
                ippos4.setColum(6);

                //aksiomatikoi






                getSlotsTable()[7][2].setNewP(aksiomatikos1);

                getSlotsTable()[7][5].setNewP(aksiomatikos2);

                getSlotsTable()[0][2].setNewP(aksiomatikos3);

                getSlotsTable()[0][5].setNewP(aksiomatikos4);

                aksiomatikos1.setRow(0);
                aksiomatikos1.setColum(2);
                aksiomatikos2.setRow(0);
                aksiomatikos2.setColum(5);
                aksiomatikos3.setRow(7);
                aksiomatikos3.setColum(2);
                aksiomatikos4.setRow(7);
                aksiomatikos4.setColum(5);
                //vasilises


                getSlotsTable()[0][3].setNewP(vasilisa1);

                getSlotsTable()[7][3].setNewP(vasilisa2);

                vasilisa1.setRow(0);
                vasilisa1.setColum(3);
                vasilisa2.setRow(7);
                vasilisa2.setColum(3);
                //vasiliades

                getSlotsTable()[0][4].setNewP(vasilias1);

                getSlotsTable()[7][4].setNewP(vasilias2);
                vasilias1.setRow(0);
                vasilias1.setColum(4);
                vasilias2.setRow(7);
                vasilias2.setColum(4);
                //pawn

                for (int i = 0; i < 8; i++) {

                    getSlotsTable()[1][i].setNewP(pionakia1[i]);
                    pionakia1[i].setRow(1);
                    pionakia1[i].setColum(i);
                    pionakia1[i].setI(0);

                }






                for (int i = 0; i < 8; i++) {

                    getSlotsTable()[6][i].setNewP(pionakia2[i]);
                    pionakia2[i].setRow(6);
                    pionakia2[i].setColum(i);
                    pionakia2[i].setI(0);
                }
                frame.repaint();
            }
        });


        ActionListener action = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {


                Pionia actionPioni = (Pionia) ae.getSource();
                Color c = actionPioni.getColor();

                
                

                //pion.setEnabled(false);
                ChessPanel parent = (ChessPanel) actionPioni.getParent();
                {


                    if (pionio == null) {
                        if ((c == Color.WHITE && !whiteTurn) || (c == Color.BLACK && whiteTurn)) {

                            return;
                        }

                        //kathorizw tin seira (players)
                        
                        
                        
                        
                        
                        pionio = actionPioni;
                        System.out.println("");
                       
                         if (pionio.getRow() == 7 && pionio instanceof Pionakia) {
                            slotsTable[pionio.getRow()][pionio.getColum()].remove(pionio);
                             pionio.removeAll();
                            queen = new Vasilisa(pionio.getColor(), pionio.getRow(),pionio.getColum());

                            queen.addActionListener(this);
                                slotsTable[pionio.getRow()][pionio.getColum()].add(queen);
                         
                        }
                        if (pionio.getRow() == 0 && pionio instanceof Pionakia) {
                            slotsTable[pionio.getRow()][pionio.getColum()].remove(pionio);
                            pionio = new Vasilisa(pionio.getColor(), pionio.getRow(), pionio.getColum());
                            qu = (Vasilisa) pionio;
                            qu.addActionListener(this);
                                 slotsTable[pionio.getRow()][pionio.getColum()].add(qu);
                               
                        }
                        
                        
                        
                        actionPioni.move(actionPioni.getRow(), actionPioni.getColum(), getSlotsTable());

                    } else if (parent.getBackground() == Color.yellow) { //trww pioni
                        System.out.print(" trwei to  ");

                        frame.add(panelw, BorderLayout.EAST);
                        frame.add(panelb, BorderLayout.WEST);
                        frame.repaint();
                        JPanel framesend = new JPanel();
                        if (actionPioni instanceof Vasilias) {
                            // ftiaxnw to mat
                            if (actionPioni.getColor() == Color.WHITE) {
                                System.out.println("BLACK WINSS");
                                winer = new JLabel("ROYA MAT BLACK WINSS");
                                matIcon.setIcon(new ImageIcon("icons/king_black_pre_unm.png"));

                            }
                            if (actionPioni.getColor() == Color.black) {
                                System.out.println(" WHITE WINSS");
                                winer = new JLabel("  ROYA MAT   WHITE WINS");
                                matIcon.setIcon(new ImageIcon("icons/king_white_pre.png"));

                            }

                            framesend.setLayout(new GridLayout(1, 1));
                            framesend.add(winer);
                            framesend.add(matIcon);

                            frame.mat(framesend);
                            frame.remove(panelw);
                            frame.remove(panelb);

                        }


                        panelw.setLayout(new GridLayout(12, 1));

                        panelb.setLayout(new GridLayout(12, 1));

//.. sto panelw vazw ta white pou trogonte
                        //  sto panelb ta black


                        if (actionPioni.getColor() == Color.white) {

                            image = new JLabel();
                            image.setIcon(actionPioni.getIcon());
                            panelw.add(image);

                        }
//pion.setEnabled(false);
                        if (actionPioni.getColor() == Color.BLACK) {

                            image = new JLabel();
                            image.setIcon(actionPioni.getIcon());
                            panelb.add(image);


                        }




                        slotsTable[pionio.getRow()][pionio.getColum()].setP(null);
                        slotsTable[actionPioni.getRow()][actionPioni.getColum()].removeAll();
                        
                        
                        if (actionPioni.getRow() == 7 && pionio instanceof Pionakia) {
                            slotsTable[pionio.getRow()][pionio.getColum()].remove(pionio);
                            pionio = new Vasilisa(pionio.getColor(), actionPioni.getRow(), actionPioni.getColum());
                            queen = (Vasilisa) pionio;
                            queen.addActionListener(this);
                        }
                        if (actionPioni.getRow() == 0 && pionio instanceof Pionakia) {
                            slotsTable[pionio.getRow()][pionio.getColum()].remove(pionio);
                            pionio = new Vasilisa(pionio.getColor(), actionPioni.getRow(), actionPioni.getColum());
                            qu = (Vasilisa) pionio;
                            qu.addActionListener(this);
                        }
                        slotsTable[actionPioni.getRow()][actionPioni.getColum()].setNewP(pionio);





                        reDrawBoard();
                        board.repaint();
                        board.setPionio(null);
                        whiteTurn = !whiteTurn;


                        frame.repaint();

                    } else {
                        reDrawBoard();

                        System.out.println("");



                        board.setPionio(null);
                    }








                }
            }
        };






        pirgos1.addActionListener(action);

        pirgos2.addActionListener(action);

        pirgos3.addActionListener(action);

        pirgos4.addActionListener(action);

        for (int i = 0;
                i
                < 8; i++) {
            pionakia1[i].addActionListener(action);

        }

        for (int i = 0;
                i
                < 8; i++) {
            pionakia2[i].addActionListener(action);

        }

        ippos1.addActionListener(action);

        ippos2.addActionListener(action);

        ippos3.addActionListener(action);

        ippos4.addActionListener(action);

        vasilisa1.addActionListener(action);

        vasilisa2.addActionListener(action);

        vasilias1.addActionListener(action);

        vasilias2.addActionListener(action);

        aksiomatikos1.addActionListener(action);

        aksiomatikos2.addActionListener(action);

        aksiomatikos3.addActionListener(action);

        aksiomatikos4.addActionListener(action);

    }

    public void reDrawBoard() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (((i * 7) + j) % 2 == 0) {

                    getSlotsTable()[i][j].setBackground((new Color(107, 66, 38)));
                } else {
                    getSlotsTable()[i][j].setBackground((Color.WHITE));
                }

            }
        }


    }

    public void setSlotsTable(ChessPanel[][] slotsTable) {
        this.setSlotsTable(slotsTable);
    }

    public ChessPanel[][] getSlotsTable() {
        return slotsTable;
    }

    /**
     * @param slotsTable the slotsTable to set
     */
    /**
     * @param pion 
    
     */
    public void ReadyToMove(Pionia pion) {
    }
}
