package com.ironsource.sdk.p293g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.g.b */
public final class C11700b implements Parcelable {
    public static final Parcelable.Creator<C11700b> CREATOR = new C11701a();

    /* renamed from: a */
    public String f52371a;

    /* renamed from: b */
    public String f52372b;

    /* renamed from: c */
    public String f52373c;

    /* renamed from: d */
    public boolean f52374d;

    /* renamed from: e */
    public int f52375e;

    /* renamed from: f */
    public String f52376f;

    /* renamed from: g */
    public String f52377g;

    /* renamed from: h */
    public boolean f52378h;

    /* renamed from: i */
    public boolean f52379i;

    /* renamed from: j */
    public Map<String, String> f52380j;

    /* renamed from: k */
    private ArrayList<String> f52381k;

    /* renamed from: l */
    private ArrayList<String> f52382l;

    /* renamed from: m */
    private ArrayList<String> f52383m;

    /* renamed from: n */
    private ArrayList<String> f52384n;

    /* renamed from: o */
    private Map<String, String> f52385o;

    /* renamed from: com.ironsource.sdk.g.b$a */
    static class C11701a implements Parcelable.Creator<C11700b> {
        C11701a() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C11700b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C11700b[i];
        }
    }

    public C11700b() {
        m51807b();
    }

    private C11700b(Parcel parcel) {
        m51807b();
        try {
            boolean z = true;
            this.f52374d = parcel.readByte() != 0;
            this.f52375e = parcel.readInt();
            this.f52371a = parcel.readString();
            this.f52372b = parcel.readString();
            this.f52373c = parcel.readString();
            this.f52376f = parcel.readString();
            this.f52377g = parcel.readString();
            this.f52385o = m51806a(parcel.readString());
            this.f52379i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f52378h = z;
            this.f52380j = m51806a(parcel.readString());
        } catch (Throwable unused) {
            m51807b();
        }
    }

    /* synthetic */ C11700b(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    private static Map<String, String> m51806a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: b */
    private void m51807b() {
        this.f52374d = false;
        this.f52375e = -1;
        this.f52381k = new ArrayList<>();
        this.f52382l = new ArrayList<>();
        this.f52383m = new ArrayList<>();
        this.f52384n = new ArrayList<>();
        this.f52378h = true;
        this.f52379i = false;
        this.f52377g = "";
        this.f52376f = "";
        this.f52385o = new HashMap();
        this.f52380j = new HashMap();
    }

    /* renamed from: a */
    public final void mo44993a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.f52383m.indexOf(str) == -1) {
            this.f52383m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f52374d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f52375e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f52381k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f52382l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f52376f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f52377g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f52385o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f52378h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f52379i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.f52380j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.f52374d ? 1 : 0));
            parcel.writeInt(this.f52375e);
            parcel.writeString(this.f52371a);
            parcel.writeString(this.f52372b);
            parcel.writeString(this.f52373c);
            parcel.writeString(this.f52376f);
            parcel.writeString(this.f52377g);
            parcel.writeString(new JSONObject(this.f52385o).toString());
            parcel.writeByte((byte) (this.f52379i ? 1 : 0));
            if (!this.f52378h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.f52380j).toString());
        } catch (Throwable unused) {
        }
    }
}
