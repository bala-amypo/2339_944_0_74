package com.example.demo.newentity;
import jakarta.presistence.*;
import jakarta.Validation.constraints.*;
public class StudentValidation{
    @Id
    @GeneratedValue(stargery=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message="No permission for outing")
    private string name;
    @NotBlank(message="Should not contain space")
    @Email(message="Invalid fromat")
    private string email;
    public StudentValidation(Long id,@)
}