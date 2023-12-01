package app.tool;

import app.devices.DeviceA;
import app.devices.DeviceB;
import app.util.Rounder;
import app.view.MainView;

public class AnswerChecker {

    public void Checker(String answer) {

        DeviceA a = new DeviceA();
        DeviceB b = new DeviceB();
        Inputer in = new Inputer();
        MainView mv = new MainView();
        Rounder round = new Rounder();

        switch (answer) {
            case "1" -> {
                System.out.println(mv.Nums());
                System.out.println(a.Result() + round.Round(a.CalcResult(in.Nums())));
            }
            case "2" -> {
                System.out.println(mv.Nums());
                System.out.println(b.Result() + round.Round(b.CalcResult(in.Nums())));
            }
            case "3" -> {
                System.out.println(mv.Exit());
                System.exit(0);
            }
            default -> {
                System.out.println(mv.Incorrect());
                System.exit(0);
            }
        }
    }
}