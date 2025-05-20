// Main class to test the banking system
public class MainBankSystem {
    public static void main(String[] args) {
        INDBank bank = new HDFC();
        bank.displayBankInfo();
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%");

        OnlineBankingFeatures ob = new HDFC();
        ob.transferMoney();
        ob.checkBalance();
    }
}

/*
Bank Name: HDFC
Interest Rate: 6.5%
HDFC: Transferring Money Online...
HDFC: Checking Balance Online...
*/