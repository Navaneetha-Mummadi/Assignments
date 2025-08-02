
package springmain;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Representation of IOC Container::
 * 1.BeanFactory interface
 * 2.ApplicationContext interface
 */
/*
 * | Feature                     | `BeanFactory`       | `ApplicationContext`               |
| --------------------------- | ------------------- | ---------------------------------- |
| Initialization              | Lazy (on-demand)    | Eager (on startup)                 |
| Memory usage                | Less                | Slightly more (for extra features) |
| AOP, Event, Annotations     | ❌ Not supported     | ✅ Fully supported                  |
| Internationalization (i18n) | ❌ No                | ✅ Yes                              |
| BeanPostProcessor support   | Manual              | Automatic                          |
| MessageSource (i18n)        | ❌ Not available     | ✅ Available                        |
| Recommended for             | Simple/Testing apps | Production / Enterprise apps       |

 */
import springprograms.SampleBean;

public class SpringCoreMainFiles {

	public static void main(String[] args) {
		ApplicationContext beanfactoryobj12 = new ClassPathXmlApplicationContext("WiproIOCContainer.xml");// src/main/resources);

		// SampleBean obj=new SampleBean();//not neccessary in SPRING

		// detect bean object OR lookup the bean in IOC
		SampleBean b1 = (SampleBean) beanfactoryobj12.getBean("mybean1");// bean object or bean id
		System.out.println("Welcome Spring By:: " + b1.getUsername());
	
		/*
		 * 
org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'mybean2': Bean definition is abstract
		Student b211=(Student)beanfactoryobj12.getBean("mybean2");
		System.out.println("Student Data:: "+b211.getSid()+ " "+b211.getSname());
*/
		
	}

}
