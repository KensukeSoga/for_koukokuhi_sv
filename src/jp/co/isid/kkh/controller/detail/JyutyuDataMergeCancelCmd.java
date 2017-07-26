package jp.co.isid.kkh.controller.detail;

import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.kkh.model.detail.DetailManager;
import jp.co.isid.kkh.model.detail.JyutyuDataMergeCancelResult;
import jp.co.isid.kkh.model.detail.JyutyuDataMergeCancelVO;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * 広告費明細−受注統合
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2011/12/05 JSE K.Fukuda)<BR>
 * </P>
 *
 * @author
 */
public class JyutyuDataMergeCancelCmd extends Command {

    private static final long serialVersionUID = 1L;

    /** 受注統合処理用VO */
    private JyutyuDataMergeCancelVO _vo;

    /** 実行結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /**
     * 受注統合処理を実行します。
     *
     * @throws KKHException 登録に失敗した場合
     */
    public void execute() throws KKHException {

        DetailManager manager = DetailManager.getInstance();

        // マスタデータの登録
        JyutyuDataMergeCancelResult result = manager.mergeCancelJyutyuData(_vo);
        // 正常終了
        getResult().set(RESULT_KEY, result);

//        throw new KKHException("");
    }

    /**
     * 受注統合VOを設定します。
     *
     * @param vo JyutyuDataMergeCancelVO 受注統合VO
     */
    public void setJyutyuDataMergeCancelVO(JyutyuDataMergeCancelVO vo) {
        _vo = vo;
    }

    /**
     * 受注統合処理結果を返します。
     *
     * @return JyutyuDataMergeCancelResult 受注統合処理結果
     */
    public JyutyuDataMergeCancelResult getJyutyuDataMergeCancelResult() {
        return (JyutyuDataMergeCancelResult) super.getResult().get(RESULT_KEY);
    }

}
