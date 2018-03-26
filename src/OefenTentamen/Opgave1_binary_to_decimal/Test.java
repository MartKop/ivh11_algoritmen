package OefenTentamen.Opgave1_binary_to_decimal;

public class Test {

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("10001"));


    }

    public static int binaryToDecimal(String binaryString) {
        int size = binaryString.length();
        if (size == 1) {
            return Integer.parseInt(binaryString);
        } else {
            return binaryToDecimal(binaryString.substring(1, size)) + Integer.parseInt(binaryString.substring(0, 1)) * (int) Math.pow(2, size - 1);
        }
    }
}

