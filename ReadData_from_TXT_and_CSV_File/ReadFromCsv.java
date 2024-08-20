package ReadData_from_TXT_and_CSV_File;

import java.io.*;

public class ReadFromCsv {
    public static void main(String[] args) throws IOException {
        //Step 1: Specify the location of the file which will be read
        File f = new File("D:\\##1Mijanur_Rahaman\\Java_Testing\\Properties_File\\TestDatCSV.csv");

        //Step 2: Create an object of FileReader class
        FileReader fr = new FileReader(f);

        // Step 3: Create an object of the buffer reader class
        BufferedReader br = new BufferedReader(fr);

        // Step 4: Now read the data
        for(int i = 1; i<5; i++){
            System.out.println(br.readLine());
        }
        br.close();
    }
}