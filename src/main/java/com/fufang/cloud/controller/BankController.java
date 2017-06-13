package com.fufang.cloud.controller;

import com.fufang.cloud.core.Controller.BaseController;
import com.fufang.cloud.core.response.FFApiResponse;
import com.fufang.cloud.model.Bank;
import com.fufang.cloud.service.IBankService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhifu.chen on 2016/11/16.
 */

@Api(value="Bank-API",description="选择银行api")
@Controller
@RequestMapping("/bank")
public class BankController extends BaseController {
    @Autowired
    private IBankService bankService;

    @ApiOperation(value = "银行列表", notes = "银行列表")
    @ApiResponses(value = {@ApiResponse(code = 200, message = RETURNMESSAGE)})
    @RequestMapping(value = "/bankList", method = RequestMethod.GET)
    @ResponseBody
    public FFApiResponse<List<Bank>> bankList() {
        try {
            return success();
        } catch (Exception e) {
            errorLog(e.getLocalizedMessage());
            return error(e.getLocalizedMessage());
        }
    }
    
}
