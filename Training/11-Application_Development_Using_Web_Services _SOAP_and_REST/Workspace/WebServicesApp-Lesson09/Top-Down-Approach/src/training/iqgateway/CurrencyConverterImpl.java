package training.iqgateway;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import training.iqgateway.types.ObjectFactory;

@WebService(name = "CurrencyConverter", targetNamespace = "http://iqgateway.training/", serviceName = "CurrencyConverterService", portName = "CurrencyConverterPort", wsdlLocation = "/WEB-INF/wsdl/CurrencyConverterService.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
public class CurrencyConverterImpl {
    public CurrencyConverterImpl() {
    }

    @ResponseWrapper(localName = "dollarToRSResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.DollarToRSResponse")
    @RequestWrapper(localName = "dollarToRS", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.DollarToRS")
    @WebMethod
    public double dollarToRS(@WebParam(name = "arg0")
        double arg0) {
        return 69.12*arg0;
    }

    @ResponseWrapper(localName = "poundToRSResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.PoundToRSResponse")
    @RequestWrapper(localName = "poundToRS", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.PoundToRS")
    @WebMethod
    public double poundToRS(@WebParam(name = "arg0")
        double arg0) {
        return 72.89*arg0;
    }

    @ResponseWrapper(localName = "yensToRSResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.YensToRSResponse")
    @RequestWrapper(localName = "yensToRS", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.YensToRS")
    @WebMethod
    public double yensToRS(@WebParam(name = "arg0")
        double arg0) {
        return 0.5*arg0;
    }
}
