package app.view;

import app.Controller.AnswerChecker;

public class Outputer {

    public void Output(){
        MainView mv = new MainView();
        AnswerChecker ac = new AnswerChecker();
        Inputer in = new Inputer();

        System.out.println(mv.Menu());
        ac.Checker(in.MenuInp());
    }
}
