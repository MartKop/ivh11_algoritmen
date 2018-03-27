package Examples.hf5_opdr3;

public class Test {

    public static void main(String[] args) {
        String string = "thisget(){{()}";
        System.out.println("String " + string + " is - " + Haakjes.isParenthesisMatch(string));
    }
}