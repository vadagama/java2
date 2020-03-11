package lesson2home;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FromStringToArray {
    public int[][] array_z;

    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[] array_x = str.split("\n");
        try {
            String[][] strArray = getArray(array_x);
            int[][] intArray = getDigitalArray(strArray);
            int sum = sumArray(intArray);
            System.out.println(sum);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    private static String[][] getArray(String[] array) {
        String[][] array_z = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            String[] array_y = array[i].split(" ");
            if (array_y[i].length() != 3) throw new ArithmeticException("Массив не равен 4");
            else {
                for (int j = 0; j < array_y.length; j++) array_z[i][j] = array_y[j];
            }
        }
        return array_z;
    }

    private static int[][] getDigitalArray(String[][] array) {
        int[][] array_z = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array_z[i][j] = Integer.parseInt(array[i][j]);
            }
        }
        return array_z;
    }

    private static int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
        }
        return sum / 2;
    }


}
