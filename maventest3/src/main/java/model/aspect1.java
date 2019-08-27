package model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class aspect1 {
	 public void aa(JoinPoint p) throws Throwable{
		 System.out.println(p.getTarget().getClass().getName());
			System.out.println("前置.......");
		} 
	 public void bb(JoinPoint p,Object result) throws Throwable{
			System.out.println("方法执行并返回......."+result);
		} 
	 public void cc(JoinPoint p) throws Throwable{
			System.out.println("后置.......");
		} 
	 public Object dd(ProceedingJoinPoint pjp) throws Throwable{
			System.out.println("环绕前置.......");
			Object o = pjp.proceed();
			System.out.println("环绕后置.......");
			return o;
		} 
	 public void ee( JoinPoint jp, Throwable e) throws Throwable{
			System.out.println("出错了"+e.getMessage());
		}
}