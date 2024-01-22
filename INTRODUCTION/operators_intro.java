// + - * / %
//create two variables and perform above mentioned operations
//and print the result

//Operations are used to perfrom arithmetic operations
public class operators_intro {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // NOTE : '+' betweem strings are concatenating
        System.out.println("Numbers are "+num1+" and "+num2);
        System.out.println("Add -> " + (num1+num2));
        System.out.println("Subtract -> " + (num1-num2));
        System.out.println("Multiply -> " + (num1*num2));
        System.out.println("Divide -> " + (num1/num2));
        System.out.println("Modulus -> " + (num1%num2));

        int num = 5;

        num = num+1; //incrementing by 1 making it 6
        num += 1; //same thing as above (now 6 + 1 = 7)
        num++; //same thing as above (now 7 + 1 = 8)

        //CURRENT VALUE ->8
        int output1 = num++; //POST INCREMENT
        System.out.println("Post increment value: "+output1); // 8 (because of post increment)
        // gets used by variable then incremented LATER

        //CURRENT VALUE -> 9
        int output2 = ++num; //PRE INCREMENT
        System.out.println("Pre increment value: "+output2); //10 because here it is PRE increment
        //Value 9 is incremented FIRST then taken to variable
        
        
        System.out.println("Value after all the incrementing: "+num); //10

        //'='-> assingment operator
    }
}
