package com.hbc.impl.controller;

import com.hbc.client.love.IMessageService;
import com.hbc.client.love.response.Res;
import com.hbc.client.love.form.MessageParam;
import com.hbc.impl.mapper.LoveMessageMapper;
import com.hbc.impl.model.LoveMessage;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceImpl implements IMessageService {

  Logger logger = LoggerFactory.getLogger(this.getClass());
  @Resource
  private LoveMessageMapper loveMessageMapper;

  @Override
  public Res addMessage(@RequestBody MessageParam messageParam) {
    try {
      LoveMessage loveMessage = new LoveMessage();
      loveMessage.setArea(messageParam.getArea());
      loveMessage.setContent(messageParam.getMessage());
      loveMessage.setIp(messageParam.getIp());
      loveMessageMapper.insert(loveMessage);
      return Res.buildSucc();
    }catch (Throwable e){
      logger.error(e.getMessage(), e);
      return Res.buildError(e);
    }
  }

  @Override
  public Res getAll() {
    try {
      List<LoveMessage> loveMessages = loveMessageMapper.selectByExample(null);
      return Res.buildSucc(loveMessages);
    }catch (Throwable e){
      logger.error(e.getMessage(), e);
      return Res.buildError(e);
    }
  }
}
