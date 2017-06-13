package com.fufang.cloud.mapper.mysql_acc;


import com.fufang.cloud.model.AccountLog;

import java.util.List;

public interface AccountLogMapper {
	
    int insert(AccountLog record);

    AccountLog selectByPrimaryKey(String id);

    List<AccountLog> selectAll();
}