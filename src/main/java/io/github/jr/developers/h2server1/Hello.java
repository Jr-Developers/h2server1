package io.github.jr.developers.h2server1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "HELLO")
@NoArgsConstructor
public class Hello {
    @Id
    @Column(name = "WORLD")
    private String world;
}
