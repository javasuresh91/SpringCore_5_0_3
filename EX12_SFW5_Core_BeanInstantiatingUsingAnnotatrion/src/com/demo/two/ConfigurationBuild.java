package com.demo.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBuild {
	
	@Bean
	public AccountRepository getAccount() {
		return new AccountRepository();
	}
	
	@Bean
	public TransferService getTransfer(AccountRepository acc) {
		return new TransferServiceImpl(); 
	}

}
