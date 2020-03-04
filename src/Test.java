
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
       /* String mot1="au";
        String mot2="ou";
        String mot3="oauu";

        System.out.println(mot3.codePoints().sum()-mot1.codePoints().sum());*/
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, LinkedList> hm =new HashMap<>();
//        //hm.put(1,)
//        System.out.println(Lecture_Dictionnaire.getLines());
         Multi_Set multi_set = new Multi_Set("aumot");

//        System.out.println(multi_set.hashCode());
//         Table_Hashage.recupere_mots_dico();
          Complementaire complementaire = new Complementaire(multi_set, new Table_Hashage());
          complementaire.recherche_complementaire();
    }
}
