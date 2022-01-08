import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       System.out.println("Enter the number");
       int num = input.nextInt();
       isEvenOrOdd(num) ;
       input.close();
    }
static void isEvenOrOdd(int user_input)
{
    if (user_input==0)
    {
System.out.println("zero is neither even nor odd ");
    }
    else if(user_input%2==0)
    {
        System.out.println( "is even ");
    }

    else 
    System.out.println("is odd function");
   
}


}