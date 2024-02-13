// Sometimes we don't know how much arguments that we need
class Test { // using 3 dots we can
    public int add(int... num) {
        // now whatever input is given it will be stored like an array
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}

public class variable_argument {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.add(2, 3)); // 5
        System.out.println(obj.add(2, 3, 4)); // 9
        System.out.println(obj.add(2, 3, 4, 5)); // 14
    }
}
