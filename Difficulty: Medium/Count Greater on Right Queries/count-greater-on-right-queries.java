class Solution {
    int[] countGreater(int arr[], int indices[]) {
        // code here
        int [] ans=new int[indices.length];
        for(int i=0;i<indices.length;i++){
            int c=0;
            int index=indices[i];
            int ele=arr[index];
            for(int j=index+1;j<arr.length;j++){
                if(arr[j]>ele){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
        
    }
}
