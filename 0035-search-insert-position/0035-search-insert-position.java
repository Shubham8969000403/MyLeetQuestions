class Solution {
    public int searchInsert(int[] arr, int target) {
        int size =arr.length;
        int found=0;
        boolean flag=false; 
        for(int i=0 ; i<size ; i++){
            if(arr[i]==target){
                found=i;
               flag=true;
            }
        }
        if(flag==false){
            boolean m=false;
            for(int i=0;i<size;i++){
                if(i<size-1){
                     if(arr[i]<target && arr[i+1]>target){
                         found = i+1;
                         m=true;
                         
                     }
                }
            }
            if(m==false){
                if(arr[size-1]<target){
                    found =size;
                }else{
                    found=0;
                }
            }
        }
        return found;      
    }
}