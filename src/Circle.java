public class Circle extends Shape2D{

    private final double circleDiameter;

    public Circle(double setDiameter) {

        this.circleDiameter = setDiameter;

    }

    @Override
    double getArea(){
        return Math.PI * Math.pow(circleDiameter/2, 2);
    }

}
