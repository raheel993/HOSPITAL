/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Development.Controller;

import Development.BO.DailyServicesBO;
import Development.Handler.DailyServicesHandler;
import java.util.List;

/**
 *
 * @author Raheel Ansari
 */
public class DailyServicesController {
    
    DailyServicesHandler hdlDailyServices = new DailyServicesHandler();
    
    public List<DailyServicesBO> locWiseDept(String locId, String fromDate, String toDate){
        return hdlDailyServices.locWiseDept(locId, fromDate, toDate);
    }
    
    public List<DailyServicesBO> deptWiseSec(String deptId, String locId, 
            String fromDate, String toDate){
        return hdlDailyServices.deptWiseSec(deptId,locId, fromDate, toDate);
    }
    
    public List<DailyServicesBO> sectionWiseServices(String secId, 
                    String fromDate, String toDate){
    
        return hdlDailyServices.sectionWiseServices(secId, fromDate, toDate);
    }
    
    public List<DailyServicesBO> cptWisePatInfo(DailyServicesBO objds){
        return hdlDailyServices.cptWisePatInfo(objds);
    }
}
