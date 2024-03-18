package travel.agency.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
  @Id
  @Column(unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @NotNull
  @NotBlank
  private String fullName;
  private String address;
  private String avatarUrl;
  @NotNull
  private String phone;
  @NotNull
  @NotBlank
  @Column(unique = true)
  private String email;
}
