class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0)
            return 0;

        String[] arr = s.split(" ");
        int count = 0;

        for (String word : arr) {
            if (!word.equals("")) {
                count++;
            }
        }

        return count;
    }
}