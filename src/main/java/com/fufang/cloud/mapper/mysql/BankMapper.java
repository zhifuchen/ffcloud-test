package com.fufang.cloud.mapper.mysql;


import com.fufang.cloud.model.Bank;

import java.util.List;

public interface BankMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bank record);

    Bank selectByPrimaryKey(String id);

    List<Bank> selectAll();

    int updateByPrimaryKey(Bank record);
}