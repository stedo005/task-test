public class Task5 {

    public static void main(String[] args) {
        System.out.println(checkString("Hallo"));
        System.out.println(checkString("Hallo ziemlich langer String"));
        System.out.println(checkString("Hallo ziemlich langer fancy String"));
    }

    private static boolean checkString(String s) {
        return s.length() > 20 && s.contains("fancy");
    }

}
