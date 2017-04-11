package kr.ac.jejunu;

/**
 * Created by blue on 2017-03-23.
 */
public class Operation {
    private int intA;
    private int intB;
    private float result;

    public void operation(int selectNum){

        switch (selectNum) {
            case 1 : result = intA + intB;
                break;
            case 2: result = intA - intB;
                break;
            case 3: result = ((float)intA / (float)intB);
                break;
            case 4: result = intA * intB;
                break;
            case 5: result = intA % intB;
                break;

            default:System.out.println("잘못된 선택");
                break;
        }
    }

    public void setIntA(int intA) {
        this.intA = intA;
    }

    public void setIntB(int intB) {
        this.intB = intB;
    }

    public float getResult() {
        return result;
    }
}
