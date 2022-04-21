package org.maxwell.ioc.bean;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 17:29
 */
public class User {

    private String name;
    private int age;
    private List<String> hobbies;
    private Set<Role> roles;

    public User() {
    }

    public User(String name, int age, List<String> hobbies, Set<Role> roles) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", roles=" + roles +
                '}';
    }
}
