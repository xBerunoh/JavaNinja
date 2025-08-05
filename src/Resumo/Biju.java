package Resumo;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura Karatachi", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9),
    JUUBI("Juubi", "Obito Uchiha", 10);


    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;
/*
* CONSTRUTORES:
* Construtores ` all args`
*
* */
    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }
    /*
     * CONSTRUTORES:
     * Construtores ` no args`
     *
     * */
    Biju() {
    }

    public void teste(){}
}
