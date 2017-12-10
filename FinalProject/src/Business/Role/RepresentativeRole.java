<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.RepresentativeRole.RepresentativeWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author shwetatatiya
 */
public class RepresentativeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Employee employee = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                employee = (Employee) person ;
                break ;
            }
        }
        return new RepresentativeWorkAreaJPanel(userProcessContainer, enterprise, account, employee);
    }

    public RepresentativeRole() {
       super(Role.RoleType.Representative);
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.RepresentativeRole.RepresentativeWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author shwetatatiya
 */
public class RepresentativeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Employee employee = null ;
        for(Person person : organization.getPersonDirectory().getPersonList()){
            if(person.getUserAccount() == account){
                employee = (Employee) person ;
                break ;
            }
        }
        return new RepresentativeWorkAreaJPanel(userProcessContainer, enterprise, account, employee);
    }

    public RepresentativeRole() {
       super(Role.RoleType.Representative);
    }
    
}
>>>>>>> af34ed33afe02d02fcfff7c38a087698480dbbfc
