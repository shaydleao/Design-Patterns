package abstractfactory;
// Fábrica concreta para criar pizzas de queijo
class CheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}