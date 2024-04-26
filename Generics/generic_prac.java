class Calculator<T extends Number> {
    T num1;
    T num2;

    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T printNum() {
        return num1;
    }

    public <T extends Number> void getSum(T num1, T num2) {
        System.out.println(num1.doubleValue() + num2.doubleValue());
    }
}

public class generic_prac {
    public static void main(String[] args) {
        Calculator<Integer> cal1 = new Calculator<>(20, 10);
        System.out.println(cal1.printNum());
        Calculator<Float> cal2 = new Calculator<>(11.6f, 111.5f);
        System.out.println(cal2.printNum());
        cal1.getSum(12, 14);
        cal1.getSum(11.4f, 56.98f);
    }
}
