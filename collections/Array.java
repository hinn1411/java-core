package collections;

import java.util.Arrays;
import java.util.Comparator;


class Employee {
    public String name;
    public int employeeId;

    public  Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
}

public class Array {

    public static void main(String[] args ) {
        int size = 10;
        int[] nums = initArray(size);

        int[] dupNums = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(dupNums));
        Integer[] boxedDupNums = Arrays.stream(dupNums).boxed().toArray(Integer[]::new);
        sortArray(boxedDupNums);
        System.out.println(Arrays.toString(boxedDupNums));

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Giang", 1);
        employees[1] = new Employee("Tuan", 2);
        employees[2] = new Employee("Hien", 3);
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return  e1.name.compareTo(e2.name);
            }
        });
        for (Employee e: employees) {
            System.out.println(e.name);
        }

        Arrays.fill(nums, 999);
        System.out.println(Arrays.toString(nums));

        int[] ints = {0,2,4,6,8,10};
        int target = 8;
        int targetIndex = Arrays.binarySearch(ints, target);
        System.out.println(targetIndex);

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
