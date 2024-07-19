
package Class;


public class LogOn {
    public String u_id;
    public String u_date;
    public String action;

    public LogOn() {
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_date() {
        return u_date;
    }

    public void setU_date(String u_date) {
        this.u_date = u_date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LogOn(String u_id, String u_date, String action) {
        this.u_id = u_id;
        this.u_date = u_date;
        this.action = action;
    }
    
}
