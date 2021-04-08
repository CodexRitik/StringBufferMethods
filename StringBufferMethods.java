/*
The StringBuffer and StringBuilder classes are used when there is a necessity
to make a lot of modifications to Strings of characters.
The main difference between the StringBuffer and StringBuilder is that
StringBuilders methods are not thread safe (not synchronised).
StringBuilder is Faster then StringBuffer
 */
import java.util.Scanner;

public class StringBufferMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//immutable
        StringBuffer strObj = new StringBuffer(str);//mutable
        /*
        Methods of StringBuffer
        append(String s),insert(int offset,int i),
        delete(int start,int end),replace(int start,int end,String str)
        reverse() etc.
         */
        strObj.append("Welcome");
        System.out.println(strObj);
        strObj.delete(4,6);
        System.out.println(strObj);
        strObj.reverse();
        System.out.println(strObj);
        strObj.replace(1,4,"Hello");
        System.out.println(strObj);
        strObj.insert(4,"Well");
        //int capacity() it returns a capacity of StringBuffer
        System.out.println(strObj.capacity());
        //length()
        System.out.println(strObj.length());
    }
}
