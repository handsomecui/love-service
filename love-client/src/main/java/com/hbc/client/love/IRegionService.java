package com.hbc.client.love;

import com.hbc.client.love.config.FeignSpringFormDecode;
import com.hbc.client.love.response.Region;
import com.hbc.client.love.response.Res;
import com.hbc.client.love.config.LoveServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = LoveServiceConfig.APPLICATION_NAME, url = "http://ip.taobao.com", configuration = FeignSpringFormDecode.class)
public interface IRegionService {

  @RequestMapping(value = "/service/getIpInfo.php", headers = {"accept=*/*","connection=Keep-Alive", "user-agent=Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)", "Cookie=_ati=9565590255061;"}, method = RequestMethod.GET)
  Res<Region> getRegionByIp(@RequestParam("ip") String ip);




}
