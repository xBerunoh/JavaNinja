package Polimorfismo_Abstracao;

public class Uchiha  extends Ninja{

    // Sobrescrever o metodo da classe NINJA !
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha !");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("ESsa é minha estrategia de batalha UCHIHA!");
    }


}
