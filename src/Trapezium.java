public class Trapezium extends Trianlge{
    public void area(){
        System.out.println("side A \n Side B \n Side C");
    }

    public void perimetr(){
        System.out.println("high");
    }

    public static void main(String[] args) {
        GeometricFigure geometricFigure = new Trapezium();

        geometricFigure.area();
        geometricFigure.perimetr();
    }
}
