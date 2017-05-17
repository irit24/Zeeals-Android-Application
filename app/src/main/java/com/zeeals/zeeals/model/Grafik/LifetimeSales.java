
package com.zeeals.zeeals.model.Grafik;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LifetimeSales {

    @SerializedName("lifetime")
    @Expose
    private String lifetime;

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

}
