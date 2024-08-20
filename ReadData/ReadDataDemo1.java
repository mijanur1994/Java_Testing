package ReadData;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo1 {
    public static void main(String[] args) throws IOException {

        //Step 1 : Create an object of File Input Stream Class which is already in JAVA
        //Instead of file reader we can user File Input Stream
        //Step 2: Create an object of properties class
        //FileInputStream fis = new FileInputStream("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestData.properties");

        //instead of hard coding we can use method to read the file
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties_File\\TestData.properties");

        Properties pr = new Properties();

        //Step 3: Load the properties file
        pr.load(fis);

        //Step 4: Use get property method to get property
        System.out.println(pr.getProperty("Website"));
        System.out.println(pr.getProperty("Name"));
        //System.out.println(System.getProperty("user.dir"));
    }
}

