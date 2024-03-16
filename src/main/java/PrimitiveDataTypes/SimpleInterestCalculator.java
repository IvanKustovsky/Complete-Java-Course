package PrimitiveDataTypes;
import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private final BigDecimal principal;
    private final BigDecimal interest;
    public SimpleInterestCalculator(String principal, String interest ){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int years){
        return principal.multiply(new BigDecimal(years)).multiply(interest).add(principal);
    }

}

