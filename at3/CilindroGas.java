public class CilindroGas {
    private int capacidadeMaxima;
    private int capacidadeAtual;
    private int qtdeUltimoConsumo;

    public CilindroGas(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeMaxima;
        this.qtdeUltimoConsumo = 0;
    }

    public void registrarConsumo(int quantidade) throws ConsumoExcedenteException {
        if (quantidade > capacidadeAtual) {
            throw new ConsumoExcedenteException("Erro: Consumo excedente! Quantidade disponível: " + capacidadeAtual);
        }
        qtdeUltimoConsumo = quantidade;
        capacidadeAtual -= quantidade;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public int getQtdeUltimoConsumo() {
        return qtdeUltimoConsumo;
    }

    @Override
    public String toString() {
        return "CilindroGas{" +
                "capacidadeMaxima=" + capacidadeMaxima +
                ", capacidadeAtual=" + capacidadeAtual +
                ", qtdeUltimoConsumo=" + qtdeUltimoConsumo +
                '}';
    }
}
