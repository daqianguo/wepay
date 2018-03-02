package me.hao0.wepay.model.pay;


/**
 * 普通服务商-小程序-JS支付请求对象
 * Author: guoq
 * Date: 2018-03-02
 *
 * @since 1.0.0
 */
public class SlJsPayRequest extends JsPayRequest {
    /**
     * 小程序的APPID
     */
    private String subAppid;
    /**
     * 子商户号
     */
    private String subMchId;

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    @Override
    public String toString() {
        return "JsPayRequest{" +
                "subAppid='" + subAppid + '\'' +
                "subMchId='" + subMchId + '\'' +
                "} " + super.toString();
    }
}
