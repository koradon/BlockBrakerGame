import javax.swing.*;

/**
 * Created by Michał on 06.04.2016.
 */
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Block Breaker");

        BlockBreakerPanel bbpanel = new BlockBreakerPanel();

        frame.getContentPane().add(bbpanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(490, 600);

        frame.setResizable(false);
    }
}
