
package com.zeeals.zeeals.model.Grafik;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

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
    private String memMemberId;
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
    private Object orderAsDropshipper;
    @SerializedName("order_status")
    @Expose
    private String orderStatus;
    @SerializedName("order_province_id")
    @Expose
    private Object orderProvinceId;
    @SerializedName("order_city_id")
    @Expose
    private Object orderCityId;
    @SerializedName("delivery_province")
    @Expose
    private Object deliveryProvince;
    @SerializedName("delivery_city")
    @Expose
    private Object deliveryCity;
    @SerializedName("order_prod_total")
    @Expose
    private Object orderProdTotal;
    @SerializedName("order_type")
    @Expose
    private Object orderType;
    @SerializedName("order_recipient")
    @Expose
    private String orderRecipient;
    @SerializedName("order_postalcode")
    @Expose
    private Object orderPostalcode;
    @SerializedName("order_address")
    @Expose
    private Object orderAddress;
    @SerializedName("order_resi")
    @Expose
    private Object orderResi;
    @SerializedName("order_jenis")
    @Expose
    private Object orderJenis;
    @SerializedName("order_promo")
    @Expose
    private Object orderPromo;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("updated_on")
    @Expose
    private String updatedOn;
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
    @SerializedName("total_produk")
    @Expose
    private Integer totalProduk;
    @SerializedName("product_id")
    @Expose
    private Object productId;

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

    public String getMemMemberId() {
        return memMemberId;
    }

    public void setMemMemberId(String memMemberId) {
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

    public Object getOrderAsDropshipper() {
        return orderAsDropshipper;
    }

    public void setOrderAsDropshipper(Object orderAsDropshipper) {
        this.orderAsDropshipper = orderAsDropshipper;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Object getOrderProvinceId() {
        return orderProvinceId;
    }

    public void setOrderProvinceId(Object orderProvinceId) {
        this.orderProvinceId = orderProvinceId;
    }

    public Object getOrderCityId() {
        return orderCityId;
    }

    public void setOrderCityId(Object orderCityId) {
        this.orderCityId = orderCityId;
    }

    public Object getDeliveryProvince() {
        return deliveryProvince;
    }

    public void setDeliveryProvince(Object deliveryProvince) {
        this.deliveryProvince = deliveryProvince;
    }

    public Object getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(Object deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public Object getOrderProdTotal() {
        return orderProdTotal;
    }

    public void setOrderProdTotal(Object orderProdTotal) {
        this.orderProdTotal = orderProdTotal;
    }

    public Object getOrderType() {
        return orderType;
    }

    public void setOrderType(Object orderType) {
        this.orderType = orderType;
    }

    public String getOrderRecipient() {
        return orderRecipient;
    }

    public void setOrderRecipient(String orderRecipient) {
        this.orderRecipient = orderRecipient;
    }

    public Object getOrderPostalcode() {
        return orderPostalcode;
    }

    public void setOrderPostalcode(Object orderPostalcode) {
        this.orderPostalcode = orderPostalcode;
    }

    public Object getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(Object orderAddress) {
        this.orderAddress = orderAddress;
    }

    public Object getOrderResi() {
        return orderResi;
    }

    public void setOrderResi(Object orderResi) {
        this.orderResi = orderResi;
    }

    public Object getOrderJenis() {
        return orderJenis;
    }

    public void setOrderJenis(Object orderJenis) {
        this.orderJenis = orderJenis;
    }

    public Object getOrderPromo() {
        return orderPromo;
    }

    public void setOrderPromo(Object orderPromo) {
        this.orderPromo = orderPromo;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
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

    public Integer getTotalProduk() {
        return totalProduk;
    }

    public void setTotalProduk(Integer totalProduk) {
        this.totalProduk = totalProduk;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

}
