package Examples.hf1_opdr5_bucket_sort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        array = bucketSort(array);

        System.out.print("aa");
    }

    public static int[] bucketSort(int[] arr){
        int i, j;
        int[] bucket = new int[arr.length+1];
        Arrays.fill(bucket, 0);

        for (i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int k=0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j<bucket[i]; j++) {
                arr[k++] = i;
            }
        }
        return arr;
    }
}
