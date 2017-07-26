package jp.co.isid.kkh.customer.lion.model.master;


import jp.co.isid.kkh.integ.tbl.TBTHB12WLRDK;
import jp.co.isid.kkh.integ.util.KKHPoolConnect;
import jp.co.isid.kkh.model.KKHOracleModel;
import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.nj.exp.UserException;
import jp.co.isid.nj.integ.sql.AbstractSimpleRdbDao;

/**
 *
 * <P>
 * TV番組マスタデータ登録DAO
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/02/17 JSE A.Naito)<BR>
 * </P>
 * @author JSE A.Naito
 */
public class LionRdKMastRegisterDAO extends AbstractSimpleRdbDao {

    /**汎用マスタ(データ)検索条件*/
    private LionCondition _cond;

    /**
     * デフォルトコンストラクタ。
     */
    public LionRdKMastRegisterDAO() {
        super.setPoolConnectClass(KKHPoolConnect.class);
        super.setDBModelInterface(KKHOracleModel.getInstance());
        super.setBigDecimalMode(true);
    }

    /**
     * プライマリキーを返します。
     *
     * @return String[] プライマリキー
     */
    public String[] getPrimryKeyNames() {
        return null;
    }

    /**
     * 更新日付フィールドを返します。
     *
     * @return String 更新日付フィールド
     */
    public String getTimeStampKeyName() {
        return TBTHB12WLRDK.TRKTIMSTMP;
    }

    /**
     * システム日付で更新する列の定義です
     */
    @Override
    protected String[] getSystemDateColumnNames() {
        return new String[] { TBTHB12WLRDK.TRKTIMSTMP,TBTHB12WLRDK.UPDTIMSTMP };
    }

    /**
     * テーブル名を返します。
     *
     * @return String テーブル名
     */
    public String getTableName() {
        return TBTHB12WLRDK.TBNAME;
    }

    /**
     * テーブル列名を返します。
     *
     * @return String[] テーブル列名
     */
    public String[] getTableColumnNames() {
        return new String[]{
                TBTHB12WLRDK.TRKTIMSTMP
                ,TBTHB12WLRDK.TRKPL
                ,TBTHB12WLRDK.TRKTNT
                ,TBTHB12WLRDK.UPDTIMSTMP
                ,TBTHB12WLRDK.UPDAPL
                ,TBTHB12WLRDK.UPDTNT
                ,TBTHB12WLRDK.EGCD
                ,TBTHB12WLRDK.TKSKGYCD
                ,TBTHB12WLRDK.TKSBMNSEQNO
                ,TBTHB12WLRDK.TKSTNTSEQNO
                ,TBTHB12WLRDK.KYOKUCD
                ,TBTHB12WLRDK.KYOKUNAME
                ,TBTHB12WLRDK.KIGOU
                ,TBTHB12WLRDK.KEIRETSU
                ,TBTHB12WLRDK.HYOJIJYUN
        };
    }

    /**
     * 汎用マスタ(データ)の登録
     *
     * @param vo マスタデータVO（INSERT用）
     * @throws KKHException データアクセス中にエラーが発生した場合
     */
    public void registLionRdKMastDataVO(LionRdKMastDataInsertVO vo) throws KKHException {
        //パラメータチェック
        if (vo == null) {
            throw new KKHException("登録エラー", "BD-E0004");
        }
        super.setModel(vo);
        try {
            if (!super.insert()) {
                throw new KKHException("登録エラー", "BD-E0004");
            }
        } catch (UserException e) {
            throw new KKHException(e.getMessage(), "BD-E0004");
        }
    }

    /**
     * 削除ＳＱＬ生成
     */
    @Override
    public String getExecString() {

        StringBuffer sql = new StringBuffer();

        sql.append(" DELETE ");
        sql.append(" FROM ");
        sql.append(" " + TBTHB12WLRDK.TBNAME + " ");
        // Where句
        sql.append(" WHERE ");
        sql.append(" " + TBTHB12WLRDK.EGCD + " = '" + _cond.getEgCd() + "' ");
        sql.append(" AND ");
        sql.append(" " + TBTHB12WLRDK.TKSKGYCD + " = '" + _cond.getTksKgyCd() + "' ");
        sql.append(" AND ");
        sql.append(" " + TBTHB12WLRDK.TKSBMNSEQNO + " = '" + _cond.getTksBmnSeqNo() + "' ");
        sql.append(" AND ");
        sql.append(" " + TBTHB12WLRDK.TKSTNTSEQNO + " = '" + _cond.getTksTntSeqNo() + "' ");

        return sql.toString();
    }

    /**
     * 汎用マスタ(データ)の削除
     *
     * @param cond 削除条件
     * @throws KKHException データアクセス中にエラーが発生した場合
     */
    public boolean deleteLionDataByCondition(LionCondition cond) throws KKHException {
        //パラメータチェック
        if (cond == null) {
            throw new KKHException("削除エラー", "BD-E0003");
        }

        try {
            _cond = cond;
            super.exec();
        } catch (UserException e) {
            throw new KKHException(e.getMessage(), "BD-E0003");
        }

        return true;
    }

}