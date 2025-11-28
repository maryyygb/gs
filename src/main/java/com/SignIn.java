package com;

import java.util.*;

public class SignIn {
    private String name;
    private String email;
    private String password;

    private int idRole;
    private String roleName;

    // private int emailId;
    // private boolean checkEmail;

    // private int passId;
    // private boolean checkPass;

    private boolean approval;

    // ADMIN
    public ArrayList<String> adminEmails;
    private ArrayList<String> adminPasswords;

    // CUSTOMER
    public ArrayList<String> customerEmails;
    private ArrayList<String> customerPasswords;

    // CLERK
    public ArrayList<String> clerkEmails;
    private ArrayList<String> clerkPasswords;

    // constructor
    public SignIn() {
        // ADMIN
        adminEmails = new ArrayList<>();
        adminPasswords = new ArrayList<>();

        // CUSTOMER
        customerEmails = new ArrayList<>();
        customerPasswords = new ArrayList<>();

        // CLERK
        clerkEmails = new ArrayList<>();
        clerkPasswords = new ArrayList<>();

        adminEmails.add("new@admin.com");
        adminEmails.add("mary@admin.com");
        adminEmails.add("haggrid@admin.com");
        adminEmails.add("mendez@admin.com");
        adminEmails.add("access@admin.com");
        adminEmails.add("1@.");
        adminEmails.add("1");

        customerEmails.add("new@customer.com");
        customerEmails.add("mary@customer.com");
        customerEmails.add("haggrid@customer.com");
        customerEmails.add("mendez@customer.com");
        customerEmails.add("access@customer.com");
        customerEmails.add("2@.");
        customerEmails.add("2");

        clerkEmails.add("new@clerk.com");
        clerkEmails.add("mary@clerk.com");
        clerkEmails.add("haggrid@clerk.com");
        clerkEmails.add("mendez@clerk.com");
        clerkEmails.add("access@clerk.com");
        clerkEmails.add("3@.");
        clerkEmails.add("3");
    }

    // to display the right menu for each role
    public boolean connect() {
        if (this.approval == true) {
            return true;
        } else {
            return false;
        }
    }

    // ADMIN SIGN IN
    public void adminSignIn() {
        Scanner s = new Scanner(System.in);
        String i1;
        String i2;
        String i3;

        System.out.println("===== ADMIN =====");
        System.out.println("");

        System.out.println(" == Please type your name. == ");
        i1 = s.nextLine();
        System.out.println("");

        System.out.println(" == Enter your Email. == ");
        i2 = s.nextLine();
        System.out.println("");

        while (true) {

            if (i2.contains("@") || i2.contains(".") || this.checkEmailActive(i2) == true) {

                System.out.println(" == Enter your Password. == ");
                i3 = s.nextLine();
                System.out.println("");

                while (true) {

                    if (i3.length() == 8 || this.checkPasswordActive(i3) == true) {

                        // Then check if the password match to the registered account of the admin
                        this.approval = true;

                        break;

                    } else {
                        System.out.println("Password must be at least 8 character or must be correct.");
                        System.out.println(" == Please enter your Password again. == ");
                        i3 = s.nextLine();
                        System.out.println("");

                    }

                }
                break;

            } else {
                System.out.println("Your Email should contain @ sign and a period.");
                System.out.println(" == Please type your email again. == ");
                i2 = s.nextLine();
                System.out.println("");

            }
        }

        setCredentials(i1, i2, i3);
    }

    // Checker for ADMIN ROLE
    // CHECK EMAIL ADMIN
    public boolean checkEmailActive(String em) {

        if (adminEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD ADMIN
    public boolean checkPasswordActive(String password) {
        adminPasswords.add("12345678");
        adminPasswords.add("mary1111");
        adminPasswords.add("22222222");
        adminPasswords.add("33333333");
        adminPasswords.add("accessAdmin");
        adminPasswords.add("11111111");
        adminPasswords.add("1");

        if (adminPasswords.contains(password)) {
            return true;
        } else {
            return false;
        }
    }

    // CUSTOMER SIGN IN
    public void customerSignIn() {
        Scanner s = new Scanner(System.in);
        String i1;
        String i2;
        String i3;

        System.out.println("===== CUSTOMER =====");
        System.out.println("");

        System.out.println(" == Please type your name. == ");
        i1 = s.nextLine();
        System.out.println("");

        System.out.println(" == Enter your Email. == ");
        i2 = s.nextLine();
        System.out.println("");

        while (true) {

            if (i2.contains("@") || i2.contains(".") || this.checkEmailActiveC(i2) == true) {

                System.out.println(" == Enter your Password. == ");
                i3 = s.nextLine();
                System.out.println("");

                while (true) {

                    if (i3.length() == 8 || this.checkPasswordActiveC(i3) == true) {
                        // Then check if the password match to the registered account of the admin
                        this.approval = true;
                        break;
                    } else {
                        System.out.println("Password must be at least 8 character or must be correct.");
                        System.out.println(" == Please enter your Password again. == ");
                        i3 = s.nextLine();
                        System.out.println("");
                    }
                }
                break;
            } else {
                System.out.println("Your Email should contain @ sign and a period.");
                System.out.println(" == Please type your email again. == ");
                i2 = s.nextLine();
                System.out.println("");
            }
        }
        setCredentials(i1, i2, i3);
    }

    // CHECKER FOR CUSTOMER
    // EMAIL CHECKER AUTH FOR CUSTOMERS
    public boolean checkEmailActiveC(String em) {

        if (customerEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD CUSTOMER
    public boolean checkPasswordActiveC(String password) {
        customerPasswords.add("12345678");
        customerPasswords.add("mary1111");
        customerPasswords.add("22222222");
        customerPasswords.add("33333333");
        customerPasswords.add("accessAdmin");
        customerPasswords.add("22222222");
        customerPasswords.add("2");

        if (customerPasswords.contains(password)) {
            return true;
        } else {
            return false;
        }
    }

    // CLERK SIGN IN
    public void clerkSignIn() {
        Scanner s = new Scanner(System.in);
        String i1;
        String i2;
        String i3;

        System.out.println("===== CLERKS' SIGN IN =====");
        System.out.println("");

        System.out.println(" == Please type your name. == ");
        i1 = s.nextLine();
        System.out.println("");

        System.out.println(" == Enter your Email. == ");
        i2 = s.nextLine();
        System.out.println("");

        while (true) {

            if (i2.contains("@") || i2.contains(".") || this.checkEmailActiveI(i2) == true) {

                System.out.println(" == Enter your Password. == ");
                i3 = s.nextLine();
                System.out.println("");

                while (true) {

                    if (i3.length() == 8 || this.checkPasswordActiveI(i3) == true) {
                        // Then check if the password match to the registered account of the admin
                        this.approval = true;
                        break;
                    } else {
                        System.out.println("Password must be at least 8 character or must be correct.");
                        System.out.println(" == Please enter your Password again. == ");
                        i3 = s.nextLine();
                        System.out.println("");
                    }
                }
                break;
            } else {
                System.out.println("Your Email should contain @ sign and a period.");
                System.out.println(" == Please type your email again. == ");
                i2 = s.nextLine();
                System.out.println("");
            }
        }
        setCredentials(i1, i2, i3);
    }

    // CHECKER FOR CLERK
    // CHECK EMAIL CLERK
    public boolean checkEmailActiveI(String em) {
        if (clerkEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD CLERK
    public boolean checkPasswordActiveI(String password) {
        clerkPasswords.add("12345678");
        clerkPasswords.add("mary1111");
        clerkPasswords.add("22222222");
        clerkPasswords.add("33333333");
        clerkPasswords.add("accessAdmin");
        clerkPasswords.add("33333333");
        clerkPasswords.add("3");

        if (clerkPasswords.contains(password)) {
            return true;
        } else {
            return false;
        }
    }

    // Setting Credentials to be accessible outside the class
    public void setCredentials(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setIdRole(int id) {
        this.idRole = id;
    }

    public int getIdRole() {
        return this.idRole;
    }

    public void setRole(String role) {
        this.roleName = role;
    }

    public String getRole() {
        return this.roleName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // DISPLAY EMAIL LIST OF DIFFERENT ROLES
    public void getCustomersEmails() {
        System.out.println("LIST OF CUSTOMERS' EMAILS");
        System.out.println("");

        System.out.printf("%-5s %-15s%n", "ID", "Emails");
        System.out.println("");

        for (int i = 0; i < customerEmails.size(); i++) {
            System.out.printf("%-5s %-15s%n", i, customerEmails.get(i));
        }
    }

    public void getAdminEmails() {
        System.out.println("LIST OF ADMINS' EMAILS");
        System.out.println("");

        System.out.printf("%-5s %-15s%n", "ID", "Emails");
        System.out.println("");

        for (int i = 0; i < adminEmails.size(); i++) {
            System.out.printf("%-5s %-15s%n", i, adminEmails.get(i));
        }
    }

    public void getClerkEmails() {
        System.out.println("LIST OF CLERKS' EMAILS");
        System.out.println("");

        System.out.printf("%-5s %-15s%n", "ID", "Emails");
        System.out.println("");

        for (int i = 0; i < clerkEmails.size(); i++) {
            System.out.printf("%-5s %-15s%n", i, clerkEmails.get(i));
        }
    }

    // ADDING NEW USERS' EMAILS AND PASSWORDS
    public void addNewAdmin(String em, String pass) {
        this.adminEmails.add(em);
        this.adminPasswords.add(pass);
    }

    public void addNewCustomer(String em, String pass) {
        this.customerEmails.add(em);
        this.customerPasswords.add(pass);
    }

    public void addNewClerk(String em, String pass) {
        this.clerkEmails.add(em);
        this.clerkPasswords.add(pass);
    }

}
