package p336x7;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.C12484a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p324r7.C12868a;
import p324r7.C12869b;

/* renamed from: x7.c */
/* compiled from: SignalsReader */
public class C12950c implements C12869b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C12952d f55661a;

    /* renamed from: x7.c$a */
    /* compiled from: SignalsReader */
    private class C12951a implements Runnable {

        /* renamed from: b */
        private C12868a f55662b;

        public C12951a(C12868a aVar) {
            this.f55662b = aVar;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, C12949b> value : C12950c.f55661a.mo48122a().entrySet()) {
                C12949b bVar = (C12949b) value.getValue();
                hashMap.put(bVar.mo48116b(), bVar.mo48118d());
                if (bVar.mo48115a() != null) {
                    str = bVar.mo48115a();
                }
            }
            if (hashMap.size() > 0) {
                this.f55662b.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f55662b.onSignalsCollected("");
            } else {
                this.f55662b.onSignalsCollectionFailed(str);
            }
        }
    }

    public C12950c(C12952d dVar) {
        f55661a = dVar;
    }

    /* renamed from: c */
    private void m54694c(Context context, String str, AdFormat adFormat, C12484a aVar) {
        AdRequest build = new AdRequest.Builder().build();
        C12949b bVar = new C12949b(str);
        C12948a aVar2 = new C12948a(bVar, aVar);
        f55661a.mo48124c(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar2);
    }

    /* renamed from: a */
    public void mo43456a(Context context, String[] strArr, String[] strArr2, C12868a aVar) {
        C12484a aVar2 = new C12484a();
        for (String c : strArr) {
            aVar2.mo46889a();
            m54694c(context, c, AdFormat.INTERSTITIAL, aVar2);
        }
        for (String c2 : strArr2) {
            aVar2.mo46889a();
            m54694c(context, c2, AdFormat.REWARDED, aVar2);
        }
        aVar2.mo46891c(new C12951a(aVar));
    }
}
