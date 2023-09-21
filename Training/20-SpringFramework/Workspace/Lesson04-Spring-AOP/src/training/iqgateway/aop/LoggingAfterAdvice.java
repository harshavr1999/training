package training.iqgateway.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object result, Method businessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging After Advice Invoked ...");
		System.out.println("Logging Advice Invoked on "+ businessMethodName);
		System.out.println("Arguments of Business Method "+ businessMethodArgs[0]);
		System.out.println("Result from the Business Method : "+result);
	}

}
