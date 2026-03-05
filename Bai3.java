import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một chuỗi ký dự dấu ngoặc: ");
        String input = sc.nextLine();

        if (input.equals("")) {
            System.out.println("Chuỗi rỗng");
            return;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if(input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Chuỗi không hợp lệ");
                    return;
                }
                char top = stack.pop();
                if ((input.charAt(i) == ')' && top != '(') || (input.charAt(i) == '}' && top != '{') || (input.charAt(i) == ']' && top != '[')) {
                    System.out.println("Chuỗi hợp lệ");
                }
            }
        }

    }
}






