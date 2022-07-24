package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Occurrence1 extends Common{

    private LocalDate date;
    private String type;
    private BigDecimal commitment;

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String getType() {
        return type;
    }
}
