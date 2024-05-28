public class Diretor implements ManipuladorCompra{
    @Override
    public void autorizarCompra(double valor) {
        // Verifica se o valor da compra está dentro da autoridade do diretor
        if (valor <= 5000) {
            // Autoriza a compra se o valor estiver dentro do limite
            System.out.println("Diretor autoriza compra de $" + valor);
        } else {
            // Se o valor exceder o limite, encaminha a solicitação para o próximo nível (CEO)
            System.out.println("Diretor não pode autorizar compra de $" + valor + ". Encaminhando para o CEO.");
            new CEO().autorizarCompra(valor);
        }
    }
}
