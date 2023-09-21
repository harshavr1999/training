
package training.iqgatway;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the training.iqgatway package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelReservation_QNAME = new QName("http://iqgatway.training/", "cancelReservation");
    private final static QName _FromCity_QNAME = new QName("http://iqgatway.training/", "fromCity");
    private final static QName _Destination_QNAME = new QName("http://iqgatway.training/", "destination");
    private final static QName _DestinationResponse_QNAME = new QName("http://iqgatway.training/", "destinationResponse");
    private final static QName _FromCityResponse_QNAME = new QName("http://iqgatway.training/", "fromCityResponse");
    private final static QName _SelectSeatNo_QNAME = new QName("http://iqgatway.training/", "selectSeatNo");
    private final static QName _CancelReservationResponse_QNAME = new QName("http://iqgatway.training/", "cancelReservationResponse");
    private final static QName _SelectSeatNoResponse_QNAME = new QName("http://iqgatway.training/", "selectSeatNoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: training.iqgatway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectSeatNo }
     * 
     */
    public SelectSeatNo createSelectSeatNo() {
        return new SelectSeatNo();
    }

    /**
     * Create an instance of {@link FromCityResponse }
     * 
     */
    public FromCityResponse createFromCityResponse() {
        return new FromCityResponse();
    }

    /**
     * Create an instance of {@link SelectSeatNoResponse }
     * 
     */
    public SelectSeatNoResponse createSelectSeatNoResponse() {
        return new SelectSeatNoResponse();
    }

    /**
     * Create an instance of {@link CancelReservationResponse }
     * 
     */
    public CancelReservationResponse createCancelReservationResponse() {
        return new CancelReservationResponse();
    }

    /**
     * Create an instance of {@link DestinationResponse }
     * 
     */
    public DestinationResponse createDestinationResponse() {
        return new DestinationResponse();
    }

    /**
     * Create an instance of {@link FromCity }
     * 
     */
    public FromCity createFromCity() {
        return new FromCity();
    }

    /**
     * Create an instance of {@link CancelReservation }
     * 
     */
    public CancelReservation createCancelReservation() {
        return new CancelReservation();
    }

    /**
     * Create an instance of {@link Destination }
     * 
     */
    public Destination createDestination() {
        return new Destination();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "cancelReservation")
    public JAXBElement<CancelReservation> createCancelReservation(CancelReservation value) {
        return new JAXBElement<CancelReservation>(_CancelReservation_QNAME, CancelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "fromCity")
    public JAXBElement<FromCity> createFromCity(FromCity value) {
        return new JAXBElement<FromCity>(_FromCity_QNAME, FromCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "destination")
    public JAXBElement<Destination> createDestination(Destination value) {
        return new JAXBElement<Destination>(_Destination_QNAME, Destination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "destinationResponse")
    public JAXBElement<DestinationResponse> createDestinationResponse(DestinationResponse value) {
        return new JAXBElement<DestinationResponse>(_DestinationResponse_QNAME, DestinationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "fromCityResponse")
    public JAXBElement<FromCityResponse> createFromCityResponse(FromCityResponse value) {
        return new JAXBElement<FromCityResponse>(_FromCityResponse_QNAME, FromCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSeatNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "selectSeatNo")
    public JAXBElement<SelectSeatNo> createSelectSeatNo(SelectSeatNo value) {
        return new JAXBElement<SelectSeatNo>(_SelectSeatNo_QNAME, SelectSeatNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "cancelReservationResponse")
    public JAXBElement<CancelReservationResponse> createCancelReservationResponse(CancelReservationResponse value) {
        return new JAXBElement<CancelReservationResponse>(_CancelReservationResponse_QNAME, CancelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectSeatNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgatway.training/", name = "selectSeatNoResponse")
    public JAXBElement<SelectSeatNoResponse> createSelectSeatNoResponse(SelectSeatNoResponse value) {
        return new JAXBElement<SelectSeatNoResponse>(_SelectSeatNoResponse_QNAME, SelectSeatNoResponse.class, null, value);
    }

}
