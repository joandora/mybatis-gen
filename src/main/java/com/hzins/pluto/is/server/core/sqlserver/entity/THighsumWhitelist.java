package com.hzins.pluto.is.server.core.sqlserver.entity;

import java.util.Date;

public class THighsumWhitelist {
    private Long id;

    private Long insureNum;

    private Boolean platform;

    private Boolean auditType;

    private Boolean auditState;

    private Boolean submitType;

    private String applicantCname;

    private Integer payAmount;

    private String companyName;

    private String productName;

    private Long insurantId;

    private String insurantCname;

    private Boolean insurantCardTypeId;

    private String insurantCardNumber;

    private Integer categoryId;

    private Boolean passportSource;

    private Long userId;

    private String userName;

    private Date updateTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInsureNum() {
        return insureNum;
    }

    public void setInsureNum(Long insureNum) {
        this.insureNum = insureNum;
    }

    public Boolean getPlatform() {
        return platform;
    }

    public void setPlatform(Boolean platform) {
        this.platform = platform;
    }

    public Boolean getAuditType() {
        return auditType;
    }

    public void setAuditType(Boolean auditType) {
        this.auditType = auditType;
    }

    public Boolean getAuditState() {
        return auditState;
    }

    public void setAuditState(Boolean auditState) {
        this.auditState = auditState;
    }

    public Boolean getSubmitType() {
        return submitType;
    }

    public void setSubmitType(Boolean submitType) {
        this.submitType = submitType;
    }

    public String getApplicantCname() {
        return applicantCname;
    }

    public void setApplicantCname(String applicantCname) {
        this.applicantCname = applicantCname == null ? null : applicantCname.trim();
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getInsurantId() {
        return insurantId;
    }

    public void setInsurantId(Long insurantId) {
        this.insurantId = insurantId;
    }

    public String getInsurantCname() {
        return insurantCname;
    }

    public void setInsurantCname(String insurantCname) {
        this.insurantCname = insurantCname == null ? null : insurantCname.trim();
    }

    public Boolean getInsurantCardTypeId() {
        return insurantCardTypeId;
    }

    public void setInsurantCardTypeId(Boolean insurantCardTypeId) {
        this.insurantCardTypeId = insurantCardTypeId;
    }

    public String getInsurantCardNumber() {
        return insurantCardNumber;
    }

    public void setInsurantCardNumber(String insurantCardNumber) {
        this.insurantCardNumber = insurantCardNumber == null ? null : insurantCardNumber.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getPassportSource() {
        return passportSource;
    }

    public void setPassportSource(Boolean passportSource) {
        this.passportSource = passportSource;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}