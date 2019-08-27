package maventest3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import model.Type;
import model.Typeinterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:aa.xml"})
public class java_test1 {
	/*@Resource(name="obj")
	Typeinterface t;*/ 
	@Autowired
	Type t;  
	
	@Test
	public void ss() {
		//System.out.println(t.getClass());
		System.out.println(t.getName());
		//t.getId();
		
	}
}
