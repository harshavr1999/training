package training.iqgatway;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "AirlineReservation", targetNamespace = "http://iqgatway.training/", serviceName = "AirlineReservationService", portName = "AirlineReservationPort", wsdlLocation = "/WEB-INF/wsdl/AirlineReservationService.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
public class AirlineReservationImpl {
    public AirlineReservationImpl() {
    }

    @Action(input = "http://iqgatway.training/AirlineReservation/destinationRequest", output = "http://iqgatway.training/AirlineReservation/destinationResponse")
    @ResponseWrapper(localName = "destinationResponse", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.DestinationResponse")
    @RequestWrapper(localName = "destination", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.Destination")
    @WebMethod
    public String destination(@WebParam(name = "arg0")
        String arg0) {
        return null;
    }

    @Action(input = "http://iqgatway.training/AirlineReservation/fromCityRequest", output = "http://iqgatway.training/AirlineReservation/fromCityResponse")
    @ResponseWrapper(localName = "fromCityResponse", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.FromCityResponse")
    @RequestWrapper(localName = "fromCity", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.FromCity")
    @WebMethod
    public String fromCity(@WebParam(name = "arg0")
        String arg0) {
        return null;
    }

    @Action(input = "http://iqgatway.training/AirlineReservation/selectSeatNoRequest", output = "http://iqgatway.training/AirlineReservation/selectSeatNoResponse")
    @ResponseWrapper(localName = "selectSeatNoResponse", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.SelectSeatNoResponse")
    @RequestWrapper(localName = "selectSeatNo", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.SelectSeatNo")
    @WebMethod
    public String selectSeatNo(@WebParam(name = "arg0")
        String arg0) {
        return null;
    }

    @Action(input = "http://iqgatway.training/AirlineReservation/cancelReservationRequest", output = "http://iqgatway.training/AirlineReservation/cancelReservationResponse")
    @ResponseWrapper(localName = "cancelReservationResponse", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.CancelReservationResponse")
    @RequestWrapper(localName = "cancelReservation", targetNamespace = "http://iqgatway.training/", className = "training.iqgatway.CancelReservation")
    @WebMethod
    public boolean cancelReservation(@WebParam(name = "arg0")
        boolean arg0) {
        return false;
    }
}
