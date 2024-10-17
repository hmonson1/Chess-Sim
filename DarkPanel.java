import javax.swing.*;
import java.awt.*;

public class DarkPanel extends JPanel{

    DarkPanel(){

        this.setSize(70, 70);
        this.setBackground(Color.DARK_GRAY);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        setVisible(true);
    }
}
