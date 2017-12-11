/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Borrower;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.BorrowerRole.BorrowerWorkAreaJPanel;

/**
 *
 * @author shwetatatiya
 */
public class BorrowerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Person p = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                p = person;
                break ;
            }
        }                    
        return new BorrowerWorkAreaJPanel(userProcessContainer, enterprise, account, (Borrower) p);
    }

    public BorrowerRole() {
        super(Role.RoleType.Borrower);
    }
    
}