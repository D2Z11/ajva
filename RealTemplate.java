
public class RealTemplate {
    // From https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void print(Object contents) {
        System.out.print(contents);
    }

    static void println(Object contents) {
        System.out.print(contents + "\n");
    }

    public static void main(String[] args) {
    }
}
