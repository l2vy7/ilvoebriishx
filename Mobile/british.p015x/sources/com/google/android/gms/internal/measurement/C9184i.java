package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9184i implements C9306q {

    /* renamed from: b */
    private final Double f45074b;

    public C9184i(Double d) {
        if (d == null) {
            this.f45074b = Double.valueOf(Double.NaN);
        } else {
            this.f45074b = d;
        }
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new C9369u(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{zzi(), str}));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9184i)) {
            return false;
        }
        return this.f45074b.equals(((C9184i) obj).f45074b);
    }

    public final int hashCode() {
        return this.f45074b.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    public final C9306q zzd() {
        return new C9184i(this.f45074b);
    }

    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.f45074b.doubleValue()) && this.f45074b.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final Double zzh() {
        return this.f45074b;
    }

    public final String zzi() {
        int i;
        if (Double.isNaN(this.f45074b.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f45074b.doubleValue())) {
            return this.f45074b.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f45074b.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i = stripTrailingZeros.precision();
        } else {
            i = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    public final Iterator zzl() {
        return null;
    }
}
