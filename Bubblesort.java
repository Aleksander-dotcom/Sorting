package zadania.tablice;
import java.util.Arrays;
import java.util.Random;

public class Bubblesort {
    public static void main(String[] args) {
        Bubblesort sort = new Bubblesort();
        Random random = new Random();
        int[] table = new int[20];
        for (int i = 0; i<table.length; i++){
            table[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(table));
        sort.bubble_sort(table);
        System.out.println(Arrays.toString(table));
    }

    private void bubble_sort(int[] table) {
        for (int j = 0; j<table.length-1;j++) {
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] > table[i + 1]) {
                    int temp = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = temp;
                }
            }
        }
    }
}