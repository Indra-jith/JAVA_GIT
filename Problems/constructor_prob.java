class Car{
    private String color;
    private String model;
    private int year;
    private boolean rentalStatus;

    public Car(String color,String model,int year){
        this.color = color;
        this.model = model;
        this.year = year;
        rentalStatus = false;
    }

    public void displayDetails()
    {
        System.out.println("Color : "+color);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Rental Status: "+ rentalStatus);
    }
}

public class constructor_prob {
    public static void main(String[] args) {
        Car c1 = new Car("black","Porsche 911",2022);
        Car c2 = new Car("blue","Nissan GTR",2012);
        Car c3 = new Car("red","Mustang GT",2018);
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
