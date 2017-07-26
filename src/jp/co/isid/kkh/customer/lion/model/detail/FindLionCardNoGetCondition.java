package jp.co.isid.kkh.customer.lion.model.detail;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class FindLionCardNoGetCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 受注NO */
    private String _jyutno;
    /** 受注明細NO */
    private String _jymeino;
    /** 売上明細NO */
    private String _urmeino;

    /**
     * 受注NOを取得する
     * @return String 受注NO
     */
    public String getJyutno() {
        return _jyutno;
    }

    /**
     * 受注NOを設定する
     * @param Jyutno String 受注NO
     */
    public void setJyutno(String jyutno) {
        this._jyutno = jyutno;
    }

    /**
     * 受注明細NOを取得する
     * @return String 受注明細NO
     */
    public String getJymeino() {
        return _jymeino;
    }

    /**
     * 受注明細NOを設定する
     * @param Jymeino String 受注明細NO
     */
    public void setJymeino(String jymeino) {
        this._jymeino = jymeino;
    }

    /**
     * 売上明細NOを取得する
     * @return String 売上明細NO
     */
    public String getUrmeino() {
        return _urmeino;
    }

    /**
     * 売上明細NOを設定する
     * @param urmeino String 売上明細NO
     */
    public void setUrmeino(String urmeino) {
        this._urmeino = urmeino;
    }

}