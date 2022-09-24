package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collections;
import java.util.List;
import p150t.C6090g;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class im1 {

    /* renamed from: a */
    private int f33302a;

    /* renamed from: b */
    private C7774hy f33303b;

    /* renamed from: c */
    private i30 f33304c;

    /* renamed from: d */
    private View f33305d;

    /* renamed from: e */
    private List<?> f33306e;

    /* renamed from: f */
    private List<C8423zy> f33307f = Collections.emptyList();

    /* renamed from: g */
    private C8423zy f33308g;

    /* renamed from: h */
    private Bundle f33309h;

    /* renamed from: i */
    private xt0 f33310i;

    /* renamed from: j */
    private xt0 f33311j;

    /* renamed from: k */
    private xt0 f33312k;

    /* renamed from: l */
    private C10487a f33313l;

    /* renamed from: m */
    private View f33314m;

    /* renamed from: n */
    private View f33315n;

    /* renamed from: o */
    private C10487a f33316o;

    /* renamed from: p */
    private double f33317p;

    /* renamed from: q */
    private q30 f33318q;

    /* renamed from: r */
    private q30 f33319r;

    /* renamed from: s */
    private String f33320s;

    /* renamed from: t */
    private final C6090g<String, c30> f33321t = new C6090g<>();

    /* renamed from: u */
    private final C6090g<String, String> f33322u = new C6090g<>();

    /* renamed from: v */
    private float f33323v;

    /* renamed from: w */
    private String f33324w;

    /* renamed from: C */
    public static im1 m33249C(ed0 ed0) {
        try {
            hm1 G = m33253G(ed0.mo31523n6(), (id0) null);
            i30 o6 = ed0.mo31524o6();
            String zzo = ed0.zzo();
            List<?> r6 = ed0.mo31527r6();
            String zzm = ed0.zzm();
            Bundle zzf = ed0.zzf();
            String zzn = ed0.zzn();
            C10487a zzl = ed0.zzl();
            String zzq = ed0.zzq();
            String zzp = ed0.zzp();
            double zze = ed0.zze();
            q30 p6 = ed0.mo31525p6();
            im1 im1 = new im1();
            im1.f33302a = 2;
            im1.f33303b = G;
            im1.f33304c = o6;
            im1.f33305d = (View) m33255I(ed0.mo31526q6());
            im1.mo32694u("headline", zzo);
            im1.f33306e = r6;
            im1.mo32694u(TtmlNode.TAG_BODY, zzm);
            im1.f33309h = zzf;
            im1.mo32694u("call_to_action", zzn);
            im1.f33314m = (View) m33255I(ed0.zzk());
            im1.f33316o = zzl;
            im1.mo32694u("store", zzq);
            im1.mo32694u(InAppPurchaseMetaData.KEY_PRICE, zzp);
            im1.f33317p = zze;
            im1.f33318q = p6;
            return im1;
        } catch (RemoteException e) {
            co0.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: D */
    public static im1 m33250D(fd0 fd0) {
        try {
            hm1 G = m33253G(fd0.mo31803n6(), (id0) null);
            i30 o6 = fd0.mo31804o6();
            String zzo = fd0.zzo();
            List<?> r6 = fd0.mo31807r6();
            String zzm = fd0.zzm();
            Bundle zze = fd0.zze();
            String zzn = fd0.zzn();
            C10487a zzk = fd0.zzk();
            String zzl = fd0.zzl();
            q30 p6 = fd0.mo31805p6();
            im1 im1 = new im1();
            im1.f33302a = 1;
            im1.f33303b = G;
            im1.f33304c = o6;
            im1.f33305d = (View) m33255I(fd0.zzi());
            im1.mo32694u("headline", zzo);
            im1.f33306e = r6;
            im1.mo32694u(TtmlNode.TAG_BODY, zzm);
            im1.f33309h = zze;
            im1.mo32694u("call_to_action", zzn);
            im1.f33314m = (View) m33255I(fd0.mo31806q6());
            im1.f33316o = zzk;
            im1.mo32694u("advertiser", zzl);
            im1.f33319r = p6;
            return im1;
        } catch (RemoteException e) {
            co0.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: E */
    public static im1 m33251E(ed0 ed0) {
        try {
            return m33254H(m33253G(ed0.mo31523n6(), (id0) null), ed0.mo31524o6(), (View) m33255I(ed0.mo31526q6()), ed0.zzo(), ed0.mo31527r6(), ed0.zzm(), ed0.zzf(), ed0.zzn(), (View) m33255I(ed0.zzk()), ed0.zzl(), ed0.zzq(), ed0.zzp(), ed0.zze(), ed0.mo31525p6(), (String) null, 0.0f);
        } catch (RemoteException e) {
            co0.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: F */
    public static im1 m33252F(fd0 fd0) {
        try {
            return m33254H(m33253G(fd0.mo31803n6(), (id0) null), fd0.mo31804o6(), (View) m33255I(fd0.zzi()), fd0.zzo(), fd0.mo31807r6(), fd0.zzm(), fd0.zze(), fd0.zzn(), (View) m33255I(fd0.mo31806q6()), fd0.zzk(), (String) null, (String) null, -1.0d, fd0.mo31805p6(), fd0.zzl(), 0.0f);
        } catch (RemoteException e) {
            co0.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: G */
    private static hm1 m33253G(C7774hy hyVar, id0 id0) {
        if (hyVar == null) {
            return null;
        }
        return new hm1(hyVar, id0);
    }

    /* renamed from: H */
    private static im1 m33254H(C7774hy hyVar, i30 i30, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, C10487a aVar, String str4, String str5, double d, q30 q30, String str6, float f) {
        im1 im1 = new im1();
        im1.f33302a = 6;
        im1.f33303b = hyVar;
        im1.f33304c = i30;
        im1.f33305d = view;
        String str7 = str;
        im1.mo32694u("headline", str);
        im1.f33306e = list;
        String str8 = str2;
        im1.mo32694u(TtmlNode.TAG_BODY, str2);
        im1.f33309h = bundle;
        String str9 = str3;
        im1.mo32694u("call_to_action", str3);
        im1.f33314m = view2;
        im1.f33316o = aVar;
        String str10 = str4;
        im1.mo32694u("store", str4);
        String str11 = str5;
        im1.mo32694u(InAppPurchaseMetaData.KEY_PRICE, str5);
        im1.f33317p = d;
        im1.f33318q = q30;
        im1.mo32694u("advertiser", str6);
        im1.mo32689p(f);
        return im1;
    }

    /* renamed from: I */
    private static <T> T m33255I(C10487a aVar) {
        if (aVar == null) {
            return null;
        }
        return C10489b.m48194f3(aVar);
    }

    /* renamed from: a0 */
    public static im1 m33256a0(id0 id0) {
        try {
            return m33254H(m33253G(id0.zzj(), id0), id0.zzk(), (View) m33255I(id0.zzm()), id0.zzs(), id0.zzv(), id0.zzq(), id0.zzi(), id0.zzr(), (View) m33255I(id0.zzn()), id0.zzo(), id0.mo31206n(), id0.zzt(), id0.zze(), id0.zzl(), id0.zzp(), id0.zzf());
        } catch (RemoteException e) {
            co0.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double mo32648A() {
        return this.f33317p;
    }

    /* renamed from: B */
    public final synchronized void mo32649B(C10487a aVar) {
        this.f33313l = aVar;
    }

    /* renamed from: J */
    public final synchronized float mo32650J() {
        return this.f33323v;
    }

    /* renamed from: K */
    public final synchronized int mo32651K() {
        return this.f33302a;
    }

    /* renamed from: L */
    public final synchronized Bundle mo32652L() {
        if (this.f33309h == null) {
            this.f33309h = new Bundle();
        }
        return this.f33309h;
    }

    /* renamed from: M */
    public final synchronized View mo32653M() {
        return this.f33305d;
    }

    /* renamed from: N */
    public final synchronized View mo32654N() {
        return this.f33314m;
    }

    /* renamed from: O */
    public final synchronized View mo32655O() {
        return this.f33315n;
    }

    /* renamed from: P */
    public final synchronized C6090g<String, c30> mo32656P() {
        return this.f33321t;
    }

    /* renamed from: Q */
    public final synchronized C6090g<String, String> mo32657Q() {
        return this.f33322u;
    }

    /* renamed from: R */
    public final synchronized C7774hy mo32658R() {
        return this.f33303b;
    }

    /* renamed from: S */
    public final synchronized C8423zy mo32659S() {
        return this.f33308g;
    }

    /* renamed from: T */
    public final synchronized i30 mo32660T() {
        return this.f33304c;
    }

    /* renamed from: U */
    public final q30 mo32661U() {
        List<?> list = this.f33306e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f33306e.get(0);
            if (obj instanceof IBinder) {
                return p30.m35940n6((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized q30 mo32662V() {
        return this.f33318q;
    }

    /* renamed from: W */
    public final synchronized q30 mo32663W() {
        return this.f33319r;
    }

    /* renamed from: X */
    public final synchronized xt0 mo32664X() {
        return this.f33311j;
    }

    /* renamed from: Y */
    public final synchronized xt0 mo32665Y() {
        return this.f33312k;
    }

    /* renamed from: Z */
    public final synchronized xt0 mo32666Z() {
        return this.f33310i;
    }

    /* renamed from: a */
    public final synchronized String mo32667a() {
        return this.f33324w;
    }

    /* renamed from: b */
    public final synchronized String mo32668b() {
        return mo32672d(InAppPurchaseMetaData.KEY_PRICE);
    }

    /* renamed from: b0 */
    public final synchronized C10487a mo32669b0() {
        return this.f33316o;
    }

    /* renamed from: c */
    public final synchronized String mo32670c() {
        return mo32672d("store");
    }

    /* renamed from: c0 */
    public final synchronized C10487a mo32671c0() {
        return this.f33313l;
    }

    /* renamed from: d */
    public final synchronized String mo32672d(String str) {
        return this.f33322u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String mo32673d0() {
        return mo32672d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List<?> mo32674e() {
        return this.f33306e;
    }

    /* renamed from: e0 */
    public final synchronized String mo32675e0() {
        return mo32672d(TtmlNode.TAG_BODY);
    }

    /* renamed from: f */
    public final synchronized List<C8423zy> mo32676f() {
        return this.f33307f;
    }

    /* renamed from: f0 */
    public final synchronized String mo32677f0() {
        return mo32672d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void mo32678g() {
        xt0 xt0 = this.f33310i;
        if (xt0 != null) {
            xt0.destroy();
            this.f33310i = null;
        }
        xt0 xt02 = this.f33311j;
        if (xt02 != null) {
            xt02.destroy();
            this.f33311j = null;
        }
        xt0 xt03 = this.f33312k;
        if (xt03 != null) {
            xt03.destroy();
            this.f33312k = null;
        }
        this.f33313l = null;
        this.f33321t.clear();
        this.f33322u.clear();
        this.f33303b = null;
        this.f33304c = null;
        this.f33305d = null;
        this.f33306e = null;
        this.f33309h = null;
        this.f33314m = null;
        this.f33315n = null;
        this.f33316o = null;
        this.f33318q = null;
        this.f33319r = null;
        this.f33320s = null;
    }

    /* renamed from: g0 */
    public final synchronized String mo32679g0() {
        return this.f33320s;
    }

    /* renamed from: h */
    public final synchronized void mo32680h(i30 i30) {
        this.f33304c = i30;
    }

    /* renamed from: h0 */
    public final synchronized String mo32681h0() {
        return mo32672d("headline");
    }

    /* renamed from: i */
    public final synchronized void mo32682i(String str) {
        this.f33320s = str;
    }

    /* renamed from: j */
    public final synchronized void mo32683j(C8423zy zyVar) {
        this.f33308g = zyVar;
    }

    /* renamed from: k */
    public final synchronized void mo32684k(q30 q30) {
        this.f33318q = q30;
    }

    /* renamed from: l */
    public final synchronized void mo32685l(String str, c30 c30) {
        if (c30 == null) {
            this.f33321t.remove(str);
        } else {
            this.f33321t.put(str, c30);
        }
    }

    /* renamed from: m */
    public final synchronized void mo32686m(xt0 xt0) {
        this.f33311j = xt0;
    }

    /* renamed from: n */
    public final synchronized void mo32687n(List<c30> list) {
        this.f33306e = list;
    }

    /* renamed from: o */
    public final synchronized void mo32688o(q30 q30) {
        this.f33319r = q30;
    }

    /* renamed from: p */
    public final synchronized void mo32689p(float f) {
        this.f33323v = f;
    }

    /* renamed from: q */
    public final synchronized void mo32690q(List<C8423zy> list) {
        this.f33307f = list;
    }

    /* renamed from: r */
    public final synchronized void mo32691r(xt0 xt0) {
        this.f33312k = xt0;
    }

    /* renamed from: s */
    public final synchronized void mo32692s(String str) {
        this.f33324w = str;
    }

    /* renamed from: t */
    public final synchronized void mo32693t(double d) {
        this.f33317p = d;
    }

    /* renamed from: u */
    public final synchronized void mo32694u(String str, String str2) {
        if (str2 == null) {
            this.f33322u.remove(str);
        } else {
            this.f33322u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void mo32695v(int i) {
        this.f33302a = i;
    }

    /* renamed from: w */
    public final synchronized void mo32696w(C7774hy hyVar) {
        this.f33303b = hyVar;
    }

    /* renamed from: x */
    public final synchronized void mo32697x(View view) {
        this.f33314m = view;
    }

    /* renamed from: y */
    public final synchronized void mo32698y(xt0 xt0) {
        this.f33310i = xt0;
    }

    /* renamed from: z */
    public final synchronized void mo32699z(View view) {
        this.f33315n = view;
    }
}
