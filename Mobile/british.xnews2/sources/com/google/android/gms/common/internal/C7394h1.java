package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import p256v4.C11056a;
import p256v4.C11058b;

/* renamed from: com.google.android.gms.common.internal.h1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7394h1 implements Parcelable.Creator<GetServiceRequest> {
    /* renamed from: a */
    static void m30008a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, getServiceRequest.f29275b);
        C11058b.m49527m(parcel, 2, getServiceRequest.f29276c);
        C11058b.m49527m(parcel, 3, getServiceRequest.f29277d);
        C11058b.m49537w(parcel, 4, getServiceRequest.f29278e, false);
        C11058b.m49526l(parcel, 5, getServiceRequest.f29279f, false);
        C11058b.m49540z(parcel, 6, getServiceRequest.f29280g, i, false);
        C11058b.m49519e(parcel, 7, getServiceRequest.f29281h, false);
        C11058b.m49535u(parcel, 8, getServiceRequest.f29282i, i, false);
        C11058b.m49540z(parcel, 10, getServiceRequest.f29283j, i, false);
        C11058b.m49540z(parcel, 11, getServiceRequest.f29284k, i, false);
        C11058b.m49517c(parcel, 12, getServiceRequest.f29285l);
        C11058b.m49527m(parcel, 13, getServiceRequest.f29286m);
        C11058b.m49517c(parcel, 14, getServiceRequest.f29287n);
        C11058b.m49537w(parcel, 15, getServiceRequest.mo30030C0(), false);
        C11058b.m49516b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 3:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    iBinder = C11056a.m49473E(parcel2, D);
                    break;
                case 6:
                    scopeArr = (Scope[]) C11056a.m49503t(parcel2, D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C11056a.m49489f(parcel2, D);
                    break;
                case 8:
                    account = (Account) C11056a.m49499p(parcel2, D, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) C11056a.m49503t(parcel2, D, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C11056a.m49503t(parcel2, D, Feature.CREATOR);
                    break;
                case 12:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 13:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 14:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 15:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
