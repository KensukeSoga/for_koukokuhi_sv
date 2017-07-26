package jp.co.isid.kkh.customer.skyp.model.detail;

import jp.co.isid.kkh.model.AbstractServiceCondition;

public class FindOrderCondition extends AbstractServiceCondition {

    private static final long serialVersionUID = 1L;

    /** 媒体区分 */
     private String _baitaikbn;

     /**
     * 媒体区分を返します。
     *
     * @return esqId
     */
    public String getbaitaikbn() {
        return _baitaikbn;
    }
    /**
     * 媒体区分を設定します。
     *
     * @param esqId
     */
    public void setbaitaikbn(String baitaikbn) {
        this._baitaikbn = baitaikbn;
    }

}
