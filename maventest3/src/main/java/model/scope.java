package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy(true)
public class scope {
	@Bean
	public Type tt() {
		return new Type(5, "dsvfd");
	}
}
