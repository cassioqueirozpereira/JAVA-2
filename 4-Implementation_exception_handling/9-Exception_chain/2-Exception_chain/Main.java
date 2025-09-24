import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) throws ValidationError {
        ArrayOperation calc = new ArrayOperation();
        char[] op1 = null;
        char[] op2 = null;

        try {
            op1 = new char[Short.MAX_VALUE];
            op2 = new char[Short.MAX_VALUE];
            // // Forcing the OutOfMemoryError
            // op1 = new char[Integer.MAX_VALUE];
            // op2 = new char[Integer.MAX_VALUE];
            output.append("Arrays sucessfully created!\n");
        } catch (OutOfMemoryError e) {
            Runtime runtime = Runtime.getRuntime();
            output.append("Insuficient memory!\n");
            output.append("Total memory of JVM is: " + runtime.totalMemory() + " and the max is " + runtime.maxMemory() + "\n");
            output.append("Free memory: " + runtime.freeMemory() + "\n");
            output.append("Reconfigure the JVM using the parameter -Xmx<size>. You need of " + 16*Short.MAX_VALUE + " only for vectors.\n");
            JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);
            System.exit(-1);
        }

        // // Forçing the ValidationError
        // try {
            calc.concatenarArray(op1, op2);
            output.append("Arrays successfully concatenated!");
            JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);
        // // Forcing the ValidationError
        // } catch (ValidationError e) {
        //     output.append(e.toString());
        //     JOptionPane.showMessageDialog(null, output.toString(), "Validation error", JOptionPane.ERROR_MESSAGE);
        // }
    }
}