package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import p198d5.C10489b;
import p198d5.C10490c;

/* renamed from: com.google.android.gms.common.internal.m0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7410m0 extends C10490c<C7393h0> {

    /* renamed from: c */
    private static final C7410m0 f29338c = new C7410m0();

    private C7410m0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m30032c(Context context, int i, int i2) throws C10490c.C10491a {
        C7410m0 m0Var = f29338c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) C10489b.m48194f3(((C7393h0) m0Var.mo42606b(context)).mo30103n6(C10489b.m48195m6(context), zax));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new C10490c.C10491a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof C7393h0 ? (C7393h0) queryLocalInterface : new C7393h0(iBinder);
    }
}
