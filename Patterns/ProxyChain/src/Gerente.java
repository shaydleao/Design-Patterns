
public class Gerente implements ManipuladorCompra{
    @Override
    public void autorizarCompra(double valor) {
        // Verifica se o valor da compra está dentro da autoridade do gerente
        if (valor <= 1000) {
            // Autoriza a compra se o valor estiver dentro do limite
            System.out.println("Gerente autoriza compra de $" + valor);
        } else {
            // Se o valor exceder o limite, encaminha a solicitação para o próximo nível (Diretor)
            System.out.println("Gerente não pode autorizar compra de $" + valor + ". Encaminhando para o Diretor.");
            new Diretor().autorizarCompra(valor);
        }
    }
}
