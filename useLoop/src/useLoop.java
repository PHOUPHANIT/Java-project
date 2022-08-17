
import java.util.Scanner;

public class useLoop {


    static void bubbleSort(int[] arr){

      int n = arr.length;
      int tmp = 0;

        for(int i=0;i<n;i++){

             for(int j = 1; j<(n-i);j++){

                if(arr[j-1]>arr[j]){
                    tmp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = tmp;
                }
             }

        }

    }
    public static void main(String[] args) throws Exception {
       
        final int MAX_NUM = 7;//constance variable

        try(Scanner Input = new Scanner(System.in)){
             
            int[] array = new int[MAX_NUM];

            for(int i = 0;i<MAX_NUM;i++){ //get input from user

                System.out.print("Enter number: ");
                array[i] = Input.nextInt();                 

            }

            System.out.print("\n\n\tAll number: ");

            for(int i = 0; i < array.length; i++){ //display all number from user input.
                System.out.print(array[i] + " ");
            } 

            bubbleSort(array); //call function

            System.out.print("\n\n\tAll number after bubble sort: ");
          
            for(int i = 0; i < array.length; i++){//display array after bubble sort.
                System.out.print(array[i] + " ");
             } 

             System.out.print("\n\n");

         Input.close();
        }    

    }
}


