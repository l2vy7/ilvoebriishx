package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C7395i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C7394h1();

    /* renamed from: b */
    final int f29275b;

    /* renamed from: c */
    final int f29276c;

    /* renamed from: d */
    int f29277d;

    /* renamed from: e */
    String f29278e;

    /* renamed from: f */
    IBinder f29279f;

    /* renamed from: g */
    Scope[] f29280g;

    /* renamed from: h */
    Bundle f29281h;

    /* renamed from: i */
    Account f29282i;

    /* renamed from: j */
    Feature[] f29283j;

    /* renamed from: k */
    Feature[] f29284k;

    /* renamed from: l */
    boolean f29285l;

    /* renamed from: m */
    int f29286m;

    /* renamed from: n */
    boolean f29287n;

    /* renamed from: o */
    private String f29288o;

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        this.f29275b = i;
        this.f29276c = i2;
        this.f29277d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f29278e = "com.google.android.gms";
        } else {
            this.f29278e = str;
        }
        if (i < 2) {
            this.f29282i = iBinder != null ? C7369a.m29985f3(C7395i.C7396a.m30009b2(iBinder)) : null;
        } else {
            this.f29279f = iBinder;
            this.f29282i = account;
        }
        this.f29280g = scopeArr;
        this.f29281h = bundle;
        this.f29283j = featureArr;
        this.f29284k = featureArr2;
        this.f29285l = z;
        this.f29286m = i4;
        this.f29287n = z2;
        this.f29288o = str2;
    }

    /* renamed from: C0 */
    public final String mo30030C0() {
        return this.f29288o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7394h1.m30008a(this, parcel, i);
    }

    public GetServiceRequest(int i, String str) {
        this.f29275b = 6;
        this.f29277d = C7353b.f29212a;
        this.f29276c = i;
        this.f29285l = true;
        this.f29288o = str;
    }
}
