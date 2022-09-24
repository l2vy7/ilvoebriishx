package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.C4580e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p244q4.C10920a;

/* renamed from: com.google.android.gms.cast.framework.media.b1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7108b1 extends C4580e.C4581a {

    /* renamed from: a */
    final /* synthetic */ C7105b f28687a;

    public C7108b1(C7105b bVar) {
        this.f28687a = bVar;
    }

    /* renamed from: g */
    public final void mo17868g() {
        long m = this.f28687a.m29338s();
        C7105b bVar = this.f28687a;
        if (m != bVar.f28671b) {
            bVar.f28671b = m;
            bVar.mo29529a();
            C7105b bVar2 = this.f28687a;
            if (bVar2.f28671b != 0) {
                bVar2.mo29530b();
            }
        }
    }

    /* renamed from: h */
    public final void mo17869h(int[] iArr) {
        List<Integer> m = C10920a.m49150m(iArr);
        if (!this.f28687a.f28673d.equals(m)) {
            this.f28687a.m29339t();
            this.f28687a.f28675f.evictAll();
            this.f28687a.f28676g.clear();
            C7105b bVar = this.f28687a;
            bVar.f28673d = m;
            C7105b.m29326g(bVar);
            this.f28687a.m29341v();
            this.f28687a.m29340u();
        }
    }

    /* renamed from: i */
    public final void mo17870i(int[] iArr, int i) {
        int i2;
        int length = iArr.length;
        if (i == 0) {
            i2 = this.f28687a.f28673d.size();
        } else {
            i2 = this.f28687a.f28674e.get(i, -1);
            if (i2 == -1) {
                this.f28687a.mo29530b();
                return;
            }
        }
        this.f28687a.m29339t();
        this.f28687a.f28673d.addAll(i2, C10920a.m49150m(iArr));
        C7105b.m29326g(this.f28687a);
        C7105b.m29329j(this.f28687a, i2, length);
        this.f28687a.m29340u();
    }

    /* renamed from: j */
    public final void mo17871j(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.f28687a.f28675f.remove(Integer.valueOf(i2));
            int i3 = this.f28687a.f28674e.get(i2, -1);
            if (i3 == -1) {
                this.f28687a.mo29530b();
                return;
            } else {
                arrayList.add(Integer.valueOf(i3));
                i++;
            }
        }
        Collections.sort(arrayList);
        this.f28687a.m29339t();
        this.f28687a.m29342w(C10920a.m49149l(arrayList));
        this.f28687a.m29340u();
    }

    /* renamed from: k */
    public final void mo17872k(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            this.f28687a.f28675f.remove(Integer.valueOf(i));
            int i2 = this.f28687a.f28674e.get(i, -1);
            if (i2 == -1) {
                this.f28687a.mo29530b();
                return;
            }
            this.f28687a.f28674e.delete(i);
            arrayList.add(Integer.valueOf(i2));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            this.f28687a.m29339t();
            this.f28687a.f28673d.removeAll(C10920a.m49150m(iArr));
            C7105b.m29326g(this.f28687a);
            C7105b.m29331l(this.f28687a, C10920a.m49149l(arrayList));
            this.f28687a.m29340u();
        }
    }

    /* renamed from: l */
    public final void mo17873l(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        this.f28687a.f28676g.clear();
        int length = mediaQueueItemArr.length;
        int i = 0;
        while (i < length) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
            int F0 = mediaQueueItem.mo29319F0();
            this.f28687a.f28675f.put(Integer.valueOf(F0), mediaQueueItem);
            int i2 = this.f28687a.f28674e.get(F0, -1);
            if (i2 == -1) {
                this.f28687a.mo29530b();
                return;
            } else {
                hashSet.add(Integer.valueOf(i2));
                i++;
            }
        }
        for (Integer intValue : this.f28687a.f28676g) {
            int i3 = this.f28687a.f28674e.get(intValue.intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        this.f28687a.f28676g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f28687a.m29339t();
        this.f28687a.m29342w(C10920a.m49149l(arrayList));
        this.f28687a.m29340u();
    }
}
