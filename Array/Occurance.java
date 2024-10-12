package Array;

public class Occurance {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,66,77,5,5,5,5,5};
        int counter = -1;
        int target = 5;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                counter = i;
            }
        }
        System.out.println("last occourance of "+ target + " is at "+ counter);
    }
}
