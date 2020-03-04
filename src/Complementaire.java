import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Complementaire {
 private Multi_Set multi_set;
 private Table_Hashage table_hashage;
   static ArrayList<String> deux_sommes =new ArrayList<>(); ;

    public Complementaire(Multi_Set multi_set, Table_Hashage table_hashage) {
        this.multi_set = multi_set;
        this.table_hashage = table_hashage;
    }

    public void recherche_complementaire() throws IOException {

        for (String mot_dico:Lecture_Dictionnaire.getLines()) {
            if (isSubAnagram(mot_dico, multi_set.getMot())) {
                getaVoid(multi_set.hashCode()-new Multi_Set(mot_dico).hashCode());
            }
        }
        System.out.println(deux_sommes);
    }

    private void getaVoid(int cle) throws IOException {

        if (table_hashage.dico_to_TableHachage().get(cle) != null) {
            deux_sommes.add(table_hashage.dico_to_TableHachage().get(cle).toString());
        }
    }

    public static boolean isSubAnagram(CharSequence word, CharSequence letters) {
        List<Integer> wordCodesPoints = toCodePoints(word);
        List<Integer> lettersCodePoints = toCodePoints(letters);
        for (int c : wordCodesPoints) {
            int indices = lettersCodePoints.indexOf(c);
            if (indices == -1) {
                return false;
            }
            lettersCodePoints.remove(indices);
        }
        return true;
    }

    private static List<Integer> toCodePoints(CharSequence letters) {
        return letters.codePoints().boxed().collect(Collectors.toList());
    }
}
