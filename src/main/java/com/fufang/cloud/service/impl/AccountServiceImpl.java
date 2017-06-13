package com.fufang.cloud.service.impl;

import com.fufang.cloud.mapper.mysql_acc.AccountLogMapper;
import com.fufang.cloud.mapper.mysql_acc.AccountMapper;
import com.fufang.cloud.model.Account;
import com.fufang.cloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	@Autowired
	private AccountMapper accountMapper;
	@Autowired
	private AccountLogMapper accountLogMapper;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void insert(Account account) {
		accountMapper.insert(account);
	}
}
