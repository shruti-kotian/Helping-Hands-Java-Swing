/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }
    
    // Add enterprise
    public Enterprise createAndAddEnterprise(String name){
        HelpingHandsEnterprise helpingHandsEnterprise = new HelpingHandsEnterprise(name, Enterprise.EnterpriseType.HelpingHands);
        enterpriseList.add(helpingHandsEnterprise);
        return helpingHandsEnterprise;
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
}
