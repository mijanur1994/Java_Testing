package WriteData;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo1 {

    public static void main(String[] args) throws IOException {

        //Step 1 : Create an object of FileWriter Class which is already in JAVA
        // If append not true then file will be overwritten
        FileOutputStream fwt = new FileOutputStream("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestData.properties",true);

        //Step 2: Create an object of properties class
        Properties pr = new Properties();

        //Step 3: Use set property method to set property
        pr.setProperty("Employee ID", "123456789");
        pr.store(fwt, "Using FileOutPutStream");
    }
}
