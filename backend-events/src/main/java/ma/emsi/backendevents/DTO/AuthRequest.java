package ma.emsi.backendevents.DTO;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
