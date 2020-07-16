package com.yuan.repository;

import com.yuan.entity.BuyerAddress;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class BuyerAddressRepositoryTest {
    @Autowired
    private BuyerAddressRepository repository;

    @Test
    void findAll(){
        List<BuyerAddress> list =  repository.findAll();
        for (BuyerAddress buyerAddress : list) {
            System.out.println(buyerAddress);
        }
    }

    @Test
    void save(){
        BuyerAddress buyerAddress = new BuyerAddress();
        buyerAddress.setAreaCode("110136");
        buyerAddress.setBuyerAddress("安徽省安庆市");
        buyerAddress.setBuyerName("小红");
        buyerAddress.setBuyerPhone("17856567878");
        repository.save(buyerAddress);
    }

    @Test
    void update(){
        BuyerAddress buyerAddress = repository.findById(35).get();
        buyerAddress.setBuyerName("小花");
        repository.save(buyerAddress);
    }
}