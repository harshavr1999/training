package training.iqgateway;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class CurrencyConverterPortClient
{
  @WebServiceRef
  private static CurrencyConverterService currencyConverterService;

  public static void main(String [] args)
  {
    currencyConverterService = new CurrencyConverterService();
    CurrencyConverter currencyConverter = currencyConverterService.getCurrencyConverterPort();
    // Add your code to call the desired methods.
    System.out.println(currencyConverter.dollarToRS(1000));
  }
}
