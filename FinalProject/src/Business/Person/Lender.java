/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;


/**
 *
 * @author shwetatatiya
 */
public class Lender extends Person{
    private String email ;
    private String phone ;
 

    public Lender() {
     //no need to instantiate accountManagement or basket here
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
