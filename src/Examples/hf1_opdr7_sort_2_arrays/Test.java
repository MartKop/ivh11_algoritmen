package Examples.hf1_opdr7_sort_2_arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] list1 = new int[]{5,6,7,18,19};
        int[] list2 = new int[]{1,13,15,16,17,18};

        int[] merged = mergeArrays(list1, list2);

        for(int x : merged) {
            System.out.println(x);
        }
    }

    public static int[] voegSamen(int[] a, int[] b) {
        int[] resultaat = new int[a.length + b.length];

        for (int i = 0; i < a.length + b.length - 1; i++) {
            if (i < a.length) resultaat[i] = a[i];
            else resultaat[i] = b[i];
        }

        Arrays.sort(resultaat);
        return resultaat;
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j]) {
                answer[k] = a[i];
                i++;
            } else {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            answer[k] = b[j];
            j++;
            k++;
        }

        return answer;
    }
}
