public class AscendingSequence {

    public int[] buildAscendingSequence(int endNumber) {
        int[] array = new int[endNumber];
        for (int i = 1; i <= endNumber; i++) {
            array[i - 1] = i;
           // System.out.print(array[i - 1]);
        }


        return array;
    }






}
