public class practice_3_13 {
    public static void main(String[] args) {
        int i = 2;
        switch (i) {
          case (1):
          case (3):
          case (5):
          case (7):
          case (8):
          case (10):
          case (12): {
            System.out.println("月末日は31日です。");
            break;
          }
          case (4):
          case (6):
          case (9):
          case (11): {
            System.out.println("月末日は30日です。");
            break;
          }
          case (2): {
            System.out.println("月末日は28日です。");
            break;
          }
          default: {
            System.out.println("1月〜12月を指定してください。");
            break;
          }
        }
    }
}