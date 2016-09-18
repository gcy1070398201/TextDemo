package com.ctxd.textdemo.entiy;


/**
 * Created by CTXD-24 on 2016/5/25.
 */
public class PhoenEntiy {
    private String errNum;
    private String retMsg;
    private Data retData;

    public String getErrNum() {
        return errNum;
    }

    public void setErrNum(String errNum) {
        this.errNum = errNum;
    }

    public Data getRetData() {
        return retData;
    }

    public void setRetData(Data retData) {
        this.retData = retData;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    @Override
    public String toString() {
        return "PhoenEntiy{" +
                "errNum='" + errNum + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", retData=" + retData +
                '}';
    }

    public static class Data {
        private String phone;
        private String prefix;
        private String supplier;
        private String province;
        private String city;
        private String suit;

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "phone='" + phone + '\'' +
                    ", prefix='" + prefix + '\'' +
                    ", supplier='" + supplier + '\'' +
                    ", province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", suit='" + suit + '\'' +
                    '}';
        }
    }

}
