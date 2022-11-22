public class Sum extends Binary{

    public Sum(ArithmeticExp leftNumber, ArithmeticExp rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int evaluate() {
        return leftNumber.evaluate() * rightNumber.evaluate();
    }

    @Override
    public String toString() {
        return super.toString("+");
    }
}
