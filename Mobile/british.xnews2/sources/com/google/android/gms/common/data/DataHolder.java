package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p254u4.C11025a;
import p256v4.C11058b;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C7359c();

    /* renamed from: l */
    private static final C7356a f29226l = new C7358b(new String[0], (String) null);

    /* renamed from: b */
    final int f29227b;

    /* renamed from: c */
    private final String[] f29228c;

    /* renamed from: d */
    Bundle f29229d;

    /* renamed from: e */
    private final CursorWindow[] f29230e;

    /* renamed from: f */
    private final int f29231f;

    /* renamed from: g */
    private final Bundle f29232g;

    /* renamed from: h */
    int[] f29233h;

    /* renamed from: i */
    int f29234i;

    /* renamed from: j */
    boolean f29235j = false;

    /* renamed from: k */
    private boolean f29236k = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7356a {

        /* renamed from: a */
        private final String[] f29237a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f29238b = new ArrayList<>();

        /* renamed from: c */
        private final HashMap<Object, Integer> f29239c = new HashMap<>();

        /* synthetic */ C7356a(String[] strArr, String str, C11025a aVar) {
            this.f29237a = (String[]) C4604n.m20098k(strArr);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f29227b = i;
        this.f29228c = strArr;
        this.f29230e = cursorWindowArr;
        this.f29231f = i2;
        this.f29232g = bundle;
    }

    /* renamed from: C0 */
    public Bundle mo29980C0() {
        return this.f29232g;
    }

    /* renamed from: D0 */
    public int mo29981D0() {
        return this.f29231f;
    }

    /* renamed from: E0 */
    public final void mo29982E0() {
        this.f29229d = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f29228c;
            if (i2 >= strArr.length) {
                break;
            }
            this.f29229d.putInt(strArr[i2], i2);
            i2++;
        }
        this.f29233h = new int[this.f29230e.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f29230e;
            if (i < cursorWindowArr.length) {
                this.f29233h[i] = i3;
                i3 += this.f29230e[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f29234i = i3;
                return;
            }
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.f29235j) {
                this.f29235j = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f29230e;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f29236k && this.f29230e.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f29235j;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49538x(parcel, 1, this.f29228c, false);
        C11058b.m49540z(parcel, 2, this.f29230e, i, false);
        C11058b.m49527m(parcel, 3, mo29981D0());
        C11058b.m49519e(parcel, 4, mo29980C0(), false);
        C11058b.m49527m(parcel, 1000, this.f29227b);
        C11058b.m49516b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
