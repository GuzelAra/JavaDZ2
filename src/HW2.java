import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HW2 {


    Path of = Path.of("file.txt");
    if (Files.notExists(of)) ;
        Files.createFile(of);
    String text = "TEXT";
    text = text.repeat(100);
        Files.writeString(of, text);




    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
    }

    private static String buildString(int n, char c1, char c2) {

        String str = new String();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                str += c1;
            else
                str += c2;
        }
        return str;
    }

}



