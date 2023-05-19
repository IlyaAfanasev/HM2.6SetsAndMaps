import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        printEvenSortNumbers(nums);



    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void printEvenSortNumbers(List<Integer> nums) {

        List<Integer> nums2=new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0&&!nums2.contains(num)) {
                nums2.add(num);
            }
        }
        Collections.sort(nums2);
        System.out.println(nums2);

    }

}