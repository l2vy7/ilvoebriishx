package p017c1;

import android.os.Bundle;
import androidx.mediarouter.media.C1001r;

/* renamed from: c1.f */
/* compiled from: MediaRouteDiscoveryRequest */
public final class C2639f {

    /* renamed from: a */
    private final Bundle f10393a;

    /* renamed from: b */
    private C1001r f10394b;

    public C2639f(C1001r rVar, boolean z) {
        if (rVar != null) {
            Bundle bundle = new Bundle();
            this.f10393a = bundle;
            this.f10394b = rVar;
            bundle.putBundle("selector", rVar.mo4688a());
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: b */
    private void m9216b() {
        if (this.f10394b == null) {
            C1001r d = C1001r.m5118d(this.f10393a.getBundle("selector"));
            this.f10394b = d;
            if (d == null) {
                this.f10394b = C1001r.f4553c;
            }
        }
    }

    /* renamed from: c */
    public static C2639f m9217c(Bundle bundle) {
        if (bundle != null) {
            return new C2639f(bundle);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle mo9288a() {
        return this.f10393a;
    }

    /* renamed from: d */
    public C1001r mo9289d() {
        m9216b();
        return this.f10394b;
    }

    /* renamed from: e */
    public boolean mo9290e() {
        return this.f10393a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2639f)) {
            return false;
        }
        C2639f fVar = (C2639f) obj;
        if (!mo9289d().equals(fVar.mo9289d()) || mo9290e() != fVar.mo9290e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo9292f() {
        m9216b();
        return this.f10394b.mo4694g();
    }

    public int hashCode() {
        return mo9289d().hashCode() ^ mo9290e() ? 1 : 0;
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + mo9289d() + ", activeScan=" + mo9290e() + ", isValid=" + mo9292f() + " }";
    }

    private C2639f(Bundle bundle) {
        this.f10393a = bundle;
    }
}
