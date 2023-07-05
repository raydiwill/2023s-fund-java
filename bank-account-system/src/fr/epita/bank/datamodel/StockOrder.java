package fr.epita.bank.datamodel;

public class StockOrder {
    private final double currentPrice;
    private final int quantity;
    private final double commissionRate;

    public StockOrder(double currentPrice, int quantity, double commissionRate) {
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.commissionRate = commissionRate;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}
