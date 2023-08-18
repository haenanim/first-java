package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TileGame extends JFrame {
  private int tileSize = 10;
  private int numRows = 20;
  private int numCols = 20;
  private int playerX = 0;
  private int playerY = 0;
  private List<Enemy> enemies = new ArrayList<>();
  private Random random = new Random();

  public TileGame() {
    setTitle("Tile Game with Enemies");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
      }
    };

    panel.setPreferredSize(new Dimension(tileSize * numCols, tileSize * numRows));

    add(panel);

    panel.setFocusable(true);
    panel.requestFocusInWindow();

    panel.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
          case KeyEvent.VK_UP:
            if (playerY > 0) playerY--;
            break;
          case KeyEvent.VK_DOWN:
            if (playerY < numRows - 1) playerY++;
            break;
          case KeyEvent.VK_LEFT:
            if (playerX > 0) playerX--;
            break;
          case KeyEvent.VK_RIGHT:
            if (playerX < numCols - 1) playerX++;
            break;
        }
        panel.repaint();
      }
    });

    Timer timer = new Timer(500, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moveEnemies();
        panel.repaint();
      }
    });
    timer.start();

    // Initialize enemies
    for (int i = 0; i < 10; i++) {
      int enemyX = random.nextInt(numCols);
      int enemyY = random.nextInt(numRows);
      enemies.add(new Enemy(enemyX, enemyY));
    }
  }

  private void drawGame(Graphics g) {
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        int x = col * tileSize;
        int y = row * tileSize;
        if (row == playerY && col == playerX) {
          g.setColor(Color.RED);
          g.fillRect(x, y, tileSize, tileSize);
        } else {
          g.setColor(Color.GRAY);
          g.drawRect(x, y, tileSize, tileSize);
        }
      }
    }

    for (Enemy enemy : enemies) {
      g.setColor(Color.BLUE);
      g.fillRect(enemy.getX() * tileSize, enemy.getY() * tileSize, tileSize, tileSize);
    }
  }

  private void moveEnemies() {
    for (Enemy enemy : enemies) {
      int direction = random.nextInt(4); // 0: up, 1: down, 2: left, 3: right
      int enemyX = enemy.getX();
      int enemyY = enemy.getY();

      switch (direction) {
        case 0:
          if (enemyY > 0) enemyY--;
          break;
        case 1:
          if (enemyY < numRows - 1) enemyY++;
          break;
        case 2:
          if (enemyX > 0) enemyX--;
          break;
        case 3:
          if (enemyX < numCols - 1) enemyX++;
          break;
      }

      enemy.setX(enemyX);
      enemy.setY(enemyY);
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      TileGame game = new TileGame();
      game.pack();
      game.setVisible(true);
    });
  }

  private class Enemy {
    private int x;
    private int y;

    public Enemy(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public void setX(int x) {
      this.x = x;
    }

    public int getY() {
      return y;
    }

    public void setY(int y) {
      this.y = y;
    }
  }
}
