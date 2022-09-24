package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p150t.C6077a;
import p257v4.C11058b;

public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new C7051b();

    /* renamed from: h */
    private static final C6077a<String, FastJsonResponse.Field<?, ?>> f28168h;

    /* renamed from: b */
    private final int f28169b;

    /* renamed from: c */
    private List<String> f28170c;

    /* renamed from: d */
    private List<String> f28171d;

    /* renamed from: e */
    private List<String> f28172e;

    /* renamed from: f */
    private List<String> f28173f;

    /* renamed from: g */
    private List<String> f28174g;

    static {
        C6077a<String, FastJsonResponse.Field<?, ?>> aVar = new C6077a<>();
        f28168h = aVar;
        aVar.put("registered", FastJsonResponse.Field.m30131H0("registered", 2));
        aVar.put("in_progress", FastJsonResponse.Field.m30131H0("in_progress", 3));
        aVar.put("success", FastJsonResponse.Field.m30131H0("success", 4));
        aVar.put("failed", FastJsonResponse.Field.m30131H0("failed", 5));
        aVar.put("escrowed", FastJsonResponse.Field.m30131H0("escrowed", 6));
    }

    public zzo() {
        this.f28169b = 1;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo29036a() {
        return f28168h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo29037b(FastJsonResponse.Field field) {
        switch (field.mo30209I0()) {
            case 1:
                return Integer.valueOf(this.f28169b);
            case 2:
                return this.f28170c;
            case 3:
                return this.f28171d;
            case 4:
                return this.f28172e;
            case 5:
                return this.f28173f;
            case 6:
                return this.f28174g;
            default:
                int I0 = field.mo30209I0();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(I0);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo29038e(FastJsonResponse.Field field) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f28169b);
        C11058b.m49539y(parcel, 2, this.f28170c, false);
        C11058b.m49539y(parcel, 3, this.f28171d, false);
        C11058b.m49539y(parcel, 4, this.f28172e, false);
        C11058b.m49539y(parcel, 5, this.f28173f, false);
        C11058b.m49539y(parcel, 6, this.f28174g, false);
        C11058b.m49516b(parcel, a);
    }

    zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f28169b = i;
        this.f28170c = list;
        this.f28171d = list2;
        this.f28172e = list3;
        this.f28173f = list4;
        this.f28174g = list5;
    }
}
