public class Arrayadd {
    void sumofarray(){
        int []arr = {1,3,4,5,6,7,99,435};
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        Arrayadd obj = new Arrayadd();
        obj.sumofarray();
    }
}
