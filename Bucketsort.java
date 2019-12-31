package zadania.tablice;
import java.util.Arrays;

public class Bucketsort{
    public static void main(String[] args) {
        Bucketsort sort = new Bucketsort();
        int[] table = new int[]{2843, 13, 21433, 2, 53, 732, 7, 4656, 445, 473, 623, 7342, 2211, 50, 8, 43, 9334, 432, 209, 3, 7};
        int[][] buckets = new int[10][table.length];

        System.out.println(Arrays.toString(table));
        sort.bucket_sort(table, buckets);
        System.out.println(Arrays.toString(table));
    }

    private void bucket_sort(int[] table, int[][] buckets) {
        int div=1;
        for (int i=0; i<table.length; i++){
            for(int j=0; j<table.length; j++){
                int ost = (table[j]/div)%10;
                buckets[ost][j] = table[j];
            }
            int iter = 0;
            for (int k=0; k<10; k++){
                for (int j=0; j<table.length; j++){
                    if(buckets[k][j] != 0){
                        table[iter] = buckets[k][j];
                        iter++;
                    }
                }
            }
            div *=10;
            buckets = new int[10][table.length];
        }
    }
}