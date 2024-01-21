//temperature input in farhehheit and output in degree celcius but integer data type
public class TemperatureConvereter {
    public static void main(String[] args) {
        float farhenheit = 98f;
        float celcius = ((float)5/9)*(farhenheit-32);
        System.out.println(farhenheit+" farhenheit is equal to "+(int) celcius+" celsius"); //float->int it is larger to smaller, therefore typecasted
    }
}
