public class AscendingSequence {

    public int[] buildAscendingSequence(int startNumber, int endNumber) {
        int[] array = new int[endNumber - startNumber + 1];
        for (int i = 0; i < array.length; i++) {
          array[i] = startNumber + i;
            System.out.println(array[i]);
        }

        return array;
    }






}
