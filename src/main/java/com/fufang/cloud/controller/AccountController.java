package com.fufang.cloud.controller;

import com.fufang.cloud.core.Controller.BaseController;
import com.fufang.cloud.service.AccountService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "account-api", description = "药店资产操作API")
@RequestMapping("/account")
@Controller
public class AccountController extends BaseController {

	@Autowired
	private AccountService accountService;
	
}
