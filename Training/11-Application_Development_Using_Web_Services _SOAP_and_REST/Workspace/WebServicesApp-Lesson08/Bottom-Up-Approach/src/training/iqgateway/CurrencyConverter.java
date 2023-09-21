package training.iqgateway;

import javax.jws.WebService;

// Business Class where Logic of the Application present
@WebService
public class CurrencyConverter {
    public double dollarToRS(double dollars){
        return 69.34*dollars;
    }
    public double poundToRS(double pounds){
        return 72.89*pounds;
    }
    public double yensToRS(double yens){
        return 0.5*yens;
    }
}
