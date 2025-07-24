package Polimorfismo_Abstracao;

public class Uzumaki extends Ninja{

    // Sobrescrever o metodo da classe NINJA !
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque uzumaki !");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Esse é meu nome: "+nome+" essa é minha estrategia ninja UZUMAKI");
    }
}
