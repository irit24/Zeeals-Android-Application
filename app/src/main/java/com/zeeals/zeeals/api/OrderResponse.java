package com.zeeals.zeeals.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zeeals.zeeals.model.Order.OrderModel;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  06/04/17.
 */
public class OrderResponse implements Serializable
{

    @SerializedName("result")
    @Expose
    private List<OrderModel> result;
    @SerializedName("total_rows")
    @Expose
    private Integer totalRows;
    @SerializedName("elapsed_time")
    @Expose
    private String elapsedTime;
    @SerializedName("parameter")
    @Expose
    private String parameter;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<OrderModel> getResult() {
        return result;
    }

    public void setResult(List<OrderModel> result) {
        this.result = result;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}