package p333v7;

import android.content.Context;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import com.unity3d.scar.adapter.common.C12491h;
import com.unity3d.scar.adapter.common.C12493j;
import com.unity3d.scar.adapter.common.C12495k;
import p323q7.C12865b;
import p323q7.C12866c;
import p335w7.C12935b;
import p335w7.C12938d;
import p337x7.C12950c;
import p337x7.C12952d;

/* renamed from: v7.a */
/* compiled from: ScarAdapter */
public class C12911a extends C12493j {

    /* renamed from: e */
    private C12952d f55608e;

    /* renamed from: v7.a$a */
    /* compiled from: ScarAdapter */
    class C12912a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12935b f55609b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55610c;

        /* renamed from: v7.a$a$a */
        /* compiled from: ScarAdapter */
        class C12913a implements C12865b {
            C12913a() {
            }

            public void onAdLoaded() {
                C12911a.this.f55269b.put(C12912a.this.f55610c.mo48010c(), C12912a.this.f55609b);
            }
        }

        C12912a(C12935b bVar, C12866c cVar) {
            this.f55609b = bVar;
            this.f55610c = cVar;
        }

        public void run() {
            this.f55609b.mo48101b(new C12913a());
        }
    }

    /* renamed from: v7.a$b */
    /* compiled from: ScarAdapter */
    class C12914b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12938d f55613b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55614c;

        /* renamed from: v7.a$b$a */
        /* compiled from: ScarAdapter */
        class C12915a implements C12865b {
            C12915a() {
            }

            public void onAdLoaded() {
                C12911a.this.f55269b.put(C12914b.this.f55614c.mo48010c(), C12914b.this.f55613b);
            }
        }

        C12914b(C12938d dVar, C12866c cVar) {
            this.f55613b = dVar;
            this.f55614c = cVar;
        }

        public void run() {
            this.f55613b.mo48101b(new C12915a());
        }
    }

    public C12911a(C12487d dVar) {
        super(dVar);
        C12952d dVar2 = new C12952d();
        this.f55608e = dVar2;
        this.f55268a = new C12950c(dVar2);
    }

    /* renamed from: c */
    public void mo46900c(Context context, C12866c cVar, C12490g gVar) {
        C12495k.m53835a(new C12912a(new C12935b(context, this.f55608e.mo48123b(cVar.mo48010c()), cVar, this.f55271d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo46901d(Context context, C12866c cVar, C12491h hVar) {
        C12495k.m53835a(new C12914b(new C12938d(context, this.f55608e.mo48123b(cVar.mo48010c()), cVar, this.f55271d, hVar), cVar));
    }
}
