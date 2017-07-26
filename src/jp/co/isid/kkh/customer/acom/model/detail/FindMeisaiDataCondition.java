package jp.co.isid.kkh.customer.acom.model.detail;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class FindMeisaiDataCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 受注No */
    private String _jyutNo = null;

    /** 受注明細No */
    private String _jyMeiNo = null;

    /** 売上明細No */
    private String _urMeiNo = null;

    /**
     * 受注Noを取得する
     * @return 受注No
     */
    public String getJyutNo() {
        return _jyutNo;
    }

    /**
     * 受注Noを設定する
     * @param jyutNo 受注No
     */
    public void setJyutNo(String jyutNo) {
        this._jyutNo = jyutNo;
    }

    /**
     * 受注明細Noを取得する
     * @return 受注明細No
     */
    public String getJyMeiNo() {
        return _jyMeiNo;
    }

    /**
     * 受注明細Noを設定する
     * @param jyMeiNo 受注明細No
     */
    public void setJyMeiNo(String jyMeiNo) {
        this._jyMeiNo = jyMeiNo;
    }

    /**
     * 売上明細Noを取得する
     * @return 売上明細No
     */
    public String getUrMeiNo() {
        return _urMeiNo;
    }

    /**
     * 売上明細Noを設定する
     * @param urMeiNo 売上明細No
     */
    public void setUrMeiNo(String urMeiNo) {
        this._urMeiNo = urMeiNo;
    }

}
