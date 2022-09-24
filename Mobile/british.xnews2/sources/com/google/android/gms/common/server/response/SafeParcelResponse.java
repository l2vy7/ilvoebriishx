package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p006a5.C6480b;
import p006a5.C6481c;
import p006a5.C6489l;
import p006a5.C6490m;
import p256v4.C11056a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C7463e();

    /* renamed from: b */
    private final int f29432b;

    /* renamed from: c */
    private final Parcel f29433c;

    /* renamed from: d */
    private final int f29434d = 2;

    /* renamed from: e */
    private final zan f29435e;

    /* renamed from: f */
    private final String f29436f;

    /* renamed from: g */
    private int f29437g;

    /* renamed from: h */
    private int f29438h;

    SafeParcelResponse(int i, Parcel parcel, zan zan) {
        this.f29432b = i;
        this.f29433c = (Parcel) C4604n.m20098k(parcel);
        this.f29435e = zan;
        this.f29436f = zan == null ? null : zan.mo30235C0();
        this.f29437g = 2;
    }

    /* renamed from: j */
    private final void m30143j(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).mo30209I0(), next);
        }
        sb.append('{');
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(C11056a.m49506w(D));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.mo30215P0()) {
                    int i = field.f29424e;
                    switch (i) {
                        case 0:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, Integer.valueOf(C11056a.m49474F(parcel, D))));
                            break;
                        case 1:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, C11056a.m49486c(parcel, D)));
                            break;
                        case 2:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, Long.valueOf(C11056a.m49476H(parcel, D))));
                            break;
                        case 3:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, Float.valueOf(C11056a.m49470B(parcel, D))));
                            break;
                        case 4:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, Double.valueOf(C11056a.m49509z(parcel, D))));
                            break;
                        case 5:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, C11056a.m49484a(parcel, D)));
                            break;
                        case 6:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, Boolean.valueOf(C11056a.m49507x(parcel, D))));
                            break;
                        case 7:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, C11056a.m49500q(parcel, D)));
                            break;
                        case 8:
                        case 9:
                            m30145l(sb, field, FastJsonResponse.m30119g(field, C11056a.m49490g(parcel, D)));
                            break;
                        case 10:
                            Bundle f = C11056a.m49489f(parcel, D);
                            HashMap hashMap = new HashMap();
                            for (String str : f.keySet()) {
                                hashMap.put(str, (String) C4604n.m20098k(f.getString(str)));
                            }
                            m30145l(sb, field, FastJsonResponse.m30119g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f29425f) {
                    sb.append("[");
                    switch (field.f29424e) {
                        case 0:
                            C6480b.m28241f(sb, C11056a.m49494k(parcel, D));
                            break;
                        case 1:
                            C6480b.m28243h(sb, C11056a.m49487d(parcel, D));
                            break;
                        case 2:
                            C6480b.m28242g(sb, C11056a.m49496m(parcel, D));
                            break;
                        case 3:
                            C6480b.m28240e(sb, C11056a.m49493j(parcel, D));
                            break;
                        case 4:
                            C6480b.m28239d(sb, C11056a.m49492i(parcel, D));
                            break;
                        case 5:
                            C6480b.m28243h(sb, C11056a.m49485b(parcel, D));
                            break;
                        case 6:
                            C6480b.m28244i(sb, C11056a.m49488e(parcel, D));
                            break;
                        case 7:
                            C6480b.m28245j(sb, C11056a.m49501r(parcel, D));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] o = C11056a.m49498o(parcel, D);
                            int length = o.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                o[i2].setDataPosition(0);
                                m30143j(sb, field.mo30213N0(), o[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f29424e) {
                        case 0:
                            sb.append(C11056a.m49474F(parcel, D));
                            break;
                        case 1:
                            sb.append(C11056a.m49486c(parcel, D));
                            break;
                        case 2:
                            sb.append(C11056a.m49476H(parcel, D));
                            break;
                        case 3:
                            sb.append(C11056a.m49470B(parcel, D));
                            break;
                        case 4:
                            sb.append(C11056a.m49509z(parcel, D));
                            break;
                        case 5:
                            sb.append(C11056a.m49484a(parcel, D));
                            break;
                        case 6:
                            sb.append(C11056a.m49507x(parcel, D));
                            break;
                        case 7:
                            String q = C11056a.m49500q(parcel, D);
                            sb.append("\"");
                            sb.append(C6489l.m28275b(q));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = C11056a.m49490g(parcel, D);
                            sb.append("\"");
                            sb.append(C6481c.m28246a(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = C11056a.m49490g(parcel, D);
                            sb.append("\"");
                            sb.append(C6481c.m28247b(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = C11056a.m49489f(parcel, D);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(C6489l.m28275b(f2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel n = C11056a.m49497n(parcel, D);
                            n.setDataPosition(0);
                            m30143j(sb, field.mo30213N0(), n);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == M) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(M);
        throw new C11056a.C11057a(sb3.toString(), parcel);
    }

    /* renamed from: k */
    private static final void m30144k(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C6489l.m28275b(C4604n.m20098k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C6481c.m28246a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C6481c.m28247b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C6490m.m28276a(sb, (HashMap) C4604n.m20098k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: l */
    private static final void m30145l(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f29423d) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m30144k(sb, field.f29422c, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m30144k(sb, field.f29422c, obj);
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo29036a() {
        zan zan = this.f29435e;
        if (zan == null) {
            return null;
        }
        return zan.mo30236D0((String) C4604n.m20098k(this.f29436f));
    }

    /* renamed from: d */
    public final Object mo30206d(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: f */
    public final boolean mo30207f(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: i */
    public final Parcel mo30221i() {
        int i = this.f29437g;
        if (i == 0) {
            int a = C11058b.m49515a(this.f29433c);
            this.f29438h = a;
            C11058b.m49516b(this.f29433c, a);
            this.f29437g = 2;
        } else if (i == 1) {
            C11058b.m49516b(this.f29433c, this.f29438h);
            this.f29437g = 2;
        }
        return this.f29433c;
    }

    public final String toString() {
        C4604n.m20099l(this.f29435e, "Cannot convert to JSON on client side.");
        Parcel i = mo30221i();
        i.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m30143j(sb, (Map) C4604n.m20098k(this.f29435e.mo30236D0((String) C4604n.m20098k(this.f29436f))), i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zan zan;
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29432b);
        C11058b.m49534t(parcel, 2, mo30221i(), false);
        int i2 = this.f29434d;
        if (i2 != 0) {
            zan = i2 != 1 ? this.f29435e : this.f29435e;
        } else {
            zan = null;
        }
        C11058b.m49535u(parcel, 3, zan, i, false);
        C11058b.m49516b(parcel, a);
    }
}
