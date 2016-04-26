/**
 * Created by Michał on 06.04.2016.
 */
public class Animate implements Runnable{
    BlockBreakerPanel breakerPanel;

    public Animate(BlockBreakerPanel breakerPanel) {
        this.breakerPanel = breakerPanel;
    }

    @Override
    public void run() {
        while (true){
            breakerPanel.update();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
