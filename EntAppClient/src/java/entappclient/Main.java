/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entappclient;

import ejb.MySessionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author ipd
 */
public class Main {

    @EJB
    private static MySessionBeanRemote mySessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.err.println("result = " + mySessionBean.getResult());
    }
    
}
