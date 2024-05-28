/*
O padrão Command é um padrão comportamental que encapsula uma solicitação como um objeto, permitindo parametrizar clientes com operações, enfileirar solicitações, registrar solicitações e suportar operações de desfazer.
################################################################################
Neste programa temos dois dispositivos (Lâmpada e Ventilador) que podem ser controlados por um controle remoto (ControleRemoto)
controle remoto tem botões para ligar e desligar cada dispositivo. Cada botão do controle remoto é associado a um comando específico,
(LigarDispositivoCommand e DesligarDispositivoCommand). Quando um botão é pressionado, o controle remoto invoca o comando correspondente para executar a operação desejada no dispositivo.
*/
public class Main {
    public static void main(String[] args) {
        // Criando os dispositivos
        Dispositivo lampada = new Dispositivo("Lâmpada");
        Dispositivo ventilador = new Dispositivo("Ventilador");

        // Criando os comandos
        Command ligarLampadaCommand = new LigarDispositivoCommand(lampada);
        Command desligarLampadaCommand = new DesligarDispositivoCommand(lampada);
        Command ligarVentiladorCommand = new LigarDispositivoCommand(ventilador);
        Command desligarVentiladorCommand = new DesligarDispositivoCommand(ventilador);

        // Criando o controle remoto
        ControleRemoto controleRemoto = new ControleRemoto();

        // Configurando os comandos nos botões do controle remoto
        controleRemoto.setBotaoLigar(ligarLampadaCommand);
        controleRemoto.setBotaoDesligar(desligarLampadaCommand);

        // Usando o controle remoto para ligar e desligar a lâmpada
        controleRemoto.pressionarBotaoLigar();
        controleRemoto.pressionarBotaoDesligar();

        // Configurando os comandos nos botões do controle remoto para controlar o ventilador
        controleRemoto.setBotaoLigar(ligarVentiladorCommand);
        controleRemoto.setBotaoDesligar(desligarVentiladorCommand);

        // Usando o controle remoto para ligar e desligar o ventilador
        controleRemoto.pressionarBotaoLigar();
        controleRemoto.pressionarBotaoDesligar();
    }
}


