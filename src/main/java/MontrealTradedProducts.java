public interface MontrealTradedProducts {

    void addProduct(Product product) throws ProductAlreadyRegisteredException;


    void traded(Product product,int quantity);

    Integer totalTradeQuantityForDay();

}
