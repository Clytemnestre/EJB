/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import javax.ejb.Stateless;

/**
 *
 * @author ipd
 */
@Stateless
public class TestEJB implements TestEJBRemote {

    @Override
    public String sayHello(String name) {
        return String.format("hi %s, nice to meet you!", name);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
