package This_and_Super_keyword;

public class ThisKeywordDemo {

    int x = 10;
    int y = 20;
    String s = "JAVA";

    public static void main(String[] args) {
        ThisKeywordDemo dm = new ThisKeywordDemo();
        dm.getData();
    }

    public void getData() {
        int x = 77;
        int y = 15;
        System.out.println(this.x * this.y);
        System.out.println(x * x);
    }
}
