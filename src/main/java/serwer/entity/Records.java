package serwer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "records")
public class Records {

    private Integer recordId;
    private Double temperature;
    private Double humidity;
    private Date date;
    private User user;

    public Records() {
    }


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "recordId", unique = true, nullable = false)
    public Integer getRecordId() {
        return this.recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    @Column(name = "temperature", nullable = false)
    public Double getTemperature(){
        return this.temperature;
    }

    public void setTemperature(Double temperature){
        this.temperature=temperature;
    }
    @Column(name = "humidity", nullable = false)
    public Double getHumidity(){
        return this.humidity;
    }

    public void setHumidity(Double humidity){
        this.humidity=humidity;
    }
    @Column(name = "date", nullable = false)
    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date=date;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    public User getUser() {
        this.user = user;
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
