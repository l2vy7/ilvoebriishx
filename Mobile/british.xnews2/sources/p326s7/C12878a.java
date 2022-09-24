package p326s7;

import android.content.Context;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import com.unity3d.scar.adapter.common.C12491h;
import com.unity3d.scar.adapter.common.C12493j;
import com.unity3d.scar.adapter.common.C12495k;
import p322q7.C12865b;
import p322q7.C12866c;
import p328t7.C12890b;
import p328t7.C12893d;
import p330u7.C12907c;
import p330u7.C12909d;

/* renamed from: s7.a */
/* compiled from: ScarAdapter */
public class C12878a extends C12493j {

    /* renamed from: e */
    private C12909d f55551e;

    /* renamed from: s7.a$a */
    /* compiled from: ScarAdapter */
    class C12879a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12890b f55552b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55553c;

        /* renamed from: s7.a$a$a */
        /* compiled from: ScarAdapter */
        class C12880a implements C12865b {
            C12880a() {
            }

            public void onAdLoaded() {
                C12878a.this.f55269b.put(C12879a.this.f55553c.mo48010c(), C12879a.this.f55552b);
            }
        }

        C12879a(C12890b bVar, C12866c cVar) {
            this.f55552b = bVar;
            this.f55553c = cVar;
        }

        public void run() {
            this.f55552b.mo48059b(new C12880a());
        }
    }

    /* renamed from: s7.a$b */
    /* compiled from: ScarAdapter */
    class C12881b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12893d f55556b;

        /* renamed from: c */
        final /* synthetic */ C12866c f55557c;

        /* renamed from: s7.a$b$a */
        /* compiled from: ScarAdapter */
        class C12882a implements C12865b {
            C12882a() {
            }

            public void onAdLoaded() {
                C12878a.this.f55269b.put(C12881b.this.f55557c.mo48010c(), C12881b.this.f55556b);
            }
        }

        C12881b(C12893d dVar, C12866c cVar) {
            this.f55556b = dVar;
            this.f55557c = cVar;
        }

        public void run() {
            this.f55556b.mo48059b(new C12882a());
        }
    }

    public C12878a(C12487d dVar) {
        super(dVar);
        C12909d dVar2 = new C12909d();
        this.f55551e = dVar2;
        this.f55268a = new C12907c(dVar2);
    }

    /* renamed from: c */
    public void mo46900c(Context context, C12866c cVar, C12490g gVar) {
        C12495k.m53835a(new C12879a(new C12890b(context, this.f55551e.mo48086b(cVar.mo48010c()), cVar, this.f55271d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo46901d(Context context, C12866c cVar, C12491h hVar) {
        C12495k.m53835a(new C12881b(new C12893d(context, this.f55551e.mo48086b(cVar.mo48010c()), cVar, this.f55271d, hVar), cVar));
    }
}
