public class TstVeic {
    public static void main(String[] args) {
        Leitura leitura = new Leitura();

        System.out.println("=== Cadastro de Veículo de Passeio ===");
        String placaPasseio = leitura.entDados("Digite a placa do veículo de passeio: ");
        String marcaPasseio = leitura.entDados("Digite a marca do veículo de passeio: ");
        String modeloPasseio = leitura.entDados("Digite o modelo do veículo de passeio: ");
        String corPasseio = leitura.entDados("Digite a cor do veículo de passeio: ");
        int qtdRodasPasseio = Integer.parseInt(leitura.entDados("Digite a quantidade de rodas: "));
        int velocMaxPasseio = Integer.parseInt(leitura.entDados("Digite a velocidade máxima (Km/h): "));
        int qtdPistoesPasseio = Integer.parseInt(leitura.entDados("Digite a quantidade de pistões do motor: "));
        int potenciaPasseio = Integer.parseInt(leitura.entDados("Digite a potência do motor: "));
        int qtdPassageiros = Integer.parseInt(leitura.entDados("Digite a quantidade de passageiros: "));

        Motor motorPasseio = new Motor(qtdPistoesPasseio, potenciaPasseio);
        Passeio passeio = new Passeio(placaPasseio, marcaPasseio, modeloPasseio, corPasseio, qtdRodasPasseio, velocMaxPasseio, motorPasseio, "01/01/2024", qtdPassageiros);
        System.out.println("Velocidade em M/h (Passeio): " + passeio.calcVel());
        System.out.println("Cálculo (Passeio): " + passeio.calcular());

        System.out.println("\n=== Cadastro de Veículo de Carga ===");
        String placaCarga = leitura.entDados("Digite a placa do veículo de carga: ");
        String marcaCarga = leitura.entDados("Digite a marca do veículo de carga: ");
        String modeloCarga = leitura.entDados("Digite o modelo do veículo de carga: ");
        String corCarga = leitura.entDados("Digite a cor do veículo de carga: ");
        int qtdRodasCarga = Integer.parseInt(leitura.entDados("Digite a quantidade de rodas: "));
        int velocMaxCarga = Integer.parseInt(leitura.entDados("Digite a velocidade máxima (Km/h): "));
        int qtdPistoesCarga = Integer.parseInt(leitura.entDados("Digite a quantidade de pistões do motor: "));
        int potenciaCarga = Integer.parseInt(leitura.entDados("Digite a potência do motor: "));
        int tara = Integer.parseInt(leitura.entDados("Digite a tara (Kg): "));
        int cargaMax = Integer.parseInt(leitura.entDados("Digite a carga máxima (Kg): "));

        Motor motorCarga = new Motor(qtdPistoesCarga, potenciaCarga);
        Carga carga = new Carga(placaCarga, marcaCarga, modeloCarga, corCarga, qtdRodasCarga, velocMaxCarga, motorCarga, "02/01/2024", tara, cargaMax);
        System.out.println("Velocidade em Cm/h (Carga): " + carga.calcVel());
        System.out.println("Cálculo (Carga): " + carga.calcular());
    }
}
