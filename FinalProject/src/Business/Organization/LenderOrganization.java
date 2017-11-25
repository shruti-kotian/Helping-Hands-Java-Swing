/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LenderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class LenderOrganization extends Organization {

    public LenderOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new LenderRole());
        return roleList;
    }

}
