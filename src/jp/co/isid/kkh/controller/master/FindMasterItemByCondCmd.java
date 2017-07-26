package jp.co.isid.kkh.controller.master;

import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.kkh.model.master.MasterCondition;
import jp.co.isid.kkh.model.master.MasterItemManager;
import jp.co.isid.kkh.model.master.MasterItemResult;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * 汎用マスタ検索コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/02/03 Fourm H.izawa)<BR>
 * </P>
 * @author
 */
public class FindMasterItemByCondCmd extends Command {

    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** 検索条件 */
    private MasterCondition _condition;

    /**
     * 検索条件を使用し、検索処理を実行します。
     * @throws KKHException 検索に失敗した場合
     */
    public void execute() throws KKHException {
        MasterItemManager manager = MasterItemManager.getInstance();
        MasterItemResult result = manager.findMasterDefineByCondition(_condition);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * 検索条件を設定します。
     *
     * @param condition CommonCodeMasterSearchCondition 検索条件
     */
    public void setFindMasterCondition(MasterCondition condition) {
        _condition = condition;
    }

    /**
     * 条件検索結果を返します。
     *
     * @return MasterResult 条件検索結果
     */
    public MasterItemResult getMasterItemResult() {
        return (MasterItemResult) super.getResult().get(RESULT_KEY);
    }

}
