package com.wellsfargo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column
    private String advisorName;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public FinancialAdvisor(Long advisorId, String advisorName,
                            String email, String phoneNumber,
                            List<Client> clients) {
        this.advisorId = advisorId;
        this.advisorName = advisorName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.clients = clients;
    }

    public FinancialAdvisor() {}

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
