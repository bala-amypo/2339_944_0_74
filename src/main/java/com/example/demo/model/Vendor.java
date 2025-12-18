package com.example.demo.entity;
import jakarta.persistence.*;
import jakarta.validation.constranints.*;
@Vendor
@Table(name="Student")

public class Vendor{
    private Long id;
    private String vendorName;
    private String contactEmail;
    private String address;
    private LocalDateTime createdAt;
    public class vendor(){

    }
    public vendor(Long id,String vendorName,String contactEmail,String address,LocalDateTime createdAt){
        this.id=id;
        this.vendorName=vendorName;
        this.contactEmail=contactEmail;
        this.address=address;
        this.createdAt=createdAt;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVendorName(){
        return vendorName;
    }
    public void setVendorName(String VendorName){
        this.vendorName=vendorName;
    }
    public String getContactEmail(){
        return vendorName;
    }
    public void setContactEmail(String ContactEmail){
        this.contactEmail=contactEmail;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String Address){
        this.contactEmail=contactEmail;

}