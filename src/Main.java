import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{8, 2, 3, 4, 5, 6, 7};
        countSumOfEven(numbers);

        String[] words = new String[]{"Alexx9800"};
        writeUniqueCharacter(words);

    }

    public static void countSumOfEven(int[] numbers) {

        int sum = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of even number is " + sum);

    }

    public static void writeUniqueCharacter(String[] words) {

        for (String word : words) {
            char[] chars = word.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();

            for (Character character : chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
                if (helpMap.get(character) == 1) {
                    System.out.println(character);
                }
            }
        }

    }

}

