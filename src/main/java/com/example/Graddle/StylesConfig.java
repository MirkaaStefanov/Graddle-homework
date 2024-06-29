package com.example.Graddle;

import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StylesConfig {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", "Bearer hradYmc4Zlx4TVWpcDFV12WqQGDIHoJc4rcXApn07FrHAqFmtvHkaFT0gcU7Hez3");
        };
    }
    @Bean public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder(); }

}
