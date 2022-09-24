package p109l4;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.common.api.Status;
import p244q4.C10927d0;
import p244q4.C10930f;

/* renamed from: l4.g0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10680g0 extends C10930f {

    /* renamed from: b */
    final /* synthetic */ C5675h0 f49300b;

    C10680g0(C5675h0 h0Var) {
        this.f49300b = h0Var;
    }

    /* renamed from: D5 */
    public final void mo42834D5(String str, long j, int i) {
        C5675h0.m25051p(this.f49300b, j, i);
    }

    /* renamed from: E */
    public final void mo42835E(String str, String str2) {
        C5675h0.f24257w.mo43190a("Receive (type=text, ns=%s) %s", str, str2);
        C5675h0.m25043h(this.f49300b).post(new C10677f0(this, str, str2));
    }

    /* renamed from: H1 */
    public final void mo42836H1(zzy zzy) {
        C5675h0.m25043h(this.f49300b).post(new C10672d0(this, zzy));
    }

    /* renamed from: M */
    public final void mo42837M(int i) {
        C5675h0.m25043h(this.f49300b).post(new C10664a0(this, i));
    }

    /* renamed from: U0 */
    public final void mo42838U0(String str, byte[] bArr) {
        C5675h0.f24257w.mo43190a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    /* renamed from: a2 */
    public final void mo42839a2(zza zza) {
        C5675h0.m25043h(this.f49300b).post(new C10674e0(this, zza));
    }

    /* renamed from: f1 */
    public final void mo42840f1(String str, double d, boolean z) {
        C5675h0.f24257w.mo43190a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    /* renamed from: k */
    public final void mo42841k(int i) {
        C5675h0.m25048m(this.f49300b, i);
    }

    /* renamed from: o */
    public final void mo42842o(int i) {
        C5675h0.m25048m(this.f49300b, i);
        if (this.f49300b.f24280t != null) {
            C5675h0.m25043h(this.f49300b).post(new C10670c0(this, i));
        }
    }

    /* renamed from: p */
    public final void mo42843p(int i) {
        C5675h0.m25048m(this.f49300b, i);
    }

    /* renamed from: s */
    public final void mo42844s(int i) {
        C5675h0.m25043h(this.f49300b).post(new C10666b0(this, i));
    }

    /* renamed from: v5 */
    public final void mo42845v5(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        ApplicationMetadata unused = this.f49300b.f24270j = applicationMetadata;
        String unused2 = this.f49300b.f24271k = str;
        C5675h0.m25046k(this.f49300b, new C10927d0(new Status(0), applicationMetadata, str, str2, z));
    }

    /* renamed from: x1 */
    public final void mo42846x1(String str, long j) {
        C5675h0.m25051p(this.f49300b, j, 0);
    }

    public final void zzb(int i) {
        C5675h0.m25043h(this.f49300b).post(new C10712z(this, i));
    }

    public final void zzf(int i) {
        this.f49300b.m25041H(i);
    }
}
