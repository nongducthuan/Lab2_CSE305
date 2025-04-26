public class User {
    private String userID;
    private String password;
    private String email;
    private String userType;

    public void createUser(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

}