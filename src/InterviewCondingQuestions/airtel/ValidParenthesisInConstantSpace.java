package InterviewCondingQuestions.airtel;

public class ValidParenthesisInConstantSpace {
    public static boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) return false;
            }
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()()"));    // true
        System.out.println(isValid("(())"));    // true
        System.out.println(isValid("(()"));     // false
        System.out.println(isValid("())("));    // false

    }
}
