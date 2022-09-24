package p243q4;

import android.text.TextUtils;

/* renamed from: q4.c0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10925c0 {

    /* renamed from: a */
    protected final C10922b f49804a;

    /* renamed from: b */
    private final String f49805b;

    /* renamed from: c */
    private C10945o f49806c;

    protected C10925c0(String str, String str2, String str3) {
        C10920a.m49142e(str);
        this.f49805b = str;
        C10922b bVar = new C10922b("MediaControlChannel");
        this.f49804a = bVar;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bVar.mo43197h((String) null);
        }
    }

    /* renamed from: a */
    public final String mo43200a() {
        return this.f49805b;
    }

    /* renamed from: b */
    public final void mo43201b(C10945o oVar) {
        this.f49806c = oVar;
        if (oVar == null) {
            mo43204e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo43202c(String str, long j, String str2) throws IllegalStateException {
        C10945o oVar = this.f49806c;
        if (oVar == null) {
            this.f49804a.mo43192c("Attempt to send text message without a sink", new Object[0]);
        } else {
            oVar.mo29586a(this.f49805b, str, j, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo43203d() {
        C10945o oVar = this.f49806c;
        if (oVar != null) {
            return oVar.zzc();
        }
        this.f49804a.mo43192c("Attempt to generate requestId without a sink", new Object[0]);
        return 0;
    }

    /* renamed from: e */
    public void mo43204e() {
        throw null;
    }
}
