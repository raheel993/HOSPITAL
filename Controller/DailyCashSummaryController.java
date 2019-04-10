

package Development.Controller;

import Development.BO.DailyCashSummary;
import Development.Handler.DailyCashSummaryHandler;
import java.util.List;

public class DailyCashSummaryController {
    
     DailyCashSummaryHandler selecthdl=new DailyCashSummaryHandler();
    
     public List<DailyCashSummary> getInvoiceDetail(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceDetail(dcsBO);
     }
     
     public List<DailyCashSummary> getInvoiceMaster(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceMaster(dcsBO);
     }
     
     public List<DailyCashSummary> getRefondDetail(DailyCashSummary dcsBO){
         return selecthdl.getRefundDetail(dcsBO);
     }
     
     public List<DailyCashSummary> getRefondMaster(DailyCashSummary dcsBO){
         return selecthdl.getRefundMaster(dcsBO);
     }
      
     public List<DailyCashSummary> getadvanceRecHis(DailyCashSummary dcsBO){
         return selecthdl.advanceRecHis(dcsBO);
     }
      public List<DailyCashSummary> getbalanceRecHis(DailyCashSummary dcsBO){
         return selecthdl.balanceRecHis(dcsBO);
     }
        public List<DailyCashSummary> getInvoiceDetailClient(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceDetailClient(dcsBO);
     }
     
     public List<DailyCashSummary> getInvoiceMasterClient(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceMasterClient(dcsBO);
     }  
     public List<DailyCashSummary> getInvoiceDetailCash(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceDetailCash(dcsBO);
     }
     
     public List<DailyCashSummary> getInvoiceMasterCash(DailyCashSummary dcsBO){
         return selecthdl.getInvoiceMasterCash(dcsBO);
     }
}
