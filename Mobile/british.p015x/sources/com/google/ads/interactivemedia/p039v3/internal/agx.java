package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agx */
/* compiled from: IMASDK */
public final class agx extends ahe {

    /* renamed from: a */
    public static final agx f14757a = new agx("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C4120ke) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: b */
    public final List<Uri> f14758b;

    /* renamed from: c */
    public final List<agw> f14759c;

    /* renamed from: d */
    public final List<agv> f14760d;

    /* renamed from: e */
    public final List<agv> f14761e;

    /* renamed from: f */
    public final C4120ke f14762f;

    /* renamed from: g */
    public final List<C4120ke> f14763g;

    /* renamed from: h */
    public final Map<String, String> f14764h;

    /* renamed from: i */
    public final List<C4276pz> f14765i;

    public agx(String str, List<String> list, List<agw> list2, List<agv> list3, List<agv> list4, List<agv> list5, List<agv> list6, C4120ke keVar, List<C4120ke> list7, boolean z, Map<String, String> map, List<C4276pz> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).f14751a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m13662c(list3, arrayList);
        m13662c(list4, arrayList);
        m13662c(list5, arrayList);
        m13662c(list6, arrayList);
        this.f14758b = Collections.unmodifiableList(arrayList);
        this.f14759c = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f14760d = Collections.unmodifiableList(list4);
        this.f14761e = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f14762f = keVar;
        this.f14763g = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f14764h = Collections.unmodifiableMap(map);
        this.f14765i = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static agx m13661b(String str) {
        Uri parse = Uri.parse(str);
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S(SessionDescription.SUPPORTED_SDP_VERSION);
        kdVar.mo16099K(MimeTypes.APPLICATION_M3U8);
        return new agx("", Collections.emptyList(), Collections.singletonList(new agw(parse, kdVar.mo16115a(), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C4120ke) null, (List<C4120ke>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: c */
    private static void m13662c(List<agv> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f14748a;
            if (!list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m13663d(List<T> list, int i, List<C4543zw> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                C4543zw zwVar = list2.get(i3);
                if (zwVar.f19783b == i && zwVar.f19784c == i2) {
                    arrayList.add(t);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13564a(List list) {
        return new agx(this.f14811r, this.f14812s, m13663d(this.f14759c, 0, list), Collections.emptyList(), m13663d(this.f14760d, 1, list), m13663d(this.f14761e, 2, list), Collections.emptyList(), this.f14762f, this.f14763g, this.f14813t, this.f14764h, this.f14765i);
    }
}
