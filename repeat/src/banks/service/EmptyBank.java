package banks.service;

import banks.service.api.ERate;
import banks.service.api.IBank;

import java.math.BigDecimal;

public class EmptyBank implements IBank {
    @Override
    public BigDecimal getRate(ERate rate) {
        return BigDecimal.ZERO;
    }
}
