package padroescomportamentais_exercicios.strategy;

public class OpercaoPrecoAtacado implements Operacao {

    public float calcular(float valor1) {
        return (float) (valor1 *0.5);
    }
}
