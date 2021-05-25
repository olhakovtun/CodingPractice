public class AscendingSequence {

    public int[] buildAscendingSequence(int startNumber, int endNumber) {
        int[] array = new int[endNumber - startNumber + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = startNumber + i;
            System.out.println(array[i]);
        }

        return array;
    }

    public String buildAscendingString(int startNumber, int endNumber) {
        if (startNumber >= endNumber || startNumber < Integer.MIN_VALUE && endNumber > Integer.MAX_VALUE) {
            System.out.println("Error");
            return "Error";
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = startNumber; i < endNumber; i++) {
                result.append(i).append(", ");
            }
            result.append(endNumber);
            System.out.println(result);
            return String.valueOf(result);
        }

    }
//    public String buildAscendingString(int startNumber) {
//        StringBuilder result = new StringBuilder();
//        for(int i = startNumber; i < 5; i++){
//            result.append(i).append(", ");
//
//        }
//        result.append(5);
//        System.out.println(result);
//        return String.valueOf(result);
//    }


}
