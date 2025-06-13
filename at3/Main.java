public class Main {
    public static void main(String[] args) {
        CilindroGas cilindro = new CilindroGas(50);

        System.out.println("Cilindro criado:");
        System.out.println(cilindro);

        int[] consumos = {10, 5, 40};

        for (int consumo : consumos) {
            try {
                System.out.println("\nTentando registrar consumo de " + consumo + " unidades...");
                cilindro.registrarConsumo(consumo);
                System.out.println("Consumo registrado com sucesso!");
                System.out.println(cilindro);
            } catch (ConsumoExcedenteException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nCapacidade atual do cilindro: " + cilindro.getCapacidadeAtual() + " unidades.");
    }
}
