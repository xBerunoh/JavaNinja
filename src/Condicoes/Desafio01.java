package Condicoes;

public class Desafio01 {
    /*
     * Descrição do Desafio: Crie um programa que representa três ninjas da vila da folha (Konoha)
     * de "Naruto" e suas respectivas missões.
     *
     * Cada ninja tem um *NOME*, uma *IDADE* e uma *MISSÃO* atribuida a ele, com o *nome da missão,
     * nível de dificuldade e status da conclusão*
     *
     * Use Condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:
     * -> Altere o status da missão , para concluida ou não concluida de acordo com essa lógica e imprima o resultado.
     * -> Ninjas menores de 15 anos só podem concluir missões de Nível C , ou D. Ninjas com 15 anos ou mais podem concluir missões de qualquer nivel
     *
     * Altere o status da missão para concluida
     *
     * */
    public static void main(String[] args) {


        String nameNinja1 = "Naruto";
        int idadeNinja1 = 17;
        String missaoNinja1 = "Ajudar a velinha a pintar sua casa";
        String statusMissao1 = "Em Andamento";
        char nivelQuestNinja1 = 'C';


        String nameNinja2 = "Sasuke";
        int idadeNinja2 = 9;
        String missaoNinja2 = "Recuperar uma equipe que foi em uma missão , para coletar informações";
        char nivelQuestNinja2 = 'S';
        String statusMissao2 = "Em Andamento";

        String nameNinja3 = "Shikamaru";
        int idadeNinja3 = 7;
        String missaoNinja3 = "Ajudar os idosos atravessar a rua";
        char nivelQuestNinja3 = 'C';
        String statusMissao3 = "Concluido";


        System.out.println("----------------------------------------");
        if(idadeNinja1 < 15) {
            if(nivelQuestNinja1 == 'C' ||nivelQuestNinja1 == 'D'){
                statusMissao1 = "Concluida";
            }else{
                statusMissao1 = "Você é muito novo";
            }
        }else{
            statusMissao1 = "Missão Concluida, você já é maior de idade";
        }
        System.out.println("Nome do Ninja: "+nameNinja1);
        System.out.println("Idade do Ninja: "+idadeNinja1);
        System.out.println("Descrição da Missão: "+missaoNinja1);
        System.out.println("Ranking da Missão: "+nivelQuestNinja1);
        System.out.println("Status da Missão:"+statusMissao1);

        System.out.println("----------------------------------------");
        if(idadeNinja2 < 15) {
            if(nivelQuestNinja2 == 'C' ||nivelQuestNinja2 == 'D'){
                statusMissao2 = "Concluida";
            }else{
                statusMissao2 = "Você é muito novo";
            }
        }else{
            statusMissao2 = "Missão Concluida, você já é maior de idade";
        }

        System.out.println("Nome do Ninja: "+nameNinja2);
        System.out.println("Idade do Ninja: "+idadeNinja2);
        System.out.println("Descrição da Missão: "+missaoNinja2);
        System.out.println("Ranking da Missão: "+nivelQuestNinja2);
        System.out.println("Status da Missão:"+statusMissao2);

        System.out.println("----------------------------------------");
        if(idadeNinja3 < 15) {
            if(nivelQuestNinja3 == 'C' ||nivelQuestNinja3 == 'D'){
                statusMissao3 = "Concluida";
            }else{
                statusMissao3 = "Você é muito novo";
            }
        }else{
            statusMissao3 = "Missão Concluida, você já é maior de idade";
        }
        System.out.println("Nome do Ninja: "+nameNinja3);
        System.out.println("Idade do Ninja: "+idadeNinja3);
        System.out.println("Descrição da Missão: "+missaoNinja3);
        System.out.println("Ranking da Missão: "+nivelQuestNinja3);
        System.out.println("Status da Missão:"+statusMissao3);

        System.out.println("----------------------------------------");

    }

}


