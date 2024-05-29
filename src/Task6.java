import java.util.Scanner;
import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите строку со скобками: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (checkBrackets(input)) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Ошибка: неправильная расстановка скобок");
        }
    }

    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

