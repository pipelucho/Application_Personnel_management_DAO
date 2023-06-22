/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class employee {
    private int numberID;
    private int idType;
    private String name1;
    private String name2;
    private String surname1;
    private String surname2;
    private int idMaritalStatus;
    private int idGender;
    private String address;
    private String phone;
    private String birthDate;

    public employee() {
    }

    public employee(int numberID, int idType, String name1, String name2, String surname1, String surname2, int idMaritalStatus, int idGender, String address, String phone, String birthDate) {
        this.numberID = numberID;
        this.idType = idType;
        this.name1 = name1;
        this.name2 = name2;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.idMaritalStatus = idMaritalStatus;
        this.idGender = idGender;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdTyp(int idType) {
        this.idType = idType;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public int getIdMaritalStatus() {
        return idMaritalStatus;
    }

    public void setIdMaritalStatus(int idMaritalStatus) {
        this.idMaritalStatus = idMaritalStatus;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}

