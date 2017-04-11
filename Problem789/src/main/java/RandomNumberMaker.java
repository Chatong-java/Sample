import java.util.Random;

/**
 * Created by blue on 2017-04-11.
 */
public class RandomNumberMaker {
    public int intRandom(int range){
        Random random = new Random();
        int result = random.nextInt(range);


        return result+1;
    }
}
