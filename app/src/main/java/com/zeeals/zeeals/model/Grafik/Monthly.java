
package com.zeeals.zeeals.model.Grafik;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Monthly {

    @SerializedName("bulan")
    @Expose
    private Integer bulan;
    @SerializedName("jml")
    @Expose
    private Integer jml;

    public Integer getBulan() {
        return bulan;
    }

    public void setBulan(Integer bulan) {
        this.bulan = bulan;
    }

    public Integer getJml() {
        return jml;
    }

    public void setJml(Integer jml) {
        this.jml = jml;
    }

}
