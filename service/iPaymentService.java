package service;

public interface iPaymentService {
    double calcInterest(double baseValue, int month);
    double calcFee(double baseValue);
}
