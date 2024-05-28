// Classe que realiza as operações reais
class Dispositivo {
    private String nome;
    private boolean ligado;

    public Dispositivo(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado.");
    }
}

