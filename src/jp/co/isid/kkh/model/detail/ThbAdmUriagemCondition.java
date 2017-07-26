package jp.co.isid.kkh.model.detail;

import java.io.Serializable;

public class ThbAdmUriagemCondition implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 扱営業所コード */
    private String _atEgsyoCd = null;

    /** 得意先企業コード */
    private String _tksKgyCd = null;

    /** 得意先部門ＳＥＱＮＯ */
    private String _tksBmnSeqNo = null;

    /** 得意先担当ＳＥＱＮＯ */
    private String _tksTntSeqNo = null;

    /** 受注ＮＯ */
    private String _jyutNo = null;

    /** 受注明細ＳＥＱ */
    private String _jyMeiSeq = null;

    /** 売上明細ＳＥＱ */
    private String _urMeiSeq = null;

    /**
     * 扱営業所コードを取得する
     * @return 扱営業所コード
     */
    public String getAtEgsyoCd() {
        return _atEgsyoCd;
    }

    /**
     * 扱営業所コードを設定する
     * @param atEgsyoCd 扱営業所コード
     */
    public void setAtEgsyoCd(String atEgsyoCd) {
        this._atEgsyoCd = atEgsyoCd;
    }

    /**
     * 得意先企業コードを取得する
     * @return 得意先企業コード
     */
    public String getTksKgyCd() {
        return _tksKgyCd;
    }

    /**
     * 得意先企業コードを設定する
     * @param tksKgyCd 得意先企業コード
     */
    public void setTksKgyCd(String tksKgyCd) {
        this._tksKgyCd = tksKgyCd;
    }

    /**
     * 得意先部門ＳＥＱＮＯを取得する
     * @return 得意先部門ＳＥＱＮＯ
     */
    public String getTksBmnSeqNo() {
        return _tksBmnSeqNo;
    }

    /**
     * 得意先部門ＳＥＱＮＯを設定する
     * @param tksBmnSeqNo 得意先部門ＳＥＱＮＯ
     */
    public void setTksBmnSeqNo(String tksBmnSeqNo) {
        this._tksBmnSeqNo = tksBmnSeqNo;
    }

    /**
     * 得意先担当ＳＥＱＮＯを取得する
     * @return 得意先担当ＳＥＱＮＯ
     */
    public String getTksTntSeqNo() {
        return _tksTntSeqNo;
    }

    /**
     * 得意先担当ＳＥＱＮＯを設定する
     * @param tksTntSeqNo 得意先担当ＳＥＱＮＯ
     */
    public void setTksTntSeqNo(String tksTntSeqNo) {
        this._tksTntSeqNo = tksTntSeqNo;
    }

    /**
     * 受注ＮＯを取得する
     * @return 受注ＮＯ
     */
    public String getJyutNo() {
        return _jyutNo;
    }

    /**
     * 受注ＮＯを設定する
     * @param jyutNo 受注ＮＯ
     */
    public void setJyutNo(String jyutNo) {
        this._jyutNo = jyutNo;
    }

    /**
     * 受注明細ＳＥＱを取得する
     * @return 受注明細ＳＥＱ
     */
    public String getJyMeiSeq() {
        return _jyMeiSeq;
    }

    /**
     * 受注明細ＳＥＱを設定する
     * @param jyMeiSeq 受注明細ＳＥＱ
     */
    public void setJyMeiSeq(String jyMeiSeq) {
        this._jyMeiSeq = jyMeiSeq;
    }

    /**
     * 売上明細ＳＥＱを取得する
     * @return 売上明細ＳＥＱ
     */
    public String getUrMeiSeq() {
        return _urMeiSeq;
    }

    /**
     * 売上明細ＳＥＱを設定する
     * @param urMeiSeq 売上明細ＳＥＱ
     */
    public void setUrMeiSeq(String urMeiSeq) {
        this._urMeiSeq = urMeiSeq;
    }

}
