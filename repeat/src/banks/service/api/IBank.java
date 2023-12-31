package banks.service.api;

import java.io.IOException;
import java.math.BigDecimal;

public interface IBank {
    BigDecimal getRate(ERate rate) throws IOException;
}
