package This_and_Super_keyword;

public class Parent {

    public Parent(){
        System.out.println("Parent Constructor");
    }

    public Parent(int i){
        System.out.println("Parameter based Constructor");
    }

    String Emp_name = "ABCD";
    int Id_No = 47899;

    public void getData() {
        System.out.println(Emp_name);
        System.out.println(Id_No);
    }

}
