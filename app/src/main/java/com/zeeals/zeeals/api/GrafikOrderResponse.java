
package com.zeeals.zeeals.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zeeals.zeeals.model.Grafik.Daily;
import com.zeeals.zeeals.model.Grafik.Info;
import com.zeeals.zeeals.model.Grafik.LifetimeSales;
import com.zeeals.zeeals.model.Grafik.Monthly;
import com.zeeals.zeeals.model.Grafik.NewArrival;
import com.zeeals.zeeals.model.Grafik.Order;
import com.zeeals.zeeals.model.Grafik.PopularProduct;

import java.util.List;

public class GrafikOrderResponse {

    @SerializedName("info")
    @Expose
    private List<Info> info = null;
    @SerializedName("total_produk")
    @Expose
    private Integer totalProduk;
    @SerializedName("popular_product")
    @Expose
    private List<PopularProduct> popularProduct = null;
    @SerializedName("new_arrival")
    @Expose
    private List<NewArrival> newArrival = null;
    @SerializedName("less_than_5")
    @Expose
    private List<Object> lessThan5 = null;
    @SerializedName("outof_stock")
    @Expose
    private List<Object> outofStock = null;
    @SerializedName("order_pending")
    @Expose
    private List<Object> orderPending = null;
    @SerializedName("tot_member_reseller")
    @Expose
    private Integer totMemberReseller;
    @SerializedName("order")
    @Expose
    private List<Order> order = null;
    @SerializedName("total_order_all")
    @Expose
    private Integer totalOrderAll;
    @SerializedName("total_order_success")
    @Expose
    private Integer totalOrderSuccess;
    @SerializedName("lifetime_sales")
    @Expose
    private LifetimeSales lifetimeSales;
    @SerializedName("monthly")
    @Expose
    private List<Monthly> monthly = null;
    @SerializedName("daily")
    @Expose
    private List<Daily> daily = null;
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

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public Integer getTotalProduk() {
        return totalProduk;
    }

    public void setTotalProduk(Integer totalProduk) {
        this.totalProduk = totalProduk;
    }

    public List<PopularProduct> getPopularProduct() {
        return popularProduct;
    }

    public void setPopularProduct(List<PopularProduct> popularProduct) {
        this.popularProduct = popularProduct;
    }

    public List<NewArrival> getNewArrival() {
        return newArrival;
    }

    public void setNewArrival(List<NewArrival> newArrival) {
        this.newArrival = newArrival;
    }

    public List<Object> getLessThan5() {
        return lessThan5;
    }

    public void setLessThan5(List<Object> lessThan5) {
        this.lessThan5 = lessThan5;
    }

    public List<Object> getOutofStock() {
        return outofStock;
    }

    public void setOutofStock(List<Object> outofStock) {
        this.outofStock = outofStock;
    }

    public List<Object> getOrderPending() {
        return orderPending;
    }

    public void setOrderPending(List<Object> orderPending) {
        this.orderPending = orderPending;
    }

    public Integer getTotMemberReseller() {
        return totMemberReseller;
    }

    public void setTotMemberReseller(Integer totMemberReseller) {
        this.totMemberReseller = totMemberReseller;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public Integer getTotalOrderAll() {
        return totalOrderAll;
    }

    public void setTotalOrderAll(Integer totalOrderAll) {
        this.totalOrderAll = totalOrderAll;
    }

    public Integer getTotalOrderSuccess() {
        return totalOrderSuccess;
    }

    public void setTotalOrderSuccess(Integer totalOrderSuccess) {
        this.totalOrderSuccess = totalOrderSuccess;
    }

    public LifetimeSales getLifetimeSales() {
        return lifetimeSales;
    }

    public void setLifetimeSales(LifetimeSales lifetimeSales) {
        this.lifetimeSales = lifetimeSales;
    }

    public List<Monthly> getMonthly() {
        return monthly;
    }

    public void setMonthly(List<Monthly> monthly) {
        this.monthly = monthly;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
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
