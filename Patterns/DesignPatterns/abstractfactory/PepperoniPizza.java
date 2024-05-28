package abstractfactory;

// Implementação concreta de uma pizza de pepperoni
class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparando pizza de pepperoni.");
    }
    @Override
    public void bake() {
        System.out.println("Assando a pizza de pepperoni.");
    }
    @Override
    public void cut() {
        System.out.println("Cortando a pizza de pepperoni em fatias.");
    }
    @Override
    public void box() {
        System.out.println("Embalando a pizza de pepperoni.");
    }
}
