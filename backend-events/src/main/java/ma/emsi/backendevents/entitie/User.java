package ma.emsi.backendevents.entitie;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.backendevents.enums.UserRole;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String fullName;
    private String email;
    @NotEmpty
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
