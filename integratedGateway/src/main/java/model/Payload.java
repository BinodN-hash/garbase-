package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Payload {
    @SerializedName("bankLists")
    @Expose
    private List<BankList> bankLists = null;

    public List<BankList> getBankLists() {
        return bankLists;
    }

    public void setBankLists(List<BankList> bankLists) {
        this.bankLists = bankLists;
    }




}
