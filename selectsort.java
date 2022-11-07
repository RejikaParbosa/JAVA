// Sort a list of input members using Selection Sort

import java.io.DataInputStream;
class selectsort
{
	public static void main(String args[])
	{
		DataInputStream in = new DataInputStream(System.in);
		int list[] = new int[5];
		int i;
		try
		{
			for(i=0; i<5; i++)
			{
				System.out.println("Enter the elements: ");
				list[i] = Integer.parseInt(in.readLine());
			}
			System.out.println("Given list is: ");
			
			for(i=0; i<5; i++)
			{
				System.out.println("" + list[i]);
			}
			System.out.println("\n");
			
			for(i=0; i<(5-1); i++)
			{
				int min = i;
				for(int j=i+1; j<5; j++)
					if(list[min]> list[j])
					{
						min = j;
					}
					if(min != i)
					{
						int temp = list[min];
						list[min] = list[i];
						list[i] = temp;
					}
			}
			System.out.println("Sorted List: ");
			for(i=0; i<5; i++)
			{
				System.out.println("" + list[i]);
			}
			System.out.println(" ");
		}
			catch(Exception e){}
	}
}


