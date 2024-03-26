package javafiles;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 45, 62, 7, 48, 44, 8 };
        int x = 8;
        int found = linearS(arr, x);

    }

    static int linearS(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;

    }

}
