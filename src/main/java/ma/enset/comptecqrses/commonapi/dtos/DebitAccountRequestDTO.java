package ma.enset.comptecqrses.commonapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data
public class DebitAccountRequestDTO {
    private String accountId ;
    private String currency ;
    private double amount;
}
