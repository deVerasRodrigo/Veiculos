public class Aviao extends Veiculo{
    private Integer quantidadeDeTurbinas;

    public Aviao(Integer quantidadeDeTurbinas) {
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }

    public Integer getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }

    @Override
    //assinatura: acelerar();
    public void acelerar() {
        setVelocidade(getVelocidade()+10);
    }

    //assinatura: pousar();
    public void pousar(){
        System.out.println("Avião pousando");
        Integer tempo = 0;

        for (int i = 0; i < getVelocidade(); i+= 10) {
            tempo++;
        }
        System.out.println("Avião pousou em " + tempo + " segundos");
    }

    //assinatura: pousar(Bollean);

    public void pousar(Boolean pistaMolhada){
        Integer tempo = 0;
        if (pistaMolhada){
            for (int i = 0; i < getVelocidade(); i+= 5) {
                tempo++;
            }
        System.out.println("Avião pousou em " + tempo + " segundos");
        } else {
            pousar();
        }
    }

    @Override
    public String toString(){
        return "O avião está a " + getVelocidade() + " com suas " + getQuantidadeDeTurbinas() + " turbinas";
    }


}
