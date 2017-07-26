package jp.co.isid.kkh.controller.history;

import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.kkh.model.history.HistoryJyutDownCondition;
import jp.co.isid.kkh.model.history.HistoryJyutDownManager;
import jp.co.isid.kkh.model.history.HistoryJyutDownResult;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * LION検索コマンド
 * </P>
 * <P>
 * <B>修正履歴</B><BR>
 * ・新規作成(2012/2/1 fourm h.izawa)<BR>
 * </P>
 * @author
 */
public class HistoryLionJyutDownByCondCmd extends Command {

    private static final long serialVersionUID = 1L;

    /** 検索結果キー */
    private static final String RESULT_KEY = "RESULT_KEY";

    /** 検索条件 */
    private HistoryJyutDownCondition _condition;

    /**
     * 検索条件を使用し、検索処理を実行します。
     * @throws KKHException 検索に失敗した場合
     */
    public void execute() throws KKHException {
        HistoryJyutDownManager manager = HistoryJyutDownManager.getInstance();
        HistoryJyutDownResult result = manager.findByCondition(_condition);
        getResult().set(RESULT_KEY, result);
    }

    /**
     * 検索条件を設定します。
     *
     * @param condition CommonCodeMasterSearchCondition 検索条件
     */
    public void setFindHistoryLionJyutDownCondition(HistoryJyutDownCondition condition) {
        _condition = condition;
    }

    /**
     * 条件検索結果を返します。
     *
     * @return HistoryLionJyutDownResult 条件検索結果
     */
    public HistoryJyutDownResult getHistoryLionJyutDownResult() {
        return (HistoryJyutDownResult) super.getResult().get(RESULT_KEY);
    }

}
