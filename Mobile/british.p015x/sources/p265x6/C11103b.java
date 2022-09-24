package p265x6;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.measurement.C9372u2;
import com.google.firebase.analytics.connector.internal.C10415b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p201d7.C10504a;
import p201d7.C10507d;
import p253t5.C11020a;
import p262w6.C11085a;
import p262w6.C11086c;

/* renamed from: x6.b */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
public class C11103b implements C11102a {

    /* renamed from: c */
    private static volatile C11102a f50073c;

    /* renamed from: a */
    final C11020a f50074a;

    /* renamed from: b */
    final Map f50075b = new ConcurrentHashMap();

    C11103b(C11020a aVar) {
        C4604n.m20098k(aVar);
        this.f50074a = aVar;
    }

    /* renamed from: c */
    public static C11102a m49599c(C11086c cVar, Context context, C10507d dVar) {
        C4604n.m20098k(cVar);
        C4604n.m20098k(context);
        C4604n.m20098k(dVar);
        C4604n.m20098k(context.getApplicationContext());
        if (f50073c == null) {
            synchronized (C11103b.class) {
                if (f50073c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo43361r()) {
                        dVar.mo42644a(C11085a.class, C11105d.f50077b, C11104c.f50076a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo43360q());
                    }
                    f50073c = new C11103b(C9372u2.m43684t(context, (String) null, (String) null, (String) null, bundle).mo38080q());
                }
            }
        }
        return f50073c;
    }

    /* renamed from: d */
    static /* synthetic */ void m49600d(C10504a aVar) {
        boolean z = ((C11085a) aVar.mo42641a()).f50027a;
        synchronized (C11103b.class) {
            ((C11103b) C4604n.m20098k(f50073c)).f50074a.mo43330u(z);
        }
    }

    /* renamed from: a */
    public void mo43382a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C10415b.m47989d(str) && C10415b.m47988c(str2, bundle) && C10415b.m47987b(str, str2, bundle)) {
            C10415b.m47986a(str, str2, bundle);
            this.f50074a.mo43323n(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public void mo43383b(String str, String str2, Object obj) {
        if (C10415b.m47989d(str) && C10415b.m47990e(str, str2)) {
            this.f50074a.mo43329t(str, str2, obj);
        }
    }
}
