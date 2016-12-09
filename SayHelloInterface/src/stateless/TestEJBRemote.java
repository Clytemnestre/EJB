/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateless;

import javax.ejb.Remote;

/**
 *
 * @author ipd
 */
@Remote
public interface TestEJBRemote {
    
    String sayHello(String name);
    
}
