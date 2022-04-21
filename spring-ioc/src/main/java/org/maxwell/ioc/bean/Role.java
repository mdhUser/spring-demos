package org.maxwell.ioc.bean;

import java.util.Objects;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 17:32
 */
public class Role {
    private int id;
    private String name;
    private String despriction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDespriction() {
        return despriction;
    }

    public void setDespriction(String despriction) {
        this.despriction = despriction;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", despriction='" + despriction + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id && Objects.equals(name, role.name) && Objects.equals(despriction, role.despriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, despriction);
    }
}
