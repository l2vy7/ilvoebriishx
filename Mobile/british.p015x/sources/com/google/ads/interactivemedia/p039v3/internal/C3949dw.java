package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.UiElement;
import com.google.ads.interactivemedia.p039v3.impl.data.C3788ba;
import com.google.ads.interactivemedia.p039v3.impl.data.C3799bl;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dw */
/* compiled from: IMASDK */
public final class C3949dw {

    /* renamed from: a */
    private static final bet f16950a;

    /* renamed from: b */
    private final C3947du f16951b;

    /* renamed from: c */
    private final Object f16952c;

    /* renamed from: d */
    private final String f16953d;

    /* renamed from: e */
    private final C3948dv f16954e;

    static {
        beu beu = new beu();
        beu.mo14975b(UiElement.class, C3799bl.GSON_TYPE_ADAPTER);
        beu.mo14975b(CompanionAdSlot.class, new C3946dt());
        beu.mo14976c(new arl());
        f16950a = beu.mo14974a();
    }

    public C3949dw(C3947du duVar, C3948dv dvVar, String str) {
        this(duVar, dvVar, str, (Object) null);
    }

    public C3949dw(C3947du duVar, C3948dv dvVar, String str, Object obj) {
        this.f16951b = duVar;
        this.f16954e = dvVar;
        this.f16953d = str;
        this.f16952c = obj;
    }

    /* renamed from: a */
    public static C3949dw m16996a(String str) throws MalformedURLException, bff {
        Object obj;
        Uri parse = Uri.parse(str);
        String substring = parse.getPath().substring(1);
        if (parse.getQueryParameter("sid") != null) {
            C3947du a = C3947du.m16994a(substring);
            C3948dv a2 = C3948dv.m16995a(parse.getQueryParameter(SessionDescription.ATTR_TYPE));
            String queryParameter = parse.getQueryParameter("sid");
            bet bet = f16950a;
            String queryParameter2 = parse.getQueryParameter("data");
            Class cls = C3788ba.class;
            if (queryParameter2 == null) {
                obj = null;
            } else {
                obj = bet.mo14971h(new StringReader(queryParameter2), cls);
            }
            if (Integer.TYPE == cls) {
                cls = Integer.class;
            } else if (Float.TYPE == cls) {
                cls = Float.class;
            } else if (Byte.TYPE == cls) {
                cls = Byte.class;
            } else if (Double.TYPE == cls) {
                cls = Double.class;
            } else if (Long.TYPE == cls) {
                cls = Long.class;
            } else if (Character.TYPE == cls) {
                cls = Character.class;
            } else if (Boolean.TYPE == cls) {
                cls = Boolean.class;
            } else if (Short.TYPE == cls) {
                cls = Short.class;
            } else if (Void.TYPE == cls) {
                cls = Void.class;
            }
            return new C3949dw(a, a2, queryParameter, cls.cast(obj));
        }
        throw new MalformedURLException("Session id must be provided in message.");
    }

    /* renamed from: b */
    public final C3947du mo15690b() {
        return this.f16951b;
    }

    /* renamed from: c */
    public final C3948dv mo15691c() {
        return this.f16954e;
    }

    /* renamed from: d */
    public final Object mo15692d() {
        return this.f16952c;
    }

    /* renamed from: e */
    public final String mo15693e() {
        return this.f16953d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3949dw)) {
            return false;
        }
        C3949dw dwVar = (C3949dw) obj;
        return this.f16951b == dwVar.f16951b && arq.m14618b(this.f16952c, dwVar.f16952c) && arq.m14618b(this.f16953d, dwVar.f16953d) && this.f16954e == dwVar.f16954e;
    }

    /* renamed from: f */
    public final String mo15695f() {
        auc auc = new auc();
        auc.mo14540b(SessionDescription.ATTR_TYPE, this.f16954e);
        auc.mo14540b("sid", this.f16953d);
        Object obj = this.f16952c;
        if (obj != null) {
            auc.mo14540b("data", obj);
        }
        return String.format("%s('%s', %s);", new Object[]{"javascript:adsense.mobileads.afmanotify.receiveMessage", this.f16951b, f16950a.mo14968e(auc.mo14539a())});
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16951b, this.f16952c, this.f16953d, this.f16954e});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", new Object[]{this.f16951b, this.f16954e, this.f16953d, this.f16952c});
    }
}
