import java.io.IOException;
import java.util.*;

public class Table_Hashage {
     final static int TAILLE_HASHMAP = 17;
    static HashMap<Integer, LinkedList<ArrayList<Character>>> hashMap = new HashMap<>();

     public HashMap<Integer, LinkedList<ArrayList<Character>>> dico_to_TableHachage() throws IOException {
          for (String mot:Lecture_Dictionnaire.getLines()) {
               Multi_Set multi_set= new Multi_Set(mot);
               Multi_Set.getEnsemble_R().sort(Character::compareTo);
                hashMap.put(multi_set.hashCode(),chainage_externe(multi_set));

          }


        return hashMap;
     }

     private static LinkedList<ArrayList<Character>> chainage_externe(Multi_Set multi_set) throws IOException {
           LinkedList<ArrayList<Character>> list = new LinkedList<>();
           TreeSet<ArrayList<Character>> set = new TreeSet<>();
           for (String mot : Lecture_Dictionnaire.getLines()) {

               if (multi_set.hashCode() == new Multi_Set(mot).hashCode() ) {
                    Multi_Set.getEnsemble_R().sort(Character::compareTo);
                   // System.out.println(Multi_Set.getEnsemble_R());
                    if (!list.contains(Multi_Set.getEnsemble_R()))

                    list.add(Multi_Set.getEnsemble_R());
               }

          }



          return list;
     }


}
