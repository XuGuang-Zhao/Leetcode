import java.util.Arrays;

public class code1588 {

    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] sum = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + arr[i];
        }
        // 1, 4, 2, 5, 3
        // 0, 1, 5, 7, 12, 15
        for (int len = 1; len <= n; len+= 2){
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;
                // 4, 2, 5
                // sum(3) - sum(1)
                ans += sum[r + 1] - sum[l];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}
