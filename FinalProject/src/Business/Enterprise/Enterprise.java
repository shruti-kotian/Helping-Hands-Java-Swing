
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.RepresentativeOrganization;
import Business.Organization.BorrowerOrganization;
import Business.Organization.FieldPartnerOrganization;
import Business.Organization.LenderOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.TrusteeOrganization;
import Business.Person.FieldPartnerContact;



/**
 *
 * @author shwetatatiya
 */
public abstract class Enterprise extends Organization{

    public static boolean containsOnlyDigits(String text) {
        try{
        long num = Long.parseLong(text.trim());           
        }
        catch(Exception e){
            return false ;
        }
        return true;
    }
    
    private EnterpriseType enterpriseType ;
    private OrganizationDirectory organizationDirectory ;
    
    public enum EnterpriseType {
        HelpingHands("HelpingHands");
        
        private String value ;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        private EnterpriseType(String value){
            this.value = value ;
        }
        
        @Override
        public String toString(){
            return value ;
        }
    }
    
    public Enterprise(String name, EnterpriseType enterpriseType){
        super(name);
        this.enterpriseType = enterpriseType ;
        this.organizationDirectory = new OrganizationDirectory();
    }

    public Enterprise() {
        super();
        this.organizationDirectory = new OrganizationDirectory();        
    }
    
    public BorrowerOrganization getBorrowerOrganization()
    {
       for(Organization organization :organizationDirectory.getOrganizationList())
       {
           if(organization instanceof BorrowerOrganization)
           return (BorrowerOrganization)organization;
       }
        
        return null;
        
    }
    public LenderOrganization getLenderOrganization()
    {
       for(Organization organization :organizationDirectory.getOrganizationList())
       {
           if(organization instanceof LenderOrganization)
           return (LenderOrganization)organization;
       }
        
        return null;
        
    }
   
    public TrusteeOrganization getTrusteeOrganization()
    {
       for(Organization organization :organizationDirectory.getOrganizationList())
       {
           if(organization instanceof TrusteeOrganization)
           return (TrusteeOrganization)organization;
       }
        
        return null;
        
    }
    public RepresentativeOrganization getRepresentativeOrganization()
    {
       for(Organization organization :organizationDirectory.getOrganizationList())
       {
           if(organization instanceof RepresentativeOrganization)
           return (RepresentativeOrganization)organization;
       }
        
        return null;
        
    }
    public FieldPartnerOrganization getFieldPartnerFromContact(FieldPartnerContact fieldPartnerContact) {
        
        for(Organization organization : organizationDirectory.getOrganizationList()){
            if(organization instanceof FieldPartnerOrganization){
                if(organization.isMember(fieldPartnerContact)){
                    FieldPartnerOrganization fieldPartnerOrg = (FieldPartnerOrganization) organization;
                    return fieldPartnerOrg;
                };
            }
        }
        return null;
    
    }
    
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
   
    
    
}
