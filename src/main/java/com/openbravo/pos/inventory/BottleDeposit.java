/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.inventory;

import com.openbravo.pos.forms.DataLogicSystem;

/**
 *
 * @author aakash
 */
public class BottleDeposit {
    double dVal;
    
    public BottleDeposit(DataLogicSystem dlSystem) {
        dVal = Double.parseDouble(dlSystem.getResourceAsText("BottleDeposit"));
        
    }

    public double getDepositRate(){
        return dVal;
    }
    
}
