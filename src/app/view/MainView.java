package app.view;

public class MainView {

    public String Menu(){
        return """
                What do tou want to do?
                1 - Multiply
                2 - Add with coefficient ( 250% )
                3 - Exit""";
    }

    public String Nums(){
        return  "\nEnter 2 numbers: ";
    }

    public String Exit(){
        return "\nGood bye.";
    }

    public String Incorrect(){
        return "\nIncorrect answer.";
    }
}
