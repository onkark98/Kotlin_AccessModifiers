public class StringUtils {

    private static String normalize(String input) {
        return input.trim().toLowerCase();
    }

    static String formatName(String name) {
        return normalize(name);
    }

    public static void printName(String name) {
        System.out.println(formatName(name));
    }
}