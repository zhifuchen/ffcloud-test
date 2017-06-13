package com.fufang.cloud.mapper.mysql_acc;

import com.fufang.cloud.model.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    int insert(Account record);

    Account selectByPrimaryKey(String id);

    List<Account> selectAll();

	Account getAccountByPharmacyId(Integer pharmacyId, Integer chainType);

	void updateAccount(Account pharmacyAccount);

	Map<String, Object> queryAccountInfo(Map<String, Object> map);
}