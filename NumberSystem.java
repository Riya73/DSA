import java.util.Scanner;

public class NumberSystem {

    // Decimal to Binary conversion
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return decimalToBinary(decimal / 2) + String.valueOf(decimal % 2);
        }
    }

    // Binary to Decimal conversion
    public static int binaryToDecimal(String binary) {
        return binaryToDecimalHelper(binary, 0, binary.length() - 1);
    }

    private static int binaryToDecimalHelper(String binary, int result, int index) {
        if (index < 0) {
            return result;
        } else {
            int digit = binary.charAt(index) - '0';
            result += digit * Math.pow(2, binary.length() - 1 - index);
            return binaryToDecimalHelper(binary, result, index - 1);
        }
    }

    // Decimal to Octal conversion
    public static String decimalToOctal(int decimal) {
        if (decimal < 8) {
            return String.valueOf(decimal);
        } else {
            return decimalToOctal(decimal / 8) + String.valueOf(decimal % 8);
        }
    }

    // Decimal to Hexadecimal conversion
    public static String decimalToHexadecimal(int decimal) {
        if (decimal < 16) {
            return toHexChar(decimal);
        } else {
            return decimalToHexadecimal(decimal / 16) + toHexChar(decimal % 16);
        }
    }

    private static String toHexChar(int digit) {
        if (digit < 10) {
            return String.valueOf(digit);
        } else {
            return String.valueOf((char) ('A' + digit - 10));
        }
    }

    // Hexadecimal to Binary conversion
    public static String hexadecimalToBinary(String hexadecimal) {
        return decimalToBinary(hexadecimalToDecimal(hexadecimal));
    }

    // Hexadecimal to Decimal conversion
    public static int hexadecimalToDecimal(String hexadecimal) {
        return hexadecimalToDecimalHelper(hexadecimal, 0, hexadecimal.length() - 1);
    }

    private static int hexadecimalToDecimalHelper(String hexadecimal, int result, int index) {
        if (index < 0) {
            return result;
        } else {
            char digit = hexadecimal.charAt(index);
            int value;
            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                value = 10 + (digit - 'A');
            }
            result += value * Math.pow(16, hexadecimal.length() - 1 - index);
            return hexadecimalToDecimalHelper(hexadecimal, result, index - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Decimal to Binary
        String decimalToBinaryResult = decimalToBinary(decimal);
        System.out.println(decimal + " in binary: " + decimalToBinaryResult);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int binaryToDecimalResult = binaryToDecimal(binary);
        System.out.println(binary + " in decimal: " + binaryToDecimalResult);

        // Decimal to Octal
        String decimalToOctalResult = decimalToOctal(decimal);
        System.out.println(decimal + " in octal: " + decimalToOctalResult);

        // Decimal to Hexadecimal
        String decimalToHexadecimalResult = decimalToHexadecimal(decimal);
        System.out.println(decimal + " in hexadecimal: " + decimalToHexadecimalResult);

        // Hexadecimal to Binary
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        String hexadecimalToBinaryResult = hexadecimalToBinary(hexadecimal);
        System.out.println(hexadecimal + " in binary: " + hexadecimalToBinaryResult);

        scanner.close();
    }
}
