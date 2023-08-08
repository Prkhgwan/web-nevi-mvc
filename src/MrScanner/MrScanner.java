package MrScanner;

import java.util.Scanner;

public class MrScanner {
    private static MrScanner instance;
    private Scanner sc = null;

    private MrScanner() {
        this.sc = new Scanner(System.in);
    }

    public static MrScanner getInstance() {
        if (instance == null) {
            instance = new MrScanner();
        }
        return instance;
    }

    public String stringInput() {
        return sc.nextLine();
    }
}
