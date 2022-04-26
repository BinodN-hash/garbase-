package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BankList {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cellpayCode")
    @Expose
    private String cellpayCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCellpayCode() {
        return cellpayCode;
    }

    public void setCellpayCode(String cellpayCode) {
        this.cellpayCode = cellpayCode;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getOperatorsBankCode() {
        return operatorsBankCode;
    }

    public void setOperatorsBankCode(String operatorsBankCode) {
        this.operatorsBankCode = operatorsBankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @SerializedName("bankType")
    @Expose
    private String bankType;
    @SerializedName("operatorsBankCode")
    @Expose
    private String operatorsBankCode;
    @SerializedName("bankCode")
    @Expose
    private String bankCode;
    @SerializedName("bankName")
    @Expose
    private String bankName;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("provider")
    @Expose
    private String provider;

}
