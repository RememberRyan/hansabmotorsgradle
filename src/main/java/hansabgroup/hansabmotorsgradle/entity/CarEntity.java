package hansabgroup.hansabmotorsgradle.entity;

/**
 * Created by Ryan Alexander on 2019-03-03.
 */
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
@EntityListeners(AuditingEntityListener.class)
public class CarEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_Id;


    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String carYear;

    @Column(nullable = false)
    private String numberplate;

    @Column(precision = 10, scale = 2)
    private BigDecimal value;

    @Column(nullable = false)
    private String condition;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private int mileage;

    @Column
    private String fuelType;


    @Column (nullable = false)
    private String gearbox;


    @Column
    private String horsepower;

    @Column
    @Size(max = 2048)
    private String description;


// for storing the car images
//    @Column
//    private String resultPageImageUrl;




}
