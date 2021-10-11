public interface ProductPricingService {
    Double price(String exchange, String contractCode, Integer month, Integer year);
    Double price(String exchange, String ticker);
}
