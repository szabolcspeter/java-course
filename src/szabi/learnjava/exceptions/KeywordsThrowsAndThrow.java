package szabi.learnjava.exceptions;

import java.io.IOException;

class Test {

    public void check(int n) throws IOException {
        if (n<20) {
            throw new IOException("The file can not be found");
        }
    }

    public void check2(int i) throws IOException {
        check(i);
    }
}


public class KeywordsThrowsAndThrow {

    public static void main(String[] args) {

        Test test = new Test();

        try {
            test.check2(10);
        } catch (IOException e) {
            System.out.println("We handle the IO exception, don't worry");
        }
    }
}
