import java.util.Random;
import java.util.Scanner;

class Tile {
  private boolean hasCrop;
  private boolean isHarvestable;

  public Tile() {
    hasCrop = false;
    isHarvestable = false;
  }

  public boolean hasCrop() {
    return hasCrop;
  }

  public boolean isHarvestable() {
    return isHarvestable;
  }

  public void plantCrop() {
    hasCrop = true;
    isHarvestable = false;
  }

  public void grow() {
    if (hasCrop && !isHarvestable) {
      isHarvestable = true;
    }
  }

  public void harvest() {
    if (hasCrop && isHarvestable) {
      hasCrop = false;
      isHarvestable = false;
    }
  }
}

class Farm {
  private Tile[][] tiles;

  public Farm(int size) {
    tiles = new Tile[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        tiles[i][j] = new Tile();
      }
    }
  }

  public void plantCrop(int x, int y) {
    tiles[x][y].plantCrop();
  }

  public void growCrops() {
    for (int i = 0; i < tiles.length; i++) {
      for (int j = 0; j < tiles[i].length; j++) {
        tiles[i][j].grow();
      }
    }
  }

  public void harvestCrop(int x, int y) {
    tiles[x][y].harvest();
  }

  public int getSize() {
    return tiles.length;
  }

  public Tile getTile(int x, int y) {
    return tiles[x][y];
  }
}

class Game {
  private Farm farm;
  private int gold;
  private int day;

  public Game(int farmSize) {
    farm = new Farm(farmSize);
    gold = 100;
    day = 1;
  }

  public void play() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    while (true) {
      System.out.println("Day " + day);
      System.out.println("Gold: " + gold);

      farm.growCrops();

      int x = random.nextInt(farm.getSize());
      int y = random.nextInt(farm.getSize());

      System.out.println("Choose an action:");
      System.out.println("1. Plant crop");
      System.out.println("2. Harvest crop");
      System.out.println("3. Next day");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          if (gold >= 10 && !farm.getTile(x, y).hasCrop()) {
            gold -= 10;
            farm.plantCrop(x, y);
            System.out.println("Crop planted at (" + x + ", " + y + ")");
          } else {
            System.out.println("Cannot plant crop here.");
          }
          break;
        case 2:
          if (farm.getTile(x, y).hasCrop() && farm.getTile(x, y).isHarvestable()) {
            farm.harvestCrop(x, y);
            gold += 20;
            System.out.println("Crop harvested at (" + x + ", " + y + ")");
          } else {
            System.out.println("No harvestable crop here.");
          }
          break;
        case 3:
          day++;
          break;
        default:
          System.out.println("Invalid choice.");
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Game game = new Game(20);
    game.play();
  }
}
