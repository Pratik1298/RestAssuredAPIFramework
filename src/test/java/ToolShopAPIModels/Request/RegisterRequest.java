package ToolShopAPIModels.Request;

public class RegisterRequest {

        private  String first_name;  //Instance variables are the fields declared inside a class (but outside any method) that belong to each individual object (instance) created from that class. Each object gets its own copy of these variables, with its own values.
        private  String last_name;    //Because every time you create a new object (new UserRequest(...)), you get a fresh, independent set of these values:
        private  String phone;
        private  String dob;
        private  String password;
        private  String email;

    public RegisterRequest(String first_name, String last_name, String phone, String dob, String password, String email) {
        this.first_name = first_name;   //The this keyword is what tells Java "assign to the object's own field," not the local parameter of the same name.
        this.last_name = last_name;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{  // inner class of registerrequest class
        private  String  first_name;
        private  String last_name;
        private  String phone;
        private  String dob;
        private  String password;
        private  String email;

        public Builder first_name(String first_name){ // create the method of instances variable
            this.first_name = first_name; // setting the value
            return this;   // return the current object
        }

        public Builder last_name(String last_name){
            this.last_name = last_name;
            return this;   // return the current object
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;   // return the current object
        }

        public Builder dob(String dob){
            this.dob = dob;
            return this;   // return the current object
        }
        public Builder password(String password){
            this.password = password;
            return this;   // return the current object
        }
        public Builder email(String email){
            this.email = email;
            return this;   // return the current object
        }

        public RegisterRequest build(){ // It will create object of registerRequest
            RegisterRequest registerRequest = new RegisterRequest(first_name,last_name, phone, dob, password, email);
            return registerRequest;
        }
    }



}

