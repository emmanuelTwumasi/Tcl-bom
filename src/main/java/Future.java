public class Future extends Product{

    private String contractCode;
    private Integer month, year;

    public Future(String id, String exchange, String contractCode, Integer month, Integer year) {
        super(id, exchange);
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Double getPricing() {
        return null;
    }
}
