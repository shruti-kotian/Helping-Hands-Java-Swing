<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BorrowerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class BorrowerOrganization extends ExternalOrganization{

    public BorrowerOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new BorrowerRole()) ;
        return roleList ;
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BorrowerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class BorrowerOrganization extends ExternalOrganization{

    public BorrowerOrganization(String name, Type type) {
        super(name, type);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>() ;
        roleList.add(new BorrowerRole()) ;
        return roleList ;
    }
    
}
>>>>>>> af34ed33afe02d02fcfff7c38a087698480dbbfc
