package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w32 {

    /* renamed from: a */
    private final C7728gq f40686a;

    /* renamed from: b */
    private final Context f40687b;

    /* renamed from: c */
    private final e32 f40688c;

    /* renamed from: d */
    private final zzcjf f40689d;

    /* renamed from: e */
    private final String f40690e;

    /* renamed from: f */
    private final nw2 f40691f;

    /* renamed from: g */
    private final zzg f40692g = zzt.zzo().mo18583h();

    public w32(Context context, zzcjf zzcjf, C7728gq gqVar, e32 e32, String str, nw2 nw2) {
        this.f40687b = context;
        this.f40689d = zzcjf;
        this.f40686a = gqVar;
        this.f40688c = e32;
        this.f40690e = str;
        this.f40691f = nw2;
    }

    /* renamed from: c */
    private static final void m39022c(SQLiteDatabase sQLiteDatabase, ArrayList<C8097qs> arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C8097qs qsVar = arrayList.get(i);
            if (qsVar.mo34413b0() == 2 && qsVar.mo34406K() > j) {
                j = qsVar.mo34406K();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo35549a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        String str2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            this.f40687b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
            mw2 b = mw2.m34936b("oa_upload");
            b.mo33603a("oa_failed_reqs", String.valueOf(r32.m36913a(sQLiteDatabase2, 0)));
            b.mo33603a("oa_total_reqs", String.valueOf(r32.m36913a(sQLiteDatabase2, 1)));
            b.mo33603a("oa_upload_time", String.valueOf(zzt.zzA().currentTimeMillis()));
            b.mo33603a("oa_last_successful_time", String.valueOf(r32.m36914b(sQLiteDatabase2, 2)));
            if (this.f40692g.zzL()) {
                str = "";
            } else {
                str = this.f40690e;
            }
            b.mo33603a("oa_session_id", str);
            this.f40691f.mo31048a(b);
            ArrayList<C8097qs> c = r32.m36915c(sQLiteDatabase);
            m39022c(sQLiteDatabase2, c);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8097qs qsVar = c.get(i2);
                mw2 b2 = mw2.m34936b("oa_signals");
                if (this.f40692g.zzL()) {
                    str2 = "";
                } else {
                    str2 = this.f40690e;
                }
                b2.mo33603a("oa_session_id", str2);
                C7915ls L = qsVar.mo34407L();
                String valueOf = L.mo33391J() ? String.valueOf(L.mo33393L() - 1) : "-1";
                String obj = i73.m33108b(qsVar.mo34409Q(), v32.f40291a).toString();
                b2.mo33603a("oa_sig_ts", String.valueOf(qsVar.mo34406K()));
                b2.mo33603a("oa_sig_status", String.valueOf(qsVar.mo34413b0() - 1));
                b2.mo33603a("oa_sig_resp_lat", String.valueOf(qsVar.mo34405J()));
                b2.mo33603a("oa_sig_render_lat", String.valueOf(qsVar.mo34404I()));
                b2.mo33603a("oa_sig_formats", obj);
                b2.mo33603a("oa_sig_nw_type", valueOf);
                b2.mo33603a("oa_sig_wifi", String.valueOf(qsVar.mo34414c0() - 1));
                b2.mo33603a("oa_sig_airplane", String.valueOf(qsVar.mo34410Y() - 1));
                b2.mo33603a("oa_sig_data", String.valueOf(qsVar.mo34411Z() - 1));
                b2.mo33603a("oa_sig_nw_resp", String.valueOf(qsVar.mo34403H()));
                b2.mo33603a("oa_sig_offline", String.valueOf(qsVar.mo34412a0() - 1));
                b2.mo33603a("oa_sig_nw_state", String.valueOf(qsVar.mo34408P().zza()));
                if (L.mo33390I() && L.mo33391J() && L.mo33393L() == 2) {
                    b2.mo33603a("oa_sig_cell_type", String.valueOf(L.mo33392K() - 1));
                }
                this.f40691f.mo31048a(b2);
            }
        } else {
            ArrayList<C8097qs> c2 = r32.m36915c(sQLiteDatabase);
            C8132rs E = C8275vs.m38908E();
            E.mo34585B(this.f40687b.getPackageName());
            E.mo34586C(Build.MODEL);
            E.mo34587H(r32.m36913a(sQLiteDatabase2, 0));
            E.mo34591y(c2);
            E.mo34589J(r32.m36913a(sQLiteDatabase2, 1));
            E.mo34590K(zzt.zzA().currentTimeMillis());
            E.mo34588I(r32.m36914b(sQLiteDatabase2, 2));
            m39022c(sQLiteDatabase2, c2);
            this.f40686a.mo32216b(new s32((C8275vs) E.mo32424p()));
            C7731gt E2 = C7769ht.m32940E();
            E2.mo32285y(this.f40689d.f43037c);
            E2.mo32284C(this.f40689d.f43038d);
            if (true == this.f40689d.f43039e) {
                i = 0;
            }
            E2.mo32283B(i);
            this.f40686a.mo32216b(new t32((C7769ht) E2.mo32424p()));
            this.f40686a.mo32217c(10004);
        }
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    /* renamed from: b */
    public final void mo35550b(boolean z) {
        try {
            this.f40688c.mo31464a(new u32(this, z));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            co0.zzg(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
