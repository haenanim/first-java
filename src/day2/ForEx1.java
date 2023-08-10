package day2;

public class ForEx1 {
  public static void main(String[] args) {
    int n = 5;
    int[][] answer = new int[n][n];
    int x = 0;
    int y = 0;
    int arrow = 0;
    int count = 2;
    int loopCount = n*n;
    answer[0][0] = 1;
    while (count <= loopCount) {
      if (x + 1 < n && arrow == 0 && answer[y][x + 1] == 0) {
        x++;
        answer[y][x] = count++;
      } else if (y + 1 < n && arrow == 1 && answer[y + 1][x] == 0) {
        y++;
        answer[y][x] = count++;
      } else if (x - 1 > -1 && answer[y][x - 1] == 0 && arrow == 2) {
        x--;
        answer[y][x] = count++;
      } else if (y - 1 > -1 && answer[y - 1][x] == 0 && arrow == 3) {
        y--;
        answer[y][x] = count++;
      } else if (arrow == 3) {
        arrow = 0;
      } else {
        arrow++;
      }
    }

    for(int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        System.out.print(answer[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
