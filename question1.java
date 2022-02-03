import java.util.Scanner;
import java.time.LocalTime;

public class uppercaseToLowecase {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char ch = scanner.next().charAt(0);

        if (ch == 'a'){
            ch = 'A';
        }

        if (ch == 'b'){
            ch = 'B';
        }

        if (ch == 'c'){
            ch = 'C';
        }

        if (ch == 'd'){
            ch = 'D';
        }

        if (ch == 'e'){
            ch = 'E';
        }

        if (ch == 'f'){
            ch = 'F';
        }

        if (ch == 'g'){
            ch = 'G';
        }

        if (ch == 'h'){
            ch = 'H';
        }

        if (ch == 'i'){
            ch = 'I';
        }

        if (ch == 'j'){
            ch = 'J';
        }

        if (ch == 'k'){
            ch = 'K';
        }

        if (ch == 'l'){
            ch = 'L';
        }

        if (ch == 'm'){
            ch = 'M';
        }

        if (ch == 'n'){
            ch = 'N';
        }

        if (ch == 'o'){
            ch = 'P';
        }

        if (ch == 'q'){
            ch = 'Q';
        }

        if (ch == 'r'){
            ch = 'R';
        }

        if (ch == 's'){
            ch = 'S';
        }

        if (ch == 't'){
            ch = 'T';
        }

        if (ch == 'u'){
            ch = 'U';
        }

        if (ch == 'v'){
            ch = 'V';
        }

        if (ch == 'w'){
            ch = 'W';
        }

        if (ch == 'x'){
            ch = 'X';
        }

        if (ch == 'y'){
            ch = 'Y';
        }

        if (ch == 'z'){
            ch = 'Z';
        }


        
        LocalTime now = LocalTime.now(); 
        LocalTime newLocalTime = now.plusSeconds(2);

            while(LocalTime.now() != newLocalTime){
                System.out.println(ch);
                System.out.println("delayes");
            }
    }
}