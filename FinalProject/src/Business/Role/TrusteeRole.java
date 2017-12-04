/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpingHandsEnterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.TrusteeRole.TrusteeWorkAreaJPanel;

/**
 *
 * @author shwetatatiya
 */
public class TrusteeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Employee employee = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                employee = (Employee) person ;
                break ;
            }
        }               
        return new TrusteeWorkAreaJPanel(userProcessContainer, (HelpingHandsEnterprise)enterprise, account, employee);
    }

    public TrusteeRole() {
        super(Role.RoleType.Trustee);
    }
    
}
