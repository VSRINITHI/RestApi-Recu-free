package com.example.freelancerfinder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ff {
    @Id
    String name;
    String email;
    String country;
    String phoneNumber;
    String jobTitle;
    String fieldOfExpertise;
    String yearsOfExperience;
    String specialization;
    String linkedInProfile;
    String gitHubProfile;
    String certifications;
    String companiesWorkedFor;
    String rolesHeld;
    String resume;
    String typeOfWork;
    String availability;
    String prefferedPaymentMethod;
    public Ff()
    {
        
    }
    public Ff(String name, String email, String country, String phoneNumber, String jobTitle, String fieldOfExpertise,
            String yearsOfExperience, String specialization, String linkedInProfile, String gitHubProfile,
            String certifications, String companiesWorkedFor, String rolesHeld, String resume, String typeOfWork,
            String availability, String prefferedPaymentMethod) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.fieldOfExpertise = fieldOfExpertise;
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
        this.linkedInProfile = linkedInProfile;
        this.gitHubProfile = gitHubProfile;
        this.certifications = certifications;
        this.companiesWorkedFor = companiesWorkedFor;
        this.rolesHeld = rolesHeld;
        this.resume = resume;
        this.typeOfWork = typeOfWork;
        this.availability = availability;
        this.prefferedPaymentMethod = prefferedPaymentMethod;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getFieldOfExpertise() {
        return fieldOfExpertise;
    }
    public void setFieldOfExpertise(String fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }
    public String getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getLinkedInProfile() {
        return linkedInProfile;
    }
    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }
    public String getGitHubProfile() {
        return gitHubProfile;
    }
    public void setGitHubProfile(String gitHubProfile) {
        this.gitHubProfile = gitHubProfile;
    }
    public String getCertifications() {
        return certifications;
    }
    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }
    public String getCompaniesWorkedFor() {
        return companiesWorkedFor;
    }
    public void setCompaniesWorkedFor(String companiesWorkedFor) {
        this.companiesWorkedFor = companiesWorkedFor;
    }
    public String getRolesHeld() {
        return rolesHeld;
    }
    public void setRolesHeld(String rolesHeld) {
        this.rolesHeld = rolesHeld;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getTypeOfWork() {
        return typeOfWork;
    }
    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public String getPrefferedPaymentMethod() {
        return prefferedPaymentMethod;
    }
    public void setPrefferedPaymentMethod(String prefferedPaymentMethod) {
        this.prefferedPaymentMethod = prefferedPaymentMethod;
    }
}
