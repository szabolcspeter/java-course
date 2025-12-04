package szabi.learnjava.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesWithStreams {

    public static void main(String[] args) throws IOException {

        String path = "./src/szabi/learnjava/streams/names.txt";
//        System.out.println(Paths.get("").toAbsolutePath());

        try (Stream<String> namesStream = Files.lines(Paths.get(path))) {
            namesStream.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            System.out.println(e.toString());
        }
    }
}
