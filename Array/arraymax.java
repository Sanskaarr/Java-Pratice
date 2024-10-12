package Array;

class Maxvalue{
    int arr[] = {3,5,6,77,88,65};
    int max = 0;

    void Max(){
    for(int i =0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println("Maximum value in the array is: " + max);
}
}

public class Arraymax {
    public static void main(String[] args) {
        Maxvalue max = new Maxvalue();
        max.Max();
    }
}
