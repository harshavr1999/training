package training.iqgateway;

import javax.ejb.Remote;

@Remote
public interface CurrencyConverter {
    public double dollarToRS(double dollars);
    public double poundsToRS(double pounds);
    public double eurosToRS(double euros);
    public double riyalsToRS(double riyals);
    public double yensToRS(double yens);
    public double pesosToRS(double yens);
//    public double diramsToRS(double dirams);
//    
//    public double uaeriyalsToRS(double uaeRiyals);
    
}
