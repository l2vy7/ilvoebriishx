package com.appnext.core.p035ra.services.p038a;

import android.content.Context;
import android.os.Bundle;
import com.appnext.base.C3117a;
import com.appnext.core.p035ra.p037b.C3227a;
import com.appnext.core.p035ra.services.C3235a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.appnext.core.ra.services.a.a */
public abstract class C3237a {

    /* renamed from: aM */
    private Context f12426aM;

    public C3237a(Context context) {
        this.f12426aM = context;
    }

    /* renamed from: a */
    private static Bundle m10902a(C3235a.C3236a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", aVar.ordinal());
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract boolean mo10854F(String str);

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo10855G(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10856a(C3227a aVar);

    /* renamed from: aW */
    public final void mo10857aW() {
        mo10855G(C3235a.C3236a.SendRA.name());
    }

    /* renamed from: c */
    public final void mo10858c(long j) {
        C3235a.C3236a aVar = C3235a.C3236a.SendRA;
        mo10856a(new C3227a(aVar, aVar.hashCode(), m10902a(aVar), j, 120000, true));
    }

    /* renamed from: d */
    public final void mo10860d(ArrayList<String> arrayList) {
        try {
            C3235a.C3236a aVar = C3235a.C3236a.StoreRa;
            Bundle a = m10902a(aVar);
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                a.putString("more_data", jSONArray.toString());
            }
            C3227a aVar2 = new C3227a(aVar, aVar.hashCode() + ((int) (System.currentTimeMillis() % 7)), a, 0, 0, false);
            C3235a.C3236a aVar3 = C3235a.C3236a.DownloadingConfig;
            if (mo10854F(aVar3.name())) {
                mo10856a(aVar2);
                return;
            }
            C3227a aVar4 = new C3227a(aVar3, aVar3.hashCode(), m10902a(aVar3), 0, 0, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(aVar4);
            arrayList2.add(aVar2);
            mo10861d((List<C3227a>) arrayList2);
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsServiceLogic$storeRA", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo10861d(List<C3227a> list);

    /* access modifiers changed from: protected */
    public final Context getContext() {
        return this.f12426aM;
    }

    /* renamed from: d */
    public final void mo10859d(long j) {
        try {
            C3235a.C3236a aVar = C3235a.C3236a.DownloadingConfig;
            mo10856a(new C3227a(aVar, aVar.hashCode(), m10902a(aVar), j, j, true));
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsServiceLogic$scheduleDownloadingConfig", th);
        }
    }
}
