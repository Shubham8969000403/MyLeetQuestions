class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int sneaky[] = new int[2];
        int size= nums.length;
        int repeat=0;
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
               
                if(nums[i]==nums[j]){
                    sneaky[repeat]=nums[i];
                    repeat++;
                }
              
            }
              if(repeat==2){
                    break;
                }
        }
        return sneaky;
    }
}