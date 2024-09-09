package company;

import java.util.Objects;

public class User {
    String name;
    int old;
    String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', old=" + old + ", phone='" + phone + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
        //return old == user.old && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
        //return Objects.hash(name, old, phone);
    }
}
