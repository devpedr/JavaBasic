package src.exercice.pOO.applicationDolar.entites;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1 + IOF);
    }
}
