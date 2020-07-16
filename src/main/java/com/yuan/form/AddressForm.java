package com.yuan.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AddressForm {
    private Integer id;
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "电话不能为空")
    private  String tel;
    @NotBlank(message = "省不能为空")
    private String province;
    @NotBlank(message = "市不能为空")
    private String city;
    @NotBlank(message = "区不能为空")
    private String county;
    @NotBlank(message = "编码不能为空")
    private String areaCode;
    @NotBlank(message = "详细地址不能为空")
    private String addressDetail;
}
