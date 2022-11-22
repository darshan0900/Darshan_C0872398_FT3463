
/**
 * main class
 */
class ArithmeticOperation {

    public static void main(String[] args) {
        // constructing the expression 3 + 2 * 5
        ArithmeticExp term = new Sum(
                new Number(2),
                new Product(new Product(new Number(7), new Number(2)), new Number(3))
        );
//        ArithmeticExp term = new Sum(
//                new Number(3),
//                new Product(new Number(2), new Number(5))
//        );

        System.out.println(term + " = " + term.evaluate());
    }

}
