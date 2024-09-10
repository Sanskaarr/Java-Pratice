class array{
    public static void main(String[] args) {
        int arr[]={98,87,76,65,54,43,40,39,23,11};
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.print(arr[j]+" ,");
            }
        }
    }
}