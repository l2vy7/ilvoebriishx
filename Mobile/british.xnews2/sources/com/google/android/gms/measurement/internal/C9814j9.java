package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9814j9 {

    /* renamed from: a */
    private final C4670h4 f46393a;

    public C9814j9(C4670h4 h4Var) {
        this.f46393a = h4Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39031a(String str, Bundle bundle) {
        String str2;
        this.f46393a.mo19273e().mo19272b();
        if (!this.f46393a.mo19385n()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = TtmlNode.TEXT_EMPHASIS_AUTO;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f46393a.mo19365F().f21345u.mo39099b(str2);
                this.f46393a.mo19365F().f21346v.mo39076b(this.f46393a.mo19274f().currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39032b() {
        String str;
        this.f46393a.mo19273e().mo19272b();
        if (mo39034d()) {
            if (mo39035e()) {
                this.f46393a.mo19365F().f21345u.mo39099b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f46393a.mo19367I().mo38956u(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmpx", bundle);
            } else {
                String a = this.f46393a.mo19365F().f21345u.mo39098a();
                if (TextUtils.isEmpty(a)) {
                    this.f46393a.mo19276j().mo19284t().mo38856a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f46393a.mo19365F().f21346v.mo39075a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f46393a.mo19367I().mo38956u(str, "_cmp", (Bundle) pair.second);
                }
                this.f46393a.mo19365F().f21345u.mo39099b((String) null);
            }
            this.f46393a.mo19365F().f21346v.mo39076b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo39033c() {
        if (mo39034d() && mo39035e()) {
            this.f46393a.mo19365F().f21345u.mo39099b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo39034d() {
        return this.f46393a.mo19365F().f21346v.mo39075a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo39035e() {
        if (mo39034d() && this.f46393a.mo19274f().currentTimeMillis() - this.f46393a.mo19365F().f21346v.mo39075a() > this.f46393a.mo19392z().mo19351q((String) null, C9903s2.f46668S)) {
            return true;
        }
        return false;
    }
}
