import org.junit.jupiter.api.Test;


class Multi_SetTest {



    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void nombre_de_caracter() {

    }

    @Test
    void isEmpty1() {
    }

    @Test
    void nombre_de_caracter1() {
    }

    @Test
    void hashCode1() {
        Multi_Set multi_set = new Multi_Set("ehllo");
        System.out.println(multi_set.hashCode());
    }

    @Test
    void affiche() {
        Multi_Set multi_set = new Multi_Set("heoll");
        System.out.println(Multi_Set.getEnsemble_R().toString().codePoints().sum());
        System.out.println(Multi_Set.toCodePoints("hello"));
        Multi_Set.affiche();
    }
}