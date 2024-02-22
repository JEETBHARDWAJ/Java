
public class reversed {
    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5 };

        int array2[] = new int[array1.length];
        int j = 0;

        for (int i = array1.length - 1; i >= 0; i--, j++) {
            array2[j] = array1[i];

            System.out.print(array2[j]);
        }

    }

}
