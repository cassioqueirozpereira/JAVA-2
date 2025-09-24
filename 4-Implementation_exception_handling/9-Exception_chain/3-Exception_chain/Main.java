import javax.swing.JOptionPane;

public class Main { 
    public static StringBuilder output = new StringBuilder();
    public static void main (String args []) { 
        char[] op1 = {'J', 'A', 'V', 'A', '.'}; 
        // Change the value to four to see the error
        char[] op2 = new char[5];
        output.append(copiarArray(op1, op2));
        JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);

    }
    private static char[] copiarArray(char[] op1, char[] op2) { //copia o vetor op1 para op2 
        try {
            if (verificarOperandos(op1, op2) && verificarTamanhoOperandos(op1, op2)) { 
                System.arraycopy(op1, 0, op2, 0, op1.length); 
                return op2;
            } else 
                output.append("The operation cannot be performed!"); 
        }
        // // Forcing OperandError 
        // catch (OperandError e) {
        //     output.append("Operand error: " + e.getMessage() + "\n");
        //     output.append("Error cause: " + e.getCause().getMessage());
        //     JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);
        //     System.exit(-1);
        // }
        catch (NullPointerException e) {
            output.append("Pointer to null object: " + e.getMessage());
            JOptionPane.showMessageDialog(null, output.toString(), "Exception handling", JOptionPane.INFORMATION_MESSAGE);

            System.exit ( -1 );
        } catch (ArrayIndexOutOfBoundsException e) { 
            output.append("Try to extrapolate the vector limit!"); 
            output.append(e.getMessage());
            System.exit (-1); 
        }
        return null; 
    }
    private static boolean verificarOperandos (char[] op1, char[] op2) { 
        boolean check = false; 
        if ((op1 == null) && (op2 == null))
            throw new OperandError ("Both operands are null!");
        else if (op1 == null)
            throw new OperandError ("First operand is null!");
        else if (op2 == null)
            throw new OperandError("Second operand is null!");
        else
            check = true;
        return check;
    }
    private static boolean verificarTamanhoOperandos(char[] op1, char[] op2) { 
        if (op1.length > op2.length) { 
            output.append("The vectors sizes are incompatible!\n");
            throw new OperandError ( new ArrayIndexOutOfBoundsException ("INSUFFICIENT SPACE IN THE SECOND OPERAND!")); 
        } else
            return true; 
    }
}