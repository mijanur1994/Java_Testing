package ReadData;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

    public static void main(String[] args) throws IOException {

        //Step 1 : Create an object if FileReader Class which is already in JAVA
        FileReader fr = new FileReader("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestData.properties");

        //Step 2: Create an object of properties class
        Properties pr = new Properties();

        //Step 3: Load the properties file
        pr.load(fr);

        //Step 4: Use get property method to get property
        System.out.println(pr.getProperty("Website"));
        System.out.println(pr.getProperty("Name"));
    }
}
