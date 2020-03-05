
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

         Multi_Set multi_set = new Multi_Set("aouu");
         Table_Hashage table_hashage = new Table_Hashage();

         Complementaire complementaire = new Complementaire(multi_set, table_hashage);
          complementaire.recherche_complementaire();

    }
}
