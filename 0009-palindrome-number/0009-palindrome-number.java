class Solution {
    public boolean isPalindrome(int x) {
        int para=0;
        int temp=x; 
            while(temp>0){
                int rem=temp%10;
                para =para*10+rem;
                temp=temp/10;
            }
        
        if(para==x){
            return true;
        }else{
            return false;
        }
       
    }
}