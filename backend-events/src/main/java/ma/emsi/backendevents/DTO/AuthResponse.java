package ma.emsi.backendevents.DTO;


import lombok.Data;

@Data
public class AuthResponse {
    private String fullName;
    private String email;
    private String password;
    private String token;
}
