public class stringAlgo {
    public static void main(String[] args){
        String str1 = "abcdefghijklmno";
        String str2 = "fgh";

        for(int i=0;i<str1.length();i++){
            str1.compareTo(str2);
            if(str2==str1){
                System.out.println(i);
            }
        }
    }
}
