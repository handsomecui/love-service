package com.hbc.client.love.config;

import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DecodeConfig {

  @Bean
  public Decoder feignDecoder() {
    return new FeignSpringFormDecode();
  }
}
