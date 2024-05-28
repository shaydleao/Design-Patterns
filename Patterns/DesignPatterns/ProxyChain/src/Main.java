//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando o proxy para controlar a cadeia de responsabilidade
        ProxyCompra proxy = new ProxyCompra();
        // Configurando o próximo manipulador na cadeia (Diretor)
        proxy.setProximoManipulador(new Diretor());

        // Solicitações de compra
        proxy.autorizarCompra(500); // Gerente
        proxy.autorizarCompra(2500); // Diretor
        proxy.autorizarCompra(10000); // CEO
    }
}
/*
    No escopo do programa temos três níveis de autorização: Manager, Director e CEO. Se o valor da compra for inferior a $1000,
 o gerente pode autorizá-lo diretamente. Se o valor estiver entre $1000 e $5000, o diretor é acionado.
 Para valores acima de $5000, o CEO precisa aprovar. O ManipuladorCompra controla a cadeia de responsabilidade
 e decide quando encaminhar a solicitação para o próximo nível.

 */