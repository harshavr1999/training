package training.iqgateway.business;

public class CurrencyConvertorImpl implements CurrencyConvertor {
	
	public Customer customerRef;
	
	public CurrencyConvertorImpl(Customer customerRef) {
		super();
		this.customerRef = customerRef;
	}

	public CurrencyConvertorImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(Customer customerRef) {
		this.customerRef = customerRef;
	}

	@Override
	public String dollorToRS(double dollars) {
		// TODO Auto-generated method stub
		return "Hello, "+ customerRef.getName()+ " Your Converted value is "+68.67*dollars;
	}

	@Override
	public String poundsToRS(double pounds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String riyalsToRS(double riyals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String yensToRS(double yens) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pesosToRS(double pesos) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
