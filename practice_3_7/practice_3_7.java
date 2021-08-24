public class practice_3_7 {
    public static void main(String[] args) {
        int i = 20;
        if (i > 79) {
          System.out.println("優");
        } else if (i > 69 && i < 80) {
          System.out.println("良");
        } else if (i > 59 && i < 70) {
          System.out.println("可");
        } else {
          System.out.println("不可");
        }
    }
}