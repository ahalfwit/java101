package javaCoding;

public class withoutUsingdivisionOperator {


    public static void main(String[] args) {



        withoutUsingDividion(15,5);
        //devides(12,4);



    }


    public static  void withoutUsingDividion(int a , int b){

        if (b == 0){
            System.out.println("infinity or invalid entry");
            System.exit(0);
        }
            int count = 0;
            for( ; a-b >= 0 ; ){
                a -= b;
                count++;

            }
            System.out.println("quotation is a/b is : " + a);

        }

        /*
	 2. Create a method that can divide two numbers without using division
		operators and Math class.

	 */

    public static void devides(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 + " devid by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }


}

