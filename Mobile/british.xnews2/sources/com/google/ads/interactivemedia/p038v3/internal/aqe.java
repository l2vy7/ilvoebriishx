package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqe */
/* compiled from: IMASDK */
public final class aqe extends IllegalStateException {
    private aqe(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m14534a(aqs<?> aqs) {
        String str;
        if (!aqs.mo14218a()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception e = aqs.mo14222e();
        if (e != null) {
            str = "failure";
        } else if (aqs.mo14219b()) {
            String valueOf = String.valueOf(aqs.mo14221d());
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = aqs.mo14220c() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new aqe(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), e);
    }
}
