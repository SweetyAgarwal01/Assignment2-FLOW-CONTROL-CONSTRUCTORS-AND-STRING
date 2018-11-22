import java.util.Scanner;
class Crosspattern
{

public static void main(String[] a)
{
Scanner s = new Scanner(System.in);

System.out.print("Enter the number of lines needs to be printed:");
int size = s.nextInt();

    for (int i = 0; i < size; i++) 
	{
        for (int j = 0; j < size; j++) 
		{
            if (i == j || i + j == size - 1) 
			{
                System.out.print("*");
            } else 
			{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}