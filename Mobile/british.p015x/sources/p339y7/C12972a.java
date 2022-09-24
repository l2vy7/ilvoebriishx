package p339y7;

import android.content.Context;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import com.unity3d.scar.adapter.common.C12491h;
import com.unity3d.scar.adapter.common.C12493j;
import com.unity3d.scar.adapter.common.C12495k;
import p270a8.C11154c;
import p270a8.C11156d;
import p323q7.C12865b;
import p323q7.C12866c;
import p341z7.C12985c;
import p341z7.C12989e;

/* renamed from: y7.a */
/* compiled from: ScarAdapter */
public class C12972a extends C12493j {

    /* renamed from: e */
    private C11156d f55705e;

    /* renamed from: y7.a$a */
    /* compiled from: ScarAdapter */
    class C12973a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12985c f55706b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55707c;

        /* renamed from: y7.a$a$a */
        /* compiled from: ScarAdapter */
        class C12974a implements C12865b {
            C12974a() {
            }

            public void onAdLoaded() {
                C12972a.this.f55269b.put(C12973a.this.f55707c.mo48010c(), C12973a.this.f55706b);
            }
        }

        C12973a(C12985c cVar, C12866c cVar2) {
            this.f55706b = cVar;
            this.f55707c = cVar2;
        }

        public void run() {
            this.f55706b.mo48159b(new C12974a());
        }
    }

    /* renamed from: y7.a$b */
    /* compiled from: ScarAdapter */
    class C12975b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12989e f55710b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55711c;

        /* renamed from: y7.a$b$a */
        /* compiled from: ScarAdapter */
        class C12976a implements C12865b {
            C12976a() {
            }

            public void onAdLoaded() {
                C12972a.this.f55269b.put(C12975b.this.f55711c.mo48010c(), C12975b.this.f55710b);
            }
        }

        C12975b(C12989e eVar, C12866c cVar) {
            this.f55710b = eVar;
            this.f55711c = cVar;
        }

        public void run() {
            this.f55710b.mo48159b(new C12976a());
        }
    }

    public C12972a(C12487d dVar) {
        super(dVar);
        C11156d dVar2 = new C11156d();
        this.f55705e = dVar2;
        this.f55268a = new C11154c(dVar2);
    }

    /* renamed from: c */
    public void mo46900c(Context context, C12866c cVar, C12490g gVar) {
        C12495k.m53835a(new C12973a(new C12985c(context, this.f55705e.mo43459b(cVar.mo48010c()), cVar, this.f55271d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo46901d(Context context, C12866c cVar, C12491h hVar) {
        C12495k.m53835a(new C12975b(new C12989e(context, this.f55705e.mo43459b(cVar.mo48010c()), cVar, this.f55271d, hVar), cVar));
    }
}
