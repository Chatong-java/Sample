package kr.ac.jejunu;

import kr.ac.jejunu.Input.InputNumber;
import kr.ac.jejunu.calcservice.*;

/**
 * Created by replay on 2017. 3. 26..
 */
public class Application {

    public static void main(String[] args){
        Application application = new Application();
        application.run();
    }

    public void run (){
        InputNumber input = new InputNumber();
        CalcMaker calcMaker=null;

        int x = input.inputNumber();
        int y = input.inputNumber();
        int selection = input.inputNumber();

        switch (selection){
            case 1: calcMaker = new Add();
                break;
            case 2: calcMaker = new Subtraction();
                break;
            case 3: calcMaker = new Multiplication();
                break;
            case 4: calcMaker = new Divider();
                break;
            case 5: calcMaker = new Reminder();
                break;
                default:             System.out.println("hhhh");

        }

        if (calcMaker != null) {
            int result = calcMaker.operation(x, y);
            System.out.println(result);
        }



    }
}
