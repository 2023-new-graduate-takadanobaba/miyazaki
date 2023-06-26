package mazin.test;

public class VendingMachine {
    private boolean isButtonPushed;
    private int remainingAmount;

    public boolean isButtonPushed() {
        return this.isButtonPushed;
    }

    public void pushButton() {
        isButtonPushed = true;
    }

    public String getBucket() {
        return "コーラ";
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void insertCoin(int coin) {
        this.remainingAmount = coin;
    }
}