package com.hbc.client.love.config;

import com.google.gson.Gson;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class FeignSpringFormDecode implements Decoder{



  private GsonDecoder gsonDecoder;



  FeignSpringFormDecode(){

    gsonDecoder = new GsonDecoder();

  }



  @Override
  public Object decode(Response response,Type type)throws IOException,DecodeException,FeignException{
    Response.Body body = response.body();
    InputStream inputStream = body.asInputStream();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
      inputStream));
    String line, result="";
    while ((line = bufferedReader.readLine()) != null) {
      result += line;
    }
    Gson gson = new Gson();
    System.out.println("result = " + result);
    Object o = gson.fromJson(result, type);
    return o;

  }

}
