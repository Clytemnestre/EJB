
package shout.ejb;

import java.io.Serializable;
import java.util.Date;

public class Shout implements Serializable {
    
    // variable declaration
    public String name;
    public String shout;
    public Date date;

    // constructor
    public Shout(String name, String shout, Date date) {
        this.name = name;
        this.shout = shout;
        this.date = date;
    }
}
