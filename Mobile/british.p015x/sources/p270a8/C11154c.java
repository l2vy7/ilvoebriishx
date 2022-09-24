package p270a8;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.C12484a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p325r7.C12868a;
import p325r7.C12869b;

/* renamed from: a8.c */
/* compiled from: SignalsReader */
public class C11154c implements C12869b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Map<String, String> f50169a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C11156d f50170b;

    /* renamed from: a8.c$a */
    /* compiled from: SignalsReader */
    private class C11155a implements Runnable {

        /* renamed from: b */
        private C12868a f50171b;

        public C11155a(C12868a aVar) {
            this.f50171b = aVar;
        }

        public void run() {
            Map unused = C11154c.f50169a = new HashMap();
            String str = null;
            for (Map.Entry<String, C11153b> value : C11154c.f50170b.mo43458a().entrySet()) {
                C11153b bVar = (C11153b) value.getValue();
                C11154c.f50169a.put(bVar.mo43451b(), bVar.mo43453d());
                if (bVar.mo43450a() != null) {
                    str = bVar.mo43450a();
                }
            }
            if (C11154c.f50169a.size() > 0) {
                this.f50171b.onSignalsCollected(new JSONObject(C11154c.f50169a).toString());
            } else if (str == null) {
                this.f50171b.onSignalsCollected("");
            } else {
                this.f50171b.onSignalsCollectionFailed(str);
            }
        }
    }

    public C11154c(C11156d dVar) {
        f50170b = dVar;
    }

    /* renamed from: e */
    private void m49759e(Context context, String str, AdFormat adFormat, C12484a aVar) {
        AdRequest build = new AdRequest.Builder().build();
        C11153b bVar = new C11153b(str);
        C11152a aVar2 = new C11152a(bVar, aVar);
        f50170b.mo43460c(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar2);
    }

    /* renamed from: a */
    public void mo43456a(Context context, String[] strArr, String[] strArr2, C12868a aVar) {
        C12484a aVar2 = new C12484a();
        for (String e : strArr) {
            aVar2.mo46889a();
            m49759e(context, e, AdFormat.INTERSTITIAL, aVar2);
        }
        for (String e2 : strArr2) {
            aVar2.mo46889a();
            m49759e(context, e2, AdFormat.REWARDED, aVar2);
        }
        aVar2.mo46891c(new C11155a(aVar));
    }
}
