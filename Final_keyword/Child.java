package Final_keyword;

public class Child extends Parent {

    public final int i = 10;


    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.i);
//        c.i = 2222;
        System.out.println(c.i);
        c.setData();

    }
//    public void setData(){
//        System.out.println(i);
//    }
}

