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

    @Test
    public void testAscendingSequenceStringHappyPath() {
        int startNumber = 1;
        int endNumber = 5;
        String expectedResult = "1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringHappyPathZero() {
        int startNumber = 0;
        int endtNumber = 5;
        String expectedResult = "0, 1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringHappyPathZeroToTen() {
        int startNumber = 0;
        int endtNumber = 10;
        String expectedResult = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringHappyPathNegativeFiveToTen() {
        int startNumber = -5;
        int endtNumber = 10;
        String expectedResult = "-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringHappyPathNegativeFiveToZero() {
        int startNumber = -5;
        int endtNumber = 0;
        String expectedResult = "-5, -4, -3, -2, -1, 0";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringNegativeTest() {
        int startNumber = 5;
        int endtNumber = 0;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringNegativeStartNumberEqualEndNumber() {
        int startNumber = -9;
        int endtNumber = -9;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStringNegativeBigNumbers() {
        int startNumber = -2147483648 - 1;
        int endtNumber = 2147483647 + 1;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endtNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
