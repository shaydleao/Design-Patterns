public class CEO implements ManipuladorCompra{
    @Override
    public void autorizarCompra(double valor) {
        // Como CEO tem a maior autoridade, autoriza a compra diretamente
        System.out.println("CEO autoriza compra de $" + valor);
    }
}
