package Lesson3;

import java.util.Arrays;

public class practiceLesson3 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        int[] data = new int[ARRAY_SIZE];

        Arrays.fill(data, -1);

        data[0] =3;
        data[1] =4;
        data[4] =4;

       // System.out.println(data);
    for (int i = 0; i < data.length; i++) {
        System.out.println(data[i] + " ");
        System.out.println(Arrays.toString(data));
    }

    }
}
