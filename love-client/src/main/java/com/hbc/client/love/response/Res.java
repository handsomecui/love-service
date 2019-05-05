package com.hbc.client.love.response;

import java.io.Serializable;

public class Res<T> implements Serializable {

  private T data;
  private int code;
  private String msg;

  public static Res buildError(Throwable e) {
    CodeEnum codeError = CodeEnum.CODE_ERROR;
    return new Res(null, codeError.code, codeError.msg);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Res() {
  }

  public Res(T data, int code, String msg) {
    this.data = data;
    this.code = code;
    this.msg = msg;
  }

  public static Res buildSucc(){
    CodeEnum codeSucc = CodeEnum.CODE_SUCC;
    return new Res(null, codeSucc.code, codeSucc.msg);
  }

  public static Res buildSucc(Object data){
    CodeEnum codeSucc = CodeEnum.CODE_SUCC;
    return new Res(data, codeSucc.code, codeSucc.msg);
  }

  public static enum CodeEnum{
    CODE_SUCC(200, "成功"), CODE_ERROR(500, "内部错误"), CODE_PARAM_ERROR(400, "参数错误");
    private int code;
    private String msg;

    CodeEnum(int code, String msg) {
      this.code = code;
      this.msg = msg;
    }

    public int getCode() {
      return code;
    }

    public void setCode(int code) {
      this.code = code;
    }

    public String getMsg() {
      return msg;
    }

    public void setMsg(String msg) {
      this.msg = msg;
    }
  }
}
