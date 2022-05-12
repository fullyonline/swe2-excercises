package ch.juventus.streams;

import java.io.FileWriter;

public class MyWriter {
    public void write(){
        try{
            FileWriter writer = new FileWriter("src\\main\\resources\\meinNEUESfile.txt");
            StringBuffer buffer = new StringBuffer();
            String out = "HAHAHAHAHAHAAHA\neeem, ok.";
            writer.write(out);
            writer.close();
        }
        catch (Exception e){

        }
    }
}
