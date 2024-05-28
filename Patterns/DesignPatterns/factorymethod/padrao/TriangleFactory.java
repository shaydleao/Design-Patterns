package factorymethod.padrao;
// Fábrica concreta para criar triângulos
public class TriangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
