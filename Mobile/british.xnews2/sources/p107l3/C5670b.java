package p107l3;

import com.facebook.C3642m;
import com.facebook.internal.C3511k;
import p113m3.C5755a;
import p119n3.C5853b;

/* renamed from: l3.b */
/* compiled from: InstrumentManager */
public class C5670b {

    /* renamed from: l3.b$a */
    /* compiled from: InstrumentManager */
    static class C5671a implements C3511k.C3514c {
        C5671a() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5755a.m25458a();
            }
        }
    }

    /* renamed from: l3.b$b */
    /* compiled from: InstrumentManager */
    static class C5672b implements C3511k.C3514c {
        C5672b() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                C5853b.m25847a();
            }
        }
    }

    /* renamed from: a */
    public static void m25023a() {
        if (C3642m.m12283i()) {
            C3511k.m11755a(C3511k.C3515d.CrashReport, new C5671a());
            C3511k.m11755a(C3511k.C3515d.ErrorReport, new C5672b());
        }
    }
}
