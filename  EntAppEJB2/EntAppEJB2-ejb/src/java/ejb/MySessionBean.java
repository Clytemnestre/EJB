/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author ipd
 */
@Stateless
public class MySessionBean implements MySessionBeanRemote {

    @Override
    public String getResult() {
        return "This is My Session Bean";
    }

    
}
