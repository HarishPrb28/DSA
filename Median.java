/*The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median.

Input
The first line inputs integer n, size of array a.
The second line inputs n space-seperated integers, i.e., a[i].
Input:
7
0 1 2 4 6 5 3
Output:
3

 */

import java.util.*;

public class Median {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = arr[n / 2];
        }
        System.out.print(ans);
    }
}
