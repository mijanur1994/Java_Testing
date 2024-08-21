package Collection_Java;
public class WrapperDemo {
    public static void main(String[] args) {
        //Wrapping primitive data type into an object
        int i = 10;//primitive Data Type
        Integer int1 = new Integer(i);// Wrpper class of java which holds the datatype of the variable in it-self.
        System.out.println(int1+", This is the value of i");

        //un Wrapping the wrapped class
        int x = int1;
        System.out.println(x+1 +", This is the value of x");
    }
}
