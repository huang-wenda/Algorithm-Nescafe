package arthmeticImplement.maxSubseqSum;

/**
 * ##### 给定K个整数组成的数列[N1,N2,N3...Nk]
 * **"连续子列":** 被定义为:[Ni,Ni+1...Nj]
 * **"最大子列和"**被定义为:所有连续子列元素中和最大者
 * 例如给定数组[-1,11,-4,13,-5,-2]
 * 其连续子列:[11,-4,13]有最大的和20
 * @author Huangwd
 */
public class MaxSubseqSum {
    public static void main(String[] args) {
        int[] a = {-1, 11, -4, 13, -5, -2};

        System.out.println(maxSubSeqSum01(3, a));
    }

    /**
     * @param n 整数序列个数
     * @param a 整数序列
     */
    public static int maxSubSeqSum01(int n, int[] a) {
        int maxSum = 0;
        /*i是子列左端位置*/
        for (int i = 0; i <= n; i++) {
            /*j是子列右端位置*/
            for (int j = 0; j < i; j++) {
                /*是从a[i]到a[j]的子列和*/
                int tmpSum = 0;
                for (int k = j; k <= i; k++) {
                    tmpSum += a[k];
                }
                if (maxSum < tmpSum) {
                    maxSum = tmpSum;
                }

            }
            return maxSum;
        }
        return 0;
    }
}
