public class Carro extends Veiculo{
    private String tipoDeMotor;

    public Carro(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    @Override
    //assinatura: acelerar();
    public void acelerar() {
        setVelocidade(getVelocidade()+10);
    }

    //assinatura: acelerar(Boolean);
    public void acelerar (Boolean temNitro){
        if (temNitro) {
            setVelocidade(getVelocidade() + 30);
        } else {
            acelerar();
        }
    }

    @Override
    public String toString (){
        return "O carro está a " + getVelocidade() + "km/h " + "com o motor " + getTipoDeMotor();
    }
}
