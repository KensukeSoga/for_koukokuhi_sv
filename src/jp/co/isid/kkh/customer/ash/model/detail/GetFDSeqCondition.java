package jp.co.isid.kkh.customer.ash.model.detail;

import java.io.Serializable;

public class GetFDSeqCondition implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ログイン担当者ESQID */
    private String _esqId = null;

    /** 営業所（取）コード */
    private String _egCd = null;

    /** 得意先企業コード */
    private String _tksKgyCd = null;

    /** 得意先部門SEQNO */
    private String _tksBmnSeqNo = null;

    /** 得意先担当SEQNO */
    private String _tksTntSeqNo = null;

    /** 年月 */
    private String _yymm = null;

    /** 売上明細No */
    private String _urMeiNo = null;

    /**
     * ログイン担当者ESQIDを取得する
     * @return ログイン担当者ESQID
     */
    public String getEsqId() {
        return _esqId;
    }

    /**
     * ログイン担当者ESQIDを設定する
     * @param esqId ログイン担当者ESQID
     */
    public void setEsqId(String esqId) {
        this._esqId = esqId;
    }

    /**
     * 営業所（取）コードを取得する
     * @return 営業所（取）コード
     */
    public String getEgCd() {
        return _egCd;
    }

    /**
     * 営業所（取）コードを設定する
     * @param egCd 営業所（取）コード
     */
    public void setEgCd(String egCd) {
        this._egCd = egCd;
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
     * 得意先部門SEQNOを取得する
     * @return 得意先部門SEQNO
     */
    public String getTksBmnSeqNo() {
        return _tksBmnSeqNo;
    }

    /**
     * 得意先部門SEQNOを設定する
     * @param tksBmnSeqNo 得意先部門SEQNO
     */
    public void setTksBmnSeqNo(String tksBmnSeqNo) {
        this._tksBmnSeqNo = tksBmnSeqNo;
    }

    /**
     * 得意先担当SEQNOを取得する
     * @return 得意先担当SEQNO
     */
    public String getTksTntSeqNo() {
        return _tksTntSeqNo;
    }

    /**
     * 得意先担当SEQNOを設定する
     * @param tksTntSeqNo 得意先担当SEQNO
     */
    public void setTksTntSeqNo(String tksTntSeqNo) {
        this._tksTntSeqNo = tksTntSeqNo;
    }

    /**
     * 年月を取得する
     * @return 年月
     */
    public String getYymm() {
        return _yymm;
    }

    /**
     * 年月を設定する
     * @param yymm 年月
     */
    public void setYymm(String yymm) {
        this._yymm = yymm;
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
