class Solution {
    public int reverse(int n) {
        int rev=0;
        boolean flag=false;
        if(n<0){
            n=n*-1;
            flag=true;
        }
        while(n>0){
            int rem=n%10;
            if(rem==0){
                n=n/10;
            
            }else{
                break;
            }
        }
        while(n>0){            
            int rem = n%10;
            // if(rem==0){
            //     n=n/10;
            //     continue;
            // }
            if (rev == Integer.MAX_VALUE / 10 && n > 7) return 0;
            if (rev == Integer.MIN_VALUE / 10 && n< -8) return 0;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev =rev*10+rem;
            n=n/10;
        }
        if(flag==true){
            int result=rev*-1;
            return result;
        }
        else{
            return rev;
        }
        
    }
}