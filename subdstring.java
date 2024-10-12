public class subdstring {
    public static void main(String[] args) {
        String str = "Hello World!";
        int start=1;
        int end=5;
        char buf[]=new char[end-start];
        str.getChars(start,end,buf,0);
        System.out.println(buf);
        String s="hello radhika welcome to amity";
        char[] var1 = new char[50];
        var1=s.toCharArray();
        System.out.println(var1);
        
                char[] myArray = {'H', 'e', 'l', 'l', 'o'};
                
                // Print the entire array
                for (char c : myArray) {
                    System.out.print(c);
                }
                
                // Modify the array
                myArray[0] = 'Y';
                System.out.println();
                
                for (char c : myArray) {
                    System.out.print(c);  // Output: Yello
                }
            }
        
    
}
