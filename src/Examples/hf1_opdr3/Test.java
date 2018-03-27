package Examples.hf1_opdr3;

public class Test {
        public static void main(String[] args) {
            int[] array = new int[100];
            for (int i = 0; i < 100; i++) {
                array[i] = i;
            }

            System.out.print(search(array, 40));
        }

        public static int search(int[] a, int key)
        {
            int lo = 0;
            int hi = a.length - 1;
            while (lo <= hi)
            {
                // Key is in a[lo..hi] or not present.
                int mid = lo + (hi - lo) / 2;
                if(key < a[mid]) hi = mid - 1;
                else if(key > a[mid]) lo = mid + 1;
                else return mid;
            }
            return -1;
        }

    public static int searchRecursion(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }

        if(target==a[middle]) {
            return middle;
        } else if(target<a[middle]) {
            return searchRecursion(a, start, middle - 1, target);
        } else {
            return searchRecursion(a, middle + 1, end, target);
        }
    }
}

