package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p038v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p038v3.api.AdEvent;
import com.google.ads.interactivemedia.p038v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p038v3.impl.data.C3795bh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.et */
/* compiled from: IMASDK */
public final class C3973et implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, C3931de, C3957ed {

    /* renamed from: a */
    private final C3958ee f17005a;

    /* renamed from: b */
    private final C3972es f17006b;

    /* renamed from: c */
    private final Context f17007c;

    /* renamed from: d */
    private View f17008d;

    /* renamed from: e */
    private String f17009e;

    /* renamed from: f */
    private final Set<FriendlyObstruction> f17010f;

    /* renamed from: g */
    private boolean f17011g = false;

    /* renamed from: h */
    private boolean f17012h = false;

    /* renamed from: i */
    private String f17013i = null;

    /* renamed from: j */
    private C3841al f17014j;

    C3973et(C3958ee eeVar, Context context) {
        C3972es esVar = new C3972es();
        this.f17005a = eeVar;
        this.f17007c = context;
        this.f17006b = esVar;
        this.f17010f = new HashSet();
    }

    /* renamed from: j */
    private final void m17062j(List<FriendlyObstruction> list) {
        C3795bh bhVar;
        if (list == null) {
            bhVar = null;
        } else if (!list.isEmpty()) {
            bhVar = C3795bh.builder().friendlyObstructions(list).build();
        } else {
            return;
        }
        this.f17005a.mo15717o(new C3949dw(C3947du.omid, C3948dv.registerFriendlyObstructions, this.f17009e, bhVar));
    }

    /* renamed from: a */
    public final void mo15701a() {
        C3839aj.m13819a(this.f17007c);
        this.f17011g = true;
    }

    /* renamed from: b */
    public final void mo15702b() {
        this.f17011g = false;
    }

    /* renamed from: c */
    public final void mo15744c(String str) {
        this.f17013i = str;
    }

    /* renamed from: d */
    public final void mo15745d(View view) {
        this.f17008d = view;
    }

    /* renamed from: e */
    public final void mo15746e(String str) {
        this.f17009e = str;
    }

    /* renamed from: f */
    public final void mo15747f(FriendlyObstruction friendlyObstruction) {
        if (!this.f17010f.contains(friendlyObstruction)) {
            this.f17010f.add(friendlyObstruction);
            C3841al alVar = this.f17014j;
            if (alVar != null) {
                alVar.mo13877d(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                m17062j(Arrays.asList(new FriendlyObstruction[]{friendlyObstruction}));
            }
        }
    }

    /* renamed from: g */
    public final void mo15748g() {
        this.f17010f.clear();
        C3841al alVar = this.f17014j;
        if (alVar != null) {
            alVar.mo13878e();
            m17062j((List<FriendlyObstruction>) null);
        }
    }

    /* renamed from: h */
    public final void mo15749h() {
        C3841al alVar;
        if (this.f17011g && (alVar = this.f17014j) != null) {
            alVar.mo13876c();
            this.f17014j = null;
        }
    }

    /* renamed from: i */
    public final void mo15750i() {
        this.f17012h = true;
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
        C3841al alVar;
        if (this.f17011g && (alVar = this.f17014j) != null) {
            alVar.mo13876c();
            this.f17014j = null;
        }
    }

    public final void onAdEvent(AdEvent adEvent) {
        if (this.f17011g) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int ordinal = adEvent.getType().ordinal();
            if (ordinal == 3 || ordinal == 14) {
                mo15749h();
            } else if (ordinal == 15 && this.f17011g && this.f17014j == null && this.f17008d != null) {
                C3849aq aqVar = C3849aq.DEFINED_BY_JAVASCRIPT;
                C3851as asVar = C3851as.DEFINED_BY_JAVASCRIPT;
                C3852at atVar = C3852at.JAVASCRIPT;
                C3842am b = C3842am.m14121b(aqVar, asVar, atVar, atVar);
                C3853au c = C3853au.m14823c();
                WebView c2 = this.f17005a.mo15705c();
                String str = this.f17013i;
                String str2 = true != this.f17012h ? "false" : "true";
                StringBuilder sb = new StringBuilder(str2.length() + 7);
                sb.append("{ssai:");
                sb.append(str2);
                sb.append("}");
                C3841al f = C3841al.m13990f(b, C3844an.m14332a(c, c2, str, sb.toString()));
                this.f17014j = f;
                f.mo13875b(this.f17008d);
                for (FriendlyObstruction next : this.f17010f) {
                    this.f17014j.mo13877d(next.getView(), next.getPurpose().getOmidPurpose(), next.getDetailedReason());
                }
                m17062j(new ArrayList(this.f17010f));
                this.f17014j.mo13874a();
            }
        }
    }
}
