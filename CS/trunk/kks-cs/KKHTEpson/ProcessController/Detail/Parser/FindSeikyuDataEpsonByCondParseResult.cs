﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Isid.KKH.Epson.ProcessController.Detail.Parser
{
    /// <summary>
    /// 請求回収パース結果プロパティ
    /// </summary>
    /// <remarks>
    ///   修正管理
    ///   <list type="table">
    ///     <listheader>
    ///       <description>日付</description>
    ///       <description>修正者</description>
    ///       <description>内容</description>
    ///     </listheader>
    ///     <item>
    ///       <description>2012/04/25</description>
    ///       <description>JSE Tamura</description>
    ///       <description>新規作成</description>
    ///     </item>
    ///   </list>
    /// </remarks>
    
    class FindSeikyuDataEpsonByCondParseResult
    {   
        #region プロパティ

        /// <summary>
        /// 請求回収データセットです。 
        /// </summary>
        private Isid.KKH.Epson.Schema.SeikyuDsEpson _dsSeikyuEpson; 

        /// <summary>
        /// 請求回収データセットを取得または設定します。 
        /// </summary>
        public Isid.KKH.Epson.Schema.SeikyuDsEpson SeikyuEpsonDataSet
        {
            get { return _dsSeikyuEpson; }
            set { _dsSeikyuEpson = value; }
        }

        #endregion プロパティ
    }

}