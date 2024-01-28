public class conversion {
    public static void main(String[] args) {
        // we use different conversions such as ParseInt, ParseFloat etc to convert
        // string into all these
        // other than that, (int) ,(float) can be used to convert within these types

        double num1 = 1.77885566d;
        float num11 = (float) (num1); // for normal conversion
        System.out.println(num11); // 1.7788557
        String num2 = "17788";
        int num22 = Integer.parseInt(num2);
        System.out.println(num22);
        // * Similarly
        // float num22 = Float.parseFloat(num2);
        // double num22 = Double.parseDouble(num2);
    }
}
