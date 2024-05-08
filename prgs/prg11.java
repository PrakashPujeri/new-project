package prgs;
import java.lang.String;
public class prg11 {
    public static void main(String[] args) {
        
            int a[] = new int[5];
            a[0] = 32;
            a[1] = 343;
            System.out.println("elements in array");
            for (int i = 0; i < 5; ++i)
            {
                System.out.println(a[i]);
            }

        

        // prg b
        int arr[][] = {{1,2,3},{5,7,8},{7,8,9}};
        System.out.println("2d");
        for ( int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; ++j)
            {
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        } 


        // prg 12

        String s1 = new String("gpt zalaki");
        String s2 = "GPT ZALAKI";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('a'));
        System.out.println(s2.charAt(4));
        System.out.println(s2.substring(2, 8));
        int result = s1.compareTo(s2);
        System.out.println("after");
        if (result ==0)
        {
            System.out.println("equel");

        }
        else if (result > 0)
        {
            System.out.println("s1 is greter ");

        }
        else
        {
            System.out.println("s1 is smaller");
        }
        

        
    }
}
