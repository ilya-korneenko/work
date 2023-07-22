package banks.service.api;

import java.math.BigDecimal;

public interface IBank {
    BigDecimal getRate(ERate rate);
}
