package com.example.demo.newentity;
import jarkarata.presistence.Id;
import jarkarata.Validation.constraints.NotBlank;
public class Validation{
    @Id
    @GeneratedValue(stargery)
    private long Id
    @NotBlank(message="No permission for outing")
    private string name;
    @NotBlank(message="Should not contain space")
    @Email(message="Invalid fromat")
    private string email;
}