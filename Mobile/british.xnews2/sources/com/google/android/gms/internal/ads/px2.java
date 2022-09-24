package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.List;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class px2 {

    /* renamed from: a */
    private final i82 f37798a;

    /* renamed from: b */
    private final String f37799b;

    /* renamed from: c */
    private final String f37800c;

    /* renamed from: d */
    private final String f37801d;

    /* renamed from: e */
    private final Context f37802e;

    /* renamed from: f */
    private final wr2 f37803f;

    /* renamed from: g */
    private final C6483e f37804g;

    /* renamed from: h */
    private final C7497ab f37805h;

    public px2(i82 i82, zzcjf zzcjf, String str, String str2, Context context, wr2 wr2, C6483e eVar, C7497ab abVar) {
        this.f37798a = i82;
        this.f37799b = zzcjf.f43036b;
        this.f37800c = str;
        this.f37801d = str2;
        this.f37802e = context;
        this.f37803f = wr2;
        this.f37804g = eVar;
        this.f37805h = abVar;
    }

    /* renamed from: d */
    public static final List<String> m36241d(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String f : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(m36243f(f, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m36242e(String str) {
        return (TextUtils.isEmpty(str) || !bo0.m30771l()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: f */
    private static String m36243f(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public final List<String> mo34215a(ur2 ur2, ir2 ir2, List<String> list) {
        return mo34216b(ur2, ir2, false, "", "", list);
    }

    /* renamed from: b */
    public final List<String> mo34216b(ur2 ur2, ir2 ir2, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? SessionDescription.SUPPORTED_SDP_VERSION : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        for (String f : list) {
            String f2 = m36243f(m36243f(m36243f(f, "@gw_adlocid@", ur2.f39936a.f38765a.f30089f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f37799b);
            if (ir2 != null) {
                f2 = mm0.m34822c(m36243f(m36243f(m36243f(f2, "@gw_qdata@", ir2.f33500z), "@gw_adnetid@", ir2.f33499y), "@gw_allocid@", ir2.f33498x), this.f37802e, ir2.f33457T);
            }
            String f3 = m36243f(m36243f(m36243f(f2, "@gw_adnetstatus@", this.f37798a.mo32570f()), "@gw_seqnum@", this.f37800c), "@gw_sessid@", this.f37801d);
            boolean z2 = false;
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37105h2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(f3);
                }
            }
            if (this.f37805h.mo30334f(Uri.parse(f3))) {
                Uri.Builder buildUpon = Uri.parse(f3).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                f3 = buildUpon.build().toString();
            }
            arrayList.add(f3);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<String> mo34217c(ir2 ir2, List<String> list, kj0 kj0) {
        String str;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.f37804g.currentTimeMillis();
        try {
            String zzc = kj0.zzc();
            String num = Integer.toString(kj0.zzb());
            wr2 wr2 = this.f37803f;
            String str2 = "";
            if (wr2 == null) {
                str = str2;
            } else {
                str = m36242e(wr2.f40858a);
            }
            wr2 wr22 = this.f37803f;
            if (wr22 != null) {
                str2 = m36242e(wr22.f40859b);
            }
            for (String f : list) {
                arrayList.add(mm0.m34822c(m36243f(m36243f(m36243f(m36243f(m36243f(m36243f(f, "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f37799b), this.f37802e, ir2.f33457T));
            }
            return arrayList;
        } catch (RemoteException e) {
            co0.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
