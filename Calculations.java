class Calculations {
    private double firstNumber;
    private double secondNumber;
    private String dividingErrorMessage = "Numbers cannot be divided by 0!";

    public Calculations(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        if (secondNumber == 0) {
            System.out.println(dividingErrorMessage);
            return Double.NaN;
        } else {
            return firstNumber / secondNumber;
        }
    }
}

