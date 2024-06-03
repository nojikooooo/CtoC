package solekia.CtoC.model;

import java.util.List;

import solekia.CtoC.repository.FurimaModel;

public class FurimaPageModel {
    public String title;

    // 顧客一覧
    public List<FurimaModel> list;

    public int customer_id;
    public String customer_pw;
    public String customer_name;
    public String customer_mail;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_pw() {
        return customer_pw;
    }

    public void setCustomer_pw(String customer_pw) {
        this.customer_pw = customer_pw;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_mail() {
        return customer_mail;
    }

    public void setCustomer_mail(String customer_mail) {
        this.customer_mail = customer_mail;
    }

}