/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FieldPartner.GeneralInformation;
import Business.FieldPartner.PerformanceInformation;
import Business.Finance.AccountManagement;
import Business.Role.FieldPartnerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class FieldPartnerOrganization extends ExternalOrganization {
    private GeneralInformation generalInformation ;
    private PerformanceInformation performanceInformation ;
    private AccountManagement accountManagement ;

    public FieldPartnerOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new FieldPartnerRole()) ;
        return roleList ;
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public PerformanceInformation getPerformanceInformation() {
        return performanceInformation;
    }

    public void setPerformanceInformation(PerformanceInformation performanceInformation) {
        this.performanceInformation = performanceInformation;
    }


    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }
    
    @Override
    public String toString(){
        return this.getGeneralInformation().getOrgName() ;
    }
    
    public AccountManagement createAccountManagement() {
        AccountManagement accountManagement = new AccountManagement();
        this.setAccountManagement(accountManagement);
        return accountManagement ;
    }
    
}
