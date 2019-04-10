package Development.BO;


public class DailyCashSummary  {

    private String patientId = "";
    private String patFullName = "";
    private String cpt = "";
    private String description = "";
    private String account = "";
    private String transactionNo = "";
    private String amount = "";
    private String recieveDate = "";
    private String comments = "";
    private String refundNo = ""; 
    private String refundAmount = "";
    private String totalAmount = "";
    private String cashRefund = "";
    private String invoiceAdjusted = "";
    private String ledgerAdjusted = "";
    private String orderNo = "";
    private String invoiceNo = "";
    private String netDiscount = "";
    private String price = "";
    private String support = "";
    private String payableAmount = "";
    private String balanceAmount = "";
    private String reciveAmount = "";
    private String advanceAdjusted = "";
    private String invoiceBy = "";
    private String refundBy = "";
    private String invoiceDate = "";
    private String refundDate = "";
    private String userId ="";
    private String locationId = "";
    private String fromDate = "";
    private String toDate = "";
    private int totalRefundDetail = 0;
    private int totalRefundMaster = 0;
    private int totalInvoiceDetail = 0;
    private int totalInvoiceMaster = 0;
    private String clientName = "";
    private String clientId = "";

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRecieveDate() {
        return recieveDate;
    }

    public void setRecieveDate(String recieveDate) {
        this.recieveDate = recieveDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    public String getPatientId() {
        return patientId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    
    
    
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatFullName() {
        return patFullName;
    }

    public void setPatFullName(String patFullName) {
        this.patFullName = patFullName;
    }

    public String getCpt() {
        return cpt;
    }

    public void setCpt(String cpt) {
        this.cpt = cpt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getNetDiscount() {
        return netDiscount;
    }

    public void setNetDiscount(String netDiscount) {
        this.netDiscount = netDiscount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getReciveAmount() {
        return reciveAmount;
    }

    public void setReciveAmount(String reciveAmount) {
        this.reciveAmount = reciveAmount;
    }

    public String getAdvanceAdjusted() {
        return advanceAdjusted;
    }

    public void setAdvanceAdjusted(String advanceAdjusted) {
        this.advanceAdjusted = advanceAdjusted;
    }

    public String getInvoiceBy() {
        return invoiceBy;
    }

    public void setInvoiceBy(String invoiceBy) {
        this.invoiceBy = invoiceBy;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getCashRefund() {
        return cashRefund;
    }

    public void setCashRefund(String cashRefund) {
        this.cashRefund = cashRefund;
    }

    public String getInvoiceAdjusted() {
        return invoiceAdjusted;
    }

    public void setInvoiceAdjusted(String invoiceAdjusted) {
        this.invoiceAdjusted = invoiceAdjusted;
    }

    public String getLedgerAdjusted() {
        return ledgerAdjusted;
    }

    public void setLedgerAdjusted(String ledgerAdjusted) {
        this.ledgerAdjusted = ledgerAdjusted;
    }

    public String getRefundBy() {
        return refundBy;
    }

    public void setRefundBy(String refundBy) {
        this.refundBy = refundBy;
    }

    public String getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(String refundDate) {
        this.refundDate = refundDate;
    }

    public int getTotalRefundDetail() {
        return totalRefundDetail;
    }

    public void setTotalRefundDetail(int totalRefundDetail) {
        this.totalRefundDetail = totalRefundDetail;
    }

    public int getTotalRefundMaster() {
        return totalRefundMaster;
    }

    public void setTotalRefundMaster(int totalRefundMaster) {
        this.totalRefundMaster = totalRefundMaster;
    }

    public int getTotalInvoiceDetail() {
        return totalInvoiceDetail;
    }

    public void setTotalInvoiceDetail(int totalInvoiceDetail) {
        this.totalInvoiceDetail = totalInvoiceDetail;
    }

    public int getTotalInvoiceMaster() {
        return totalInvoiceMaster;
    }

    public void setTotalInvoiceMaster(int totalInvoiceMaster) {
        this.totalInvoiceMaster = totalInvoiceMaster;
    }
    
}
