package serwer.entity;

import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "userName")})
public class User {
    private Integer userId;
    private String userName;
    private Set<Records> records = new HashSet<Records>(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "userName", unique = true, nullable = false)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Records> getRecords() {
        return this.records;
    }

    public void setRecords(Set<Records> records) {
        this.records = records;
    }
}
