package training.iqgateway;

import javax.ejb.Stateless;

@Stateless(name = "CurrencyConverter", mappedName = "JavaEEApps-Lesson06-SessionEJBDemo-CurrencyConverter")
public class CurrencyConverterBean implements CurrencyConverter,
                                              CurrencyConverterLocal {
    public CurrencyConverterBean() {
    }

    public double dollarToRS(double dollars) {
        return 69.34*dollars;
    }

    public double poundsToRS(double pounds) {
        return 81.90*pounds;
    }

    public double eurosToRS(double euros) {
        return 76.12*euros;
    }

    public double riyalsToRS(double riyals) {
        return 0.0;
    }

    public double yensToRS(double yens) {
        return 0.0;
    }

    public double pesosToRS(double yens) {
        return 0.0;
    }
}
