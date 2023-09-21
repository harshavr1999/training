
package training.iqgateway.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the training.iqgateway.types package. 
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

    private final static QName _YensToRSResponse_QNAME = new QName("http://iqgateway.training/", "yensToRSResponse");
    private final static QName _DollarToRS_QNAME = new QName("http://iqgateway.training/", "dollarToRS");
    private final static QName _DollarToRSResponse_QNAME = new QName("http://iqgateway.training/", "dollarToRSResponse");
    private final static QName _PoundToRSResponse_QNAME = new QName("http://iqgateway.training/", "poundToRSResponse");
    private final static QName _PoundToRS_QNAME = new QName("http://iqgateway.training/", "poundToRS");
    private final static QName _YensToRS_QNAME = new QName("http://iqgateway.training/", "yensToRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: training.iqgateway.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link YensToRSResponse }
     * 
     */
    public YensToRSResponse createYensToRSResponse() {
        return new YensToRSResponse();
    }

    /**
     * Create an instance of {@link DollarToRSResponse }
     * 
     */
    public DollarToRSResponse createDollarToRSResponse() {
        return new DollarToRSResponse();
    }

    /**
     * Create an instance of {@link DollarToRS }
     * 
     */
    public DollarToRS createDollarToRS() {
        return new DollarToRS();
    }

    /**
     * Create an instance of {@link PoundToRS }
     * 
     */
    public PoundToRS createPoundToRS() {
        return new PoundToRS();
    }

    /**
     * Create an instance of {@link YensToRS }
     * 
     */
    public YensToRS createYensToRS() {
        return new YensToRS();
    }

    /**
     * Create an instance of {@link PoundToRSResponse }
     * 
     */
    public PoundToRSResponse createPoundToRSResponse() {
        return new PoundToRSResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YensToRSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "yensToRSResponse")
    public JAXBElement<YensToRSResponse> createYensToRSResponse(YensToRSResponse value) {
        return new JAXBElement<YensToRSResponse>(_YensToRSResponse_QNAME, YensToRSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "dollarToRS")
    public JAXBElement<DollarToRS> createDollarToRS(DollarToRS value) {
        return new JAXBElement<DollarToRS>(_DollarToRS_QNAME, DollarToRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "dollarToRSResponse")
    public JAXBElement<DollarToRSResponse> createDollarToRSResponse(DollarToRSResponse value) {
        return new JAXBElement<DollarToRSResponse>(_DollarToRSResponse_QNAME, DollarToRSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoundToRSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "poundToRSResponse")
    public JAXBElement<PoundToRSResponse> createPoundToRSResponse(PoundToRSResponse value) {
        return new JAXBElement<PoundToRSResponse>(_PoundToRSResponse_QNAME, PoundToRSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoundToRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "poundToRS")
    public JAXBElement<PoundToRS> createPoundToRS(PoundToRS value) {
        return new JAXBElement<PoundToRS>(_PoundToRS_QNAME, PoundToRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YensToRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "yensToRS")
    public JAXBElement<YensToRS> createYensToRS(YensToRS value) {
        return new JAXBElement<YensToRS>(_YensToRS_QNAME, YensToRS.class, null, value);
    }

}
