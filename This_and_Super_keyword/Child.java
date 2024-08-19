package This_and_Super_keyword;

public class Child extends Parent {

    public Child(){
        //super();
        super(11);
    }

    String Emp_name = "Mijan";
    int Id_No = 789654123;

    public static void main(String[] args) {
        Child c = new Child();
        c.getData();

    }

    public void getData() {
        //super.getData();
        System.out.println(super.Emp_name);
        System.out.println(super.Id_No);
    }

}

