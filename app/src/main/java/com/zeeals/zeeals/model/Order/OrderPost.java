package com.zeeals.zeeals.model.Order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  20/04/17.
 */

public class OrderPost implements Serializable{


    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("key")
    @Expose
    private Integer key;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

}

