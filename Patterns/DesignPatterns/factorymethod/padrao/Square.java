package factorymethod.padrao;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Desenhando um quadrado.");
    }
}
