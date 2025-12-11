import java.util.Scanner;

public class Q6 {

    public static boolean isMirror(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        if (a.length < 1 || a.length > 50) {
            return false;
        }

        int n = a.length;
        
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            
            if (a[i] != b[j]) {
                return false;
            }
        }
        
        return true;
    }

    public static int[] convertToArray(String input) throws NumberFormatException {
        String[] strNumbers = input.split(",");
        int[] result = new int[strNumbers.length];
        
        for (int i = 0; i < strNumbers.length; i++) {
            String numberStr = strNumbers[i].trim();
            result[i] = Integer.parseInt(numberStr);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array A (comma-separated): ");
        String inputA = scanner.nextLine();

        System.out.print("Enter Array B (comma-separated): ");
        String inputB = scanner.nextLine();

        try {
            int[] arrayA = convertToArray(inputA);
            int[] arrayB = convertToArray(inputB);
            
            boolean result = isMirror(arrayA, arrayB);
            
            System.out.println("Mirror pattern: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please ensure all inputs are comma-separated integers.");
        }
        
        scanner.close();
    }
}
