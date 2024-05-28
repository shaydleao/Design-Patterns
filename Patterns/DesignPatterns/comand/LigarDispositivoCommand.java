// Implementações concretas de comandos
class LigarDispositivoCommand implements Command {
    private Dispositivo dispositivo;

    public LigarDispositivoCommand(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.ligar();
    }
}
