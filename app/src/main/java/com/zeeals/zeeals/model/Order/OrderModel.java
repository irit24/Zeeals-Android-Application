package com.zeeals.zeeals.model.Order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  06/04/17.
 */

public class OrderModel {

    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("paymethod_id")
    @Expose
    private String paymethodId;
    @SerializedName("courier_id")
    @Expose
    private String courierId;
    @SerializedName("member_id")
    @Expose
    private String memberId;
    @SerializedName("mem_member_id")
    @Expose
    private Object memMemberId;
    @SerializedName("addr_id")
    @Expose
    private String addrId;
    @SerializedName("order_unique_code")
    @Expose
    private String orderUniqueCode;
    @SerializedName("order_datetime")
    @Expose
    private String orderDatetime;
    @SerializedName("order_total_price")
    @Expose
    private String orderTotalPrice;
    @SerializedName("order_total_weight")
    @Expose
    private String orderTotalWeight;
    @SerializedName("order_shipping_fee")
    @Expose
    private String orderShippingFee;
    @SerializedName("order_delivery_type")
    @Expose
    private String orderDeliveryType;
    @SerializedName("order_note")
    @Expose
    private Object orderNote;
    @SerializedName("order_as_dropshipper")
    @Expose
    private String orderAsDropshipper;
    @SerializedName("order_status")
    @Expose
    private Integer orderStatus;
    @SerializedName("order_province_id")
    @Expose
    private String orderProvinceId;
    @SerializedName("order_city_id")
    @Expose
    private String orderCityId;
    @SerializedName("delivery_province")
    @Expose
    private String deliveryProvince;
    @SerializedName("delivery_city")
    @Expose
    private String deliveryCity;
    @SerializedName("order_prod_total")
    @Expose
    private String orderProdTotal;
    @SerializedName("order_type")
    @Expose
    private String orderType;
    @SerializedName("order_recipient")
    @Expose
    private String orderRecipient;
    @SerializedName("order_postalcode")
    @Expose
    private String orderPostalcode;
    @SerializedName("order_address")
    @Expose
    private String orderAddress;
    @SerializedName("order_resi")
    @Expose
    private Object orderResi;
    @SerializedName("order_jenis")
    @Expose
    private String orderJenis;
    @SerializedName("order_promo")
    @Expose
    private Object orderPromo;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;
    @SerializedName("updated_on")
    @Expose
    private Object updatedOn;
    @SerializedName("paymethod_name")
    @Expose
    private String paymethodName;
    @SerializedName("courier_name")
    @Expose
    private String courierName;
    @SerializedName("member_fullname")
    @Expose
    private String memberFullname;
    @SerializedName("addr_address")
    @Expose
    private Object addrAddress;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymethodId() {
        return paymethodId;
    }

    public void setPaymethodId(String paymethodId) {
        this.paymethodId = paymethodId;
    }

    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Object getMemMemberId() {
        return memMemberId;
    }

    public void setMemMemberId(Object memMemberId) {
        this.memMemberId = memMemberId;
    }

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getOrderUniqueCode() {
        return orderUniqueCode;
    }

    public void setOrderUniqueCode(String orderUniqueCode) {
        this.orderUniqueCode = orderUniqueCode;
    }

    public String getOrderDatetime() {
        return orderDatetime;
    }

    public void setOrderDatetime(String orderDatetime) {
        this.orderDatetime = orderDatetime;
    }

    public String getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(String orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderTotalWeight() {
        return orderTotalWeight;
    }

    public void setOrderTotalWeight(String orderTotalWeight) {
        this.orderTotalWeight = orderTotalWeight;
    }

    public String getOrderShippingFee() {
        return orderShippingFee;
    }

    public void setOrderShippingFee(String orderShippingFee) {
        this.orderShippingFee = orderShippingFee;
    }

    public String getOrderDeliveryType() {
        return orderDeliveryType;
    }

    public void setOrderDeliveryType(String orderDeliveryType) {
        this.orderDeliveryType = orderDeliveryType;
    }

    public Object getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(Object orderNote) {
        this.orderNote = orderNote;
    }

    public String getOrderAsDropshipper() {
        return orderAsDropshipper;
    }

    public void setOrderAsDropshipper(String orderAsDropshipper) {
        this.orderAsDropshipper = orderAsDropshipper;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderProvinceId() {
        return orderProvinceId;
    }

    public void setOrderProvinceId(String orderProvinceId) {
        this.orderProvinceId = orderProvinceId;
    }

    public String getOrderCityId() {
        return orderCityId;
    }

    public void setOrderCityId(String orderCityId) {
        this.orderCityId = orderCityId;
    }

    public String getDeliveryProvince() {
        return deliveryProvince;
    }

    public void setDeliveryProvince(String deliveryProvince) {
        this.deliveryProvince = deliveryProvince;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getOrderProdTotal() {
        return orderProdTotal;
    }

    public void setOrderProdTotal(String orderProdTotal) {
        this.orderProdTotal = orderProdTotal;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderRecipient() {
        return orderRecipient;
    }

    public void setOrderRecipient(String orderRecipient) {
        this.orderRecipient = orderRecipient;
    }

    public String getOrderPostalcode() {
        return orderPostalcode;
    }

    public void setOrderPostalcode(String orderPostalcode) {
        this.orderPostalcode = orderPostalcode;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public Object getOrderResi() {
        return orderResi;
    }

    public void setOrderResi(Object orderResi) {
        this.orderResi = orderResi;
    }

    public String getOrderJenis() {
        return orderJenis;
    }

    public void setOrderJenis(String orderJenis) {
        this.orderJenis = orderJenis;
    }

    public Object getOrderPromo() {
        return orderPromo;
    }

    public void setOrderPromo(Object orderPromo) {
        this.orderPromo = orderPromo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Object getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Object updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getPaymethodName() {
        return paymethodName;
    }

    public void setPaymethodName(String paymethodName) {
        this.paymethodName = paymethodName;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getMemberFullname() {
        return memberFullname;
    }

    public void setMemberFullname(String memberFullname) {
        this.memberFullname = memberFullname;
    }

    public Object getAddrAddress() {
        return addrAddress;
    }

    public void setAddrAddress(Object addrAddress) {
        this.addrAddress = addrAddress;
    }

}
