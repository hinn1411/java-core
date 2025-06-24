import java.util.Arrays;

public class Array {

    public static void main(String[] args ) {
        int size = 10;
        int[] nums = initArray(size);

        int[] dupNums = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(dupNums));
        Integer[] boxedDupNums = Arrays.stream(dupNums).boxed().toArray(Integer[]::new);
        sortArray(boxedDupNums);
        System.out.println(Arrays.toString(boxedDupNums));

    }
    private static int[] initArray(int arraySize) {
        int[] nums = new int[arraySize];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        return nums;

    }

    private static void sortArray(Integer[] arr) {
        Arrays.sort(arr, (first, second) -> second - first);
    }
}
