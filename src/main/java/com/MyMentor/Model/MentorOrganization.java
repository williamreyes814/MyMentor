package com.MyMentor.Model;


import javax.persistence.*;

@Entity
public class MentorOrganization {

    @Id
   @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    private String companyName;

    @Column(unique = true)
    private String email;

    private String phoneNumber;
    private String address;


    public MentorOrganization(Integer id, String companyName, String email, String phoneNumber, String address) {

            this.companyName = companyName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.id = id;
    }


    public Integer getId(Integer id) {

        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
