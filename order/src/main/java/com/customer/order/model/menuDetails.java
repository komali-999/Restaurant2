package com.customer.order.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "menu_list",schema = "foodresevation")
public class menuDetails {

    public menuDetails(){
    }
    @Getter
    @Setter
    private String stater;
    private List[] biryani;
    private String mandi;
    private String cocktail;
    private String disert;

    Timestamp create_timestamp;

    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getCreate_timestamp() {
        return create_timestamp;
    }

    public void setCreate_timestamp(Timestamp create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public Timestamp getUpdated_timestamp() {
        return updated_timestamp;
    }

    public void setUpdated_timestamp(Timestamp updated_timestamp) {
        this.updated_timestamp = updated_timestamp;
    }

    Timestamp updated_timestamp;
    @Id
    private int id;

    public String getStater() {
        return stater;
    }

    public void setStater(String stater) {
        this.stater = stater;
    }


    public String getMandi() {
        return mandi;
    }

    public List[] getBiryani() {
        return biryani;
    }

    public void setBiryani(List[] biryani) {
        this.biryani = biryani;
    }

    public void setMandi(String mandi) {
        this.mandi = mandi;
    }

    public String getCocktail() {
        return cocktail;
    }

    public void setCocktail(String cocktail) {
        this.cocktail = cocktail;
    }


    public String getDisert() {
        return disert;
    }

    public void setDisert(String disert) {
        this.disert = disert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
