import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read {

    public static void main(String[] args) throws IOException {
        String whatToRead = "read.txt";
        String whereToWrite = "write.txt";

        try(
            FileReader fr = new FileReader(whatToRead);
            BufferedReader bfr = new BufferedReader(fr);
            FileWriter fw = new FileWriter(whereToWrite);
            BufferedWriter bfw = new BufferedWriter(fw);
        ){
            String line;
            while ((line = bfr.readLine()) != null) {
                bfw.write(line);
                bfw.newLine();
            }

            System.out.println("Successfully edited...");
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}