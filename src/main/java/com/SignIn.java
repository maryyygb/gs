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
    private ArrayList<String> adminEmails;
    private ArrayList<String> adminPasswords;

    // CUSTOMER
    private ArrayList<String> customerEmails;
    private ArrayList<String> customerPasswords;

    // CLERK
    private ArrayList<String> clerkEmails;
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

        // ArrayList<String> adminEmails = new ArrayList<>();

        adminEmails.add("new@admin.com");
        adminEmails.add("mary@admin.com");
        adminEmails.add("haggrid@admin.com");
        adminEmails.add("mendez@admin.com");
        adminEmails.add("access@admin.com");
        adminEmails.add("1@.");
        adminEmails.add("1");

        // boolean emailActive = adminEmails.contains(em);

        // String validEmail = "Admin ID: " + adminEmails.indexOf(em);
        // String invalidEmail = "The user is not in the Admin List.";

        // this.emailId = adminEmails.indexOf(em);
        // this.checkEmail = adminEmails.contains(em);

        if (adminEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD ADMIN
    public boolean checkPasswordActive(String password) {
        // ArrayList<String> adminPasswords = new ArrayList<>();

        adminPasswords.add("12345678");
        adminPasswords.add("mary1111");
        adminPasswords.add("22222222");
        adminPasswords.add("33333333");
        adminPasswords.add("accessAdmin");
        adminPasswords.add("11111111");
        adminPasswords.add("1");

        // String check = "The password is for user number " +
        // adminPasswords.indexOf(password);

        /* System.out.println(check); */

        // this.passId = adminPasswords.indexOf(password);
        // this.checkPass = adminPasswords.contains(password);

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

        // ArrayList<String> customerEmails = new ArrayList<>();

        customerEmails.add("new@customer.com");
        customerEmails.add("mary@customer.com");
        customerEmails.add("haggrid@customer.com");
        customerEmails.add("mendez@customer.com");
        customerEmails.add("access@customer.com");
        customerEmails.add("2@.");
        customerEmails.add("2");

        // boolean emailActive = customerEmails.contains(em);

        // String validEmail = "Customer ID: " + customerEmails.indexOf(em);
        // String invalidEmail = "The user is not in the Customer List.";

        // this.emailId = customerEmails.indexOf(em);
        // this.checkEmail = customerEmails.contains(em);

        if (customerEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD CUSTOMER
    public boolean checkPasswordActiveC(String password) {
        // ArrayList<String> customerPasswords = new ArrayList<>();

        customerPasswords.add("12345678");
        customerPasswords.add("mary1111");
        customerPasswords.add("22222222");
        customerPasswords.add("33333333");
        customerPasswords.add("accessAdmin");
        customerPasswords.add("22222222");
        customerPasswords.add("2");

        // String check = "The password is for user number " +
        // customerPasswords.indexOf(password);

        /* System.out.println(check); */

        // this.passId = customerPasswords.indexOf(password);
        // this.checkPass = customerPasswords.contains(password);

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

        // ArrayList<String> clerkEmails = new ArrayList<>();

        clerkEmails.add("new@clerk.com");
        clerkEmails.add("mary@clerk.com");
        clerkEmails.add("haggrid@clerk.com");
        clerkEmails.add("mendez@clerk.com");
        clerkEmails.add("access@clerk.com");
        clerkEmails.add("3@.");
        clerkEmails.add("3");

        // boolean emailActive = clerkEmails.contains(em);

        // String validEmail = "Clerk's ID: " + clerkEmails.indexOf(em);
        // String invalidEmail = "The user is not in the Admin List.";

        // this.emailId = clerkEmails.indexOf(em);
        // this.checkEmail = clerkEmails.contains(em);

        if (clerkEmails.contains(em)) {
            return true;
        } else {
            return false;
        }
    }

    // CHECK PASSWORD CLERK
    public boolean checkPasswordActiveI(String password) {
        // ArrayList<String> clerkPasswords = new ArrayList<>();

        clerkPasswords.add("12345678");
        clerkPasswords.add("mary1111");
        clerkPasswords.add("22222222");
        clerkPasswords.add("33333333");
        clerkPasswords.add("accessAdmin");
        clerkPasswords.add("33333333");
        clerkPasswords.add("3");

        // String check = "The password is for user number " +
        // clerkPasswords.indexOf(password);

        /* System.out.println(check); */

        // this.passId = clerkPasswords.indexOf(password);
        // this.checkPass = clerkPasswords.contains(password);

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

}
