package com.hbc.client.love;

import com.hbc.client.love.response.Res;
import com.hbc.client.love.config.LoveServiceConfig;
import com.hbc.client.love.form.MessageParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(LoveServiceConfig.APPLICATION_NAME)
public interface IMessageService {

  @RequestMapping(value = "/message/add", method = RequestMethod.POST)
  Res addMessage(@RequestBody MessageParam messageParam);

  @RequestMapping(value = "/message/getAll", method = RequestMethod.GET)
  Res getAll();


}
