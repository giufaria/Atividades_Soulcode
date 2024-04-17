public class Contador {
    private int valor;


    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        Contador contador = new Contador(5);
        System.out.println("Valor inicial do contador: " + contador.getValor());

        contador.incrementar();
        System.out.println("Valor do contador após incremento: " + contador.getValor());

        contador.zerar();
        System.out.println("Valor do contador após zerar: " + contador.getValor());
    }
}
