package ma.emsi.backendevents.entitie;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.backendevents.enums.EventCategory;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Events {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enventId;
    @NotEmpty
    private String eventName;
    @Enumerated(EnumType.STRING)
    private EventCategory eventCategory;
    private String eventCity;
    private String eventPlace;
    @Temporal(TemporalType.DATE)
    private Date eventDate;
    private double eventPrice;
    @Lob
    @Column(length = 50000)
    private String eventDetails;
    @Lob
    @Column(length = 50000)
    private String imgUrl;
}
