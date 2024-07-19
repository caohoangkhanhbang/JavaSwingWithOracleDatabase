
package Class;

public class UserInSys {
    private String USERNAME;
    private String CREATED;
    private String EXPIRY_DATE;
    private String ACCOUNT_STATUS;
    private String LAST_LOGIN;
    private String PROFILE;

    public UserInSys() {
    }

    public UserInSys(String USERNAME, String CREATED, String EXPIRY_DATE, String ACCOUNT_STATUS, String LAST_LOGIN, String PROFILE) {
        this.USERNAME = USERNAME;
        this.CREATED = CREATED;
        this.EXPIRY_DATE = EXPIRY_DATE;
        this.ACCOUNT_STATUS = ACCOUNT_STATUS;
        this.LAST_LOGIN = LAST_LOGIN;
        this.PROFILE = PROFILE;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getCREATED() {
        return CREATED;
    }

    public void setCREATED(String CREATED) {
        this.CREATED = CREATED;
    }

    public String getEXPIRY_DATE() {
        return EXPIRY_DATE;
    }

    public void setEXPIRY_DATE(String EXPIRY_DATE) {
        this.EXPIRY_DATE = EXPIRY_DATE;
    }

    public String getACCOUNT_STATUS() {
        return ACCOUNT_STATUS;
    }

    public void setACCOUNT_STATUS(String ACCOUNT_STATUS) {
        this.ACCOUNT_STATUS = ACCOUNT_STATUS;
    }

    public String getLAST_LOGIN() {
        return LAST_LOGIN;
    }

    public void setLAST_LOGIN(String LAST_LOGIN) {
        this.LAST_LOGIN = LAST_LOGIN;
    }

    public String getPROFILE() {
        return PROFILE;
    }

    public void setPROFILE(String PROFILE) {
        this.PROFILE = PROFILE;
    }
    
    
}
