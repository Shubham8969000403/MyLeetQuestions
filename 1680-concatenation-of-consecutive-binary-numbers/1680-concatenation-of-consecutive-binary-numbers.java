class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            int len = Integer.toBinaryString(i).length(); // simple way
            result = (result * (1 << len) + i) % mod;
        }

        return (int) result;
    }
}