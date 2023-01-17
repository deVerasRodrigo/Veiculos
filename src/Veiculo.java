public abstract class Veiculo {
    private Integer velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public abstract void acelerar();

}
