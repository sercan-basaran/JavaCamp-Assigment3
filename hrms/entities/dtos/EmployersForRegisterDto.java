package hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployersForRegisterDto {
    private String companyName;
    private String website;
    private String email;
    private String phone;
    private String password;
    private String verifyPassword;
}