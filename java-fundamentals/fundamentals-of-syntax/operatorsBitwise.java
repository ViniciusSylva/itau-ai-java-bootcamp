public class operatorsBitwise {
    
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("%d em binário é %s \n", value1, binary1);
        var value2 = 3; 
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("%d em binário é %s \n", value2, binary2);
        var and = value1 & value2;
        var binaryAnd = Integer.toBinaryString(and);
        System.out.printf("%d & %d = %d em binário é %s \n", value1, value2, and, binaryAnd);
        var or = value1 | value2;
        var binaryOr = Integer.toBinaryString(or);
        System.out.printf("%d | %d = %d em binário é %s \n", value1, value2, or, binaryOr);
        var xor = value1 ^ value2;
        var binaryXor = Integer.toBinaryString(xor);
        System.out.printf("%d ^ %d = %d em binário é %s \n", value1, value2, xor, binaryXor);
    }

}
