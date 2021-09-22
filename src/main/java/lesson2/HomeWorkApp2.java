package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        //Task 1
        System.out.println(sumNumber(10,11));
        //Task 2
        positiveNegativeNumber(-1);
        //Task 3
        System.out.println(negativeNumber(-1));
        //Task 4
        printStringNomder(15);


    }

    public static boolean sumNumber(int a, int b) {

        int c = a + b;

        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }

    }
    public static void positiveNegativeNumber (int a){

        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число Положительное");
        }
    }
    public static boolean negativeNumber(int value) {
        if (value < 0){
            return true;
        } else {
            return false;
        }


    }

    public static void printStringNomder( int i) {
        String [] Hello = {"Hello"};
        for (String o : Hello) {
            for (i = 0; 3 > i; i++) {
                System.out.println( "" + o );

            }

        }


        
        // for (int value = 0; value < 5; value++) {
      //      System.out.println("value  " + value);

        }
        

    }





