import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Player {
    public static int positionX = 0;
    private int positionY = 0;
    private int scaleX = 0;
    private int scaleY = 0;
    private int speedX = 0;
    private int speed = 0;

    public int FY = 0;
    public int FX = 0;

    private boolean Right = false;
    private boolean Left = false;
    private boolean Move = false;
    public boolean Shoot = false;

    private Hunter Hun;
    private Bullet b;

    public Player() {
        positionX = 320;
        positionY = 700;
        scaleX = 100;
        scaleY = 100;
        speed = 4;
        FX = 320;
        FY = -30;

        Hun = new Hunter();
        b = new Bullet();

    }

    public void update() {
        Move();
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(Hun.player[0], positionX, positionY, scaleX, scaleY, null);

        g2.drawImage(b.bullet[0], FX + 44, FY, 15, 30, null);
        FY = (FY <= 0) ? -30 : FY - 15;

    }

    public int reFX() {

        return FX;
    }

    public int reFY() {
        return FY;
    }

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Right = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Left = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Shoot = false;

        }

    }

    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Right = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Left = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (FY == -30) {
                Shoot = true;
            }
        }

    }

    public void Move() {
        if (positionX <= -3)
            positionX = 565;
        if (positionX >= 566)
            positionX = -5;

        if (Right == true) {
            positionX += speedX + speed;
        }

        if (Left == true) {
            positionX += speedX + -speed;
        }
        if (Shoot == true) {
            Shoot = false;
            FX = positionX;
            FY = positionY;
        }

    }

    public int getPositionX(int positionX) {
        return positionX;
    }

    public int getPositionY(int positionY) {
        return positionY;
    }

    public int getScaleX() {
        return scaleX;
    }

    public int getScaleY() {
        return scaleY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeed() {
        return speed;
    }

}
