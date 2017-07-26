package jp.co.isid.kkh.integ.tbl;

/**
 *
 * <P>
 * 組織マスタ
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/02/10 JSE H.Abe)<BR>
 * </P>
 */
public class TBRCMN_MEU00SIK {

    /**
     * インスタンス生成禁止。
     */
    private TBRCMN_MEU00SIK() {
    }

    /** 組織マスタ */
    public static final String TBNAME = "RCMN_MEU00SIK";

    /** カラム名のプレフィックス */
    public static final String PREFIX = "MEU00_";

    /** 組織コード (SIKCD) */
    public static final String SIKCD = PREFIX + "SIKCD";

    /** 有効終了年月日 (ENDYMD) */
    public static final String ENDYMD = PREFIX + "ENDYMD";

    /** 有効開始年月日 (STARTYMD) */
    public static final String STARTYMD = PREFIX + "STARTYMD";

    /** 会社識別コード (KSHASKBTUCD) */
    public static final String KSHASKBTUCD = PREFIX + "KSHASKBTUCD";

    /** 入出力コード (IOCD) */
    public static final String IOCD = PREFIX + "IOCD";

    /** 表示名（カナ） (HYOJIKN) */
    public static final String HYOJIKN = PREFIX + "HYOJIKN";

    /** 表示名（漢字） (HYOJIKJ) */
    public static final String HYOJIKJ = PREFIX + "HYOJIKJ";

    /** 表示略称 (HYOJIRYAKU) */
    public static final String HYOJIRYAKU = PREFIX + "HYOJIRYAKU";

    /** 表示名（英字） (HYOJIEN) */
    public static final String HYOJIEN = PREFIX + "HYOJIEN";

    /** 特殊用途コード (SPUSECD) */
    public static final String SPUSECD = PREFIX + "SPUSECD";

    /** 階層コード (KAISOCD) */
    public static final String KAISOCD = PREFIX + "KAISOCD";

    /** 上位組織コード (JSIKCD) */
    public static final String JSIKCD = PREFIX + "JSIKCD";

    /** 直轄区分 (CKATUKBN) */
    public static final String CKATUKBN = PREFIX + "CKATUKBN";

    /** 受注登録区分 (JYTRKKBN) */
    public static final String JYTRKKBN = PREFIX + "JYTRKKBN";

    /** 発注登録区分 (ODRTRKKBN) */
    public static final String ODRTRKKBN = PREFIX + "ODRTRKKBN";

    /** 管理部門 (KNRIBMON) */
    public static final String KNRIBMON = PREFIX + "KNRIBMON";

    /** 会社取引先企業コード (KSHATHSKGYCD) */
    public static final String KSHATHSKGYCD = PREFIX + "KSHATHSKGYCD";

    /** 会社取引先ＳＥＱＮＯ (KSHATHSSEQNO) */
    public static final String KSHATHSSEQNO = PREFIX + "KSHATHSSEQNO";

    /** 旧会社取引先コード (KYUKSHATHSCD) */
    public static final String KYUKSHATHSCD = PREFIX + "KYUKSHATHSCD";

    /** 媒直区分 (BCKKBN) */
    public static final String BCKKBN = PREFIX + "BCKKBN";

    /** 営業所コード (EGSYOCD) */
    public static final String EGSYOCD = PREFIX + "EGSYOCD";

}