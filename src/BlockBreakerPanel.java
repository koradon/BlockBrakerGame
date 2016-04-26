import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by Michał on 06.04.2016.
 */
public class BlockBreakerPanel extends JPanel implements KeyListener{
    ArrayList<Block> blocks = new ArrayList<Block>();
    Block paddle;
    Thread thread;
    Animate animate;

    public BlockBreakerPanel() {
        this.paddle = new Block("img/paddle.png", 175, 480, 120, 25);
        for(int i = 0; i<8; i++){
            blocks.add(new Block("img/blueBlock.jpg", (i*60+2), 0, 60, 25));
        }
        for(int i = 0; i<8; i++){
            blocks.add(new Block("img/blueBlock.jpg", (i*60+2), 25, 60, 25));
        }
        for(int i = 0; i<8; i++){
            blocks.add(new Block("img/blueBlock.jpg", (i*60+2), 50, 60, 25));
        }
        for(int i = 0; i<8; i++){
            blocks.add(new Block("img/blueBlock.jpg", (i*60+2), 75, 60, 25));
        }
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Block block : blocks){
            block.draw(g, this);
        }
        paddle.draw(g, this);
    }

    public void update(){
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT){
            animate = new Animate(this);
            this.thread = new Thread(animate);
            this.thread.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT && paddle.x > 0){
            paddle.x-=15;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT && paddle.x < (getWidth() - paddle.width)){
            paddle.x+=15;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
