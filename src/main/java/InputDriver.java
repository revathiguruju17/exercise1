import java.util.Scanner;

public class InputDriver {
    static String readString(){
        Scanner scanner = new Scanner( System.in );
        return scanner.next();
    }

    static int readInt(){
        Scanner scanner = new Scanner( System.in );
        return scanner.nextInt();
    }
}
