package Comments;

public class Les_1 {
    /*
    Algorithm: recipe to solve a problem
        - Efficiency is key
    Data structure: the way data is structured
        - The data structure that supports the algorithm
        - Usually in-memory
    Two goals in this course:
        - Create efficient algorithms yourself
            - Determine the approach
            - Turn the approach into source code
        - Recognize a problem to be similar to an already solved problem and apply the solution
    Hot topics “big data” and “data science”
        - With the huge amount of data being produced these days algorithms & data structures
        are even more important than before

    Well-known problems
    In many problems, the bottleneck boils down to:
        - Efficient searching
        - Efficient sorting
        - There are many solutions for searching and sorting each with their own advantages and disadvantages

    List searching
    - Unsorted List
        int[] a = {1, 2, 3, 5, 6, 4};
        public static int indexOf(int[] a, int key) {
            for(int i = 0; i < a.length; i++) {
                if(key == a[i]) {
                    return i;
                }
            }
            return -1;
        }
    - Sorted List (Binary Search)
    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

Time table
n       Linear  Binary
8       8       3
16      16      4
32      32      5
64      64      6
128     128     7
256     256     8
512     512     9
1024    1024    10

Unsorted -> Linear O(n)
Sorted -> Binary -> Logarithmic O(log n)

Prime numbers

int p = 3, divisor, found = 1;
    while(p < 1000000) {
        divisor = 3;
        while(divisor <= Math.sqrt(p) && p % divisor != 0)
        {
            divisor += 2;
        }
        if(divisor > Math.sqrt(p)) { ++found; }
        p += 2;
    }

final int MAX = 1000001;
boolean[] divisorFound = new boolean[MAX];
int found = 0;
int p, multiple;
for(p = 2; p < Math.sqrt(MAX); p++)
{
if(!divisorFound[p])
{
for(multiple = p*p; multiple <= MAX; multiple += p)
{
divisorFound[multiple] = true;
}
}
for(p = 2; p < MAX; p++)
{
if(!divisorFound[p]) found++;
}
}

     */

}
