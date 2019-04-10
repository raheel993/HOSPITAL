/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Development.Controller;

import Development.BO.VerifiedReportsBO;
import Development.Handler.VerifiedReportsHandler;
import java.util.List;

/**
 *
 * @author Raheel Ansari
 */
public class VerifiedReortsController {
    
    VerifiedReportsHandler hdlVerifiedReports = new VerifiedReportsHandler();
    
    public List<VerifiedReportsBO> selectCptWiseReports(VerifiedReportsBO ObjVer) {
        return hdlVerifiedReports.selectCptWiseReports(ObjVer);
    }
    
    public List<VerifiedReportsBO> searchVerifiedReports(String patientId, 
            String PatientName) {
        return hdlVerifiedReports.selectPatReport_Verified(patientId, PatientName);
    }
    
    public List<VerifiedReportsBO> searchAllReports(String patientId, 
            String PatientName) {
        return hdlVerifiedReports.selectPatReport_All(patientId, PatientName);
    }
}
