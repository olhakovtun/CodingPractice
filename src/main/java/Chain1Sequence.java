import java.util.ArrayList;
import java.util.List;

public  class Chain1Sequence {

    public static boolean isNumeric(String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static List<String> getExpectedValues(String value){
        List<String> expectedValues = new ArrayList<>();
        int valueInt;
        if(isNumeric(value)){
            valueInt = Integer.parseInt(value);
            if(valueInt >= 0){
                expectedValues.add(String.valueOf(valueInt));
                for (int i = 2; i <= 10; i++) {
                    valueInt = valueInt * 2;
                    expectedValues.add(String.valueOf(valueInt));
                }

                return  expectedValues;
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        String numValue = "0070";
        System.out.println(getExpectedValues(numValue));
    }
}
