package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdSessionContextType;
import com.iab.omid.library.startio.adsession.CreativeType;
import com.iab.omid.library.startio.adsession.ImpressionType;
import com.iab.omid.library.startio.adsession.Owner;
import com.startapp.sdk.omsdk.AdVerification;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.p */
/* compiled from: Sta */
public class C12118p {
    /* renamed from: a */
    public static boolean m52730a(Context context) {
        try {
            if (C12075n7.f53327a.f53046a) {
                return true;
            }
            C12075n7.m52625a(context);
            return true;
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static C12039m m52733b(WebView webView) {
        try {
            return m52728a(webView);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return null;
        }
    }

    /* renamed from: b */
    public static C12039m m52732b(Context context, AdVerification adVerification, boolean z) {
        try {
            return m52727a(context, adVerification, z);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static C12039m m52728a(WebView webView) {
        if (!m52730a(webView.getContext())) {
            return null;
        }
        C12000je.m52520a("Startio", "Name is null or empty");
        C12000je.m52520a("4.10.2", "Version is null or empty");
        return m52729a(new C12101o(new C12180s7("Startio", "4.10.2"), webView, (String) null, (List<C12453yb>) null, (String) null, "", AdSessionContextType.HTML), false, false);
    }

    /* renamed from: b */
    public static C11780a6 m52731b(C12039m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            return C11780a6.m52056a(mVar);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static C12039m m52727a(Context context, AdVerification adVerification, boolean z) {
        URL url;
        if (!m52730a(context)) {
            return null;
        }
        if (adVerification == null || adVerification.mo46490a() == null) {
            C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
            d4Var.f22126d = "OMSDK: Verification details can't be null!";
            d4Var.mo20661a();
            return null;
        }
        String a = C12109o7.m52702a();
        List<VerificationDetails> a2 = adVerification.mo46490a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (VerificationDetails next : a2) {
            try {
                url = new URL(next.mo46493c());
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                url = null;
            }
            if (url != null) {
                String a3 = next.mo46491a();
                String b = next.mo46492b();
                C12000je.m52520a(a3, "VendorKey is null or empty");
                C12000je.m52520a(b, "VerificationParameters is null or empty");
                arrayList.add(new C12453yb(a3, url, b));
            }
        }
        C12000je.m52520a("Startio", "Name is null or empty");
        C12000je.m52520a("4.10.2", "Version is null or empty");
        C12180s7 s7Var = new C12180s7("Startio", "4.10.2");
        C12000je.m52519a((Object) a, "OM SDK JS script content is null");
        return m52729a(new C12101o(s7Var, (WebView) null, a, arrayList, (String) null, "", AdSessionContextType.NATIVE), z, true);
    }

    /* renamed from: a */
    public static C12039m m52729a(C12101o oVar, boolean z, boolean z2) {
        Owner owner;
        CreativeType creativeType = z ? CreativeType.VIDEO : z2 ? CreativeType.NATIVE_DISPLAY : CreativeType.HTML_DISPLAY;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner2 = Owner.NATIVE;
        if (z) {
            owner = owner2;
        } else {
            owner = Owner.NONE;
        }
        if (creativeType != CreativeType.DEFINED_BY_JAVASCRIPT) {
            C12063n nVar = new C12063n(creativeType, impressionType, owner2, owner, false);
            if (C12075n7.f53327a.f53046a) {
                return new C11972id(nVar, oVar);
            }
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    /* renamed from: a */
    public static C11974j m52726a(C12039m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            return C11974j.m52483a(mVar);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return null;
        }
    }
}
