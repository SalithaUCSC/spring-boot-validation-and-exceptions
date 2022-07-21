package rest.dtos;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank(message = "Invalid Name: Empty name")
    @NotNull(message = "Invalid Name: Name is NULL")
    @Size(min = 3, max = 30, message = "Invalid Name: Exceeds 30 characters")
    String name;

    @Email(message = "Invalid email")
    String email;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    String mobile;

    @Min(value = 1, message = "Invalid Age: Equals to zero")
    @Max(value = 100, message = "Invalid Age: Exceeds 100 years")
    Integer age;

}
