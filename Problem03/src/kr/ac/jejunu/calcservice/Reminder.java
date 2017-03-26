package kr.ac.jejunu.calcservice;

/**
 * Created by replay on 2017. 3. 26..
 */
public class Reminder implements CalcMaker {
    @Override
    public int operation(int x, int y) {
        return x%y;
    }
}
