import java.awt.*;

/**
 * Created by Michał on 06.04.2016.
 */
public class Block extends Rectangle {
    Image pic;
    int x, y, width, height;

    public Block(String pic, int x, int y, int width, int height) {
        this.pic = Toolkit.getDefaultToolkit().getImage(pic);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g, Component c){
        g.drawImage(pic, x, y, width, height, c);
    }
}
