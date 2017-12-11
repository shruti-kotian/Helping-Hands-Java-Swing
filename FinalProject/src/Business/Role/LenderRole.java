/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Lender;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.LenderRole.LenderWorkAreaJPanel;

/**
 *
 * @author shwetatatiya
 */
public class LenderRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Person p = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                p = person;
                break ;
            }
        }                
        return new LenderWorkAreaJPanel(userProcessContainer, enterprise, account, (Lender) p);
    }

    public LenderRole() {
        super(Role.RoleType.Lender);
    }
    
}
