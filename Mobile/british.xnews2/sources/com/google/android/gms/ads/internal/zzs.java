package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C7497ab;
import com.google.android.gms.internal.ads.C7518aw;
import com.google.android.gms.internal.ads.C7533bb;
import com.google.android.gms.internal.ads.C7555by;
import com.google.android.gms.internal.ads.C7590cx;
import com.google.android.gms.internal.ads.C7624dw;
import com.google.android.gms.internal.ads.C7654ep;
import com.google.android.gms.internal.ads.C7663ey;
import com.google.android.gms.internal.ads.C7699fx;
import com.google.android.gms.internal.ads.C7772hw;
import com.google.android.gms.internal.ads.C7774hy;
import com.google.android.gms.internal.ads.C8101qw;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8279vw;
import com.google.android.gms.internal.ads.C8385yw;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.ih0;
import com.google.android.gms.internal.ads.l10;
import com.google.android.gms.internal.ads.lh0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.vn0;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import p198d5.C10487a;
import p198d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzs extends C8101qw {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzcjf f19881b;

    /* renamed from: c */
    private final zzbfi f19882c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Future<C7497ab> f19883d = po0.f37722a.mo33675b(new zzo(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f19884e;

    /* renamed from: f */
    private final zzr f19885f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WebView f19886g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7624dw f19887h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7497ab f19888i;

    /* renamed from: j */
    private AsyncTask<Void, Void, String> f19889j;

    public zzs(Context context, zzbfi zzbfi, String str, zzcjf zzcjf) {
        this.f19884e = context;
        this.f19881b = zzcjf;
        this.f19882c = zzbfi;
        this.f19886g = new WebView(context);
        this.f19885f = new zzr(context, str);
        mo17655n6(0);
        this.f19886g.setVerticalScrollBarEnabled(false);
        this.f19886g.getSettings().setJavaScriptEnabled(true);
        this.f19886g.setWebViewClient(new zzm(this));
        this.f19886g.setOnTouchListener(new zzn(this));
    }

    /* renamed from: t6 */
    static /* bridge */ /* synthetic */ String m19823t6(zzs zzs, String str) {
        if (zzs.f19888i == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzs.f19888i.mo30329a(parse, zzs.f19884e, (View) null, (Activity) null);
        } catch (C7533bb e) {
            co0.zzk("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: w6 */
    static /* bridge */ /* synthetic */ void m19826w6(zzs zzs, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzs.f19884e.startActivity(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo17654a(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C8241uv.m38463b();
            return vn0.m38860s(this.f19884e, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n6 */
    public final void mo17655n6(int i) {
        if (this.f19886g != null) {
            this.f19886g.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzB() throws RemoteException {
        C4604n.m20093f("resume must be called on the main UI thread.");
    }

    public final void zzC(C7518aw awVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzD(C7624dw dwVar) throws RemoteException {
        this.f19887h = dwVar;
    }

    public final void zzE(C8279vw vwVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzF(zzbfi zzbfi) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zzG(C8385yw ywVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzH(C7654ep epVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzI(zzbfo zzbfo) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzJ(C7699fx fxVar) {
    }

    public final void zzK(zzbjd zzbjd) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzM(ih0 ih0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzN(boolean z) throws RemoteException {
    }

    public final void zzO(l10 l10) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzP(C7555by byVar) {
    }

    public final void zzQ(lh0 lh0, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzS(qj0 qj0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzU(zzbkq zzbkq) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzW(C10487a aVar) {
    }

    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(zzbfd zzbfd) throws RemoteException {
        C4604n.m20099l(this.f19886g, "This Search Ad has already been torn down");
        this.f19885f.zzf(zzbfd, this.f19881b);
        this.f19889j = new zzq(this, (zzp) null).execute(new Void[0]);
        return true;
    }

    public final void zzab(C7590cx cxVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    public final zzbfi zzg() throws RemoteException {
        return this.f19882c;
    }

    public final C7624dw zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final C8385yw zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final C7663ey zzk() {
        return null;
    }

    public final C7774hy zzl() {
        return null;
    }

    public final C10487a zzn() throws RemoteException {
        C4604n.m20093f("getAdFrame must be called on the main UI thread.");
        return C10489b.m48195m6(this.f19886g);
    }

    /* access modifiers changed from: package-private */
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(u10.f39718d.mo34648e());
        builder.appendQueryParameter("query", this.f19885f.zzd());
        builder.appendQueryParameter("pubId", this.f19885f.zzc());
        builder.appendQueryParameter("mappver", this.f19885f.zza());
        Map<String, String> zze = this.f19885f.zze();
        for (String next : zze.keySet()) {
            builder.appendQueryParameter(next, zze.get(next));
        }
        Uri build = builder.build();
        C7497ab abVar = this.f19888i;
        if (abVar != null) {
            try {
                build = abVar.mo30330b(build, this.f19884e);
            } catch (C7533bb e) {
                co0.zzk("Unable to process ad data", e);
            }
        }
        String zzq = zzq();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(zzq.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzq);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzq() {
        String zzb = this.f19885f.zzb();
        if (true == TextUtils.isEmpty(zzb)) {
            zzb = "www.google.com";
        }
        String e = u10.f39718d.mo34648e();
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 8 + String.valueOf(e).length());
        sb.append("https://");
        sb.append(zzb);
        sb.append(e);
        return sb.toString();
    }

    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String zzs() throws RemoteException {
        return null;
    }

    public final String zzt() throws RemoteException {
        return null;
    }

    public final void zzx() throws RemoteException {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        this.f19889j.cancel(true);
        this.f19883d.cancel(true);
        this.f19886g.destroy();
        this.f19886g = null;
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
    }

    public final void zzz() throws RemoteException {
        C4604n.m20093f("pause must be called on the main UI thread.");
    }
}
