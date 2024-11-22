public final class Carga extends Veiculo implements Calc {
    private int tara = 0;
    private int cargaMax = 0;

    public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        setTara(tara);
        setCargaMax(cargaMax);
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        if (tara < 0) {
            System.out.println("Tara não pode ser negativa. Atribuindo valor padrão 0.");
            this.tara = 0;
        } else {
            this.tara = tara;
        }
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        if (cargaMax < 0) {
            System.out.println("Carga máxima não pode ser negativa. Atribuindo valor padrão 0.");
            this.cargaMax = 0;
        } else {
            this.cargaMax = cargaMax;
        }
    }

    // Implementação do método calcVel
    @Override
    public int calcVel() {
        return getVelocMax() * 100000; // Converte Km/h para Cm/h
    }

    // Implementação do método calcular (interface Calc)
    @Override
    public int calcular() {
        return getTara() + getCargaMax() + getQtdRodas() + getVelocMax();
    }
}
