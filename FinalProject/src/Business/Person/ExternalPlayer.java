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
public class ExternalPlayer extends Person{
    
    private String address ;

    public ExternalPlayer() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
