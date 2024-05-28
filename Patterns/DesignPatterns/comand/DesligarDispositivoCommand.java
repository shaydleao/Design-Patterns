class DesligarDispositivoCommand implements Command {
    private Dispositivo dispositivo;

    public DesligarDispositivoCommand(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.desligar();
    }
}

