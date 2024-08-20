package WriteData_to_TXT_and_CSV_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCsv {
    public static void main(String[] args) throws IOException {
        //Step 1: Create an object of File Write
        //If append argument is true, content will be appended otherwise it will be replaced with the new one
        File f = new File("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestDatCSV.csv");
        FileWriter fr = new FileWriter(f, true);

        //Step 2: Write File via BufferWriter
        BufferedWriter bw = new BufferedWriter(fr);

        //Step 3: Write data to file
        for (int i=1; i<5; i++){
            bw.write("Java for Tester... Testing with Selenium..."+",");
        }


        //Step 4: Close the file
        bw.close();
    }
}

