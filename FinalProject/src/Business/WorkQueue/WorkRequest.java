/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import Business.Employee.Employee;

/**
 *
 * @author shwetatatiya
 */
public abstract class WorkRequest {

    private String message;
    private String messageHistory;
    private Employee representative;
    private Employee trustee;

    public WorkRequest() {

        representative = null;
        trustee = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageHistory() {
        return messageHistory;
    }

    public void setMessageHistory(String messageHistory) {
        this.messageHistory = messageHistory;
    }

    public void pushToOrganizationWorkQueue(Organization organization) {
        organization.getWorkQueue().addWorkRequest(this);
    }

    public Employee getRepresentative() {
        return representative;
    }

    public void setRepresentative(Employee representative) {
        this.representative = representative;
    }

    public Employee getTrustee() {
        return trustee;
    }

    public void setTrustee(Employee trustee) {
        this.trustee = trustee;
    }

    public abstract String getNameOfRelevantOrg();

    public abstract String getStatus();

    @Override
    public String toString() {
        return this.getNameOfRelevantOrg();
    }

}
