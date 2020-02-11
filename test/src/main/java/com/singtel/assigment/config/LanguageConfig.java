package com.singtel.assigment.config;

import java.util.Locale;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LanguageConfig {

	@Value("${language}")
	private String language;

	@PostConstruct
	private void setLanguge() {
		Locale.setDefault(new Locale(language));
	}

}
