class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
    
        boolean flag =true;
        int size=binary.length();
        for(int i=0;i<size;i++){
            if(i==(size-1)){
                break;
            }
            if(binary.charAt(i)==binary.charAt(i+1)){
                flag= false;
            }
        }

        return flag;
    }
}