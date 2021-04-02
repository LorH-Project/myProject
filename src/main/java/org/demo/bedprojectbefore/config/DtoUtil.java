package org.demo.bedprojectbefore.config;


public class DtoUtil {
    public static String success="true";
    public static String fail="false";
    public static String errorCode="0";

    public static Dto returnSuccess(){
        Dto dto=new Dto();
        dto.setSuccess(success);
        return dto;
    }

    public static Dto returnSuccess(Object data){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setData(data);
        return dto;
    }

    public static Dto returnSuccess(String message){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setMsg(message);
        return dto;
    }

    public static Dto returnSuccess(String message,Object data){
        Dto dto=new Dto();
        dto.setSuccess(success);
        dto.setMsg(message);
        dto.setData(data);
        return dto;
    }

    public static Dto returnSuccess(String message,String errorCode){
        Dto dto = new Dto();
        dto.setSuccess(success);
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        return dto;
    }

    public static Dto returnFail(String message,String errorCode){
        Dto dto = new Dto();
        dto.setMsg(message);
        dto.setErrorCode(errorCode);
        dto.setSuccess(fail);
        return dto;

    }


}
