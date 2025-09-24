public class ArrayOperation {
    public char[] concatenarArray(char[] op1, char[] op2) throws ValidationError {
        if (op1 == null || op2 == null)
            throw new ValidationError("Arrays cannot be null");
        int result_size;

        result_size = op1.length + op2.length;
        
        return copyArray(op1, op2, result_size, op2.length);
    }

    private char[] copyArray(char[] op1, char[] op2, int result_size, int n) {
        char[] result = new char[result_size];
        System.arraycopy(op2, 0, result, 0, op1.length);
        System.arraycopy(op1, 0, result, op1.length, n);
        return result;
    }
}