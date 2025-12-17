package com.example.demo.newentity;
import jakarta.presistence.*;
import jakarta.Validation.constraints.*;
public class StudentValidation{
    @Id
    @Table(name="Student")
    @GeneratedValue(stargery=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message="No permission for outing")
    private string name;
    @NotBlank(message="Should not contain space")
    @Email(message="Invalid fromat")
    private string email;
    public StudentValidation(Long id,@NotBlank(message="No permission for outing")string name,
            @NotBlank(message="Should not contain space") @Email(message="Invalid fromat")String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public StudentValidation(){
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        return name;
    }
    public Long getEmail(){
        return Email;
    }
    public void setEmail(String id){
        return email;
    }
}