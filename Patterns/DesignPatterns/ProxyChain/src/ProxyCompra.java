public class ProxyCompra implements ManipuladorCompra{
    private ManipuladorCompra proximoManipulador;

    public void setProximoManipulador(ManipuladorCompra proximoManipulador) {
        // Define o próximo manipulador na cadeia
        this.proximoManipulador = proximoManipulador;
    }
@Override
public void autorizarCompra(double valor) {
    // Verifica se o valor da compra está dentro da autoridade do proxy (gerente)
    if (valor <= 1000) {
        // Se estiver dentro do limite, a autorização é tratada pelo gerente
        new Gerente().autorizarCompra(valor);
    } else {
        // Se exceder o limite, encaminha a solicitação para o próximo manipulador na cadeia
        System.out.println("Proxy encaminhando solicitação para o próximo manipulador.");
        if (proximoManipulador != null) {
            proximoManipulador.autorizarCompra(valor);
        } else {
            // Se não houver mais manipuladores na cadeia, exibe uma mensagem de erro
            System.out.println("Não há mais manipuladores para lidar com a solicitação.");
            }
        }
    }
}
