import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class ChessFrame extends JFrame implements MouseListener {

    //making a
    JPanel container = new JPanel();

    //making tiles (with numbers xy)
    DarkPanel DK11,DK13,DK15,DK17,DK22,DK24,DK26,DK28,DK31,DK33,DK35,DK37,DK42,DK44,DK46,DK48,DK51,DK53,DK55,DK57,DK62,DK64,DK66,DK68,DK71,DK73,DK75,DK77,DK82,DK84,DK86,DK88;
    LightPanel LP12,LP14,LP16,LP18,LP21,LP23,LP25,LP27,LP32,LP34,LP36,LP38,LP41,LP43,LP45,LP47,LP52,LP54,LP56,LP58,LP61,LP63,LP65,LP67,LP72,LP74,LP76,LP78,LP81,LP83,LP85,LP87;

    //making an array to store the tiles
    JPanel[][] TileHolder = new JPanel[8][8];

    //making stack to hold the pieces
    Stack<JLabel> pieces = new Stack<>();

    //initializing the piece labels for black pieces
    JLabel BR1 = new JLabel("R");
    JLabel BR2 = new JLabel("R");
    JLabel BKn1 = new JLabel("Kn");
    JLabel BKn2 = new JLabel("Kn");
    JLabel BQ = new JLabel("Q");
    JLabel BK = new JLabel("K");
    JLabel BB1 = new JLabel("B");
    JLabel BB2 = new JLabel("B");
    JLabel Bp1 = new JLabel("P");
    JLabel Bp2 = new JLabel("P");
    JLabel Bp3 = new JLabel("P");
    JLabel Bp4 = new JLabel("P");
    JLabel Bp5 = new JLabel("P");
    JLabel Bp6 = new JLabel("P");
    JLabel Bp7 = new JLabel("P");
    JLabel Bp8 = new JLabel("P");


    //initializing the piece labels for white pieces
    JLabel WR1 = new JLabel("R");
    JLabel WR2 = new JLabel("R");
    JLabel WKn1 = new JLabel("Kn");
    JLabel WKn2 = new JLabel("Kn");
    JLabel WQ = new JLabel("Q");
    JLabel WK = new JLabel("K");
    JLabel WB1 = new JLabel("B");
    JLabel WB2 = new JLabel("B");
    JLabel Wp1 = new JLabel("P");
    JLabel Wp2 = new JLabel("P");
    JLabel Wp3 = new JLabel("P");
    JLabel Wp4 = new JLabel("P");
    JLabel Wp5 = new JLabel("P");
    JLabel Wp6 = new JLabel("P");
    JLabel Wp7 = new JLabel("P");
    JLabel Wp8 = new JLabel("P");


    ChessFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setResizable(true);
        this.setTileHolder();
        this.ColorSquares();
        this.add(container);

        this.setVisible(true);
        this.pack();
    }
    public void setPieces(){

        //adds all pieces to stack
        pieces.add(BR1);
        pieces.add(BR2);
        pieces.add(BK);
        pieces.add(BQ);
        pieces.add(BB1);
        pieces.add(BB2);
        pieces.add(BKn1);
        pieces.add(BKn2);
        pieces.add(Bp1);
        pieces.add(Bp2);
        pieces.add(Bp3);
        pieces.add(Bp4);
        pieces.add(Bp5);
        pieces.add(Bp6);
        pieces.add(Bp7);
        pieces.add(Bp8);

        pieces.add(WR1);
        pieces.add(WR2);
        pieces.add(WK);
        pieces.add(WQ);
        pieces.add(WB1);
        pieces.add(WB2);
        pieces.add(WKn1);
        pieces.add(WKn2);
        pieces.add(Wp1);
        pieces.add(Wp2);
        pieces.add(Wp3);
        pieces.add(Wp4);
        pieces.add(Wp5);
        pieces.add(Wp6);
        pieces.add(Wp7);
        pieces.add(Wp8);
    }

    public void setTileHolder(){
        //[row][col]
        TileHolder[0][0] = DK11;
        TileHolder[0][1] = LP12;
        TileHolder[0][2] = DK13;
        TileHolder[0][3] = LP14;
        TileHolder[0][4] = DK15;
        TileHolder[0][5] = LP16;
        TileHolder[0][6] = DK17;
        TileHolder[0][7] = LP18;

        TileHolder[1][0] = LP21;
        TileHolder[1][1] = DK22;
        TileHolder[1][2] = LP23;
        TileHolder[1][3] = DK24;
        TileHolder[1][4] = LP25;
        TileHolder[1][5] = DK26;
        TileHolder[1][6] = LP27;
        TileHolder[1][7] = DK28;

        TileHolder[2][0] = DK31;
        TileHolder[2][1] = LP32;
        TileHolder[2][2] = DK33;
        TileHolder[2][3] = LP34;
        TileHolder[2][4] = DK35;
        TileHolder[2][5] = LP36;
        TileHolder[2][6] = DK37;
        TileHolder[2][7] = LP38;

        TileHolder[3][0] = LP41;
        TileHolder[3][1] = DK42;
        TileHolder[3][2] = LP43;
        TileHolder[3][3] = DK44;
        TileHolder[3][4] = LP45;
        TileHolder[3][5] = DK46;
        TileHolder[3][6] = LP47;
        TileHolder[3][7] = DK48;

        TileHolder[4][0] = DK51;
        TileHolder[4][1] = LP52;
        TileHolder[4][2] = DK53;
        TileHolder[4][3] = LP54;
        TileHolder[4][4] = DK55;
        TileHolder[4][5] = LP56;
        TileHolder[4][6] = DK57;
        TileHolder[4][7] = LP58;

        TileHolder[5][0] = LP61;
        TileHolder[5][1] = DK62;
        TileHolder[5][2] = LP63;
        TileHolder[5][3] = DK64;
        TileHolder[5][4] = LP65;
        TileHolder[5][5] = DK66;
        TileHolder[5][6] = LP67;
        TileHolder[5][7] = DK68;

        TileHolder[6][0] = DK71;
        TileHolder[6][1] = LP72;
        TileHolder[6][2] = DK73;
        TileHolder[6][3] = LP74;
        TileHolder[6][4] = DK75;
        TileHolder[6][5] = LP76;
        TileHolder[6][6] = DK77;
        TileHolder[6][7] = LP78;

        TileHolder[7][0] = LP81;
        TileHolder[7][1] = DK82;
        TileHolder[7][2] = LP83;
        TileHolder[7][3] = DK84;
        TileHolder[7][4] = LP85;
        TileHolder[7][5] = DK86;
        TileHolder[7][6] = LP87;
        TileHolder[7][7] = DK88;

    }

    public void ColorSquares(){
        //j=which row, i=which col

        container.setLayout(new GridLayout(8,8));
        for(int j=0;j<=7;j++){
            for(int i=0; i<=7;i++){
                container.add(TileHolder[j][i]);
            }
        }
    }
    public void fillSquares() {

        Random rand = new Random();

        for (int i = 0; i <= 32; i++) {

            //creates the x and y boxes to go into
            int xInitialVal = rand.nextInt(8);
            int yInitialVal = rand.nextInt(8);

            //check if used and if not, convert and insert the element

            //finds the x and y value in terms of frame size
            int xVal = (xInitialVal * 100) + 50;
            int yVal = (yInitialVal * 100) + 50;

            //this.getComponents().add(pieces.pop());

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
/*
       public void ColorSquares() {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0) {
                    for (int i = 0; i < 8; i++) {
                        if (i % 2 == 0) {
                            JPanel Bpanel = new JPanel();
                            Bpanel.setSize(70, 70);
                            Bpanel.setBackground(Color.DARK_GRAY);
                            Bpanel.setBorder(BorderFactory.createLineBorder(Color.black));
                            this.add(Bpanel);
                        } else {
                            JPanel Tpanel = new JPanel();
                            Tpanel.setSize(70, 70);
                            Tpanel.setBackground(Color.gray);
                            Tpanel.setBorder(BorderFactory.createLineBorder(Color.black));
                            this.add(Tpanel);
                        }
                    }
                } else if (j % 2 == 1) {
                    for (int i = 0; i < 8; i++) {
                        if (i % 2 == 0) {
                            JPanel Tpanel = new JPanel();
                            Tpanel.setSize(70, 70);
                            Tpanel.setBackground(Color.gray);
                            Tpanel.setBorder(BorderFactory.createLineBorder(Color.black));
                            this.add(Tpanel);
                        } else {
                            JPanel Bpanel = new JPanel();
                            Bpanel.setSize(70, 70);
                            Bpanel.setBackground(Color.DARK_GRAY);
                            Bpanel.setBorder(BorderFactory.createLineBorder(Color.black));
                            this.add(Bpanel);
                        }
                    }
                }

            }
        }
 */
