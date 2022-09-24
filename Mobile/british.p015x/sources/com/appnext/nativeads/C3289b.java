package com.appnext.nativeads;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3164a;
import com.appnext.core.C3180d;
import com.appnext.core.C3198g;
import com.appnext.core.C3201h;
import com.appnext.core.SettingsManager;
import com.appnext.nativeads.NativeAdRequest;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.appnext.nativeads.b */
public class C3289b extends C3180d {

    /* renamed from: fZ */
    private static C3289b f12521fZ;

    /* renamed from: r */
    private final int f12522r = 50;

    /* renamed from: b */
    protected static String m11014b(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        if (substring.contains("?")) {
            substring = substring.substring(0, substring.indexOf("?"));
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("rnd");
            if (queryParameter == null || queryParameter.equals("")) {
                return substring;
            }
            return substring.substring(0, substring.lastIndexOf(46)) + "_" + queryParameter + substring.substring(substring.lastIndexOf(46));
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$extractFileNameFromPath", th);
            return substring;
        }
    }

    /* renamed from: be */
    public static synchronized C3289b m11016be() {
        C3289b bVar;
        synchronized (C3289b.class) {
            if (f12521fZ == null) {
                f12521fZ = new C3289b();
            }
            bVar = f12521fZ;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo11009a(Context context, C3148Ad ad, String str, C3180d.C3185a aVar, NativeAdRequest nativeAdRequest) {
        ((NativeAdObject) ad).setAdRequest(new NativeAdRequest(nativeAdRequest));
        super.mo10770a(context, ad, str, aVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10235a(C3148Ad ad, String str, String str2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo10237a(String str, C3148Ad ad, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SettingsManager mo10240c(C3148Ad ad) {
        return C3288a.m11006bc();
    }

    /* renamed from: e */
    public final ArrayList<AppnextAd> mo11010e(C3148Ad ad) {
        return mo10779j(ad).getAds();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo10233a(Context context, C3148Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        Integer num;
        Integer num2;
        try {
            StringBuilder sb = new StringBuilder("&auid=");
            sb.append(ad != null ? ad.getAUID() : "1000");
            sb.append("&creative=");
            sb.append(ad != null ? Integer.valueOf(((NativeAdRequest) ((NativeAdObject) ad).getAdRequest()).getCreativeType().ordinal()) : NativeAdRequest.CreativeType.ALL);
            sb.append("&vidmin=");
            if (ad == null) {
                num = "";
            } else {
                num = Integer.valueOf(ad.getMinVideoLength());
            }
            sb.append(num);
            sb.append("&vidmax=");
            if (ad == null) {
                num2 = "";
            } else {
                num2 = Integer.valueOf(ad.getMaxVideoLength());
            }
            sb.append(num2);
            return sb.toString();
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$urlSuffix", th);
            return "";
        }
    }

    /* renamed from: a */
    static String m11012a(NativeAdRequest nativeAdRequest, AppnextAd appnextAd) {
        String videoUrl;
        String str = "";
        NativeAdRequest.VideoQuality videoQuality = nativeAdRequest.getVideoQuality();
        NativeAdRequest.VideoQuality videoQuality2 = NativeAdRequest.VideoQuality.HIGH;
        if (videoQuality == videoQuality2 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.LONG) {
            videoUrl = appnextAd.getVideoUrlHigh30Sec();
            try {
                if (videoUrl.equals(str)) {
                    return appnextAd.getVideoUrl30Sec();
                }
            } catch (Throwable th) {
                th = th;
                str = videoUrl;
                C3117a.m10553a("NativeAdsManager$getVideoUrl", th);
                return str;
            }
        } else {
            try {
                NativeAdRequest.VideoQuality videoQuality3 = nativeAdRequest.getVideoQuality();
                NativeAdRequest.VideoQuality videoQuality4 = NativeAdRequest.VideoQuality.LOW;
                if (videoQuality3 == videoQuality4 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.LONG) {
                    videoUrl = appnextAd.getVideoUrl30Sec();
                    if (videoUrl.equals(str)) {
                        return appnextAd.getVideoUrlHigh30Sec();
                    }
                } else if (nativeAdRequest.getVideoQuality() == videoQuality2 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.SHORT) {
                    videoUrl = appnextAd.getVideoUrlHigh();
                    if (videoUrl.equals(str)) {
                        return appnextAd.getVideoUrl();
                    }
                } else {
                    if (nativeAdRequest.getVideoQuality() == videoQuality4 && nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.SHORT) {
                        videoUrl = appnextAd.getVideoUrl();
                        if (videoUrl.equals(str)) {
                            str = appnextAd.getVideoUrlHigh();
                        }
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                C3117a.m10553a("NativeAdsManager$getVideoUrl", th);
                return str;
            }
        }
        str = videoUrl;
        return str;
    }

    /* renamed from: b */
    static boolean m11015b(AppnextAd appnextAd) {
        return !appnextAd.getWideImageURL().equals("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10229a(Context context, C3201h hVar) {
        try {
            NativeAdData nativeAdData = new NativeAdData((AppnextAd) hVar);
            int a = m11011a(context, nativeAdData);
            if (a != 0) {
                return a;
            }
            boolean z = true;
            if (nativeAdData.getCampaignGoal().equals("new") && C3198g.m10789b(context, nativeAdData.getAdPackage())) {
                return 1;
            }
            if (nativeAdData.getCampaignGoal().equals("existing") && !C3198g.m10789b(context, nativeAdData.getAdPackage())) {
                return 2;
            }
            if (!m11015b((AppnextAd) hVar)) {
                AppnextAd appnextAd = (AppnextAd) hVar;
                if (appnextAd.getVideoUrl().equals("") && appnextAd.getVideoUrlHigh().equals("") && appnextAd.getVideoUrl30Sec().equals("") && appnextAd.getVideoUrlHigh30Sec().equals("")) {
                    z = false;
                }
                if (z) {
                    return 0;
                }
                return 3;
            }
            return 0;
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$adFilter", th);
            return 3;
        }
    }

    /* renamed from: a */
    public final ArrayList<AppnextAd> mo11008a(String str, NativeAdRequest nativeAdRequest, ArrayList<AppnextAd> arrayList) {
        ArrayList<AppnextAd> arrayList2 = new ArrayList<>();
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (m11013a(next, nativeAdRequest)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo11007a(Context context, C3148Ad ad, ArrayList<AppnextAd> arrayList, NativeAdRequest nativeAdRequest) {
        try {
            Iterator<AppnextAd> it = arrayList.iterator();
            while (it.hasNext()) {
                AppnextAd next = it.next();
                if (m11013a(next, nativeAdRequest)) {
                    next.getBannerID();
                    ad.getAUID();
                    return next;
                }
            }
            return null;
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$getFirst", th);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo11006a(Context context, C3148Ad ad, NativeAdRequest nativeAdRequest) {
        ArrayList<?> ads;
        if (mo10779j(ad) == null || (ads = mo10779j(ad).getAds()) == null) {
            return null;
        }
        return mo11007a(context, ad, (ArrayList<AppnextAd>) ads, nativeAdRequest);
    }

    /* renamed from: a */
    private boolean m11013a(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        if (nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.ALL) {
            return m11015b(appnextAd) || !m11012a(nativeAdRequest, appnextAd).equals("");
        }
        if (nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.STATIC_ONLY) {
            return m11015b(appnextAd);
        }
        return nativeAdRequest.getCreativeType() == NativeAdRequest.CreativeType.VIDEO_ONLY && !m11012a(nativeAdRequest, appnextAd).equals("");
    }

    /* renamed from: a */
    private static int m11011a(Context context, NativeAdData nativeAdData) {
        try {
            if (!nativeAdData.getCptList().equals("") && !nativeAdData.getCptList().equals("[]")) {
                JSONArray jSONArray = new JSONArray(nativeAdData.getCptList());
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (C3198g.m10789b(context, jSONArray.getString(i))) {
                        return 0;
                    }
                }
                return 3;
            }
        } catch (JSONException e) {
            C3117a.m10553a("NativeAdsManager$checkCPT", e);
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$checkCPT", th);
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10238a(C3148Ad ad) {
        return super.mo10238a(ad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10234a(Context context, C3148Ad ad, C3164a aVar) throws Exception {
        try {
            File[] listFiles = new File(context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/").listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    Arrays.sort(listFiles, new Comparator<File>() {
                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                            return Long.valueOf(((File) obj).lastModified()).compareTo(Long.valueOf(((File) obj2).lastModified()));
                        }
                    });
                    int parseInt = Integer.parseInt(C3288a.m11006bc().mo10732y("num_saved_videos")) - 1;
                    if (listFiles.length > parseInt) {
                        for (int i = 0; i < listFiles.length - parseInt; i++) {
                            listFiles[i].delete();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("NativeAdsManager$customAdLoad", th);
            return;
        }
        NativeAdRequest nativeAdRequest = (NativeAdRequest) ((NativeAdObject) ad).getAdRequest();
        if (nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.DEFAULT) {
            ((NativeAdRequest) ((NativeAdObject) ad).getAdRequest()).setVideoLength(NativeAdRequest.VideoLength.fromInt(Integer.parseInt(C3288a.m11006bc().mo10732y("default_video_length"))));
        }
        if (nativeAdRequest.getVideoQuality() == NativeAdRequest.VideoQuality.DEFAULT) {
            nativeAdRequest.setVideoQuality(NativeAdRequest.VideoQuality.fromInt(Integer.parseInt(C3288a.m11006bc().mo10732y("default_video_quality"))));
        }
        AppnextAd a = m11016be().mo11006a(context, ad, nativeAdRequest);
        if (a != null && nativeAdRequest.getCreativeType() != NativeAdRequest.CreativeType.STATIC_ONLY) {
            if (nativeAdRequest.getCachingPolicy() == NativeAdRequest.CachingPolicy.ALL || nativeAdRequest.getCachingPolicy() == NativeAdRequest.CachingPolicy.VIDEO_ONLY) {
                String a2 = m11012a(nativeAdRequest, a);
                if (!a2.equals("")) {
                    String b = m11014b(a2);
                    String str = context.getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
                    File file = new File(str + b);
                    if (file.exists()) {
                        file.setLastModified(System.currentTimeMillis());
                        file.getPath();
                        return;
                    }
                    new File(str).mkdirs();
                    URL url = new URL(a2);
                    url.openConnection().connect();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
                    FileOutputStream fileOutputStream = new FileOutputStream(str + b + ".tmp");
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            bufferedInputStream.close();
                            File file2 = new File(str + b + ".tmp");
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(b);
                            file2.renameTo(new File(sb.toString()));
                            file2.delete();
                            return;
                        }
                    }
                }
            }
        }
    }
}
