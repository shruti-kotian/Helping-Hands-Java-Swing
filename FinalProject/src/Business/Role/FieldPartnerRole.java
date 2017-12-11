/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpingHandsEnterprise;
import Business.Organization.Organization;
import Business.Person.FieldPartnerContact;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.FieldPartnerRole.FieldPartnerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shwetatatiya
 */
public class FieldPartnerRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        FieldPartnerContact fieldPartnerContact = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                fieldPartnerContact = (FieldPartnerContact) person ;
                break ;
            }
        }                
        return new FieldPartnerWorkAreaJPanel(userProcessContainer, (HelpingHandsEnterprise)enterprise, fieldPartnerContact);
    }

    public FieldPartnerRole() {
        super(Role.RoleType.FieldPartner);
    }
}
