package Q6;

public class teste {
    public static void main(String[] args) {
       boolean coisa = isInteger("12.3");
       MyIO.println(coisa);
    }

    private static boolean isInteger(String str) {
        return str != null && str.matches("^([+-]?\\d*\\.?\\d*)$");
    }
}
