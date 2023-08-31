import java.io.BufferedReader;
import java.net.URL;
import java.util.Scanner;

public class ResourceLoaderDemo {

    public static void main(String[] args) {
        var resource = ResourceLoaderDemo.class.getClassLoader().getResourceAsStream("myresource.txt");

        var in = new Scanner(resource);
        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}
