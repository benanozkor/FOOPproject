
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public void createMenuFileContent(String content) {
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
        }catch (IOException exception){
            System.out.println("Sorry can't show the menu ");
            exception.printStackTrace();;
        }
    }

    public void printMenuFileContent(){
        File file = new File(fileName);
        try(Scanner scanner = new Scanner(file)){
            System.out.println("File content");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (IOException exception) {
            System.out.println("Error while reading file");
            exception.printStackTrace();
        }
    }
}
