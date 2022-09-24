package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.C0690c;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p115m4.C10766k;
import p115m4.C10768l;
import p115m4.C10770m;
import p115m4.C5758b;
import p115m4.C5759d;

/* renamed from: com.google.android.gms.cast.framework.media.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C7115f extends C0690c {

    /* renamed from: C0 */
    boolean f28695C0;

    /* renamed from: D0 */
    List<MediaTrack> f28696D0;

    /* renamed from: E0 */
    List<MediaTrack> f28697E0;

    /* renamed from: F0 */
    private long[] f28698F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public Dialog f28699G0;

    /* renamed from: H0 */
    private C4580e f28700H0;

    /* renamed from: I0 */
    private MediaInfo f28701I0;

    /* renamed from: J0 */
    private long[] f28702J0;

    @RecentlyNonNull
    /* renamed from: f2 */
    public static C7115f m29373f2() {
        return new C7115f();
    }

    /* renamed from: i2 */
    static /* synthetic */ void m29376i2(C7115f fVar, C7126k0 k0Var, C7126k0 k0Var2) {
        if (!fVar.f28695C0) {
            fVar.m29377j2();
            return;
        }
        C4580e eVar = (C4580e) C4604n.m20098k(fVar.f28700H0);
        if (!eVar.mo17850o()) {
            fVar.m29377j2();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack a = k0Var.mo29571a();
        if (!(a == null || a.mo29363E0() == -1)) {
            arrayList.add(Long.valueOf(a.mo29363E0()));
        }
        MediaTrack a2 = k0Var2.mo29571a();
        if (a2 != null) {
            arrayList.add(Long.valueOf(a2.mo29363E0()));
        }
        long[] jArr = fVar.f28698F0;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            for (MediaTrack E0 : fVar.f28697E0) {
                hashSet.add(Long.valueOf(E0.mo29363E0()));
            }
            for (MediaTrack E02 : fVar.f28696D0) {
                hashSet.add(Long.valueOf(E02.mo29363E0()));
            }
            for (long valueOf : jArr) {
                Long valueOf2 = Long.valueOf(valueOf);
                if (!hashSet.contains(valueOf2)) {
                    arrayList.add(valueOf2);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr2[i] = ((Long) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr2);
        eVar.mo17827L(jArr2);
        fVar.m29377j2();
    }

    /* renamed from: j2 */
    private final void m29377j2() {
        Dialog dialog = this.f28699G0;
        if (dialog != null) {
            dialog.cancel();
            this.f28699G0 = null;
        }
    }

    /* renamed from: k2 */
    private static ArrayList<MediaTrack> m29378k2(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        for (MediaTrack next : list) {
            if (next.mo29369K0() == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l2 */
    private static int m29379l2(List<MediaTrack> list, long[] jArr, int i) {
        if (!(jArr == null || list == null)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                for (long j : jArr) {
                    if (j == list.get(i2).mo29363E0()) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: A0 */
    public void mo3342A0() {
        Dialog S1 = mo3719S1();
        if (S1 != null && mo3382O()) {
            S1.setDismissMessage((Message) null);
        }
        super.mo3342A0();
    }

    @RecentlyNonNull
    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        int l2 = m29379l2(this.f28696D0, this.f28698F0, 0);
        int l22 = m29379l2(this.f28697E0, this.f28698F0, -1);
        C7126k0 k0Var = new C7126k0(mo3443p(), this.f28696D0, l2);
        C7126k0 k0Var2 = new C7126k0(mo3443p(), this.f28697E0, l22);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo3443p());
        View inflate = mo3443p().getLayoutInflater().inflate(C10768l.f49445b, (ViewGroup) null);
        int i = C10766k.f49419N;
        ListView listView = (ListView) inflate.findViewById(i);
        int i2 = C10766k.f49425h;
        ListView listView2 = (ListView) inflate.findViewById(i2);
        TabHost tabHost = (TabHost) inflate.findViewById(C10766k.f49417L);
        tabHost.setup();
        if (k0Var.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter(k0Var);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(i);
            newTabSpec.setIndicator(mo3443p().getString(C10770m.f49448B));
            tabHost.addTab(newTabSpec);
        }
        if (k0Var2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter(k0Var2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(i2);
            newTabSpec2.setIndicator(mo3443p().getString(C10770m.f49470v));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(mo3443p().getString(C10770m.f49447A), new C7120h0(this, k0Var, k0Var2)).setNegativeButton(C10770m.f49471w, new C7118g0(this));
        Dialog dialog = this.f28699G0;
        if (dialog != null) {
            dialog.cancel();
            this.f28699G0 = null;
        }
        AlertDialog create = builder.create();
        this.f28699G0 = create;
        return create;
    }

    /* renamed from: t0 */
    public void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        this.f28695C0 = true;
        this.f28697E0 = new ArrayList();
        this.f28696D0 = new ArrayList();
        this.f28698F0 = new long[0];
        C5759d d = C5758b.m25464e(mo3466w()).mo22535c().mo42953d();
        if (d == null || !d.mo42943c()) {
            this.f28695C0 = false;
            return;
        }
        C4580e q = d.mo22550q();
        this.f28700H0 = q;
        if (q == null || !q.mo17850o() || this.f28700H0.mo17845j() == null) {
            this.f28695C0 = false;
            return;
        }
        C4580e eVar = this.f28700H0;
        long[] jArr = this.f28702J0;
        if (jArr != null) {
            this.f28698F0 = jArr;
        } else {
            MediaStatus k = eVar.mo17846k();
            if (k != null) {
                this.f28698F0 = k.mo29330C0();
            }
        }
        MediaInfo mediaInfo = this.f28701I0;
        if (mediaInfo == null) {
            mediaInfo = eVar.mo17845j();
        }
        if (mediaInfo == null) {
            this.f28695C0 = false;
            return;
        }
        List<MediaTrack> K0 = mediaInfo.mo29226K0();
        if (K0 == null) {
            this.f28695C0 = false;
            return;
        }
        this.f28697E0 = m29378k2(K0, 2);
        ArrayList<MediaTrack> k2 = m29378k2(K0, 1);
        this.f28696D0 = k2;
        if (!k2.isEmpty()) {
            List<MediaTrack> list = this.f28696D0;
            MediaTrack.C7089a aVar = new MediaTrack.C7089a(-1, 1);
            aVar.mo29376c(mo3443p().getString(C10770m.f49474z));
            aVar.mo29377d(2);
            aVar.mo29375b("");
            list.add(0, aVar.mo29374a());
        }
    }
}
