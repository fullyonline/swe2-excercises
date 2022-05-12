package ch.juventus.streams;

import java.io.FileReader;
import java.io.Reader;

public class MyReader {
    public void read(){
        try{
            Reader reader = new FileReader("src\\main\\resources\\meinfile.txt");
            int character = reader.read();
            while(character != -1){
                System.out.println((char) character);
                character = reader.read();
            }
            reader.close();
        }
        catch(Exception e){

        }
    }

}
