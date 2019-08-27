package model;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class myaspect implements 
MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor,ThrowsAdvice  {
	
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("��������---"+returnValue);
	}
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("����ǰ");
		Object o= invocation.proceed();
		System.out.println("���ƺ�");
		return o;
	}
	//�쳣����ķ������ǽӿ��Դ��ģ����������������ܸĶ�
	 public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		 System.out.println("������");
	 }
	 public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
			System.out.println("֮ǰִ�С�����");
		}
}
