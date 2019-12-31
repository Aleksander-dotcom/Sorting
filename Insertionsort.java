package zadania.tablice;
import java.util.Arrays;
import java.util.Random;

public class Insertionsort {
    public static void main(String[] args) {
        Insertionsort sort = new Insertionsort();
        Random random = new Random();
        int[] table = new int[20];
        for (int i = 0; i<table.length; i++){
            table[i] = random.nextInt(30);
        }

        System.out.println(Arrays.toString(table));
        sort.insertion_sort(table);
        System.out.println(Arrays.toString(table));
    }

    private void insertion_sort(int[] table) {
        for (int i = 0; i < table.length-1; i++){
            int index = i;
            for (int j = i+1; j < table.length; j++){
                if (table[j]<table[index]){
                    index = j;
                }
            }
            int tmp = table[i];
            table[i] = table[index];
            table[index] = tmp;
        }
    }
}