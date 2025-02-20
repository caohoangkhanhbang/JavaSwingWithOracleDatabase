
package Class;

import java.util.logging.Logger;

public class User {
    private String u_id;
    private String u_name;
    private String u_phone;
    private String u_image;

    public User() {
    }

    public User(String u_id, String u_name, String u_phone, String u_image) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_phone = u_phone;
        this.u_image = u_image;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getU_image() {
        return u_image;
    }

    public void setU_image(String u_image) {
        this.u_image = u_image;
    }
    
    
}
