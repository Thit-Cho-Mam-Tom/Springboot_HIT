package org.example.btvn_buoi2.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
@Table(name ="NhanVien")
public class Employees {
    @Id
    @Column(name = "id" , length=20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id ;
    @Column(name = "name" , length = 40)
    private String name ;
    @Column(name = "email" , length = 60)
    private String email ;
    @Column(name = "address",length = 120)
    private String address ;
    @Column(name = "phone" , length = 12)
    private String phone ;

    public Employees(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
}