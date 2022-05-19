package ch.juventus.nio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioExercise {
    private final String foldername = "folder";
    private final String filename = "folder\\file.txt";
    private final String filename2 = "folder\\file2.txt";

    public void createFolder(){
        try{
            Path p = Paths.get(foldername);
            Files.createDirectories(p);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void createTextfile(){
        try {
            Path p = Paths.get(filename);
            Files.createFile(p);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void writeInTextfile(){
        try {
            Path p = Paths.get(filename);
            Files.writeString(p, "append this text");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void moveExistingTextfile(){
        try {
            Path p1 = Paths.get(filename);
            Path p2 = Paths.get(filename2);
            Files.move(p1, p2);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void textfileExists(){
        Path p = Paths.get(filename2);
        if(Files.exists(p)){
            System.out.println("exists");
        }else {
            System.out.println("not exists");
        }
    }

    public void readTextfile(){
        Path p = Paths.get(filename2);
        try{
            System.out.println(Files.readString(p));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void listDirectoryWithFiles(){
        try{
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(foldername));
            for (Path path : directoryStream) {
                System.out.println(path.toString());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void deleteFolderWithFiles(){
        try{
            // Files
            Path p;
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(foldername));
            for (Path path : directoryStream) {
                p = Paths.get(path.toString());
                Files.deleteIfExists(p);
            }
            // Folder
            p = Paths.get(foldername);
            Files.deleteIfExists(p);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
