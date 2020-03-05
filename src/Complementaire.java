import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Complementaire {
 private Multi_Set multi_set;
 private Table_Hashage table_hashage;
   static ArrayList<ArrayList<Character>> deux_sommes =new ArrayList<>();

    public Complementaire(Multi_Set multi_set, Table_Hashage table_hashage) {
        this.multi_set = multi_set;
        this.table_hashage = table_hashage;
    }

    public void recherche_complementaire() throws IOException {
       String missing_set="";
        for (String mot_dico:Lecture_Dictionnaire.getLines()) {
            if (isSubAnagram(mot_dico, multi_set.getMot())) {
              missing_set=  delete_multi_setC_in_multisetR(mot_dico,multi_set.getMot());

                if (table_hashage.dico_to_TableHachage().get(new Multi_Set(missing_set).hashCode()) != null) {
                    setCle(new Multi_Set(missing_set).hashCode(),new Multi_Set(missing_set).getMot());
                }
            }
        }
        if (deux_sommes.size() != 2){
            System.out.println(" n'existe pas");
        }else{System.out.println(" sont "+deux_sommes);}


    }

    private void setCle(int cle, String mot) throws IOException {
        for (int i = 0; i <table_hashage.dico_to_TableHachage().get(cle).size() ; i++) {
            if (isSubAnagram(mot, table_hashage.dico_to_TableHachage().get(cle).get(i).toString())) {
                if (!deux_sommes.contains(table_hashage.dico_to_TableHachage().get(cle).get(i)))
                deux_sommes.add(table_hashage.dico_to_TableHachage().get(cle).get(i));
            }
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

    public static String delete_multi_setC_in_multisetR(CharSequence word, CharSequence letters) {
        List<Integer> wordCodesPoints = toCodePoints(word);
        List<Integer> lettersCodePoints = toCodePoints(letters);
        for (int c : wordCodesPoints) {
            int indices = lettersCodePoints.indexOf(c);
            if (indices != -1) {
                lettersCodePoints.remove(indices);
            }

        }
           return toLetters(lettersCodePoints);

    }

    private static String toLetters(List<Integer> integerList) {
        char[] result1 ;
        String str1="";
        for (int i = 0; i <integerList.size() ; i++) {
            result1 = Character.toChars(integerList.get(i));
            str1 = str1 + result1[0];
        }

        return str1;
    }

    private static List<Integer> toCodePoints(CharSequence letters) {
        return letters.codePoints().boxed().collect(Collectors.toList());
    }
}
