package dmitry.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
      printThreeWords();
      checkSumSign();
      printColor();
      compareNumbers();

    }
    //Задача №2//
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Задача №3//
    public static void checkSumSign(){
        int a = 3 ;
        int b = 5;
        int c = a-b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        }
        if (c <= 0){
            System.out.println("Сумма отрицательная");
        }
    }
    //Задача №4//
    public static void printColor(){
        int value = -5;

        if (value <= 0 ) {
            System.out.println("Красный");
        } else if ((value>0) && (value<=100)){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }


    }
    //Задача №5//
    public static void compareNumbers(){
        int a =125;
        int b =100;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
