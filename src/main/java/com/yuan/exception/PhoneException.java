package com.yuan.exception;

import com.yuan.enums.ResultEnum;
import com.yuan.service.PhoneService;

public class PhoneException extends RuntimeException{
    public PhoneException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
    }

    public PhoneException(String error){
        super(error);
    }
}
