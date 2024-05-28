package factorymethod.padrao;
public class Main {
    public static void main(String[] args) {
        // Criando um círculo
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        // Criando um quadrado
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();

        // Criando um triângulo
        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape();
        triangle.draw();
    }
}