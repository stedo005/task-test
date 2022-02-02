public class Task4 {

    public static void main(String[] args) {
        printSum(add(7, 17));
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static void printSum(int sum) {
        System.out.println("Summe: " + sum);
    }

}
