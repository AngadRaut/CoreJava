package May.Arrays.PracticeArrays;

public class ArrayDashPatternQ3 {
    public static void main(String[] args) {
        String[] arrayDash = new String[10];
        for (int i = 0; i < arrayDash.length; i++) {
            for (int j = 0; j < arrayDash.length; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
