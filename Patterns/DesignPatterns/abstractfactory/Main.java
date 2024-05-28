package abstractfactory;


public class Main {
    public static void main(String[] args) {
        // Utilizando a fábrica de pizzas de queijo
        PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        Pizza cheesePizza = cheesePizzaFactory.createPizza();
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();

        // Utilizando a fábrica de pizzas de pepperoni
        PizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniPizzaFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}