package com.app.config;

import com.app.services.UsLocalDateFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;

/**
 * Created by Marcin on 01.08.2016.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDate.class, new
                UsLocalDateFormatter());
    }
}
