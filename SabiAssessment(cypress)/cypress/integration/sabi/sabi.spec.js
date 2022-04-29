/// <reference types= 'cypress' />

import landingPage from "../../support/pageObjects/landingpage";
import loginPage from "../../support/pageObjects/loginpage";
import homePage from "../../support/pageObjects/homepage";
import settingsPage from "../../support/pageObjects/settingpage";
import accountSettingsPage from "../../support/pageObjects/accountsettingspage";

describe('Sabi assessment test suite', () => {

    //here i stored all page objects classes into variables to call in this file 
    const landPage = new landingPage();
    const logPage = new loginPage();
    const homPage = new homePage();
    const settPage = new settingsPage();
    const acctSettPage = new accountSettingsPage();

    //in times where there are multiple test cases this before each method saves time and increases neatness of test cases by setting up methods/pre condition's for every test case 
    beforeEach(function(){
        
        cy.fixture('sabidata').then(function(data) {
            this.sdata = data
        })

        //this method call the url which has been set in cypress.json
        cy.visit(Cypress.env('sabiUrl'))
    
        //the viewport keeps the dimensions constant no matter the window size
        cy.viewport('macbook-13')
    });

    it('End to End testing ', function(){

        landPage.getLoginBtn().click
        logPage.getPhoneNumberField().type(this.sdata.number);
        logPage.getContinuebtn().click();
        logPage.getInputPin().type(this.sdata.pin);
        logPage.getLoginbtn().click();
        homPage.getMoreSection().click();
        settPage.getAccountSettings().click();
        acctSettPage.getLogoutBtn().scrollIntoView().should('be.visible').click();

    });
});