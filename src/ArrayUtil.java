import java.util.ArrayList;
import java.util.List;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here
        String[] array3;
        List<String> array3List = new ArrayList<>();

        for(String arr1:array1) {
            for(String arr2:array2) {
                if (arr1.equals(arr2)) {
                    if(!array3List.contains(arr1)) {
                        System.out.println("Common element is: " + arr1);
                        array3List.add(arr1);
                    }
                }
            }
        }
        array3 = new String[array3List.size()];

        for(int i=0;i<array3.length;i++) {
            array3[i] = array3List.get(i);
        }

        return array3;
    }
}