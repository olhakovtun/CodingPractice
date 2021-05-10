import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceHappyPath() {

        //1A
        int startNumber = 1;
        int endNumber = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};


        //2A
        AscendingSequence ascendingSequence = new AscendingSequence();

        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);


        //3A
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceZeroCase() {
        int startNumber = 0;
        int endNumber = 3;
        int[] expectedResult = {0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeNumbersCase() {
        int startNumber = -8;
        int endNumber = -1;
        int[] expectedResult = {-8, -7, -6, -5, -4, -3, -2, -1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativePositiveNumbersCase() {
        int startNumber = -2;
        int endNumber = 3;
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingSequence(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }


}
