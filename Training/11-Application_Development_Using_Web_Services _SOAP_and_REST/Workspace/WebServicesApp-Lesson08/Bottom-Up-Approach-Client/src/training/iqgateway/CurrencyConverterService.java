package training.iqgateway;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://localhost:7101/WebServicesApp-Lesson08-Bottom-Up-Approach-context-root/CurrencyConverterPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConverterService?wsdl",
  targetNamespace="http://iqgateway.training/", name="CurrencyConverterService")
public class CurrencyConverterService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("training.iqgateway.CurrencyConverterService");
      URL baseUrl = CurrencyConverterService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            CurrencyConverterService.class.getResource("http://localhost:7101/WebServicesApp-Lesson08-Bottom-Up-Approach-context-root/CurrencyConverterPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConverterService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://localhost:7101/WebServicesApp-Lesson08-Bottom-Up-Approach-context-root/CurrencyConverterPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConverterService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://localhost:7101/WebServicesApp-Lesson08-Bottom-Up-Approach-context-root/CurrencyConverterPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConverterService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://localhost:7101/WebServicesApp-Lesson08-Bottom-Up-Approach-context-root/CurrencyConverterPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConverterService?wsdl",
          e);
    }
  }

  public CurrencyConverterService()
  {
    super(wsdlLocationURL,
          new QName("http://iqgateway.training/", "CurrencyConverterService"));
  }

  public CurrencyConverterService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="CurrencyConverterPort")
  public training.iqgateway.CurrencyConverter getCurrencyConverterPort()
  {
    return (training.iqgateway.CurrencyConverter) super.getPort(new QName("http://iqgateway.training/",
                                                                          "CurrencyConverterPort"),
                                                                training.iqgateway.CurrencyConverter.class);
  }

  @WebEndpoint(name="CurrencyConverterPort")
  public training.iqgateway.CurrencyConverter getCurrencyConverterPort(WebServiceFeature... features)
  {
    return (training.iqgateway.CurrencyConverter) super.getPort(new QName("http://iqgateway.training/",
                                                                          "CurrencyConverterPort"),
                                                                training.iqgateway.CurrencyConverter.class,
                                                                features);
  }
}
