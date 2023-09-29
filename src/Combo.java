public class Combo{
    private Burger burger = new Burger();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();
    private int escolhido;

    @Override
    public String toString() {
        String retorno = " ";
        if(this.escolhido == 1) {
            retorno += "Combo Master";
        } else if (this.escolhido == 2) {
            retorno += "Super Combo";
        } else {
            return "Pedido não realizado";
        }

        retorno += "\nBurger: " + burger.getDescricao() + " - " + burger.getGramas() + "g - R$" + burger.getPreco() + "\n";
        retorno += "Sobremesa: " + sobremesa.getDescricao() + " - Tam. " + sobremesa.getTamanho() + " - R$" + sobremesa.getPreco() + "\n";
        retorno += "Bebida: " + bebida.getDescricao() + " - " + bebida.getMl() + "ml - R$" + bebida.getPreco() + "\n";
        return retorno;
    }


    public void CriarCombo(int escolhido) {

        this.escolhido = escolhido;

        if (escolhido == 1) {
            burger.setDescricao("X Salada ");
            burger.setGramas(130);
            burger.setPreco(25.00);

            sobremesa.setDescricao("Sorvete Napolitano");
            sobremesa.setTamanho("Médio");
            sobremesa.setPreco(8.5);

            bebida.setDescricao("lata Coca Cola");
            bebida.setMl(350);
            bebida.setPreco(5.5);

        } else if (escolhido == 2) {
            burger.setDescricao("1 X Bacon Catupiry && 1 X Cheedar Bacon");
            burger.setGramas(200);
            burger.setPreco(35);

            sobremesa.setDescricao("1 Sorvete Ovomaltine && 1 Sorvete Lacta ");
            sobremesa.setTamanho("Grande");
            sobremesa.setPreco(20);

            bebida.setDescricao("Coca-Cola 1,5 Lts");
            bebida.setMl(1500);
            bebida.setPreco(10);
        }
    }

}
