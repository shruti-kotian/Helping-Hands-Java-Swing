/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Trustee.getValue())){
            organization = new TrusteeOrganization("Trustee Organization", Type.Trustee);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Representative.getValue())){
            organization = new RepresentativeOrganization("Representative Organization", Type.Representative);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lender.getValue())){
            organization = new LenderOrganization("Lender Organization", Type.Lender);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Borrower.getValue())){
            organization = new BorrowerOrganization("Borrower Organization", Type.Borrower);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FieldPartner.getValue())){
            organization = new FieldPartnerOrganization("FieldPartner Organization", Type.FieldPartner);
            organizationList.add(organization);
        }   
        return organization;
    }
}