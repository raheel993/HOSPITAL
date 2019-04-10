/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development.Controller;

import Development.BO.ModalityAnalyzer;
import Development.Handler.ModalityAnalyzerHandler;
import java.util.List;
import utilities.Constants;

public class ModalityAnalyzerController {

    ModalityAnalyzerHandler hdlMac = new ModalityAnalyzerHandler();

    public List<ModalityAnalyzer> selectMachine(String macName, String locId,
            String deptId, String secId, String machineType) {
        return hdlMac.selectMachine(macName, locId, deptId, secId, machineType);
    }

    public List<ModalityAnalyzer> selectSectionWiseMachine(String macName) {
        return hdlMac.selectSectionWiseMachine(macName);
    }

    public boolean UpdateMachineInfo(ModalityAnalyzer obj) {

        boolean ret = true;

        if (ret) {
            ret = hdlMac.updateMachineInfo(obj);
        }

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean deleteSectionWiseMachine(ModalityAnalyzer obj) {

        boolean ret = true;

        if (ret) {
            ret = hdlMac.deleteSectionWiseMachine(obj);
        }

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean insertMachineRegister(ModalityAnalyzer obj) {

        boolean ret = hdlMac.insertMachineRegister(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

    public boolean insertSectionWiseMachine(ModalityAnalyzer obj) {

        boolean ret = hdlMac.insertSectionWiseMachine(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }

}
