public abstract class Binary implements ArithmeticExp {
    ArithmeticExp leftNumber;
    ArithmeticExp rightNumber;

    public Binary(ArithmeticExp leftNumber, ArithmeticExp rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public String toString(String operator) {
        String desc = "";
        if (!(leftNumber instanceof Number)) {
            desc += "(";
        }
        desc += leftNumber;
        if (!(leftNumber instanceof Number)) {
            desc += ")";
        }
        desc += " "+operator+" ";
        if (!(rightNumber instanceof Number)) {
            desc += "(";
        }
        desc += rightNumber;
        if (!(rightNumber instanceof Number)) {
            desc += ")";
        }

        return desc;
    }
}
