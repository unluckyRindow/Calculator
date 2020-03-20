package sample;

public class ComputationHandler{
    //TODO IMPLEMENT ALL CALCULATIONS
    public static String compute (String operator, String firstDigit, String secondDigit){
        boolean intCase = !firstDigit.contains(".") && !secondDigit.contains(".");
        switch (operator){
            case "+":
                return intCase ? ((Integer)(Integer.parseInt(firstDigit) + Integer.parseInt(secondDigit))).toString()
                        : ((Double)(Double.parseDouble(firstDigit) + Double.parseDouble(secondDigit))).toString();
            case "-":
                return intCase ? ((Integer)(Integer.parseInt(firstDigit) - Integer.parseInt(secondDigit))).toString()
                        : ((Double)(Double.parseDouble(firstDigit) - Double.parseDouble(secondDigit))).toString();
            case "x":
                return intCase ? ((Integer)(Integer.parseInt(firstDigit) * Integer.parseInt(secondDigit))).toString()
                        : ((Double)(Double.parseDouble(firstDigit) * Double.parseDouble(secondDigit))).toString();
            case "÷":
                return intCase ? ((Integer)(Integer.parseInt(firstDigit) / Integer.parseInt(secondDigit))).toString()
                        : ((Double)(Double.parseDouble(firstDigit) / Double.parseDouble(secondDigit))).toString();
        }
        return "0";
    }
}
