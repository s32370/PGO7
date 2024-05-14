public class User {public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }
    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }
    public void upgradeToUser(String name, String lastName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.isGuest = false;
    }
}

}
