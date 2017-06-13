package com.fufang.cloud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户操作日志表
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -171977069299842869L;

	private String id;
	
	/**
	 * 药店Id
	 */
    private Integer pharmacyId;

    /**
     * 连锁类型
     */
    private Integer chainType;

    /**
     * 操作类型(1入账,-1出账)
     */
    private Integer operationType;

    /**
     * 操作金额
     */
    private BigDecimal operationMoney;

    /**
     * 账户余额
     */
    private BigDecimal surplusMoney;

    /**
     * 账户Id
     */
    private String accountId;

    /**
     * 创建人名称
     */
    private String createName;
    
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;
  
    /**
     * 更新人
     */
    private String updateName;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 创建人Id
     */
    private String createUserId;
       
    /**
     * 更新人Id
     */
    private String updateUserId;
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

    public Integer getChainType() {
        return chainType;
    }

    public void setChainType(Integer chainType) {
        this.chainType = chainType;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public BigDecimal getOperationMoney() {
        return operationMoney;
    }

    public void setOperationMoney(BigDecimal operationMoney) {
        this.operationMoney = operationMoney;
    }

    public BigDecimal getSurplusMoney() {
        return surplusMoney;
    }

    public void setSurplusMoney(BigDecimal surplusMoney) {
        this.surplusMoney = surplusMoney;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
}