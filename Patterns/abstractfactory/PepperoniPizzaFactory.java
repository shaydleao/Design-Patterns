package abstractfactory;
// Fábrica concreta para criar pizzas de pepperoni
    class PepperoniPizzaFactory implements PizzaFactory {
        @Override
        public Pizza createPizza() {
            return new PepperoniPizza();
        }
    }

