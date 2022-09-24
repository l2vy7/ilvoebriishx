package p253t6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: t6.a */
/* compiled from: BigIntegerMath */
public final class C11021a {

    /* renamed from: a */
    static final BigInteger f49976a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    private static final double f49977b = Math.log(10.0d);

    /* renamed from: c */
    private static final double f49978c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m49398a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
