import java.util.*;

public class Maximum_Product {

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int negAns = arr[0] * arr[1] * arr[n - 1];
        int posAns = arr[n - 3] * arr[n - 2] * arr[n - 1];

        if (negAns > posAns) {
            System.out.println(negAns);
        } else {
            System.out.println(posAns);
        }
    }

}
