import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Table_Hashage {
     final static int TAILLE_HASHMAP = 17;
    static HashMap<Integer, LinkedList<ArrayList<Character>>> hashMap = new HashMap<>();
     static LinkedList<ArrayList<Character>> list;
     public static void recupere_mots_dico() throws IOException {
          list = new LinkedList<>();
          for (String mot:Lecture_Dictionnaire.getLines()) {
               Multi_Set multi_set= new Multi_Set(mot);
               Multi_Set.getEnsemble_R().sort(Character::compareTo);
              // System.out.println(Multi_Set.getEnsemble_R()+" "+multi_set.hashCode());
                list.addAll(chainage_externe(multi_set));

          }
          //hashMap.put(new Multi_Set(list.get(0).toString()).hashCode(),list);

          System.out.println(list);
     }

     private static LinkedList<ArrayList<Character>> chainage_externe(Multi_Set multi_set) {
           LinkedList<ArrayList<Character>> list = new LinkedList<>();
         // System.out.println(Multi_Set.getEnsemble_R());
          if (multi_set.hashCode() == 336 ) {

               list.add(Multi_Set.getEnsemble_R());
               
          }

          return list;
     }


}
