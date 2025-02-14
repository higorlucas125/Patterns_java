package PatternsCreational.LearningFactory;

import PatternsCreational.LearningFactory.factory.Dialog;
import PatternsCreational.LearningFactory.factory.HtmlDialog;
import PatternsCreational.LearningFactory.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;


    public static void main(String[] args) {
       configure();
       runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Linux")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }

}
