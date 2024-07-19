
package Class;

public class File {
    public String F_ID;
    public String F_NAME;
    public String F_TYPE;
    public String F_SIZE;
    public String F_DATECREATE;
    public String F_DATECHANGE;
    public String F_DESCRIPTION;
    public String F_PATH;
    public String F_ISDELETED;

    public File(String F_ID, String F_NAME, String F_TYPE, String F_SIZE, String F_DATECREATE, String F_DATECHANGE, String F_DESCRIPTION, String F_PATH, String F_ISDELETED) {
        this.F_ID = F_ID;
        this.F_NAME = F_NAME;
        this.F_TYPE = F_TYPE;
        this.F_SIZE = F_SIZE;
        this.F_DATECREATE = F_DATECREATE;
        this.F_DATECHANGE = F_DATECHANGE;
        this.F_DESCRIPTION = F_DESCRIPTION;
        this.F_PATH = F_PATH;
        this.F_ISDELETED = F_ISDELETED;
    }
    
    public File(){}

    public String getF_ID() {
        return F_ID;
    }

    public void setF_ID(String F_ID) {
        this.F_ID = F_ID;
    }

    public String getF_NAME() {
        return F_NAME;
    }

    public void setF_NAME(String F_NAME) {
        this.F_NAME = F_NAME;
    }

    public String getF_TYPE() {
        return F_TYPE;
    }

    public void setF_TYPE(String F_TYPE) {
        this.F_TYPE = F_TYPE;
    }

    public String getF_SIZE() {
        return F_SIZE;
    }

    public void setF_SIZE(String F_SIZE) {
        this.F_SIZE = F_SIZE;
    }

    public String getF_DATECREATE() {
        return F_DATECREATE;
    }

    public void setF_DATECREATE(String F_DATECREATE) {
        this.F_DATECREATE = F_DATECREATE;
    }

    public String getF_DATECHANGE() {
        return F_DATECHANGE;
    }

    public void setF_DATECHANGE(String F_DATECHANGE) {
        this.F_DATECHANGE = F_DATECHANGE;
    }

    public String getF_DESCRIPTION() {
        return F_DESCRIPTION;
    }

    public void setF_DESCRIPTION(String F_DESCRIPTION) {
        this.F_DESCRIPTION = F_DESCRIPTION;
    }

    public String getF_PATH() {
        return F_PATH;
    }

    public void setF_PATH(String F_PATH) {
        this.F_PATH = F_PATH;
    }

    public String getF_ISDELETED() {
        return F_ISDELETED;
    }

    public void setF_ISDELETED(String F_ISDELETED) {
        this.F_ISDELETED = F_ISDELETED;
    }
            
}
