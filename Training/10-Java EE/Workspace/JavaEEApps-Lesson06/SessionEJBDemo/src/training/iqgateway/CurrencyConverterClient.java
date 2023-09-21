package training.iqgateway;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CurrencyConverterClient {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            CurrencyConverter ccRef = (CurrencyConverter)context.lookup("JavaEEApps-Lesson06-SessionEJBDemo-CurrencyConverter#training.iqgateway.CurrencyConverter");
            
            //invoke the business methods
            System.out.println(ccRef.dollarToRS(1000.0));
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //where to lookup
    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        return new InitialContext( env );
    }
}
