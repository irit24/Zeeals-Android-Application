
package com.zeeals.zeeals.model.Grafik;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Daily {

    @SerializedName("jml")
    @Expose
    private Integer jml;

    public Integer getJml() {
        return jml;
    }

    public void setJml(Integer jml) {
        this.jml = jml;
    }

}
