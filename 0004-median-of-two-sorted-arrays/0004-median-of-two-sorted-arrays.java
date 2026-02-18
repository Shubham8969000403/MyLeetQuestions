class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int count=0;
        int size=n+m;
        double meadian=0.0;
        int arr[]=new int[size];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=n;i<size;i++){
            
            arr[i]=nums2[count];
            count++;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        boolean flag=false;
        if(size%2 ==0){
            flag=true;
        }        
        for(int i=0;i<size;i++){
            if(flag==false){
                int res=size/2;
                meadian=arr[res];
            }else{
                int res=size/2;
                meadian = (arr[res]+arr[res-1])/2.0;
            }
        }
        return meadian;
    }
}