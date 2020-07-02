import java.util.Scanner;

public class Main {
    ////////////////////////////////////////////////////////////////////////////
    ///BasicA1
    public static void myNum (){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + "");
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    ///A2
    public static void myNumber (){
        for (int y = 2; y <= 100; y = y + 2) {
            System.out.println(y + "");
        }
    }
    /////////////////////////////////////////////////////////////////////////
    ///Intermediate
    ///A3
    public static void myOddNum (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter last number: ");
        int lastNum = input.nextInt();

        if (firstNum % 2 != 0) {
            for (int x = firstNum; x < lastNum; x = x + 2) {
                System.out.print(x + " ");
            }
            }else {
            for (int x = firstNum + 1; x < lastNum; x = x + 2) {        // firstNum + 1 gives the next odd number when firstNum is even
                System.out.print(x + " ");
            }
        }
    }
    //////////////////////////////////////////////////////////////////////////
    ///A4
    public static void numberSum (){
        int num, count, total = 0;


        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        //closing scanner after use
        scan.close();
        for(count = 1; count <= num; count++){
            total = total + count;
        }

        System.out.println("Sum of first "+num+" numbers is: "+total);
    }
    ////////////////////////////////////////////////////////////////////////////////
    ///Advanced
    ///A5
    public static void a5 (){
        int[] mynumbers = {1,1,2,3,4,5,5,5,10,10};
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number between 1 and 10: ");
        int x = input.nextInt();
        for (int i : mynumbers) {
            if (i == x){
                counter++;
            }
        }
        if (counter ==0){
            System.out.println("Nothing found");
        }else {
            System.out.println(counter);
        }
    }











    /////////////////////////////////MAIN////////////////////////////////////////////
    public static void main(String[] args) {
        a5();


    }
}
