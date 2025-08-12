public class Duplicates {
    public static void main(String[] args) {
        int[] num = {3, 6, 8, 3, 2, 8, 1};
        System.out.print("Duplicates:- ");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[i] + " ");
                    break;
                }
            }
        }
    }
}