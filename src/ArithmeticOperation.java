
/**
 * main class
 */
class ArithmeticOperation {

    public static void main(String[] args) {
        // constructing the expression 3 + 2 * 5
        ArithmeticExp expression1 = new Sum(
                new Number(2),
                new Product(
                        new Product(new Number(7), new Number(2)),
                        new Number(3)
                )
        );
        System.out.println(expression1 + " = " + expression1.evaluate());

        ArithmeticExp expression2 = new Sum(
                new Number(2),
                new Product(
                        new Modulo(new Number(7), new Number(2)),
                        new Number(3)
                )
        );
        System.out.println(expression2 + " = " + expression2.evaluate());

        ArithmeticExp expression3 = new Sum(
                new Number(3),
                new Product(new Number(2), new Number(5))
        );
        System.out.println(expression3 + " = " + expression3.evaluate());
    }

}
