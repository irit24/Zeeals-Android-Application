package com.zeeals.zeeals.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.zeeals.zeeals.model.Datum;

import java.util.List;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  18/04/17.
 */

public class ExampleResponse {

        @SerializedName("status_code")
        @Expose
        private Integer statusCode;
        @SerializedName("data")
        @Expose
        private List<Datum> data = null;

        public Integer getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

    }
