package factorymethod.padrao;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Desenhando um triângulo.");
    }
}
