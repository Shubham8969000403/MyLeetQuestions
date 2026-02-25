import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0;

        Arrays.sort(arr);

        int count = 1;
        int maxCount = 1;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] == arr[i+1]) {
                continue; 
            }

            if(arr[i] == arr[i+1] - 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }
}