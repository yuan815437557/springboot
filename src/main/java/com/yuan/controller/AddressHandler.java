package com.yuan.controller;

import com.yuan.exception.PhoneException;
import com.yuan.form.AddressForm;
import com.yuan.service.AddressService;
import com.yuan.util.ResultVOUtil;
import com.yuan.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/address")
@Slf4j
public class AddressHandler {
    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResultVO list(){
        return ResultVOUtil.success(addressService.findAll());
    }

    @PostMapping("/create")//@RequestBody将前端传来的json解析为java对象
    public ResultVO create( @RequestBody @Valid AddressForm addressForm, BindingResult bindingResult){
        //@Valid启用验证的机制
        if(bindingResult.hasErrors()){
            log.error("[添加地址] 参数错误，addressForm()",addressForm );
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());//控制台抛出
//            return ResultVOUtil.error(bindingResult.getFieldError().getDefaultMessage());//返回给用户message
        }

        addressService.saveOrUpdate(addressForm);

        return ResultVOUtil.success(null);
    }

    @PutMapping("/update")
    public ResultVO update(@Valid @RequestBody AddressForm addressForm,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("[修改地址] 参数错误，addressForm()",addressForm);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        addressService.saveOrUpdate(addressForm);

        return ResultVOUtil.success(null);
    }
}
