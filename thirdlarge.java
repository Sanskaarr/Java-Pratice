public class thirdlarge {
    public static void main(String[]args)
    {
        int arr[]={3,4,5,6,7,76};
        int first =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>first){
                first=arr[i];
            }
        }
        System.out.println("first largest number  "+first);
        int sec =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sec && arr[i]<first){
                sec=arr[i];
            }
        }
        System.out.println("Second largest number  "+sec);
        int third=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>third && arr[i]<sec){
                third=arr[i];
            }
        }
        System.out.println("third largest number  "+third);
    }

}
