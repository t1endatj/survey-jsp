
package com.mycompany.survey.resources;

/**
 *
 * @author PC
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String source;
    private boolean announcements;
    private boolean emailAnnouncements;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        source = "";
        contact = "";
    }
    public User(String firstName, String lastName, String email,
                String dateOfBirth, String source,
                boolean announcements, boolean emailAnnouncements,
                String contact) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.source = source;
        this.announcements = announcements;
        this.emailAnnouncements = emailAnnouncements;
        this.contact = contact;
    }
  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

   
    public boolean isAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(boolean announcements) {
        this.announcements = announcements;
    }


    public boolean isEmailAnnouncements() {
        return emailAnnouncements;
    }

    public void setEmailAnnouncements(boolean emailAnnouncements) {
        this.emailAnnouncements = emailAnnouncements;
    }

  
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}