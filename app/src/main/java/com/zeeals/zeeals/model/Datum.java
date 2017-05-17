package com.zeeals.zeeals.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  18/04/17.
 */

public class Datum {

        @SerializedName("employee_id")
        @Expose
        private Integer employeeId;
        @SerializedName("employee_name")
        @Expose
        private String employeeName;
        @SerializedName("employee_address")
        @Expose
        private String employeeAddress;
        @SerializedName("employee_phone")
        @Expose
        private String employeePhone;
        @SerializedName("employee_birthday")
        @Expose
        private Object employeeBirthday;
        @SerializedName("created_at")
        @Expose
        private Object createdAt;
        @SerializedName("updated_at")
        @Expose
        private Object updatedAt;

        public Integer getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Integer employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeAddress() {
            return employeeAddress;
        }

        public void setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
        }

        public String getEmployeePhone() {
            return employeePhone;
        }

        public void setEmployeePhone(String employeePhone) {
            this.employeePhone = employeePhone;
        }

        public Object getEmployeeBirthday() {
            return employeeBirthday;
        }

        public void setEmployeeBirthday(Object employeeBirthday) {
            this.employeeBirthday = employeeBirthday;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public Object getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Object updatedAt) {
            this.updatedAt = updatedAt;
        }

    }

