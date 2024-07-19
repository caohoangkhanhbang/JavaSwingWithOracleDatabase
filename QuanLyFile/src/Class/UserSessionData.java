/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
public class UserSessionData {
    private static UserSessionData instance;
    private String username;
    private String sessionToKill;

    private UserSessionData() {
        
    }

    public String getSessionToKill() {
        return sessionToKill;
    }

    public void setSessionToKill(String sessionToKill) {
        this.sessionToKill = sessionToKill;
    }

    public static synchronized UserSessionData getInstance() {
        if (instance == null) {
            instance = new UserSessionData();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
