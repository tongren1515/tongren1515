package model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspect {
	@Pointcut("execution(public * get*(..))")
	public void anymethod() {	
	}
	
	@Before(value="anymethod()")
	public void ss(JoinPoint p) throws Throwable {
		System.out.println(p.getTarget().getClass().getName());
		System.out.println("前置。。。。");
	}
	
	@After(value = "anymethod()")
    public void exe1(JoinPoint p) throws Throwable{
		System.out.println("后置.......");
	}
	@AfterReturning(value = "anymethod()",returning="o")
    public void exe2(JoinPoint p,Object o) throws Throwable{
		System.out.println("后置1......."+o);
	}	
	/*@Around(value = "anymethod()")
    public void exe34(ProceedingJoinPoint p) throws Throwable{
		System.out.println("h前置.......");
		p.proceed();
		System.out.println("h后置.......");
	}	*/
	@AfterThrowing(value = "anymethod()",throwing="o")
    public void exe2(JoinPoint p,Throwable o) throws Throwable{
		System.out.println("错误......."+o.getMessage());
	}

}
