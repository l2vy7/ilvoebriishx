package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p256u5.C11031f;
import p256u5.C11040o;
import p256u5.C11041p;
import p256u5.C11042q;

/* renamed from: com.google.android.gms.measurement.internal.y2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9962y2 {

    /* renamed from: b */
    protected static final AtomicReference f46896b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f46897c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f46898d = new AtomicReference();

    /* renamed from: a */
    private final C11031f f46899a;

    public C9962y2(C11031f fVar) {
        this.f46899a = fVar;
    }

    /* renamed from: g */
    private static final String m45515g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C4604n.m20098k(strArr);
        C4604n.m20098k(strArr2);
        C4604n.m20098k(atomicReference);
        C4604n.m20088a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C4668d9.m21491Z(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo39317a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo39318b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo39318b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f46899a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo39321e(str2));
            sb.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = mo39317a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo39317a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo39317a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo39319c(zzau zzau) {
        String str;
        if (!this.f46899a.zza()) {
            return zzau.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzau.f46939d);
        sb.append(",name=");
        sb.append(mo39320d(zzau.f46937b));
        sb.append(",params=");
        zzas zzas = zzau.f46938c;
        if (zzas == null) {
            str = null;
        } else if (!this.f46899a.zza()) {
            str = zzas.toString();
        } else {
            str = mo39318b(zzas.mo39355D0());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo39320d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46899a.zza()) {
            return str;
        }
        return m45515g(str, C11040o.f50000c, C11040o.f49998a, f46896b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo39321e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46899a.zza()) {
            return str;
        }
        return m45515g(str, C11041p.f50003b, C11041p.f50002a, f46897c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo39322f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f46899a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m45515g(str, C11042q.f50007b, C11042q.f50006a, f46898d);
        }
        return "experiment_id(" + str + ")";
    }
}
