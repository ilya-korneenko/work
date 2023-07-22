package homework.hw_5.dto;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String nick;
    private String password;
    private String name;

    public String getPassword(){
        return this.password;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException{
        out.writeUTF(name);
        out.writeUTF(nick);
        out.writeUTF(password);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        name = in.readUTF();
        nick = in.readUTF();
        password = in.readUTF();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//    public String getName() {
//        return name;
//    }
}
