public class code528 {
    // 0, 3, 4, 6
    private int[] preSum;
    // 6
    private int sum;

    // 3, 1, 2
    public code528(int[] w) {
        int n = w.length;
        preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = w[i] + preSum[i];
        }
        sum = preSum[n];
    }

    public int pickIndex() {
        //需要在 [0, sum) 中生成一个随机数
        //int r = new Random().nextInt(sum);
        int r = (int) (Math.random() * sum);
        // 0, 1, 2, 3, 4, 5
        return binarySearchPreSum(r);
    }

    // r = 5
    private int binarySearchPreSum(int r) {
        int start = 0;
        int end = preSum.length - 1;
        int memo = 0;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (preSum[mid] == r) {
                return mid;
            }
            // 如果pre[mid] < r, 我们需要记录最大的index
            if (preSum[mid] < r) {
                memo = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return memo;
    }
}
