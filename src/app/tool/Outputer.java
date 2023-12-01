package app.tool;

import app.view.MainView;

public class Outputer {

    public void Output(){
        MainView mv = new MainView();
        AnswerChecker ac = new AnswerChecker();
        Inputer in = new Inputer();

        System.out.println(mv.Menu());
        ac.Checker(in.MenuInp());
    }
}
