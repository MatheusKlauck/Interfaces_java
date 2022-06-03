package entity;

import java.util.Date;

public class Installment {
    private double amount;
    private Date dueDate;

    public Installment(double amount, Date dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
