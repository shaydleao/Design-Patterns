package abstractfactory;

public class CheesePizza implements Pizza{
        @Override
        public void prepare() {
            System.out.println("Preparando pizza de queijo.");
        }

        @Override
        public void bake() {
            System.out.println("Assando a pizza de queijo.");
        }

        @Override
        public void cut() {
            System.out.println("Cortando a pizza de queijo em fatias.");
        }

        @Override
        public void box() {
            System.out.println("Embalando a pizza de queijo.");
        }


}
