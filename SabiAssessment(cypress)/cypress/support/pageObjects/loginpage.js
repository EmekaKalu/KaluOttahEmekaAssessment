class loginPage{
    getPhoneNumberField(){
       return cy.get('input[name=phoneNumber]')
    }
    getContinuebtn(){
        return cy.get('button[type=submit]')
    }
    getInputPin(){
        return cy.get('input#1')
    }
    getLoginbtn(){
        return cy.get('button[type=submit]')
    }
}
export default loginPage