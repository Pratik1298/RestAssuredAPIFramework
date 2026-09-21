package ToolShopAPIModels.Request;

public class UserRequest {
    private  String first_name;
    private  String last_name;
    private  String dob;
    private  String password;
    private  String email;

    public UserRequest(String first_name, String last_name, String dob, String password, String email, String s) {
        this.first_name = first_name;
        this.last_name = last_name;
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
        return "UserRequest{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", dob='" + dob + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static class Builder{  // inner class of registerrequest class
        private  String first_name;
        private  String last_name;
        private  String phone;
        private  String dob;
        private  String password;
        private  String email;

        public UserRequest.Builder first_name(String first_name){ // create the method of instances variable
            this.first_name = first_name; // setting the value
            return this;   // return the current object
        }

        public UserRequest.Builder last_name(String last_name){
            this.last_name = last_name;
            return this;   // return the current object
        }

        public UserRequest.Builder phone(String phone){
            this.phone = phone;
            return this;   // return the current object
        }

        public UserRequest.Builder dob(String dob){
            this.dob = dob;
            return this;   // return the current object
        }
        public UserRequest.Builder password(String password){
            this.password = password;
            return this;   // return the current object
        }
        public UserRequest.Builder email(String email){
            this.email = email;
            return this;   // return the current object
        }

        public UserRequest build(){ // It will create object of registerRequest
            return new UserRequest(first_name,last_name, phone, dob, password, email);
        }
    }
}
