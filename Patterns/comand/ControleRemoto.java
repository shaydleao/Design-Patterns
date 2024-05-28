//Classe que solicita a execução de um comando
class ControleRemoto {
    private Command botaoLigar;
    private Command botaoDesligar;

    public void setBotaoLigar(Command botaoLigar) {
        this.botaoLigar = botaoLigar;
    }

    public void setBotaoDesligar(Command botaoDesligar) {
        this.botaoDesligar = botaoDesligar;
    }

    public void pressionarBotaoLigar() {
        botaoLigar.execute();
    }

    public void pressionarBotaoDesligar() {
        botaoDesligar.execute();
    }
}

