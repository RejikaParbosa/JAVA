
import java.util.Scanner; 

class extracts
{
    public static void main(String args[ ])
    {
        String str1 = new String();
        String str2 = new String();
        int m=0,n=0;

        try
        {
            str1 = "Hallelujah";
            System.out.println(" String is : "+str1);

			Scanner s = new Scanner(System.in);
			System.out.print("\n Enter no. of characters to be extracted from string : ");
			m = s.nextInt();

			Scanner r = new Scanner(System.in);
			System.out.print("\n Enter starting index : ");
			n = r.nextInt();
        }
        catch(Exception e)
        {
        	System.out.println("\n I/O Error");
        }

       
        str2=str1.substring(n,(m+n));
        System.out.println("\n Extracted String is : "+str2);
    }
}
