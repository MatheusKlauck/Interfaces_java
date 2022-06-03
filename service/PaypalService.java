package service;

public class PaypalService implements iPaymentService {
    @Override
    public double calcInterest(double baseValue, int month) {
        return baseValue * .01 * month;
    }

    @Override
    public double calcFee(double baseValue) {
        return baseValue * .02;
    }
}
