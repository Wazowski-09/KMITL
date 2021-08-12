import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import java.awt.event.KeyEvent;

public class GamePanel extends Canvas implements Runnable {

    private int Width = 0;
    private int Height = 0;
    private static int ticks = 0;
    private static int second = 0;
    private int minute = 0;
    // private int totalEnemy = 40; //กำหนดจำนวนศัตรู
    int score = 0;
    private boolean running = false;
    private boolean ending = true;
    private boolean winning = false;
    // private boolean Reset = false;
    private Thread thread;

    private Player player;
    private BufferedImage bglocation;
    private Enemy enemy;
    // public GameFrame gameFrame2;
    // private Bullet bullet;

    public GamePanel(int x, int y) {
        Width = x;
        Height = y;
        thread = new Thread(this, "Dispaly");
        player = new Player();
        enemy = new Enemy(5, 6); // กำหนกให้ศัตรูมี 5 แถว แถวละ 8 ตัว
        // bullet = new Bullet();

        bglocation = LoadImages.loadImages("/pic/bg.png");

        this.setFocusable(true); // ใช้กำหนดว่า view สามารถ ได้รับ focus หรือไม่
        this.addKeyListener(new KeyInput(player, this));
        this.setPreferredSize(new Dimension(Width, Height));
        this.setMinimumSize(new Dimension(Width, Height));
        this.setMaximumSize(new Dimension(Width, Height));
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_R) {
            // Reset = true;
            minute = 0;
            ending = true;
            winning = false;
            running = false;
            score = 0;
            second = 0;
            ticks = 0;
            enemy = new Enemy(5, 6);
        }

    }

    public synchronized void start() {// synchronized(ขณะนั้นจะมีเพียง thread เดียวเท่านั้นที่กำลังทำงาน)

        if (running == false) {
            running = true;
            thread.start();
        }
    }

    public synchronized void stop() {
        if (running == true) {
            running = false;
            try { // ในบล็อคคำสั่งของ try เป็นส่วนของโปรแกรมที่อาจจะทำให้เกิด exception ขึ้น
                thread.join();
            } catch (InterruptedException e) { // catch เป็นการจัดการกับ exception แต่ละแบบ
                e.printStackTrace(); // ใช้ในการบอกรายละเอียดเกี่ยวกับข้อผิดพลาดให้กับเรา เช่น
                                     // บรรทัดที่ทำให้เกิดความผิดพลาด และคลาสที่รัน
            }
        }

    }

    @Override
    public void run() { // ทำเวลา นาที : วินาที

        double tickPerTime = 1000000000 / 60;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        while (running == true || ending == true) {

            now = System.nanoTime();
            delta += (now - lastTime) / tickPerTime;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                update();
                draw();
                ticks++;
                if (ticks == 60)
                    second++;
                if (second == 60) {
                    second = 0;
                    minute++;
                }
                delta--;
            }
            if (timer >= 1000000000) {

                timer = 0;
                ticks = 0; // ไม่ให้เกิน60
            }
            if (minute == 1)
                ending = false;
            if (score == 30)
                winning = true;

        }
        stop();
    }

    public static int resecond() {

        return second;
    }

    public static int reticks() {

        return ticks;
    }

    public void update() {
        player.update();
    }

    public void draw() {

        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();

        g2.clearRect(0, 0, Width, Height);

        g2.drawImage(bglocation, 0, 0, Width, Height, null);
        if (ending == true && winning == false) {
            g2.drawString("[ TIME ] " + minute + " : " + second + " . " + ticks, 10, 20);
            g2.drawString("[ SCORE ]  : " + score, 550, 20);
        }
        if (ending == false) {
            g2.drawString("Time Out  ", 260, 200);
            g2.drawString("  [ SCORE ]  : " + score, 250, 300);
            g2.drawString("<<< Press R : to restart >>> ", 230, 500);
        }
        if (winning == true) {
            minute = 2;
            g2.drawString("YOU Won  ", 260, 200);
            g2.drawString("  [ SCORE ]  : " + score, 250, 300);
            g2.drawString("<<< Press R : to restart >>> ", 230, 500);
        }

        player.draw(g2);
        // if (GamePanel.resecond()%3 == 0)
        enemy.draw(g2);

        gf();

        bs.show();
        g2.dispose();

    }

    public int gf() {
        if (ending == false) {
            for (int i = 0; i <= 4; i++) {
                for (int j = 0; j <= 5; j++) {
                    enemy.map[i][j] = 0;
                }
            }
        }

        if (player.reFX() >= 20 && player.reFX() <= 65) {
            if (enemy.map[4][0] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][0] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][0] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][0] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][0] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][0] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][0] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][0] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][0] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][0] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }

        if (player.reFX() >= 120 && player.reFX() <= 160) {
            if (enemy.map[4][1] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][1] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][1] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][1] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][1] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][1] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][1] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][1] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][1] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][1] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }

        if (player.reFX() >= 200 && player.reFX() <= 245) {
            if (enemy.map[4][2] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][2] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][2] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][2] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][2] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][2] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][2] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][2] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][2] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][2] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }

        if (player.reFX() >= 295 && player.reFX() <= 340) {
            if (enemy.map[4][3] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][3] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][3] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][3] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][3] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][3] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][3] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][3] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][3] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][3] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }

        if (player.reFX() >= 385 && player.reFX() <= 430) {
            if (enemy.map[4][4] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][4] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][4] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][4] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][4] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][4] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][4] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][4] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][4] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][4] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }

        if (player.reFX() >= 480 && player.reFX() <= 520) {
            if (enemy.map[4][5] != 0) {
                if (player.reFY() == 600 - 5) {
                    enemy.map[4][5] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[3][5] != 0) {
                if (player.reFY() == 480 - 5) {
                    enemy.map[3][5] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[2][5] != 0) {
                if (player.reFY() == 360 - 5) {
                    enemy.map[2][5] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[1][5] != 0) {
                if (player.reFY() == 240 - 5) {
                    enemy.map[1][5] = 0;
                    score++;
                    return player.FY = -30;
                }
            }
            if (enemy.map[0][5] != 0) {
                if (player.reFY() == 120 - 5) {
                    enemy.map[0][5] = 0;
                    score++;
                    return player.FY = -30;
                }
            }

        }
        return score;
    }

}
