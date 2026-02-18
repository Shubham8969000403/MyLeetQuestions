class Solution {
    public int findFinalValue(int[] arr, int original) {
        int size= arr.length;
        int temp=original;
        int result=2;
        for(int i=0;i<size;i++){
            if(arr[i]==temp){
                result*=arr[i];//result=6
                temp=result;
                result=2;
                i=-1;
            }
        }
    return temp;
    }   
    
}