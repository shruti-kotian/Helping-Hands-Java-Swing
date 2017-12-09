<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;

    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    private EcoSystem() {
        super();
        networkList = new ArrayList<Network>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public static boolean checkIfUserNameIsUnique(String username) {

        if (!(system.getUserAccountDirectory().checkIfUsernameIsUnique(username))) {
            return false;
        }

        for (Network network : system.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                    return false;
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                        return false;
                    }

                }

            }

        }
        return true;

    }

    public static void setSystem(EcoSystem system) {
        EcoSystem.system = system;
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;

    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    private EcoSystem() {
        super();
        networkList = new ArrayList<Network>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public static boolean checkIfUserNameIsUnique(String username) {

        if (!(system.getUserAccountDirectory().checkIfUsernameIsUnique(username))) {
            return false;
        }

        for (Network network : system.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                    return false;
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                        return false;
                    }

                }

            }

        }
        return true;

    }

    public static void setSystem(EcoSystem system) {
        EcoSystem.system = system;
    }

}
>>>>>>> af34ed33afe02d02fcfff7c38a087698480dbbfc
