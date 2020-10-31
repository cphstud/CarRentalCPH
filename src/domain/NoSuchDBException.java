package domain;


import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class NoSuchDBException extends IOException {
    public NoSuchDBException(String msg) {
        super(msg);
    }


}
