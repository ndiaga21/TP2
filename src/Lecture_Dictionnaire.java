import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture_Dictionnaire {
     static List<String> getLines;

    public static List<String> getLines() throws IOException {
        getLines = new ArrayList<>();
        Stream<String> getLinesStream = Files.lines(Paths.get("resources", "/dict-simple.txt"));
        getLines = getLinesStream.limit(1000).collect(Collectors.toList());
        return getLines;
    }
}
