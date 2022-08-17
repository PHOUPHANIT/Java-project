import java.util.Scanner;

public class calculateRoot {

    public static void main(String[] args) throws Exception {
       
        try(Scanner input = new Scanner(System.in)){
           
           System.out.print("Enter value a: ");
           int a = input.nextInt();
           System.out.print("Enter value b: ");
           int b = input.nextInt();
           System.out.print("Enter value c: ");
           int c = input.nextInt();

              double delta = (Math.pow(b,2)) - (4*a*c);
              double x1=0, x2=0;

              if(delta==0){

                  x1 = -b/(2*a);
                  System.out.println("The root of equation is : x1=x2="+x1);

              }else if(delta>0){
 
                x1 = (-b+ Math.sqrt(delta))/(2*a);
                x2 = (-b- Math.sqrt(delta))/(2*a);

                System.out.println("The root of equation is x1="+x1+" and x2="+x2);
              }else{
                  System.out.println("No root");
              }
              
        input.close();
        }

    }
}
