package zadania.tablice;
import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {
        Quicksort sort = new Quicksort();
        Random random = new Random();
        int[] table = new int[20];

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(table));

        double time = System.nanoTime();
        sort.quick_sort(table, 0, table.length - 1);
        System.out.println(Arrays.toString(table));
        System.out.println("Duration: " + String.format("%.10f",((System.nanoTime()-time)/Math.pow(10,9))) + " seconds");


    }

    private static void swap(int[] table,int left,int right){
        int tmp = table[left];
        table[left] = table[right];
        table[right] = tmp;

    }

    public void quick_sort(int[] table, int left, int right){
        int l = left;
        int p = right;
        int pivot = right;

        while (p>l){
            if (pivot==l){
                if (table[p]<table[pivot]){
                    swap(table,p,pivot);
                    pivot = p;
                    l++;
                }
                else {
                    p--;
                }
            }
            if (pivot == p){
                if (table[l]>table[pivot]) {
                    swap(table, l, pivot);
                    pivot = l;
                    p--;
                }
                else{
                    l++;
                }
            }
        }
        if (p+1<right){
            quick_sort(table, p+1, right);
        }
        if (l-1>left){
            quick_sort(table, left, l-1);
        }
    }
}