class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=0;
        int size=operations.length;
        for(int i=0;i<size;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                n=n-1;
            }
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                n=n+1;
            }
        }
        return n;
    }
}