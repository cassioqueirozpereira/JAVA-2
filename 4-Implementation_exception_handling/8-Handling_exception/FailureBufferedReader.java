import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

class FailureBufferedReader extends BufferedReader {
    // the constructor calls the constructor of father class (BufferReader)
    public FailureBufferedReader() {
        super(new StringReader(""));
    }

    // override the metod close() to forcing the exception
    @Override
    public void close() throws IOException {
        HandlingException.output.append("DEBUG: Forcing a exception to close the file...\n");
        throw new IOException("Simulated failure to close file!");
    }
}