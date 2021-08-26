public class practice_pyramid {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 5; i++) {
          for (int j = 0; j < 5 - (i + 1); j++) {
            System.out.print(" ");
          }
          for (int k = 0; k < (i + 1) * 2 - 1; k++) {
            System.out.print("*");
          }
          System.out.println("");
        }
    }
}