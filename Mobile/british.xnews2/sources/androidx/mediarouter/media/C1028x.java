package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import androidx.mediarouter.media.C0983l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import p017c1.C2639f;
import p017c1.C2640g;
import p017c1.C2641h;

@SuppressLint({"NewApi"})
/* renamed from: androidx.mediarouter.media.x */
/* compiled from: MediaRouter2Utils */
class C1028x {
    /* renamed from: a */
    static List<String> m5295a(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) list.stream().filter(C2641h.f10396a).map(C2640g.f10395a).collect(Collectors.toList());
    }

    /* renamed from: b */
    static String m5296b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 94496206:
                if (str.equals("android.media.route.feature.REMOTE_PLAYBACK")) {
                    c = 0;
                    break;
                }
                break;
            case 1328964233:
                if (str.equals("android.media.route.feature.LIVE_AUDIO")) {
                    c = 1;
                    break;
                }
                break;
            case 1348000558:
                if (str.equals("android.media.route.feature.LIVE_VIDEO")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "android.media.intent.category.REMOTE_PLAYBACK";
            case 1:
                return "android.media.intent.category.LIVE_AUDIO";
            case 2:
                return "android.media.intent.category.LIVE_VIDEO";
            default:
                return str;
        }
    }

    /* renamed from: c */
    static RouteDiscoveryPreference m5297c(C2639f fVar) {
        if (fVar == null || !fVar.mo9292f()) {
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        return new RouteDiscoveryPreference.Builder((List) fVar.mo9289d().mo4691e().stream().map(C1027w.f4659a).collect(Collectors.toList()), fVar.mo9290e()).build();
    }

    /* renamed from: d */
    static Collection<String> m5298d(List<IntentFilter> list) {
        HashSet hashSet = new HashSet();
        for (IntentFilter next : list) {
            int countCategories = next.countCategories();
            for (int i = 0; i < countCategories; i++) {
                hashSet.add(m5301g(next.getCategory(i)));
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r1 != 2) goto L_0x0062;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaRoute2Info m5299e(androidx.mediarouter.media.C0983l r4) {
        /*
            if (r4 != 0) goto L_0x0004
            r4 = 0
            return r4
        L_0x0004:
            android.media.MediaRoute2Info$Builder r0 = new android.media.MediaRoute2Info$Builder
            java.lang.String r1 = r4.mo4613m()
            java.lang.String r2 = r4.mo4616p()
            r0.<init>(r1, r2)
            java.lang.String r1 = r4.mo4608h()
            android.media.MediaRoute2Info$Builder r0 = r0.setDescription(r1)
            int r1 = r4.mo4606f()
            android.media.MediaRoute2Info$Builder r0 = r0.setConnectionState(r1)
            int r1 = r4.mo4623v()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolumeHandling(r1)
            int r1 = r4.mo4622u()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolume(r1)
            int r1 = r4.mo4624w()
            android.media.MediaRoute2Info$Builder r0 = r0.setVolumeMax(r1)
            java.util.List r1 = r4.mo4607g()
            java.util.Collection r1 = m5298d(r1)
            android.media.MediaRoute2Info$Builder r0 = r0.addFeatures(r1)
            android.net.Uri r1 = r4.mo4612l()
            android.media.MediaRoute2Info$Builder r0 = r0.setIconUri(r1)
            int r1 = r4.mo4609i()
            r2 = 1
            if (r1 == r2) goto L_0x0058
            r2 = 2
            if (r1 == r2) goto L_0x005d
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK"
            r0.addFeature(r1)
        L_0x005d:
            java.lang.String r1 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK"
            r0.addFeature(r1)
        L_0x0062:
            java.util.List r1 = r4.mo4611k()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = "android.media.route.feature.REMOTE_GROUP_PLAYBACK"
            r0.addFeature(r1)
        L_0x0071:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r4.mo4610j()
            java.lang.String r3 = "androidx.mediarouter.media.KEY_EXTRAS"
            r1.putBundle(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r4.mo4607g()
            r2.<init>(r3)
            java.lang.String r3 = "androidx.mediarouter.media.KEY_CONTROL_FILTERS"
            r1.putParcelableArrayList(r3, r2)
            int r2 = r4.mo4609i()
            java.lang.String r3 = "androidx.mediarouter.media.KEY_DEVICE_TYPE"
            r1.putInt(r3, r2)
            int r2 = r4.mo4618r()
            java.lang.String r3 = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE"
            r1.putInt(r3, r2)
            java.lang.String r2 = r4.mo4613m()
            java.lang.String r3 = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"
            r1.putString(r3, r2)
            r0.setExtras(r1)
            java.util.List r4 = r4.mo4607g()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00ba
            java.lang.String r4 = "android.media.route.feature.EMPTY"
            r0.addFeature(r4)
        L_0x00ba:
            android.media.MediaRoute2Info r4 = r0.build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.media.C1028x.m5299e(androidx.mediarouter.media.l):android.media.MediaRoute2Info");
    }

    /* renamed from: f */
    public static C0983l m5300f(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C0983l.C0984a f = new C0983l.C0984a(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString()).mo4633g(mediaRoute2Info.getConnectionState()).mo4645s(mediaRoute2Info.getVolumeHandling()).mo4646t(mediaRoute2Info.getVolumeMax()).mo4644r(mediaRoute2Info.getVolume()).mo4637k(mediaRoute2Info.getExtras()).mo4636j(true).mo4632f(false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            f.mo4634h(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            f.mo4638l(iconUri);
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        f.mo4637k(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        f.mo4635i(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        f.mo4642p(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            f.mo4628b(parcelableArrayList);
        }
        return f.mo4631e();
    }

    /* renamed from: g */
    static String m5301g(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2065577523:
                if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                    c = 0;
                    break;
                }
                break;
            case 956939050:
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    c = 1;
                    break;
                }
                break;
            case 975975375:
                if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case 1:
                return "android.media.route.feature.LIVE_AUDIO";
            case 2:
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
