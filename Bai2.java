import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một đoạn văn bản: ");
        String text = sc.nextLine();

        text = text.toLowerCase();
        text = text.replaceAll("[.,]", "");

        Map<Integer, Character> map = new HashMap<Integer, Character>();

        String[] words = text.split(" ");
        for (String word : words) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, word.charAt(0));
            }
        }

        ArrayList<Integer> lengths = new ArrayList<Integer>(map.keySet());
        for (int i = 0; i < lengths.size() - 1; i++) {
            for (int j = 0; j < lengths.size() - i - 1; j++) {
                if (lengths.get(j) > lengths.get(j + 1)) {
                    int temp = lengths.get(j);
                    lengths.set(j, lengths.get(j + 1));
                    lengths.set(j + 1, temp);
                }
            }
        }
        for (int length : lengths) {
            System.out.print(length + " ký tự: [");
            for (String word : words) {
                if (word.length() == length) {
                    System.out.print(word + " ");
                }
            }
            System.out.println("]");
        }

    }
}
