package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.TPurchaserInvoice;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 进项发票主表
 * @author code-generator
 * @date 2020-05-25 11:24:44
 */
@Mapper
@Service
public interface TPurchaserInvoiceMapper {
    /**
     * 根据主键获取实体
     */
    @Select("SELECT `INVOICE_ID`, `PRE_INVOICE_ID`, `SETTLEMENT_ID`, `SETTLEMENT_NO`, `ORIGIN_SETTLEMENT_NO`, `SELLER_INVOICE_ID`, `TAX_INVOICE_ID`, `SCAN_INVOICE_ID`, `SELLER_INFO_STATUS`, `TAX_INFO_STATUS`, `SCAN_INFO_STATUS`, `INVOICE_TYPE`, `INVOICE_CODE`, `INVOICE_NO`, `SELLER_TENANT_CODE`, `SELLER_NO`, `SELLER_NO_FROM_PURCHASER`, `SELLER_CODE`, `SELLER_TAX_NO`, `SELLER_NAME`, `SELLER_ADDR_TEL`, `SELLER_ADDRESS`, `SELLER_TEL`, `SELLER_BANK_INFO`, `SELLER_BANK_NAME`, `SELLER_BANK_ACCOUNT`, `PURCHASER_TENANT_CODE`, `PURCHASER_NO`, `PURCHASER_NO_FROM_SELLER`, `PURCHASER_CODE`, `PURCHASER_TAX_NO`, `TAX_PURCHASER_NAME`, `PURCHASER_NAME`, `PURCHASER_ADDR_TEL`, `PURCHASER_ADDRESS`, `PURCHASER_TEL`, `PURCHASER_BANK_INFO`, `PURCHASER_BANK_NAME`, `PURCHASER_BANK_ACCOUNT`, `TAX_RATE`, `AMOUNT_WITHOUT_TAX`, `TAX_AMOUNT`, `AMOUNT_WITH_TAX`, `PAPER_DREW_DATE`, `INVOICE_ORIG`, `TWO_CODE_FLAG`, `CIPHER_TEXT_TWO_CODE`, `CIPHER_TEXT`, `REMARK`, `CASHIER_NAME`, `CHECKER_NAME`, `INVOICER_NAME`, `MACHINE_CODE`, `SCAN_TIME`, `SCAN_ORDER`, `SCAN_USER_ID`, `SCAN_USER_NAME`, `SCAN_BATCH_NO`, `SCAN_DEDUCTION_IMAGE_URL`, `SCAN_INVOICE_IMAGE_URL`, `SCAN_STATUS`, `SCAN_NUM`, `DRAWOUT_TIME`, `DRAWOUT_USER_ID`, `IS_NEED_AUTH`, `LOCK_FLAG`, `STATUS`, `ORIGIN_INVOICE_NO`, `ORIGIN_INVOICE_CODE`, `RED_NOTIFICATION_NO`, `RED_TIME`, `RED_FLAG`, `PROCESS_FLAG`, `PROCESS_REMARK`, `SYSTEM_ORIG`, `CHECK_CODE`, `TP_BATCH_NO`, `TP`, `AUDIT_STATUS`, `EL_GET_INFO_FLAG`, `EL_FLAG`, `EL_TIME`, `EL_USER_ID`, `EL_REQUEST_TIME`, `EL_REQUEST_USER_ID`, `EL_CHECK_TIME`, `EL_TAX_PERIOD`, `EL_ENSURE_REQUEST_TIME`, `EL_ENSURE_REQUEST_USER_ID`, `EL_ENSURE_TIME`, `EL_ENSURE_REMARK`, `COOPERATE_FLAG`, `RETREAT_STATUS`, `RETREAT_REMARK`, `SELLER_VIEW_IMAGE_FLAG`, `EXCEPTION_FLAG`, `COMPARISON_FLAG`, `AUTH_RESULT`, `AUTH_TIME`, `AUTH_REMARK`, `AUTH_REQUEST_TIME`, `AUTH_REQUEST_USER_ID`, `AUTH_REQUEST_USER_NAME`, `AUTH_ROUTE`, `AUTH_STATUS`, `TAX_FLAG`, `TAX_REQUEST_TIME`, `SERVICE_CODE`, `IS_NEED_ALL_INFO`, `PDF_PATH`, `OP_STATUS`, `CREATE_TIME`, `CREATE_USER_ID`, `UPDATE_TIME`, `UPDATE_USER_ID`, `SETTLEMENT_MATCH_STATUS`, `LOGISTICS_STATUS`, `PRINT_CONTENT_FLAG`, `DIFF_STATUS`, `TAX_BUREAU_OPEN_TYPE`, `CANCEL_EXCEPITON_FLAG`, `AUTH_EXCEPTION_REASON`, `SALE_LIST_FILE_FLAG`, `INVOICE_ITEM_ORIG`, `TAX_FLAG_REMARK`, `INVOICE_TAG`, `INVOICE_TRADE_TYPE`, `INBOUNDORDER_MATCH_STATUS`, `INBOUNDORDER_MATCH_NUM`, `MATCH_FIRST`, `MATCH_SECOND`, `TP_CERTIFICATE_NO`, `TP_CERTIFICATE_PERIOD`, `CUSTOMIZE_REMARK1`, `CUSTOMIZE_REMARK2`, `CUSTOMIZE_REMARK3`, `EXT1`, `EXT2`, `EXT3`, `EXT4`, `EXT5`, `EXT6`, `EXT7`, `EXT8`, `EXT9`, `EXT10`, `SHORT_TAXCODE_STATUS`, `EFFECTIVE_TAX_AMOUNT`, `USE_ROUTE` FROM t_purchaser_invoice WHERE `INVOICE_ID` = #{id}")
    TPurchaserInvoice get(@Param("id") String id);

    @Select("select `invoice_id`, `pre_invoice_id`, `settlement_id`, `settlement_no`, `origin_settlement_no`, `seller_invoice_id`, `tax_invoice_id`, `scan_invoice_id`, `seller_info_status`, `tax_info_status`, `scan_info_status`, `invoice_type`, `invoice_code`, `invoice_no`, `seller_tenant_code`, `seller_no`, `seller_no_from_purchaser`, `seller_code`, `seller_tax_no`, `seller_name`, `seller_addr_tel`, `seller_address`, `seller_tel`, `seller_bank_info`, `seller_bank_name`, `seller_bank_account`, `purchaser_tenant_code`, `purchaser_no`, `purchaser_no_from_seller`, `purchaser_code`, `purchaser_tax_no`, `tax_purchaser_name`, `purchaser_name`, `purchaser_addr_tel`, `purchaser_address`, `purchaser_tel`, `purchaser_bank_info`, `purchaser_bank_name`, `purchaser_bank_account`, `tax_rate`, `amount_without_tax`, `tax_amount`, `amount_with_tax`, `paper_drew_date`, `invoice_orig`, `two_code_flag`, `cipher_text_two_code`, `cipher_text`, `remark`, `cashier_name`, `checker_name`, `invoicer_name`, `machine_code`, `scan_time`, `scan_order`, `scan_user_id`, `scan_user_name`, `scan_batch_no`, `scan_deduction_image_url`, `scan_invoice_image_url`, `scan_status`, `scan_num`, `drawout_time`, `drawout_user_id`, `is_need_auth`, `lock_flag`, `status`, `origin_invoice_no`, `origin_invoice_code`, `red_notification_no`, `red_time`, `red_flag`, `process_flag`, `process_remark`, `system_orig`, `check_code`, `tp_batch_no`, `tp`, `audit_status`, `el_get_info_flag`, `el_flag`, `el_time`, `el_user_id`, `el_request_time`, `el_request_user_id`, `el_check_time`, `el_tax_period`, `el_ensure_request_time`, `el_ensure_request_user_id`, `el_ensure_time`, `el_ensure_remark`, `cooperate_flag`, `retreat_status`, `retreat_remark`, `seller_view_image_flag`, `exception_flag`, `comparison_flag`, `auth_result`, `auth_time`, `auth_remark`, `auth_request_time`, `auth_request_user_id`, `auth_request_user_name`, `auth_route`, `auth_status`, `tax_flag`, `tax_request_time`, `service_code`, `is_need_all_info`, `pdf_path`, `op_status`, `create_time`, `create_user_id`, `update_time`, `update_user_id`, `settlement_match_status`, `logistics_status`, `print_content_flag`, `diff_status`, `tax_bureau_open_type`, `cancel_excepiton_flag`, `auth_exception_reason`, `sale_list_file_flag`, `invoice_item_orig`, `tax_flag_remark`, `invoice_tag`, `invoice_trade_type`, `inboundorder_match_status`, `inboundorder_match_num`, `match_first`, `match_second`, `tp_certificate_no`, `tp_certificate_period`, `customize_remark1`, `customize_remark2`, `customize_remark3`, `ext1`, `ext2`, `ext3`, `ext4`, `ext5`, `ext6`, `ext7`, `ext8`, `ext9`, `ext10`, `short_taxcode_status`, `effective_tax_amount`, `use_route` from t_purchaser_invoice order by create_time desc limit #{id}")
    List<TPurchaserInvoice> getList(@Param("id") Integer id);


    /**
     * 新增记录
     * @param tPurchaserInvoice
     * @return
     */
    @InsertProvider(type = TPurchaserInvoiceMapperProvider.class, method = "insert")
    long insert(TPurchaserInvoice tPurchaserInvoice);

    /**
     * 根据主键删除记录
     * @return
     */
    @Delete("DELETE FROM t_purchaser_invoice WHERE `INVOICE_ID` = #{invoiceId}")
    long delete(@Param("invoiceId") String invoiceId);

    /**
     * 更新实体信息
     * @param tPurchaserInvoice
     */
    @UpdateProvider(type = TPurchaserInvoiceMapperProvider.class, method = "update")
    long update(TPurchaserInvoice tPurchaserInvoice);

    /**
     * 更新实体信息，null值字段不更新
     * @param tPurchaserInvoice
     * @return
     */
    @UpdateProvider(type = TPurchaserInvoiceMapperProvider.class, method = "updateIgnoreNull")
    long updateIgnoreNull(TPurchaserInvoice tPurchaserInvoice);

    class TPurchaserInvoiceMapperProvider {
        public String insert() {
            return new SQL(){{
                INSERT_INTO("t_purchaser_invoice");
                VALUES("INVOICE_ID", "#{invoiceId}");
                VALUES("PRE_INVOICE_ID", "#{preInvoiceId}");
                VALUES("SETTLEMENT_ID", "#{settlementId}");
                VALUES("SETTLEMENT_NO", "#{settlementNo}");
                VALUES("ORIGIN_SETTLEMENT_NO", "#{originSettlementNo}");
                VALUES("SELLER_INVOICE_ID", "#{sellerInvoiceId}");
                VALUES("TAX_INVOICE_ID", "#{taxInvoiceId}");
                VALUES("SCAN_INVOICE_ID", "#{scanInvoiceId}");
                VALUES("SELLER_INFO_STATUS", "#{sellerInfoStatus}");
                VALUES("TAX_INFO_STATUS", "#{taxInfoStatus}");
                VALUES("SCAN_INFO_STATUS", "#{scanInfoStatus}");
                VALUES("INVOICE_TYPE", "#{invoiceType}");
                VALUES("INVOICE_CODE", "#{invoiceCode}");
                VALUES("INVOICE_NO", "#{invoiceNo}");
                VALUES("SELLER_TENANT_CODE", "#{sellerTenantCode}");
                VALUES("SELLER_NO", "#{sellerNo}");
                VALUES("SELLER_NO_FROM_PURCHASER", "#{sellerNoFromPurchaser}");
                VALUES("SELLER_CODE", "#{sellerCode}");
                VALUES("SELLER_TAX_NO", "#{sellerTaxNo}");
                VALUES("SELLER_NAME", "#{sellerName}");
                VALUES("SELLER_ADDR_TEL", "#{sellerAddrTel}");
                VALUES("SELLER_ADDRESS", "#{sellerAddress}");
                VALUES("SELLER_TEL", "#{sellerTel}");
                VALUES("SELLER_BANK_INFO", "#{sellerBankInfo}");
                VALUES("SELLER_BANK_NAME", "#{sellerBankName}");
                VALUES("SELLER_BANK_ACCOUNT", "#{sellerBankAccount}");
                VALUES("PURCHASER_TENANT_CODE", "#{purchaserTenantCode}");
                VALUES("PURCHASER_NO", "#{purchaserNo}");
                VALUES("PURCHASER_NO_FROM_SELLER", "#{purchaserNoFromSeller}");
                VALUES("PURCHASER_CODE", "#{purchaserCode}");
                VALUES("PURCHASER_TAX_NO", "#{purchaserTaxNo}");
                VALUES("TAX_PURCHASER_NAME", "#{taxPurchaserName}");
                VALUES("PURCHASER_NAME", "#{purchaserName}");
                VALUES("PURCHASER_ADDR_TEL", "#{purchaserAddrTel}");
                VALUES("PURCHASER_ADDRESS", "#{purchaserAddress}");
                VALUES("PURCHASER_TEL", "#{purchaserTel}");
                VALUES("PURCHASER_BANK_INFO", "#{purchaserBankInfo}");
                VALUES("PURCHASER_BANK_NAME", "#{purchaserBankName}");
                VALUES("PURCHASER_BANK_ACCOUNT", "#{purchaserBankAccount}");
                VALUES("TAX_RATE", "#{taxRate}");
                VALUES("AMOUNT_WITHOUT_TAX", "#{amountWithoutTax}");
                VALUES("TAX_AMOUNT", "#{taxAmount}");
                VALUES("AMOUNT_WITH_TAX", "#{amountWithTax}");
                VALUES("PAPER_DREW_DATE", "#{paperDrewDate}");
                VALUES("INVOICE_ORIG", "#{invoiceOrig}");
                VALUES("TWO_CODE_FLAG", "#{twoCodeFlag}");
                VALUES("CIPHER_TEXT_TWO_CODE", "#{cipherTextTwoCode}");
                VALUES("CIPHER_TEXT", "#{cipherText}");
                VALUES("REMARK", "#{REMARK}");
                VALUES("CASHIER_NAME", "#{cashierName}");
                VALUES("CHECKER_NAME", "#{checkerName}");
                VALUES("INVOICER_NAME", "#{invoicerName}");
                VALUES("MACHINE_CODE", "#{machineCode}");
                VALUES("SCAN_TIME", "#{scanTime}");
                VALUES("SCAN_ORDER", "#{scanOrder}");
                VALUES("SCAN_USER_ID", "#{scanUserId}");
                VALUES("SCAN_USER_NAME", "#{scanUserName}");
                VALUES("SCAN_BATCH_NO", "#{scanBatchNo}");
                VALUES("SCAN_DEDUCTION_IMAGE_URL", "#{scanDeductionImageUrl}");
                VALUES("SCAN_INVOICE_IMAGE_URL", "#{scanInvoiceImageUrl}");
                VALUES("SCAN_STATUS", "#{scanStatus}");
                VALUES("SCAN_NUM", "#{scanNum}");
                VALUES("DRAWOUT_TIME", "#{drawoutTime}");
                VALUES("DRAWOUT_USER_ID", "#{drawoutUserId}");
                VALUES("IS_NEED_AUTH", "#{isNeedAuth}");
                VALUES("LOCK_FLAG", "#{lockFlag}");
                VALUES("STATUS", "#{STATUS}");
                VALUES("ORIGIN_INVOICE_NO", "#{originInvoiceNo}");
                VALUES("ORIGIN_INVOICE_CODE", "#{originInvoiceCode}");
                VALUES("RED_NOTIFICATION_NO", "#{redNotificationNo}");
                VALUES("RED_TIME", "#{redTime}");
                VALUES("RED_FLAG", "#{redFlag}");
                VALUES("PROCESS_FLAG", "#{processFlag}");
                VALUES("PROCESS_REMARK", "#{processRemark}");
                VALUES("SYSTEM_ORIG", "#{systemOrig}");
                VALUES("CHECK_CODE", "#{checkCode}");
                VALUES("TP_BATCH_NO", "#{tpBatchNo}");
                VALUES("TP", "#{TP}");
                VALUES("AUDIT_STATUS", "#{auditStatus}");
                VALUES("EL_GET_INFO_FLAG", "#{elGetInfoFlag}");
                VALUES("EL_FLAG", "#{elFlag}");
                VALUES("EL_TIME", "#{elTime}");
                VALUES("EL_USER_ID", "#{elUserId}");
                VALUES("EL_REQUEST_TIME", "#{elRequestTime}");
                VALUES("EL_REQUEST_USER_ID", "#{elRequestUserId}");
                VALUES("EL_CHECK_TIME", "#{elCheckTime}");
                VALUES("EL_TAX_PERIOD", "#{elTaxPeriod}");
                VALUES("EL_ENSURE_REQUEST_TIME", "#{elEnsureRequestTime}");
                VALUES("EL_ENSURE_REQUEST_USER_ID", "#{elEnsureRequestUserId}");
                VALUES("EL_ENSURE_TIME", "#{elEnsureTime}");
                VALUES("EL_ENSURE_REMARK", "#{elEnsureRemark}");
                VALUES("COOPERATE_FLAG", "#{cooperateFlag}");
                VALUES("RETREAT_STATUS", "#{retreatStatus}");
                VALUES("RETREAT_REMARK", "#{retreatRemark}");
                VALUES("SELLER_VIEW_IMAGE_FLAG", "#{sellerViewImageFlag}");
                VALUES("EXCEPTION_FLAG", "#{exceptionFlag}");
                VALUES("COMPARISON_FLAG", "#{comparisonFlag}");
                VALUES("AUTH_RESULT", "#{authResult}");
                VALUES("AUTH_TIME", "#{authTime}");
                VALUES("AUTH_REMARK", "#{authRemark}");
                VALUES("AUTH_REQUEST_TIME", "#{authRequestTime}");
                VALUES("AUTH_REQUEST_USER_ID", "#{authRequestUserId}");
                VALUES("AUTH_REQUEST_USER_NAME", "#{authRequestUserName}");
                VALUES("AUTH_ROUTE", "#{authRoute}");
                VALUES("AUTH_STATUS", "#{authStatus}");
                VALUES("TAX_FLAG", "#{taxFlag}");
                VALUES("TAX_REQUEST_TIME", "#{taxRequestTime}");
                VALUES("SERVICE_CODE", "#{serviceCode}");
                VALUES("IS_NEED_ALL_INFO", "#{isNeedAllInfo}");
                VALUES("PDF_PATH", "#{pdfPath}");
                VALUES("OP_STATUS", "#{opStatus}");
                VALUES("CREATE_TIME", "#{createTime}");
                VALUES("CREATE_USER_ID", "#{createUserId}");
                VALUES("UPDATE_TIME", "#{updateTime}");
                VALUES("UPDATE_USER_ID", "#{updateUserId}");
                VALUES("SETTLEMENT_MATCH_STATUS", "#{settlementMatchStatus}");
                VALUES("LOGISTICS_STATUS", "#{logisticsStatus}");
                VALUES("PRINT_CONTENT_FLAG", "#{printContentFlag}");
                VALUES("DIFF_STATUS", "#{diffStatus}");
                VALUES("TAX_BUREAU_OPEN_TYPE", "#{taxBureauOpenType}");
                VALUES("CANCEL_EXCEPITON_FLAG", "#{cancelExcepitonFlag}");
                VALUES("AUTH_EXCEPTION_REASON", "#{authExceptionReason}");
                VALUES("SALE_LIST_FILE_FLAG", "#{saleListFileFlag}");
                VALUES("INVOICE_ITEM_ORIG", "#{invoiceItemOrig}");
                VALUES("TAX_FLAG_REMARK", "#{taxFlagRemark}");
                VALUES("INVOICE_TAG", "#{invoiceTag}");
                VALUES("INVOICE_TRADE_TYPE", "#{invoiceTradeType}");
                VALUES("INBOUNDORDER_MATCH_STATUS", "#{inboundorderMatchStatus}");
                VALUES("INBOUNDORDER_MATCH_NUM", "#{inboundorderMatchNum}");
                VALUES("MATCH_FIRST", "#{matchFirst}");
                VALUES("MATCH_SECOND", "#{matchSecond}");
                VALUES("TP_CERTIFICATE_NO", "#{tpCertificateNo}");
                VALUES("TP_CERTIFICATE_PERIOD", "#{tpCertificatePeriod}");
                VALUES("CUSTOMIZE_REMARK1", "#{customizeRemark1}");
                VALUES("CUSTOMIZE_REMARK2", "#{customizeRemark2}");
                VALUES("CUSTOMIZE_REMARK3", "#{customizeRemark3}");
                VALUES("EXT1", "#{EXT1}");
                VALUES("EXT2", "#{EXT2}");
                VALUES("EXT3", "#{EXT3}");
                VALUES("EXT4", "#{EXT4}");
                VALUES("EXT5", "#{EXT5}");
                VALUES("EXT6", "#{EXT6}");
                VALUES("EXT7", "#{EXT7}");
                VALUES("EXT8", "#{EXT8}");
                VALUES("EXT9", "#{EXT9}");
                VALUES("EXT10", "#{EXT10}");
                VALUES("SHORT_TAXCODE_STATUS", "#{shortTaxcodeStatus}");
                VALUES("EFFECTIVE_TAX_AMOUNT", "#{effectiveTaxAmount}");
                VALUES("USE_ROUTE", "#{useRoute}");
            }}.toString();
        }

        public String update(TPurchaserInvoice tPurchaserInvoice) {
            return new SQL(){{
                UPDATE("t_purchaser_invoice");
                SET("`INVOICE_ID` = #{invoiceId}");
                SET("`PRE_INVOICE_ID` = #{preInvoiceId}");
                SET("`SETTLEMENT_ID` = #{settlementId}");
                SET("`SETTLEMENT_NO` = #{settlementNo}");
                SET("`ORIGIN_SETTLEMENT_NO` = #{originSettlementNo}");
                SET("`SELLER_INVOICE_ID` = #{sellerInvoiceId}");
                SET("`TAX_INVOICE_ID` = #{taxInvoiceId}");
                SET("`SCAN_INVOICE_ID` = #{scanInvoiceId}");
                SET("`SELLER_INFO_STATUS` = #{sellerInfoStatus}");
                SET("`TAX_INFO_STATUS` = #{taxInfoStatus}");
                SET("`SCAN_INFO_STATUS` = #{scanInfoStatus}");
                SET("`INVOICE_TYPE` = #{invoiceType}");
                SET("`INVOICE_CODE` = #{invoiceCode}");
                SET("`INVOICE_NO` = #{invoiceNo}");
                SET("`SELLER_TENANT_CODE` = #{sellerTenantCode}");
                SET("`SELLER_NO` = #{sellerNo}");
                SET("`SELLER_NO_FROM_PURCHASER` = #{sellerNoFromPurchaser}");
                SET("`SELLER_CODE` = #{sellerCode}");
                SET("`SELLER_TAX_NO` = #{sellerTaxNo}");
                SET("`SELLER_NAME` = #{sellerName}");
                SET("`SELLER_ADDR_TEL` = #{sellerAddrTel}");
                SET("`SELLER_ADDRESS` = #{sellerAddress}");
                SET("`SELLER_TEL` = #{sellerTel}");
                SET("`SELLER_BANK_INFO` = #{sellerBankInfo}");
                SET("`SELLER_BANK_NAME` = #{sellerBankName}");
                SET("`SELLER_BANK_ACCOUNT` = #{sellerBankAccount}");
                SET("`PURCHASER_TENANT_CODE` = #{purchaserTenantCode}");
                SET("`PURCHASER_NO` = #{purchaserNo}");
                SET("`PURCHASER_NO_FROM_SELLER` = #{purchaserNoFromSeller}");
                SET("`PURCHASER_CODE` = #{purchaserCode}");
                SET("`PURCHASER_TAX_NO` = #{purchaserTaxNo}");
                SET("`TAX_PURCHASER_NAME` = #{taxPurchaserName}");
                SET("`PURCHASER_NAME` = #{purchaserName}");
                SET("`PURCHASER_ADDR_TEL` = #{purchaserAddrTel}");
                SET("`PURCHASER_ADDRESS` = #{purchaserAddress}");
                SET("`PURCHASER_TEL` = #{purchaserTel}");
                SET("`PURCHASER_BANK_INFO` = #{purchaserBankInfo}");
                SET("`PURCHASER_BANK_NAME` = #{purchaserBankName}");
                SET("`PURCHASER_BANK_ACCOUNT` = #{purchaserBankAccount}");
                SET("`TAX_RATE` = #{taxRate}");
                SET("`AMOUNT_WITHOUT_TAX` = #{amountWithoutTax}");
                SET("`TAX_AMOUNT` = #{taxAmount}");
                SET("`AMOUNT_WITH_TAX` = #{amountWithTax}");
                SET("`PAPER_DREW_DATE` = #{paperDrewDate}");
                SET("`INVOICE_ORIG` = #{invoiceOrig}");
                SET("`TWO_CODE_FLAG` = #{twoCodeFlag}");
                SET("`CIPHER_TEXT_TWO_CODE` = #{cipherTextTwoCode}");
                SET("`CIPHER_TEXT` = #{cipherText}");
                SET("`REMARK` = #{REMARK}");
                SET("`CASHIER_NAME` = #{cashierName}");
                SET("`CHECKER_NAME` = #{checkerName}");
                SET("`INVOICER_NAME` = #{invoicerName}");
                SET("`MACHINE_CODE` = #{machineCode}");
                SET("`SCAN_TIME` = #{scanTime}");
                SET("`SCAN_ORDER` = #{scanOrder}");
                SET("`SCAN_USER_ID` = #{scanUserId}");
                SET("`SCAN_USER_NAME` = #{scanUserName}");
                SET("`SCAN_BATCH_NO` = #{scanBatchNo}");
                SET("`SCAN_DEDUCTION_IMAGE_URL` = #{scanDeductionImageUrl}");
                SET("`SCAN_INVOICE_IMAGE_URL` = #{scanInvoiceImageUrl}");
                SET("`SCAN_STATUS` = #{scanStatus}");
                SET("`SCAN_NUM` = #{scanNum}");
                SET("`DRAWOUT_TIME` = #{drawoutTime}");
                SET("`DRAWOUT_USER_ID` = #{drawoutUserId}");
                SET("`IS_NEED_AUTH` = #{isNeedAuth}");
                SET("`LOCK_FLAG` = #{lockFlag}");
                SET("`STATUS` = #{STATUS}");
                SET("`ORIGIN_INVOICE_NO` = #{originInvoiceNo}");
                SET("`ORIGIN_INVOICE_CODE` = #{originInvoiceCode}");
                SET("`RED_NOTIFICATION_NO` = #{redNotificationNo}");
                SET("`RED_TIME` = #{redTime}");
                SET("`RED_FLAG` = #{redFlag}");
                SET("`PROCESS_FLAG` = #{processFlag}");
                SET("`PROCESS_REMARK` = #{processRemark}");
                SET("`SYSTEM_ORIG` = #{systemOrig}");
                SET("`CHECK_CODE` = #{checkCode}");
                SET("`TP_BATCH_NO` = #{tpBatchNo}");
                SET("`TP` = #{TP}");
                SET("`AUDIT_STATUS` = #{auditStatus}");
                SET("`EL_GET_INFO_FLAG` = #{elGetInfoFlag}");
                SET("`EL_FLAG` = #{elFlag}");
                SET("`EL_TIME` = #{elTime}");
                SET("`EL_USER_ID` = #{elUserId}");
                SET("`EL_REQUEST_TIME` = #{elRequestTime}");
                SET("`EL_REQUEST_USER_ID` = #{elRequestUserId}");
                SET("`EL_CHECK_TIME` = #{elCheckTime}");
                SET("`EL_TAX_PERIOD` = #{elTaxPeriod}");
                SET("`EL_ENSURE_REQUEST_TIME` = #{elEnsureRequestTime}");
                SET("`EL_ENSURE_REQUEST_USER_ID` = #{elEnsureRequestUserId}");
                SET("`EL_ENSURE_TIME` = #{elEnsureTime}");
                SET("`EL_ENSURE_REMARK` = #{elEnsureRemark}");
                SET("`COOPERATE_FLAG` = #{cooperateFlag}");
                SET("`RETREAT_STATUS` = #{retreatStatus}");
                SET("`RETREAT_REMARK` = #{retreatRemark}");
                SET("`SELLER_VIEW_IMAGE_FLAG` = #{sellerViewImageFlag}");
                SET("`EXCEPTION_FLAG` = #{exceptionFlag}");
                SET("`COMPARISON_FLAG` = #{comparisonFlag}");
                SET("`AUTH_RESULT` = #{authResult}");
                SET("`AUTH_TIME` = #{authTime}");
                SET("`AUTH_REMARK` = #{authRemark}");
                SET("`AUTH_REQUEST_TIME` = #{authRequestTime}");
                SET("`AUTH_REQUEST_USER_ID` = #{authRequestUserId}");
                SET("`AUTH_REQUEST_USER_NAME` = #{authRequestUserName}");
                SET("`AUTH_ROUTE` = #{authRoute}");
                SET("`AUTH_STATUS` = #{authStatus}");
                SET("`TAX_FLAG` = #{taxFlag}");
                SET("`TAX_REQUEST_TIME` = #{taxRequestTime}");
                SET("`SERVICE_CODE` = #{serviceCode}");
                SET("`IS_NEED_ALL_INFO` = #{isNeedAllInfo}");
                SET("`PDF_PATH` = #{pdfPath}");
                SET("`OP_STATUS` = #{opStatus}");
                SET("`CREATE_TIME` = #{createTime}");
                SET("`CREATE_USER_ID` = #{createUserId}");
                SET("`UPDATE_TIME` = #{updateTime}");
                SET("`UPDATE_USER_ID` = #{updateUserId}");
                SET("`SETTLEMENT_MATCH_STATUS` = #{settlementMatchStatus}");
                SET("`LOGISTICS_STATUS` = #{logisticsStatus}");
                SET("`PRINT_CONTENT_FLAG` = #{printContentFlag}");
                SET("`DIFF_STATUS` = #{diffStatus}");
                SET("`TAX_BUREAU_OPEN_TYPE` = #{taxBureauOpenType}");
                SET("`CANCEL_EXCEPITON_FLAG` = #{cancelExcepitonFlag}");
                SET("`AUTH_EXCEPTION_REASON` = #{authExceptionReason}");
                SET("`SALE_LIST_FILE_FLAG` = #{saleListFileFlag}");
                SET("`INVOICE_ITEM_ORIG` = #{invoiceItemOrig}");
                SET("`TAX_FLAG_REMARK` = #{taxFlagRemark}");
                SET("`INVOICE_TAG` = #{invoiceTag}");
                SET("`INVOICE_TRADE_TYPE` = #{invoiceTradeType}");
                SET("`INBOUNDORDER_MATCH_STATUS` = #{inboundorderMatchStatus}");
                SET("`INBOUNDORDER_MATCH_NUM` = #{inboundorderMatchNum}");
                SET("`MATCH_FIRST` = #{matchFirst}");
                SET("`MATCH_SECOND` = #{matchSecond}");
                SET("`TP_CERTIFICATE_NO` = #{tpCertificateNo}");
                SET("`TP_CERTIFICATE_PERIOD` = #{tpCertificatePeriod}");
                SET("`CUSTOMIZE_REMARK1` = #{customizeRemark1}");
                SET("`CUSTOMIZE_REMARK2` = #{customizeRemark2}");
                SET("`CUSTOMIZE_REMARK3` = #{customizeRemark3}");
                SET("`EXT1` = #{EXT1}");
                SET("`EXT2` = #{EXT2}");
                SET("`EXT3` = #{EXT3}");
                SET("`EXT4` = #{EXT4}");
                SET("`EXT5` = #{EXT5}");
                SET("`EXT6` = #{EXT6}");
                SET("`EXT7` = #{EXT7}");
                SET("`EXT8` = #{EXT8}");
                SET("`EXT9` = #{EXT9}");
                SET("`EXT10` = #{EXT10}");
                SET("`SHORT_TAXCODE_STATUS` = #{shortTaxcodeStatus}");
                SET("`EFFECTIVE_TAX_AMOUNT` = #{effectiveTaxAmount}");
                SET("`USE_ROUTE` = #{useRoute}");
                WHERE("`INVOICE_ID` = #{invoiceId}");
            }}.toString();
        }

        public String updateIgnoreNull(TPurchaserInvoice tPurchaserInvoice) {
            return new SQL(){{
                UPDATE("t_purchaser_invoice");
                if (tPurchaserInvoice.getInvoiceId() != null) {
                    SET("`INVOICE_ID` = #{invoiceId}");
                }
                if (tPurchaserInvoice.getPreInvoiceId() != null) {
                    SET("`PRE_INVOICE_ID` = #{preInvoiceId}");
                }
                if (tPurchaserInvoice.getSettlementId() != null) {
                    SET("`SETTLEMENT_ID` = #{settlementId}");
                }
                if (tPurchaserInvoice.getSettlementNo() != null) {
                    SET("`SETTLEMENT_NO` = #{settlementNo}");
                }
                if (tPurchaserInvoice.getOriginSettlementNo() != null) {
                    SET("`ORIGIN_SETTLEMENT_NO` = #{originSettlementNo}");
                }
                if (tPurchaserInvoice.getSellerInvoiceId() != null) {
                    SET("`SELLER_INVOICE_ID` = #{sellerInvoiceId}");
                }
                if (tPurchaserInvoice.getTaxInvoiceId() != null) {
                    SET("`TAX_INVOICE_ID` = #{taxInvoiceId}");
                }
                if (tPurchaserInvoice.getScanInvoiceId() != null) {
                    SET("`SCAN_INVOICE_ID` = #{scanInvoiceId}");
                }
                if (tPurchaserInvoice.getSellerInfoStatus() != null) {
                    SET("`SELLER_INFO_STATUS` = #{sellerInfoStatus}");
                }
                if (tPurchaserInvoice.getTaxInfoStatus() != null) {
                    SET("`TAX_INFO_STATUS` = #{taxInfoStatus}");
                }
                if (tPurchaserInvoice.getScanInfoStatus() != null) {
                    SET("`SCAN_INFO_STATUS` = #{scanInfoStatus}");
                }
                if (tPurchaserInvoice.getInvoiceType() != null) {
                    SET("`INVOICE_TYPE` = #{invoiceType}");
                }
                if (tPurchaserInvoice.getInvoiceCode() != null) {
                    SET("`INVOICE_CODE` = #{invoiceCode}");
                }
                if (tPurchaserInvoice.getInvoiceNo() != null) {
                    SET("`INVOICE_NO` = #{invoiceNo}");
                }
                if (tPurchaserInvoice.getSellerTenantCode() != null) {
                    SET("`SELLER_TENANT_CODE` = #{sellerTenantCode}");
                }
                if (tPurchaserInvoice.getSellerNo() != null) {
                    SET("`SELLER_NO` = #{sellerNo}");
                }
                if (tPurchaserInvoice.getSellerNoFromPurchaser() != null) {
                    SET("`SELLER_NO_FROM_PURCHASER` = #{sellerNoFromPurchaser}");
                }
                if (tPurchaserInvoice.getSellerCode() != null) {
                    SET("`SELLER_CODE` = #{sellerCode}");
                }
                if (tPurchaserInvoice.getSellerTaxNo() != null) {
                    SET("`SELLER_TAX_NO` = #{sellerTaxNo}");
                }
                if (tPurchaserInvoice.getSellerName() != null) {
                    SET("`SELLER_NAME` = #{sellerName}");
                }
                if (tPurchaserInvoice.getSellerAddrTel() != null) {
                    SET("`SELLER_ADDR_TEL` = #{sellerAddrTel}");
                }
                if (tPurchaserInvoice.getSellerAddress() != null) {
                    SET("`SELLER_ADDRESS` = #{sellerAddress}");
                }
                if (tPurchaserInvoice.getSellerTel() != null) {
                    SET("`SELLER_TEL` = #{sellerTel}");
                }
                if (tPurchaserInvoice.getSellerBankInfo() != null) {
                    SET("`SELLER_BANK_INFO` = #{sellerBankInfo}");
                }
                if (tPurchaserInvoice.getSellerBankName() != null) {
                    SET("`SELLER_BANK_NAME` = #{sellerBankName}");
                }
                if (tPurchaserInvoice.getSellerBankAccount() != null) {
                    SET("`SELLER_BANK_ACCOUNT` = #{sellerBankAccount}");
                }
                if (tPurchaserInvoice.getPurchaserTenantCode() != null) {
                    SET("`PURCHASER_TENANT_CODE` = #{purchaserTenantCode}");
                }
                if (tPurchaserInvoice.getPurchaserNo() != null) {
                    SET("`PURCHASER_NO` = #{purchaserNo}");
                }
                if (tPurchaserInvoice.getPurchaserNoFromSeller() != null) {
                    SET("`PURCHASER_NO_FROM_SELLER` = #{purchaserNoFromSeller}");
                }
                if (tPurchaserInvoice.getPurchaserCode() != null) {
                    SET("`PURCHASER_CODE` = #{purchaserCode}");
                }
                if (tPurchaserInvoice.getPurchaserTaxNo() != null) {
                    SET("`PURCHASER_TAX_NO` = #{purchaserTaxNo}");
                }
                if (tPurchaserInvoice.getTaxPurchaserName() != null) {
                    SET("`TAX_PURCHASER_NAME` = #{taxPurchaserName}");
                }
                if (tPurchaserInvoice.getPurchaserName() != null) {
                    SET("`PURCHASER_NAME` = #{purchaserName}");
                }
                if (tPurchaserInvoice.getPurchaserAddrTel() != null) {
                    SET("`PURCHASER_ADDR_TEL` = #{purchaserAddrTel}");
                }
                if (tPurchaserInvoice.getPurchaserAddress() != null) {
                    SET("`PURCHASER_ADDRESS` = #{purchaserAddress}");
                }
                if (tPurchaserInvoice.getPurchaserTel() != null) {
                    SET("`PURCHASER_TEL` = #{purchaserTel}");
                }
                if (tPurchaserInvoice.getPurchaserBankInfo() != null) {
                    SET("`PURCHASER_BANK_INFO` = #{purchaserBankInfo}");
                }
                if (tPurchaserInvoice.getPurchaserBankName() != null) {
                    SET("`PURCHASER_BANK_NAME` = #{purchaserBankName}");
                }
                if (tPurchaserInvoice.getPurchaserBankAccount() != null) {
                    SET("`PURCHASER_BANK_ACCOUNT` = #{purchaserBankAccount}");
                }
                if (tPurchaserInvoice.getTaxRate() != null) {
                    SET("`TAX_RATE` = #{taxRate}");
                }
                if (tPurchaserInvoice.getAmountWithoutTax() != null) {
                    SET("`AMOUNT_WITHOUT_TAX` = #{amountWithoutTax}");
                }
                if (tPurchaserInvoice.getTaxAmount() != null) {
                    SET("`TAX_AMOUNT` = #{taxAmount}");
                }
                if (tPurchaserInvoice.getAmountWithTax() != null) {
                    SET("`AMOUNT_WITH_TAX` = #{amountWithTax}");
                }
                if (tPurchaserInvoice.getPaperDrewDate() != null) {
                    SET("`PAPER_DREW_DATE` = #{paperDrewDate}");
                }
                if (tPurchaserInvoice.getInvoiceOrig() != null) {
                    SET("`INVOICE_ORIG` = #{invoiceOrig}");
                }
                if (tPurchaserInvoice.getTwoCodeFlag() != null) {
                    SET("`TWO_CODE_FLAG` = #{twoCodeFlag}");
                }
                if (tPurchaserInvoice.getCipherTextTwoCode() != null) {
                    SET("`CIPHER_TEXT_TWO_CODE` = #{cipherTextTwoCode}");
                }
                if (tPurchaserInvoice.getCipherText() != null) {
                    SET("`CIPHER_TEXT` = #{cipherText}");
                }
                if (tPurchaserInvoice.getREMARK() != null) {
                    SET("`REMARK` = #{REMARK}");
                }
                if (tPurchaserInvoice.getCashierName() != null) {
                    SET("`CASHIER_NAME` = #{cashierName}");
                }
                if (tPurchaserInvoice.getCheckerName() != null) {
                    SET("`CHECKER_NAME` = #{checkerName}");
                }
                if (tPurchaserInvoice.getInvoicerName() != null) {
                    SET("`INVOICER_NAME` = #{invoicerName}");
                }
                if (tPurchaserInvoice.getMachineCode() != null) {
                    SET("`MACHINE_CODE` = #{machineCode}");
                }
                if (tPurchaserInvoice.getScanTime() != null) {
                    SET("`SCAN_TIME` = #{scanTime}");
                }
                if (tPurchaserInvoice.getScanOrder() != null) {
                    SET("`SCAN_ORDER` = #{scanOrder}");
                }
                if (tPurchaserInvoice.getScanUserId() != null) {
                    SET("`SCAN_USER_ID` = #{scanUserId}");
                }
                if (tPurchaserInvoice.getScanUserName() != null) {
                    SET("`SCAN_USER_NAME` = #{scanUserName}");
                }
                if (tPurchaserInvoice.getScanBatchNo() != null) {
                    SET("`SCAN_BATCH_NO` = #{scanBatchNo}");
                }
                if (tPurchaserInvoice.getScanDeductionImageUrl() != null) {
                    SET("`SCAN_DEDUCTION_IMAGE_URL` = #{scanDeductionImageUrl}");
                }
                if (tPurchaserInvoice.getScanInvoiceImageUrl() != null) {
                    SET("`SCAN_INVOICE_IMAGE_URL` = #{scanInvoiceImageUrl}");
                }
                if (tPurchaserInvoice.getScanStatus() != null) {
                    SET("`SCAN_STATUS` = #{scanStatus}");
                }
                if (tPurchaserInvoice.getScanNum() != null) {
                    SET("`SCAN_NUM` = #{scanNum}");
                }
                if (tPurchaserInvoice.getDrawoutTime() != null) {
                    SET("`DRAWOUT_TIME` = #{drawoutTime}");
                }
                if (tPurchaserInvoice.getDrawoutUserId() != null) {
                    SET("`DRAWOUT_USER_ID` = #{drawoutUserId}");
                }
                if (tPurchaserInvoice.getIsNeedAuth() != null) {
                    SET("`IS_NEED_AUTH` = #{isNeedAuth}");
                }
                if (tPurchaserInvoice.getLockFlag() != null) {
                    SET("`LOCK_FLAG` = #{lockFlag}");
                }
                if (tPurchaserInvoice.getSTATUS() != null) {
                    SET("`STATUS` = #{STATUS}");
                }
                if (tPurchaserInvoice.getOriginInvoiceNo() != null) {
                    SET("`ORIGIN_INVOICE_NO` = #{originInvoiceNo}");
                }
                if (tPurchaserInvoice.getOriginInvoiceCode() != null) {
                    SET("`ORIGIN_INVOICE_CODE` = #{originInvoiceCode}");
                }
                if (tPurchaserInvoice.getRedNotificationNo() != null) {
                    SET("`RED_NOTIFICATION_NO` = #{redNotificationNo}");
                }
                if (tPurchaserInvoice.getRedTime() != null) {
                    SET("`RED_TIME` = #{redTime}");
                }
                if (tPurchaserInvoice.getRedFlag() != null) {
                    SET("`RED_FLAG` = #{redFlag}");
                }
                if (tPurchaserInvoice.getProcessFlag() != null) {
                    SET("`PROCESS_FLAG` = #{processFlag}");
                }
                if (tPurchaserInvoice.getProcessRemark() != null) {
                    SET("`PROCESS_REMARK` = #{processRemark}");
                }
                if (tPurchaserInvoice.getSystemOrig() != null) {
                    SET("`SYSTEM_ORIG` = #{systemOrig}");
                }
                if (tPurchaserInvoice.getCheckCode() != null) {
                    SET("`CHECK_CODE` = #{checkCode}");
                }
                if (tPurchaserInvoice.getTpBatchNo() != null) {
                    SET("`TP_BATCH_NO` = #{tpBatchNo}");
                }
                if (tPurchaserInvoice.getTP() != null) {
                    SET("`TP` = #{TP}");
                }
                if (tPurchaserInvoice.getAuditStatus() != null) {
                    SET("`AUDIT_STATUS` = #{auditStatus}");
                }
                if (tPurchaserInvoice.getElGetInfoFlag() != null) {
                    SET("`EL_GET_INFO_FLAG` = #{elGetInfoFlag}");
                }
                if (tPurchaserInvoice.getElFlag() != null) {
                    SET("`EL_FLAG` = #{elFlag}");
                }
                if (tPurchaserInvoice.getElTime() != null) {
                    SET("`EL_TIME` = #{elTime}");
                }
                if (tPurchaserInvoice.getElUserId() != null) {
                    SET("`EL_USER_ID` = #{elUserId}");
                }
                if (tPurchaserInvoice.getElRequestTime() != null) {
                    SET("`EL_REQUEST_TIME` = #{elRequestTime}");
                }
                if (tPurchaserInvoice.getElRequestUserId() != null) {
                    SET("`EL_REQUEST_USER_ID` = #{elRequestUserId}");
                }
                if (tPurchaserInvoice.getElCheckTime() != null) {
                    SET("`EL_CHECK_TIME` = #{elCheckTime}");
                }
                if (tPurchaserInvoice.getElTaxPeriod() != null) {
                    SET("`EL_TAX_PERIOD` = #{elTaxPeriod}");
                }
                if (tPurchaserInvoice.getElEnsureRequestTime() != null) {
                    SET("`EL_ENSURE_REQUEST_TIME` = #{elEnsureRequestTime}");
                }
                if (tPurchaserInvoice.getElEnsureRequestUserId() != null) {
                    SET("`EL_ENSURE_REQUEST_USER_ID` = #{elEnsureRequestUserId}");
                }
                if (tPurchaserInvoice.getElEnsureTime() != null) {
                    SET("`EL_ENSURE_TIME` = #{elEnsureTime}");
                }
                if (tPurchaserInvoice.getElEnsureRemark() != null) {
                    SET("`EL_ENSURE_REMARK` = #{elEnsureRemark}");
                }
                if (tPurchaserInvoice.getCooperateFlag() != null) {
                    SET("`COOPERATE_FLAG` = #{cooperateFlag}");
                }
                if (tPurchaserInvoice.getRetreatStatus() != null) {
                    SET("`RETREAT_STATUS` = #{retreatStatus}");
                }
                if (tPurchaserInvoice.getRetreatRemark() != null) {
                    SET("`RETREAT_REMARK` = #{retreatRemark}");
                }
                if (tPurchaserInvoice.getSellerViewImageFlag() != null) {
                    SET("`SELLER_VIEW_IMAGE_FLAG` = #{sellerViewImageFlag}");
                }
                if (tPurchaserInvoice.getExceptionFlag() != null) {
                    SET("`EXCEPTION_FLAG` = #{exceptionFlag}");
                }
                if (tPurchaserInvoice.getComparisonFlag() != null) {
                    SET("`COMPARISON_FLAG` = #{comparisonFlag}");
                }
                if (tPurchaserInvoice.getAuthResult() != null) {
                    SET("`AUTH_RESULT` = #{authResult}");
                }
                if (tPurchaserInvoice.getAuthTime() != null) {
                    SET("`AUTH_TIME` = #{authTime}");
                }
                if (tPurchaserInvoice.getAuthRemark() != null) {
                    SET("`AUTH_REMARK` = #{authRemark}");
                }
                if (tPurchaserInvoice.getAuthRequestTime() != null) {
                    SET("`AUTH_REQUEST_TIME` = #{authRequestTime}");
                }
                if (tPurchaserInvoice.getAuthRequestUserId() != null) {
                    SET("`AUTH_REQUEST_USER_ID` = #{authRequestUserId}");
                }
                if (tPurchaserInvoice.getAuthRequestUserName() != null) {
                    SET("`AUTH_REQUEST_USER_NAME` = #{authRequestUserName}");
                }
                if (tPurchaserInvoice.getAuthRoute() != null) {
                    SET("`AUTH_ROUTE` = #{authRoute}");
                }
                if (tPurchaserInvoice.getAuthStatus() != null) {
                    SET("`AUTH_STATUS` = #{authStatus}");
                }
                if (tPurchaserInvoice.getTaxFlag() != null) {
                    SET("`TAX_FLAG` = #{taxFlag}");
                }
                if (tPurchaserInvoice.getTaxRequestTime() != null) {
                    SET("`TAX_REQUEST_TIME` = #{taxRequestTime}");
                }
                if (tPurchaserInvoice.getServiceCode() != null) {
                    SET("`SERVICE_CODE` = #{serviceCode}");
                }
                if (tPurchaserInvoice.getIsNeedAllInfo() != null) {
                    SET("`IS_NEED_ALL_INFO` = #{isNeedAllInfo}");
                }
                if (tPurchaserInvoice.getPdfPath() != null) {
                    SET("`PDF_PATH` = #{pdfPath}");
                }
                if (tPurchaserInvoice.getOpStatus() != null) {
                    SET("`OP_STATUS` = #{opStatus}");
                }
                if (tPurchaserInvoice.getCreateTime() != null) {
                    SET("`CREATE_TIME` = #{createTime}");
                }
                if (tPurchaserInvoice.getCreateUserId() != null) {
                    SET("`CREATE_USER_ID` = #{createUserId}");
                }
                if (tPurchaserInvoice.getUpdateTime() != null) {
                    SET("`UPDATE_TIME` = #{updateTime}");
                }
                if (tPurchaserInvoice.getUpdateUserId() != null) {
                    SET("`UPDATE_USER_ID` = #{updateUserId}");
                }
                if (tPurchaserInvoice.getSettlementMatchStatus() != null) {
                    SET("`SETTLEMENT_MATCH_STATUS` = #{settlementMatchStatus}");
                }
                if (tPurchaserInvoice.getLogisticsStatus() != null) {
                    SET("`LOGISTICS_STATUS` = #{logisticsStatus}");
                }
                if (tPurchaserInvoice.getPrintContentFlag() != null) {
                    SET("`PRINT_CONTENT_FLAG` = #{printContentFlag}");
                }
                if (tPurchaserInvoice.getDiffStatus() != null) {
                    SET("`DIFF_STATUS` = #{diffStatus}");
                }
                if (tPurchaserInvoice.getTaxBureauOpenType() != null) {
                    SET("`TAX_BUREAU_OPEN_TYPE` = #{taxBureauOpenType}");
                }
                if (tPurchaserInvoice.getCancelExcepitonFlag() != null) {
                    SET("`CANCEL_EXCEPITON_FLAG` = #{cancelExcepitonFlag}");
                }
                if (tPurchaserInvoice.getAuthExceptionReason() != null) {
                    SET("`AUTH_EXCEPTION_REASON` = #{authExceptionReason}");
                }
                if (tPurchaserInvoice.getSaleListFileFlag() != null) {
                    SET("`SALE_LIST_FILE_FLAG` = #{saleListFileFlag}");
                }
                if (tPurchaserInvoice.getInvoiceItemOrig() != null) {
                    SET("`INVOICE_ITEM_ORIG` = #{invoiceItemOrig}");
                }
                if (tPurchaserInvoice.getTaxFlagRemark() != null) {
                    SET("`TAX_FLAG_REMARK` = #{taxFlagRemark}");
                }
                if (tPurchaserInvoice.getInvoiceTag() != null) {
                    SET("`INVOICE_TAG` = #{invoiceTag}");
                }
                if (tPurchaserInvoice.getInvoiceTradeType() != null) {
                    SET("`INVOICE_TRADE_TYPE` = #{invoiceTradeType}");
                }
                if (tPurchaserInvoice.getInboundorderMatchStatus() != null) {
                    SET("`INBOUNDORDER_MATCH_STATUS` = #{inboundorderMatchStatus}");
                }
                if (tPurchaserInvoice.getInboundorderMatchNum() != null) {
                    SET("`INBOUNDORDER_MATCH_NUM` = #{inboundorderMatchNum}");
                }
                if (tPurchaserInvoice.getMatchFirst() != null) {
                    SET("`MATCH_FIRST` = #{matchFirst}");
                }
                if (tPurchaserInvoice.getMatchSecond() != null) {
                    SET("`MATCH_SECOND` = #{matchSecond}");
                }
                if (tPurchaserInvoice.getTpCertificateNo() != null) {
                    SET("`TP_CERTIFICATE_NO` = #{tpCertificateNo}");
                }
                if (tPurchaserInvoice.getTpCertificatePeriod() != null) {
                    SET("`TP_CERTIFICATE_PERIOD` = #{tpCertificatePeriod}");
                }
                if (tPurchaserInvoice.getCustomizeRemark1() != null) {
                    SET("`CUSTOMIZE_REMARK1` = #{customizeRemark1}");
                }
                if (tPurchaserInvoice.getCustomizeRemark2() != null) {
                    SET("`CUSTOMIZE_REMARK2` = #{customizeRemark2}");
                }
                if (tPurchaserInvoice.getCustomizeRemark3() != null) {
                    SET("`CUSTOMIZE_REMARK3` = #{customizeRemark3}");
                }
                if (tPurchaserInvoice.getEXT1() != null) {
                    SET("`EXT1` = #{EXT1}");
                }
                if (tPurchaserInvoice.getEXT2() != null) {
                    SET("`EXT2` = #{EXT2}");
                }
                if (tPurchaserInvoice.getEXT3() != null) {
                    SET("`EXT3` = #{EXT3}");
                }
                if (tPurchaserInvoice.getEXT4() != null) {
                    SET("`EXT4` = #{EXT4}");
                }
                if (tPurchaserInvoice.getEXT5() != null) {
                    SET("`EXT5` = #{EXT5}");
                }
                if (tPurchaserInvoice.getEXT6() != null) {
                    SET("`EXT6` = #{EXT6}");
                }
                if (tPurchaserInvoice.getEXT7() != null) {
                    SET("`EXT7` = #{EXT7}");
                }
                if (tPurchaserInvoice.getEXT8() != null) {
                    SET("`EXT8` = #{EXT8}");
                }
                if (tPurchaserInvoice.getEXT9() != null) {
                    SET("`EXT9` = #{EXT9}");
                }
                if (tPurchaserInvoice.getEXT10() != null) {
                    SET("`EXT10` = #{EXT10}");
                }
                if (tPurchaserInvoice.getShortTaxcodeStatus() != null) {
                    SET("`SHORT_TAXCODE_STATUS` = #{shortTaxcodeStatus}");
                }
                if (tPurchaserInvoice.getEffectiveTaxAmount() != null) {
                    SET("`EFFECTIVE_TAX_AMOUNT` = #{effectiveTaxAmount}");
                }
                if (tPurchaserInvoice.getUseRoute() != null) {
                    SET("`USE_ROUTE` = #{useRoute}");
                }
                WHERE("`INVOICE_ID` = #{invoiceId}");
            }}.toString();
        }
    }

}