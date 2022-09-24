package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import p149t.C6077a;
import p240o7.C10862d;
import p256v4.C11058b;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C10862d();

    /* renamed from: b */
    Bundle f48969b;

    /* renamed from: c */
    private Map<String, String> f48970c;

    public RemoteMessage(Bundle bundle) {
        this.f48969b = bundle;
    }

    /* renamed from: C0 */
    public final Map<String, String> mo41944C0() {
        if (this.f48970c == null) {
            Bundle bundle = this.f48969b;
            C6077a aVar = new C6077a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f48970c = aVar;
        }
        return this.f48970c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49519e(parcel, 2, this.f48969b, false);
        C11058b.m49516b(parcel, a);
    }
}
