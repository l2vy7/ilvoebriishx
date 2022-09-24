package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cd2 implements zi2<dd2> {

    /* renamed from: a */
    private final nb3 f30339a;

    /* renamed from: b */
    private final Context f30340b;

    /* renamed from: c */
    private final bs2 f30341c;

    /* renamed from: d */
    private final View f30342d;

    public cd2(nb3 nb3, Context context, bs2 bs2, ViewGroup viewGroup) {
        this.f30339a = nb3;
        this.f30340b = context;
        this.f30341c = bs2;
        this.f30342d = viewGroup;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ dd2 mo30884a() throws Exception {
        Context context = this.f30340b;
        zzbfi zzbfi = this.f30341c.f30088e;
        ArrayList arrayList = new ArrayList();
        View view = this.f30342d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString(SessionDescription.ATTR_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new dd2(context, zzbfi, arrayList);
    }

    public final mb3<dd2> zzb() {
        return this.f30339a.mo33675b(new bd2(this));
    }
}
