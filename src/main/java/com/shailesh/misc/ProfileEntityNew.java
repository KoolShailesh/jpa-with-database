package com.shailesh.misc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "porta")
public class ProfileEntityNew {
    @Id
    @Column(name = "idporta")
    private Long id;
    @Column(name = "title")
    private String name;
    @Column(name = "imageURL")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "twitterName")
    private String twitterName;
    
}
