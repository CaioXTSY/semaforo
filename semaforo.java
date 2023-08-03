public class semaforo {
    private enum Estado {
        VERMELHO, VERDE, AMARELO
    }

    private Estado estadoAtual;

    public semaforo() {
        this.estadoAtual = Estado.VERMELHO;
    }

    public String getEstado() {
        switch(estadoAtual) {
            case VERDE:
                return "Verde";
            case AMARELO:
                return "Amarelo";
            default:
                return "Vermelho";
        }
    }

    public void proximoEstado() {
        switch(estadoAtual) {
            case VERMELHO:
                estadoAtual = Estado.VERDE;
                break;
            case VERDE:
                estadoAtual = Estado.AMARELO;
                break;
            case AMARELO:
                estadoAtual = Estado.VERMELHO;
                break;
        }
    }

    public static void main(String[] args) {
        semaforo semaforo = new semaforo();
        System.out.println(semaforo.getEstado());
        semaforo.proximoEstado();
        System.out.println(semaforo.getEstado());
        semaforo.proximoEstado();
        System.out.println(semaforo.getEstado());
        semaforo.proximoEstado();
        System.out.println(semaforo.getEstado());
        
    }
}
