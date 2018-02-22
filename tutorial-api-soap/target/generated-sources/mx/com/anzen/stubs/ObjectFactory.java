
package mx.com.anzen.stubs;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.anzen.stubs package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.anzen.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterRequest }
     * 
     */
    public RegisterRequest createRegisterRequest() {
        return new RegisterRequest();
    }

    /**
     * Create an instance of {@link UserBase }
     * 
     */
    public UserBase createUserBase() {
        return new UserBase();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link AllRequest }
     * 
     */
    public AllRequest createAllRequest() {
        return new AllRequest();
    }

    /**
     * Create an instance of {@link AllResponse }
     * 
     */
    public AllResponse createAllResponse() {
        return new AllResponse();
    }

    /**
     * Create an instance of {@link OneByIdRequest }
     * 
     */
    public OneByIdRequest createOneByIdRequest() {
        return new OneByIdRequest();
    }

    /**
     * Create an instance of {@link OneByIdResponse }
     * 
     */
    public OneByIdResponse createOneByIdResponse() {
        return new OneByIdResponse();
    }

    /**
     * Create an instance of {@link SoapComponentError }
     * 
     */
    public SoapComponentError createSoapComponentError() {
        return new SoapComponentError();
    }

}
