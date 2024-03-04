package mm.com.mytel.apartmentSystem.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    @NotBlank
    @Length(min=1)
    private String roomType;
    private double area;
    private String status;
    @NotBlank
    @Length(min=1)
    private Integer customerId;
}
