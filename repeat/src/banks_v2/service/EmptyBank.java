package banks_v2.service;

import banks_v2.service.api.ERate;
import banks_v2.service.api.IBank;

import java.math.BigDecimal;

public class EmptyBank implements IBank {
    @Override
    public BigDecimal getRate(ERate rate) {
        return BigDecimal.ZERO;
    }
}
