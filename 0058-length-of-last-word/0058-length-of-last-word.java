class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int length=s.length();
      
        for(int i=length-1;i>=0;i--){
            char ch = s.charAt(i);
            if(count >0 && ch==' '){
                break;
            }
            if(ch!= ' '){
                count++;
            }
        }
        return count++;
   
    }

}