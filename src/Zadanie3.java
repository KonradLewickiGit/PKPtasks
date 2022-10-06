import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Zadanie3 {
    public void getPosts() {
        System.out.println("next - next quote");
        System.out.println("exit - exit program");
        String check = "next";
        Scanner sc = new Scanner(System.in);
        String scan;
        try {
            URL url = new URL("https://raw.githubusercontent.com/ajzbc/kanye.rest/master/quotes.json");
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            in.readLine();
            String inputLine=in.readLine();
            System.out.println(inputLine);
            while (!(inputLine = in.readLine()).equals("]")){
                scan=sc.nextLine();
                if (scan.equals(check))
                    System.out.println(inputLine);
                else if (scan.equals("exit"))
                    break;
            }
            in.close();
        } catch (IOException ex) {
            System.err.println("error");
        }
    }
}
