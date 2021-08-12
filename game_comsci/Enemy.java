import java.awt.Graphics;
import java.util.Random;

public class Enemy {
    public int map[][];
    public int positionX;
    public int positionY;
    public Player player;
    public GamePanel panel;
    public Boss En;
    public int i, j;

    public Enemy(int row, int col) {

        positionX = 550 / col;
        positionY = 600 / row;
        player = new Player();
        En = new Boss();
        map = new int[row][col];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }

    }

    public void draw(Graphics g2) {
        Random rand = new Random();
        int t = 1;

        if (GamePanel.resecond() % 3 == 0 && GamePanel.reticks() == t) {
            t += 58;
            i = rand.nextInt(5);
            j = rand.nextInt(6);
            System.out.println(i + " " + j);
            if (t > 59)
                t = 1;
        }
        if (map[i][j] != 0) {

            g2.drawImage(En.enemy[0], j * positionX + 65, i * positionY + 50, 60, 60, null);
        }

    }

}