package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: d */
    public Object mo30206d(String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo29036a().values()) {
            if (mo29038e(next)) {
                if (!fastJsonResponse.mo29038e(next) || !C7408m.m30028a(mo29037b(next), fastJsonResponse.mo29037b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo29038e(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo30207f(String str) {
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo29036a().values()) {
            if (mo29038e(next)) {
                i = (i * 31) + C4604n.m20098k(mo29037b(next)).hashCode();
            }
        }
        return i;
    }
}
