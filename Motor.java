// Victor dos Santos Araujo - 2475553
public class Motor {
    private int qtdPistoes = 0;
    private int potencia = 0;


    public Motor(int qtdPistoes, int potencia){
        //metodo construtor 
        System.out.println("\nMetodo Construtor Motor>");
        this.potencia = potencia;
        this.qtdPistoes = qtdPistoes;
    }


    public int getQtdPistoes() {
        return qtdPistoes;
    }

    public void setQtdPistoes(int qtd){
        this.qtdPistoes = qtd;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int pot){
        this.potencia = pot;
    }
}
