package factorymethod.padrao;
// Fábrica concreta para criar quadrados
public class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
