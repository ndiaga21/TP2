import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Multi_Set {

    private static ArrayList<Character> ensemble_R;
    private String mot;

    public Multi_Set(String mot) {
        this.mot =mot;

        ensemble_R = new ArrayList<>();
        for (int i = 0; i < mot.length(); i++) {
            ensemble_R.add(mot.charAt(i));
        }
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public static ArrayList<Character> getEnsemble_R() {
        return ensemble_R;
    }

    public static void setEnsemble_R(ArrayList<Character> ensemble_R) {
        Multi_Set.ensemble_R = ensemble_R;
    }

    public boolean isEmpty() {
        return ensemble_R.isEmpty();
    }

    public int nombre_de_caracter() {
        return ensemble_R.size();
    }

    public boolean contains(ArrayList<Character> e) {
        return ensemble_R.contains(e);
    }

    public void remove(char e) {
        ensemble_R.remove(e);
    }

    public void add(char e) {
        ensemble_R.add(e);
    }

    @Override
    public int hashCode() {
        return toCodePoints(this.mot);
    }

     static int toCodePoints(CharSequence letters) {
        return somme(letters.codePoints().boxed().collect(Collectors.toList()));
    }

     private static int somme(List<Integer> list) {
        int somme =0;
        for (int i = 0; i <list.size() ; i++) {
            somme = somme + list.get(i);
        }

        return somme;
    }

    public static void affiche() {
        //   Collections.sort(ensemble_R);
        System.out.println(ensemble_R);
    }
}
