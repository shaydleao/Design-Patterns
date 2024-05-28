package factorymethod.padrao;
// Fábrica concreta para criar círculos

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

