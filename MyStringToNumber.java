public class MyStringToNumber {
 
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }
     
    public static void main(String a[]){
         
        System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
    }
}
- See more at: http://www.java2novice.com/java-interview-programs/string-to-number/#sthash.Q84AthGd.dpuf
