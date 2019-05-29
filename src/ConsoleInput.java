import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput{

    public static void main(String... args) throws IOException{

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
        System.out.println("Enter a name:");
        String name = reader.readLine();
        System.out.println("The name that you entered was ".concat(name));
    }
}
