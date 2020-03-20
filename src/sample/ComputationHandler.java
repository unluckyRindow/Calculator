package sample;

public class ComputationHandler{
    public static String compute (String operator, String firstDigit, String secondDigit){
        Double firstNumber = Double.parseDouble(firstDigit);
        Double secondNumber = Double.parseDouble((secondDigit));
        switch (operator){
            case "+":
                return ((Double)(firstNumber + secondNumber)).toString();
            case "-":
                return ((Double)(firstNumber - secondNumber)).toString();
            case "x":
                return ((Double)(firstNumber * secondNumber)).toString();
            case "÷":
                try {
                    Double result = firstNumber / secondNumber;
                    if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) throw new ArithmeticException();
                    return result.toString();
                } catch (ArithmeticException e){
                    return "Can't divide by zero";
                }
        }
        return "0";
    }

    public static String compute(String operator, String digit){
        if (operator.equals("%")) {
            return ((Double)(Double.parseDouble(digit) / 100)).toString();
        }
        return "0";
    }
}
