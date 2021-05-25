package casper.hrmsApp.src.main.java.casper.hrmsApp.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_positions")

public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="title")
    private String position;
}
