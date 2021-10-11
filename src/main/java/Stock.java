public class Stock extends Product {
    private  String ticker;
    private ProductPricingService productPricingService;

    public Stock(String id,String exchange,String ticker,ProductPricingService productPricingService) {
        super(id,exchange);
        this.ticker = ticker;
        this.productPricingService = productPricingService;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public Double getPricing() {
        return productPricingService.price(this.getExchange(),this.getTicker());
    }
}
