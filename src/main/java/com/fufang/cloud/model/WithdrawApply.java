package com.fufang.cloud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel("提现申请")
public class WithdrawApply {
    @ApiModelProperty("id")
    private String id;
    @ApiModelProperty("药店id")
    @Excel(name = "药店id",orderNum = "2")
    private Integer pharmacyId;
    @ApiModelProperty("药店类型")
    private Integer pharmacyType;
    @ApiModelProperty("药店名称")
    @Excel(name = "药店名称",orderNum = "1")
    private String pharmacyName;
    @ApiModelProperty("收款账号id")
    private String accountId;
    @ApiModelProperty("提现金额")
    @Excel(name = "提现金额",orderNum = "8")
    private BigDecimal money;
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("创建用户id")
    private String createUserId;
    @ApiModelProperty("创建用户姓名")
    private String createUserName;
    @ApiModelProperty("申请状态")
    private Integer status;
    @ApiModelProperty("审核用户id")
    private String checkUserId;
    @ApiModelProperty("审核用户姓名")
    private String checkUserName;
    @ApiModelProperty("审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date checkTime;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("汇款流水号")
    private String remitNumber;

    @ApiModelProperty("提现户名")
    @Excel(name = "提现户名",orderNum = "3")
    private String accountName;
    @ApiModelProperty("提现银行卡号")
    @Excel(name = "提现银行卡号",orderNum = "4")
    private String cardNo;
    @ApiModelProperty("提现开户银行")
    @Excel(name = "提现开户银行",orderNum = "5")
    private String bankName;
    private String bankProvince;
    private String bankCity;
    @ApiModelProperty("提现详细开户行")
    @Excel(name = "提现详细开户行",orderNum = "6")
    private String detailedBankName;
    @ApiModelProperty("对公/对私")
    @Excel(name = "对公/对私",orderNum = "7")
    private Integer publicPrivate;
    @ApiModelProperty("财务联系人")
    @Excel(name = "财务联系人",orderNum = "9")
    private String linkman;
    @ApiModelProperty("财务联系人手机号")
    @Excel(name = "财务联系人手机号",orderNum = "10")
    private String phoneNo;
    @ApiModelProperty("日志id")
    private String accountLogId;
    @ApiModelProperty("导出的标识字段")
    private Long sort;
    @ApiModelProperty("开户行支行联行号")
    private String bankSettleNo;

    public String getBankSettleNo() {
		return bankSettleNo;
	}

	public void setBankSettleNo(String bankSettleNo) {
		this.bankSettleNo = bankSettleNo;
	}

	public Long getSort() {
		return sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	public String getAccountLogId() {
		return accountLogId;
	}

	public void setAccountLogId(String accountLogId) {
		this.accountLogId = accountLogId;
	}

	public String getRemitNumber() {
        return remitNumber;
    }

    public void setRemitNumber(String remitNumber) {
        this.remitNumber = remitNumber;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDetailedBankName() {
        return detailedBankName;
    }

    public void setDetailedBankName(String detailedBankName) {
        this.detailedBankName = detailedBankName;
    }

    public Integer getPublicPrivate() {
        return publicPrivate;
    }

    public void setPublicPrivate(Integer publicPrivate) {
        this.publicPrivate = publicPrivate;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public Integer getPharmacyType() {
        return pharmacyType;
    }

    public void setPharmacyType(Integer pharmacyType) {
        this.pharmacyType = pharmacyType;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}