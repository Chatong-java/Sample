
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by blue on 2017-04-11.
 */
public class ProblemTest {
    /**
     *테스트 작성하는 방법 : 내가 이 함수에 무엇을 넣어서 무엇이 나오는 지만 생각한다 속에서 어떤 일이 벌어지는지는 생각하지않는다 (블랙박스 테스트)
     * ex) random함수는 45를 넣으면 45숫자 이하만 나와야 한다. 에 대한 테스트를 작성한다면,**/
    @Test
    public void random함수는_범위이하의_정수만_나와야한다(){
        int range = 45;
        int[] results = new int[100];
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();

        for (int i = 0 ; i <100; i++) {
            results[i] = randomNumberMaker.intRandom(range);

            System.out.println(results[i]);
            assertTrue(results[i]>0);
            assertTrue(results[i]<=range);
        }
    }
    /** 대충 쓰면 이런데 너무 안좋은 테스트같닼ㅋㅋㅋ
     *
     * */
}
