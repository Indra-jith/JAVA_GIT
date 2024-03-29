
class Rectangle extends Shape {
    int width;
    int hieght;

    public void setValues() {
        System.out.println("Enter the height and width for Rectangle: ");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        scanner.nextLine();
        int h = scanner.nextInt();
        this.width = w;
        this.hieght = h;
        scanner.close();
    }

    public double calculateArea() {
        double area = width * hieght;
        return area;
    }

    public String toString() {
        return "Rectangle details :\n" + "width : " + width + " height : " + hieght +
                "\n Area : " + calculateArea();
    }

    public boolean equals(Circle obj) {
    return (this.hieght == obj.radius);
    }
}