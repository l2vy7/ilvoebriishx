package com.appnext.core.p033a;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.C3211o;
import com.appnext.core.C3212p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.a.a */
public final class C3167a {

    /* renamed from: eI */
    private static C3167a f12274eI;
    /* access modifiers changed from: private */

    /* renamed from: eH */
    public String f12275eH;

    private C3167a(final Context context) {
        C3211o.m10825az().mo10821a(new Runnable() {
            public final void run() {
                try {
                    C3167a aVar = C3167a.this;
                    C3212p.m10827aA();
                    String unused = aVar.f12275eH = C3212p.m10828m(context);
                } catch (Throwable th) {
                    C3117a.m10553a("Language$Language", th);
                }
            }
        });
    }

    /* renamed from: q */
    public static synchronized C3167a m10684q(Context context) {
        C3167a aVar;
        synchronized (C3167a.class) {
            if (f12274eI == null) {
                f12274eI = new C3167a(context.getApplicationContext());
            }
            aVar = f12274eI;
        }
        return aVar;
    }

    /* renamed from: aF */
    public final String mo10750aF() {
        String str = this.f12275eH;
        return str != null ? str : "{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        com.appnext.base.C3117a.m10553a("Translate$translate", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        com.appnext.base.C3117a.m10553a("Translate$translate", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        com.appnext.base.C3117a.m10553a("Translate$translate", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return m10683a("{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}", r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return m10683a(r4.f12275eH, "EN", r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return m10683a("{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}", "EN", r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10749a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "EN"
            java.lang.String r1 = "{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}"
            if (r5 == 0) goto L_0x000e
            java.lang.String r2 = ""
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x001a
        L_0x000e:
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getLanguage()
            java.lang.String r5 = r5.toUpperCase()
        L_0x001a:
            java.lang.String r2 = r4.f12275eH     // Catch:{ all -> 0x0021 }
            java.lang.String r7 = m10683a(r2, r5, r6, r7)     // Catch:{ all -> 0x0021 }
            goto L_0x003e
        L_0x0021:
            java.lang.String r7 = m10683a(r1, r5, r6, r7)     // Catch:{ all -> 0x0026 }
            goto L_0x003e
        L_0x0026:
            r5 = move-exception
            java.lang.String r2 = "Translate$translate"
            com.appnext.base.C3117a.m10553a(r2, r5)
            java.lang.String r3 = r4.f12275eH     // Catch:{ all -> 0x0033 }
            java.lang.String r7 = m10683a(r3, r0, r6, r7)     // Catch:{ all -> 0x0033 }
            goto L_0x003e
        L_0x0033:
            com.appnext.base.C3117a.m10553a(r2, r5)
            java.lang.String r7 = m10683a(r1, r0, r6, r7)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            com.appnext.base.C3117a.m10553a(r2, r5)
        L_0x003e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.p033a.C3167a.mo10749a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m10683a(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has(str2)) {
            if (jSONObject.has("EN")) {
                str2 = "EN";
            } else {
                str2 = null;
            }
        }
        return (TextUtils.isEmpty(str2) || !jSONObject.getJSONObject(str2).getJSONObject("settings").getBoolean("active")) ? str4 : jSONObject.getJSONObject(str2).getJSONObject(str3).getString(str4);
    }
}
