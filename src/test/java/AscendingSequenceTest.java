import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceHappyPass () {

        //1A
        int endNumber = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};


        //2A
        AscendingSequence ascendingSequence = new AscendingSequence();

        int[] actualResult = ascendingSequence.buildAscendingSequence(endNumber);


        //3A
        Assert.assertArrayEquals(expectedResult, actualResult);






    }
}
