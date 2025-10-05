import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileReaderException {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        BufferedReader leitor = null;
        try {
            // Open file
            leitor = new BufferedReader(new FileReader("arquivo.txt"));
            // // Failure simulation
            // leitor = new FailureBufferedReader();
            // File content reader
            String linha;
            while ((linha = leitor.readLine()) != null) {
                // Process each file line
                output.append(linha + "\n");
            }
            if (linha == null)
                JOptionPane.showMessageDialog(null, output.toString(), "Exception handling1", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            // Handle IO exception
            output.append("Ocurred an error to read the file:  " + e.getMessage());
            JOptionPane.showMessageDialog(null, output.toString(), "Exception handling2", JOptionPane.INFORMATION_MESSAGE);

        } finally {
            // Closing the file in the finally block
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException e) {
                output.append("Error to close file: " + e.getMessage());
                JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

// if I change the name file. will show a error "file don't find"