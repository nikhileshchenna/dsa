public class bs {

    int arr[] = {1,2,3,4,5,6,6,7,7,8};
   
    int mid;
     int meth(int target){
         int left=0;
    int right=arr.length-1;
        while(left<=right){
       mid = (left+right)/2;

       if(arr[mid]==target){
         return mid;
       }
       else if(arr[mid]<target){
         right=mid-1;

       }
       else{
        left=mid+1;
       }

    }

       return -1;
    }
    public static void main(String []args){
     bs bb = new bs();
     System.out.println(bb.meth(5));
        //pull is used to update local file or directory.
        
    }
}
