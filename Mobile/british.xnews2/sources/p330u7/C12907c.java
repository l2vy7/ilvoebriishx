package p330u7;

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

/* renamed from: u7.c */
/* compiled from: SignalsReader */
public class C12907c implements C12869b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C12909d f55601a;

    /* renamed from: u7.c$a */
    /* compiled from: SignalsReader */
    private class C12908a implements Runnable {

        /* renamed from: b */
        private C12868a f55602b;

        public C12908a(C12868a aVar) {
            this.f55602b = aVar;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, C12906b> value : C12907c.f55601a.mo48085a().entrySet()) {
                C12906b bVar = (C12906b) value.getValue();
                hashMap.put(bVar.mo48079b(), bVar.mo48081d());
                if (bVar.mo48078a() != null) {
                    str = bVar.mo48078a();
                }
            }
            if (hashMap.size() > 0) {
                this.f55602b.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f55602b.onSignalsCollected("");
            } else {
                this.f55602b.onSignalsCollectionFailed(str);
            }
        }
    }

    public C12907c(C12909d dVar) {
        f55601a = dVar;
    }

    /* renamed from: c */
    private void m54586c(Context context, String str, AdFormat adFormat, C12484a aVar) {
        AdRequest build = new AdRequest.Builder().build();
        C12906b bVar = new C12906b(str);
        C12905a aVar2 = new C12905a(bVar, aVar);
        f55601a.mo48087c(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar2);
    }

    /* renamed from: a */
    public void mo43456a(Context context, String[] strArr, String[] strArr2, C12868a aVar) {
        C12484a aVar2 = new C12484a();
        for (String c : strArr) {
            aVar2.mo46889a();
            m54586c(context, c, AdFormat.INTERSTITIAL, aVar2);
        }
        for (String c2 : strArr2) {
            aVar2.mo46889a();
            m54586c(context, c2, AdFormat.REWARDED, aVar2);
        }
        aVar2.mo46891c(new C12908a(aVar));
    }
}
