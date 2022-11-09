public class Main {
    public static void main(String[] args) {


        ///////////////////////////2D/////////////////////////////////

        Circle circle1 = new Circle(15);
        System.out.println(circle1.getArea());

        Square square1 = new Square(10);
        System.out.println(square1.getArea());


        Triangle triangle1 = new Triangle(10, 10);
        System.out.println(triangle1.getArea());


        ///////////////////////////3D/////////////////////////////////

        Cube cube1 = new Cube(5);
        System.out.println(cube1.getArea());
        System.out.println(cube1.getVolume());










    }
}