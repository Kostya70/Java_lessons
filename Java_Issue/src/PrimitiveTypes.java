public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false, true, true));



    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return  (!a & !b & c & d) | (!a & b & !c & d) |
                (!a & b & c & !d) | (a & !b & !c & d) |
                (a & !b & c & !d) | (a & b & !c & !d);
    }

}
