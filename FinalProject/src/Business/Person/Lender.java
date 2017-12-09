<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Finance.AccountManagement;
import Business.Finance.MoneyBasket;

/**
 *
 * @author shwetatatiya
 */
public class Lender extends ExternalPlayer{
    
    private String email ;
    private String phone ;
    private AccountManagement accountManagement ;
    private MoneyBasket moneyBasket ;

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

    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    public MoneyBasket getMoneyBasket() {
        return moneyBasket;
    }

    public void setMoneyBasket(MoneyBasket moneyBasket) {
        this.moneyBasket = moneyBasket;
    }

    
    
    public MoneyBasket getCurrentBasket(){
        if (moneyBasket == null){
            this.moneyBasket = new MoneyBasket();
            return moneyBasket;
        }else{
            return moneyBasket ;
        }
    }

    public void subtractCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() - amount);
    }
    
    public void addCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() + amount);
    }    
    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Finance.AccountManagement;
import Business.Finance.MoneyBasket;

/**
 *
 * @author shwetatatiya
 */
public class Lender extends ExternalPlayer{
    
    private String email ;
    private String phone ;
    private AccountManagement accountManagement ;
    private MoneyBasket moneyBasket ;

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

    public AccountManagement getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(AccountManagement accountManagement) {
        this.accountManagement = accountManagement;
    }

    public MoneyBasket getMoneyBasket() {
        return moneyBasket;
    }

    public void setMoneyBasket(MoneyBasket moneyBasket) {
        this.moneyBasket = moneyBasket;
    }

    
    
    public MoneyBasket getCurrentBasket(){
        if (moneyBasket == null){
            this.moneyBasket = new MoneyBasket();
            return moneyBasket;
        }else{
            return moneyBasket ;
        }
    }

    public void subtractCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() - amount);
    }
    
    public void addCredit(int amount) {
        this.getAccountManagement().setAvailableCredit(this.getAccountManagement().getAvailableCredit() + amount);
    }    
    
    
}
>>>>>>> af34ed33afe02d02fcfff7c38a087698480dbbfc
