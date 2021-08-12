import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

    private Player player;
    private GamePanel gp;

    public KeyInput(Player player, GamePanel gp) {
        this.player = player;
        this.gp = gp;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
        // gp.keyPressed(e);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        player.keyReleased(e);
        gp.keyReleased(e);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}