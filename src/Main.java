import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words= new ArrayList<>(List.of(
                "Повторюсь", "в","отраженьях", "зеркал",
                "Повторюсь", "в", "эхе", "собственных", "мыслей",
                        "Повторюсь",  "в", "слове", "что", "вслух", "сказал",
                "И", "в", "стихах", "став", "их", "сути", "частицей"
        ));
        printOddNumbers(nums);
        printEvenSortNumbers(nums);
        printWords(words);



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
    public static void printWords(List<String> words) {

        List<String> words2=new ArrayList<>();
        for (String word : words) {
            if (!words2.contains(word)) {
                words2.add(word);
            }
        }

        System.out.println(words2);

    }

}