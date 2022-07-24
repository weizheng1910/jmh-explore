package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Occurrence2 extends Common{

    private LocalDate date;
    private String type;
    private BigDecimal amortizedAmount;

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String getType() {
        return type;
    }
}
