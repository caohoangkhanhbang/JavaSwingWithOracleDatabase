
package Class;


public class AuditUpdateUser {
    private String UNAME;
    private String DATE_UPDATE;
    private String IP_ADDRESS;
    private String CONTENT_UPDATE;

    public AuditUpdateUser() {
    }

    public AuditUpdateUser(String UNAME, String DATE_UPDATE, String IP_ADDRESS, String CONTENT_UPDATE) {
        this.UNAME = UNAME;
        this.DATE_UPDATE = DATE_UPDATE;
        this.IP_ADDRESS = IP_ADDRESS;
        this.CONTENT_UPDATE = CONTENT_UPDATE;
    }

    public String getUNAME() {
        return UNAME;
    }

    public void setUNAME(String UNAME) {
        this.UNAME = UNAME;
    }

    public String getDATE_UPDATE() {
        return DATE_UPDATE;
    }

    public void setDATE_UPDATE(String DATE_UPDATE) {
        this.DATE_UPDATE = DATE_UPDATE;
    }

    public String getIP_ADDRESS() {
        return IP_ADDRESS;
    }

    public void setIP_ADDRESS(String IP_ADDRESS) {
        this.IP_ADDRESS = IP_ADDRESS;
    }

    public String getCONTENT_UPDATE() {
        return CONTENT_UPDATE;
    }

    public void setCONTENT_UPDATE(String CONTENT_UPDATE) {
        this.CONTENT_UPDATE = CONTENT_UPDATE;
    }
    
    
}
