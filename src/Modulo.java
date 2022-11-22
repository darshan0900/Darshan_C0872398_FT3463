public class Modulo extends Binary {

    public Modulo(ArithmeticExp leftNumber, ArithmeticExp rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int evaluate() {
        return leftNumber.evaluate() % rightNumber.evaluate();
    }

    @Override
    public String toString() {
        return super.toString("%");
    }
}
