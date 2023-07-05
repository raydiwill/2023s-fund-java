package fr.epita.bank.services;

import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

public class AccountService {

    private static final double commissionRate= 0.05;

    public static void buyStock(Stock stock, InvestmentAccount investmentAccount, int quantity) {
        StockOrder stockOrder = new StockOrder(stock.getCurrentPrice(), quantity, commissionRate);

        investmentAccount.setBalance(
                investmentAccount.getBalance() - stockOrder.getCurrentPrice()* stockOrder.getQuantity()  * (1 + stockOrder.getCommissionRate())
        );
    }
}
