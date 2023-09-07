package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext417Application;

@Entity
@Table(name = "Ggg_table")
@Data
//<<< DDD / Aggregate Root
public class Ggg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static GggRepository repository() {
        GggRepository gggRepository = BoundedContext417Application.applicationContext.getBean(
            GggRepository.class
        );
        return gggRepository;
    }
}
//>>> DDD / Aggregate Root
