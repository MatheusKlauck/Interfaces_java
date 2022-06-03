package service;

import entity.Contract;
import entity.Installment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
    public Contract processContract(iPaymentService paymentMethod, int number, Date date, double totalValue, int quotes) {
        ArrayList<Installment> installments = new ArrayList<>();
        double valuePerQuote = totalValue / quotes;
        for (int i = 1; i <= quotes; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, i);
            double updatedQuote = valuePerQuote + paymentMethod.calcInterest(valuePerQuote, i);
            double fullQuote = updatedQuote + paymentMethod.calcFee(updatedQuote);
            installments.add(new Installment(fullQuote, cal.getTime()));
        }
        return new Contract(number, totalValue, date, installments);
    }
}
