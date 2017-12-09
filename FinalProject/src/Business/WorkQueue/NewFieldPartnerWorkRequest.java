/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FieldPartner.GeneralInformation;
import Business.FieldPartner.PerformanceInformation;
import Business.Person.FieldPartnerContact;

/**
 *
 * @author shwetatatiya
 */
public class NewFieldPartnerWorkRequest extends WorkRequest{
     private GeneralInformation generalInformation ;
    private PerformanceInformation performanceInformation ;
    private FieldPartnerContact fieldPartnerContact ;
    private Status status ;

    @Override
    public String getNameOfRelevantOrg() {
        return generalInformation.getOrgName();
    }
    
    public enum Status{
        NewFieldPartner("New Field Partner"),
        AnalystRated("Analyst Rated"),
        TrusteeApproved("Trustee Approved"),
        TrusteeRejected("Trustee Rejected"),
        Complete("Complete") ;
        
        private String value ;
        
        Status(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return this.getValue();
        }
        
        
    }

    public NewFieldPartnerWorkRequest(GeneralInformation generalInformation, PerformanceInformation performanceInformation, FieldPartnerContact fieldPartnerContact) {
        super();
        this.generalInformation = generalInformation;
        this.performanceInformation = performanceInformation;
        this.fieldPartnerContact = fieldPartnerContact;
        status = NewFieldPartnerWorkRequest.Status.NewFieldPartner ;
    }

    public NewFieldPartnerWorkRequest() {
        super();
        status = NewFieldPartnerWorkRequest.Status.NewFieldPartner ;        
    }

    public GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public PerformanceInformation getPerformanceInformation() {
        return performanceInformation;
    }

    public void setPerformanceInformation(PerformanceInformation performanceInformation) {
        this.performanceInformation = performanceInformation;
    }
    


  

    public FieldPartnerContact getFieldPartnerContact() {
        return fieldPartnerContact;
    }

    public void setFieldPartnerContact(FieldPartnerContact fieldPartnerContact) {
        this.fieldPartnerContact = fieldPartnerContact;
    }


    @Override
    public String getStatus() {
        return status.getValue();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public String toString()
    {
        return generalInformation.getOrgName();
    }
           
}
