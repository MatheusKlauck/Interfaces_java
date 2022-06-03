package main;
import entity.Contract;
import service.PaypalService;
import service.ContractService;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dat = new Date(2022,06,15);
        double baseValue = 600;
        int quotes = 3;

        ContractService ctrSrv = new ContractService();
        Contract contract = ctrSrv.processContract(new PaypalService(), 8015, dat, baseValue, quotes);
        System.out.print("Contract info");
        System.out.printf("%n  date: %tD  quotes: %d  value: $ %f%n",contract.getDate(), contract.getInstallments().stream().count(), contract.getTotalValue());
        System.out.printf("%nInstallments info%n");
        contract.getInstallmentsInfo();
    }
}
