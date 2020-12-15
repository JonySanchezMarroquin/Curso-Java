public class OperadorInstanceOf {
    public static void main(String[] args) {

        String text = "Creando un objeto de la clase String... que tal";

        Integer num = 7;

        boolean b1 = text instanceof String;

        System.out.println("Texto es del tipo String? = " + b1);

        b1 = text instanceof Object;

        System.out.println("Texto es del tipo Object? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number? = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object? = " + b1);

        Double decimal = 45.5;
        b1 = decimal instanceof Number;
        System.out.println("num es del tipo Number? = " + b1);
    }
}
