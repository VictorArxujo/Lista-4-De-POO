public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiro = 0;

    public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiro) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        setQtdePassageiro(qtdePassageiro);
    }

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        if (qtdePassageiro < 0) {
            System.out.println("Quantidade de passageiros não pode ser negativa. Atribuindo valor padrão 0.");
            this.qtdePassageiro = 0;
        } else {
            this.qtdePassageiro = qtdePassageiro;
        }
    }

    // Implementação do método calcVel
    @Override
    public int calcVel() {
        return getVelocMax() * 1000; // Converte Km/h para M/h
    }

    // Implementação do método calcular (interface Calc)
    @Override
    public int calcular() {
        String allStrings = getPlaca() + getMarca() + getModelo() + getCor() + getDataCadastro();
        return allStrings.replaceAll("\\s", "").length(); // Soma das letras
    }
}
