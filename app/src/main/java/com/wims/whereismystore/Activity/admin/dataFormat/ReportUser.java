package com.wims.whereismystore.Activity.admin.dataFormat;

import java.io.Serializable;

public class ReportUser implements Serializable {
        String email;
        String reportCode;
        String reportName;
        String reason;
        String state;

    public ReportUser() {

    }

    public String getReportKey() {
            return reportKey;
        }

        public void setReportKey(String reportKey) {
            this.reportKey = reportKey;
        }

        String reportKey;

        public ReportUser(String email, String reportCode, String reportName, String reason, String state){
            this.email=email;
            this.reportCode=reportCode;
            this.reportName=reportName;
            this.reason=reason;
            this.state=state;
        }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getReportCode() {
            return reportCode;
        }

        public void setReportCode(String reportCode) {
            this.reportCode = reportCode;
        }

        public String getReportName() {
            return reportName;
        }

        public void setReportName(String reportName) {
            this.reportName = reportName;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }