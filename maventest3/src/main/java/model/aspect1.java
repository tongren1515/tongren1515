package model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class aspect1 {
	 public void aa(JoinPoint p) throws Throwable{
		 System.out.println(p.getTarget().getClass().getName());
			System.out.println("ǰ��.......");
		} 
	 public void bb(JoinPoint p,Object result) throws Throwable{
			System.out.println("����ִ�в�����......."+result);
		} 
	 public void cc(JoinPoint p) throws Throwable{
			System.out.println("����.......");
		} 
	 public Object dd(ProceedingJoinPoint pjp) throws Throwable{
			System.out.println("����ǰ��.......");
			Object o = pjp.proceed();
			System.out.println("���ƺ���.......");
			return o;
		} 
	 public void ee( JoinPoint jp, Throwable e) throws Throwable{
			System.out.println("������"+e.getMessage());
		}
}