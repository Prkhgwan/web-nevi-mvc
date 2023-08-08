package Controller;

import DAO.DAO;
import MrScanner.MrScanner;
import View.View;

public class Controller {
    View view = new View();
    DAO dao = new DAO();
    MrScanner sc = MrScanner.getInstance();
    String URL2 = "";
    public void start() {
        while(true) {
            String input = sc.stringInput();
            if (input.contains("VISIT")) {
                URL2 = input.substring(6);
                input = input.substring(0,5);
            }
            switch (input) {
                case "VISIT":
                    dao.visit(URL2);
                    break;
                case "BACK":
                    dao.back();
                    break;
                case "FORWARD":
                    dao.foward();
                    break;
                case "QUIT":
                    return;
            }
        }
    }
}
