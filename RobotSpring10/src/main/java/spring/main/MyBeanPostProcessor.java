package spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	
	public Object postProcessAfterInitialization(Object object, String name) throws BeansException {

		return object;
	}

	
	public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
		System.out.println(object + " - postProcessBeforeInitialization()");
		return object;
	}

}
