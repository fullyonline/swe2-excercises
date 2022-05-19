package ch.juventus.nio;

public class Main {
    public static void main(String[] args) {
        NioExercise ne = new NioExercise();
        ne.createFolder();
        ne.createTextfile();
        ne.writeInTextfile();
        ne.moveExistingTextfile();
        ne.textfileExists();
        ne.readTextfile();
        ne.listDirectoryWithFiles();
        ne.deleteFolderWithFiles();
    }
}
