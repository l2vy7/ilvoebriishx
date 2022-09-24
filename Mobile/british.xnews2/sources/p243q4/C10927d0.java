package p243q4;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import p108l4.C10657a;

/* renamed from: q4.d0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10927d0 implements C10657a.C10658a {

    /* renamed from: b */
    private final Status f49807b;

    /* renamed from: c */
    private final ApplicationMetadata f49808c;

    /* renamed from: d */
    private final String f49809d;

    /* renamed from: e */
    private final String f49810e;

    /* renamed from: f */
    private final boolean f49811f;

    public C10927d0(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.f49807b = status;
        this.f49808c = applicationMetadata;
        this.f49809d = str;
        this.f49810e = str2;
        this.f49811f = z;
    }

    /* renamed from: Z */
    public final ApplicationMetadata mo42794Z() {
        return this.f49808c;
    }

    public final String getSessionId() {
        return this.f49810e;
    }

    /* renamed from: j */
    public final boolean mo42796j() {
        return this.f49811f;
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        return this.f49807b;
    }

    /* renamed from: u */
    public final String mo42797u() {
        return this.f49809d;
    }
}
