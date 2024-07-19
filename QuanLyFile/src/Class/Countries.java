/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

public class Countries {
    public String countriesID;
    public String countriesName;

    public Countries(){}
    public Countries(String countriesID, String countriesName) {
        this.countriesID = countriesID;
        this.countriesName = countriesName;
    }

    public String getCountriesID() {
        return countriesID;
    }

    public void setCountriesID(String countriesID) {
        this.countriesID = countriesID;
    }

    public String getCountriesName() {
        return countriesName;
    }

    public void setCountriesName(String countriesName) {
        this.countriesName = countriesName;
    }
}
