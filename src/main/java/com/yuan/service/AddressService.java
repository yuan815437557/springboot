package com.yuan.service;

import com.yuan.form.AddressForm;
import com.yuan.vo.AddressVO;

import java.util.List;

public interface AddressService {
    public List<AddressVO> findAll();
    public void saveOrUpdate(AddressForm addressForm);
}
