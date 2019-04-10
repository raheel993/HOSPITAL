/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Development.BO;

/**
 *
 * @author Raheel Ansari
 */
public class DailyServicesBO {
    
    private String departmentId = "";
    private String departmentName = "";
    private String sectionId = "";
    private String sectionName = "";
    private String patientId = "";
    private String patientName = "";
    private String cptId = "";
    private String cptName = "";
    private String statusId = "";
    private String statusName = "";
    private String trnDate = "";
    private String countCptId = "";
    private String depWiseCount = "";
    private String noOfServices = "";
    private String fromDate = "";
    private String toDate = "";

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

    public String getNoOfServices() {
        return noOfServices;
    }

    public void setNoOfServices(String noOfServices) {
        this.noOfServices = noOfServices;
    }

    public String getDepWiseCount() {
        return depWiseCount;
    }

    public void setDepWiseCount(String depWiseCount) {
        this.depWiseCount = depWiseCount;
    }

    public String getCountCptId() {
        return countCptId;
    }

    public void setCountCptId(String countCptId) {
        this.countCptId = countCptId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getCptName() {
        return cptName;
    }

    public void setCptName(String cptName) {
        this.cptName = cptName;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getTrnDate() {
        return trnDate;
    }

    public void setTrnDate(String trnDate) {
        this.trnDate = trnDate;
    }
}
