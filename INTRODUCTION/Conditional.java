public class Conditional {

  public static void main(String[] args) {
    int num1 = 15;
    if (num1 < 10) {
      System.out.println("Less than 10");
    } else if (num1 > 10) {
      System.out.println("Greater than 10");
    } else {
      System.out.println("equal to 10");
    }

    // NOTE : it checks all if's
    // but in case of if,else if and else, any one will be checked until one is
    // true, rest ignored

    // Create two variables length and breadth and check if it
    // creates a square or not, print "It's a square" if true
    // of "It's not a square" if not

    int length = 10;
    int breadth = 20;
    if (length == breadth) {
      System.out.println("It's a square");
    } else {
      System.out.println("It's not a square");
    }

    // Write a program to print the absolute values of following numbers
    // -1
    // 1

    int number1 = -1;
    if (number1 < 0) {
      System.out.println(number1 * -1);
    } else {
      System.out.println(number1);
    }
    // ------------------------------------------------------------
    int num = 41;
    if (num % 2 == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
    // --------------------------------------------------------------
    // OR -> TERNARY OPERATOR
    String output = num % 2 == 0 ? "Number is even" : "Number is odd";
    // string because the output we are putting is a string
    // int output = num % 2 ==0 ? 1 : 0;
    System.out.println(output);
  }
}
