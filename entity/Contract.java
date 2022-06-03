package entity;

import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private double number;
    private double totalValue;
    private Date date;
    private ArrayList<Installment> installments;

    public Contract(double number, double totalValue, Date date, ArrayList<Installment> installments) {
        this.number = number;
        this.totalValue = totalValue;
        this.date = date;
        this.installments = installments;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public ArrayList<Installment> getInstallments() {
        return installments;
    }

    public Date getDate() {
        return date;
    }

    public void getInstallmentsInfo() {
        System.out.printf("Total installments value: $ %f%n",installments.stream().mapToDouble(x -> x.getAmount()).sum());
        System.out.println("-----");
        installments.stream().forEach(x -> System.out.printf("date: %tD    amount: $ %f%n",x.getDueDate(), x.getAmount()));
    }
}
