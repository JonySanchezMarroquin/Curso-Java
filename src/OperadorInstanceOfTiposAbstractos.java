public class OperadorInstanceOfTiposAbstractos {
    public static void main(String[] args) {

        Object text = "Creando un objeto de la clase String... que tal";

        Number num = Integer.valueOf(7); //7;

        boolean b1 = text instanceof String;

        System.out.println("Texto es del tipo String? = " + b1);

        b1 = text instanceof Object;

        System.out.println("Texto es del tipo Object? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);

        b1 = text instanceof Integer;
        System.out.println("Texto es de tipo Integer? = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number? = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object? = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es de tipo Long = " + b1);
        
        b1 = num instanceof Double;
        System.out.println("num es de tipo Double = " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Float;
        System.out.println("Decimal es float = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("Decimal es float = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("num es del tipo Number? = " + b1);
    }
}
