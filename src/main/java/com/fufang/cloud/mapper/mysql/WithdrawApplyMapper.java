package com.fufang.cloud.mapper.mysql;

import com.fufang.cloud.model.WithdrawApply;

import java.util.List;

public interface WithdrawApplyMapper {
    int deleteByPrimaryKey(String id);

    int insert(WithdrawApply record);

    WithdrawApply selectByPrimaryKey(String id);

    List<WithdrawApply> selectAll();
}