package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zr2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzbfd f42560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzbfi f42561b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f42562c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzbkq f42563d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f42564e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<String> f42565f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<String> f42566g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public zzbnw f42567h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzbfo f42568i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AdManagerAdViewOptions f42569j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public PublisherAdViewOptions f42570k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C8385yw f42571l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f42572m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public zzbtz f42573n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final or2 f42574o = new or2();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f42575p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public cc2 f42576q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C7590cx f42577r;

    /* renamed from: D */
    public final or2 mo36099D() {
        return this.f42574o;
    }

    /* renamed from: E */
    public final zr2 mo36100E(bs2 bs2) {
        this.f42574o.mo33995a(bs2.f30098o.f38265a);
        this.f42560a = bs2.f30087d;
        this.f42561b = bs2.f30088e;
        this.f42577r = bs2.f30100q;
        this.f42562c = bs2.f30089f;
        this.f42563d = bs2.f30084a;
        this.f42565f = bs2.f30090g;
        this.f42566g = bs2.f30091h;
        this.f42567h = bs2.f30092i;
        this.f42568i = bs2.f30093j;
        mo36101F(bs2.f30095l);
        mo36113c(bs2.f30096m);
        this.f42575p = bs2.f30099p;
        this.f42576q = bs2.f30086c;
        return this;
    }

    /* renamed from: F */
    public final zr2 mo36101F(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f42569j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f42564e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    /* renamed from: G */
    public final zr2 mo36102G(zzbfi zzbfi) {
        this.f42561b = zzbfi;
        return this;
    }

    /* renamed from: H */
    public final zr2 mo36103H(String str) {
        this.f42562c = str;
        return this;
    }

    /* renamed from: I */
    public final zr2 mo36104I(zzbfo zzbfo) {
        this.f42568i = zzbfo;
        return this;
    }

    /* renamed from: J */
    public final zr2 mo36105J(cc2 cc2) {
        this.f42576q = cc2;
        return this;
    }

    /* renamed from: K */
    public final zr2 mo36106K(zzbtz zzbtz) {
        this.f42573n = zzbtz;
        this.f42563d = new zzbkq(false, true, false);
        return this;
    }

    /* renamed from: L */
    public final zr2 mo36107L(boolean z) {
        this.f42575p = z;
        return this;
    }

    /* renamed from: M */
    public final zr2 mo36108M(boolean z) {
        this.f42564e = z;
        return this;
    }

    /* renamed from: N */
    public final zr2 mo36109N(int i) {
        this.f42572m = i;
        return this;
    }

    /* renamed from: O */
    public final zr2 mo36110O(zzbnw zzbnw) {
        this.f42567h = zzbnw;
        return this;
    }

    /* renamed from: a */
    public final zr2 mo36111a(ArrayList<String> arrayList) {
        this.f42565f = arrayList;
        return this;
    }

    /* renamed from: b */
    public final zr2 mo36112b(ArrayList<String> arrayList) {
        this.f42566g = arrayList;
        return this;
    }

    /* renamed from: c */
    public final zr2 mo36113c(PublisherAdViewOptions publisherAdViewOptions) {
        this.f42570k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f42564e = publisherAdViewOptions.zzc();
            this.f42571l = publisherAdViewOptions.zza();
        }
        return this;
    }

    /* renamed from: d */
    public final zr2 mo36114d(zzbfd zzbfd) {
        this.f42560a = zzbfd;
        return this;
    }

    /* renamed from: e */
    public final zr2 mo36115e(zzbkq zzbkq) {
        this.f42563d = zzbkq;
        return this;
    }

    /* renamed from: f */
    public final bs2 mo36116f() {
        C4604n.m20099l(this.f42562c, "ad unit must not be null");
        C4604n.m20099l(this.f42561b, "ad size must not be null");
        C4604n.m20099l(this.f42560a, "ad request must not be null");
        return new bs2(this, (as2) null);
    }

    /* renamed from: h */
    public final String mo36117h() {
        return this.f42562c;
    }

    /* renamed from: m */
    public final boolean mo36118m() {
        return this.f42575p;
    }

    /* renamed from: o */
    public final zr2 mo36119o(C7590cx cxVar) {
        this.f42577r = cxVar;
        return this;
    }

    /* renamed from: t */
    public final zzbfd mo36120t() {
        return this.f42560a;
    }

    /* renamed from: v */
    public final zzbfi mo36121v() {
        return this.f42561b;
    }
}
