package DAO;

import View.View;

import java.util.Stack;

public class DAO {
    View view = new View();
    Stack<String> Back = new Stack<>();
    Stack<String> Forward = new Stack<>();
    String URL = "http://www.acm.org/";

    public void visit(String URL2) {
        Back.push(URL);
        URL = URL2;
        view.println(URL);
        Forward.clear();
    }

    public void back() {
        if(!Back.empty()) {
            Forward.push(URL);
            URL = Back.pop();
            System.out.println(URL);
        } else {
            System.out.println("Ignored");
        }
    }
    public void foward() {
        if(!Forward.empty()) {
            Back.push(URL);
            URL = Forward.pop();
            System.out.println(URL);
        } else {
            System.out.println("Ignored");
        }
    }

}
