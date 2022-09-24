package com.facebook;

import android.util.Log;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3561x;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.r */
/* compiled from: GraphResponse */
public class C3655r {

    /* renamed from: g */
    private static final String f13569g = "r";

    /* renamed from: a */
    private final HttpURLConnection f13570a;

    /* renamed from: b */
    private final JSONObject f13571b;

    /* renamed from: c */
    private final JSONArray f13572c;

    /* renamed from: d */
    private final FacebookRequestError f13573d;

    /* renamed from: e */
    private final String f13574e;

    /* renamed from: f */
    private final GraphRequest f13575f;

    C3655r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, (JSONArray) null, (FacebookRequestError) null);
    }

    /* renamed from: a */
    static List<C3655r> m12327a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C3572j jVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3655r(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) jVar)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C3655r m12328b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m11234a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                Log.e(f13569g, a.toString());
                if (a.mo11225d() == 190 && C3481f0.m11602M(graphRequest.mo11252q())) {
                    if (a.mo11232j() != 493) {
                        AccessToken.m11208v((AccessToken) null);
                    } else if (!AccessToken.m11205h().mo11194u()) {
                        AccessToken.m11204f();
                    }
                }
                return new C3655r(graphRequest, httpURLConnection, a);
            }
            Object C = C3481f0.m11592C(jSONObject, TtmlNode.TAG_BODY, "FACEBOOK_NON_JSON_RESULT");
            if (C instanceof JSONObject) {
                return new C3655r(graphRequest, httpURLConnection, C.toString(), (JSONObject) C);
            }
            if (C instanceof JSONArray) {
                return new C3655r(graphRequest, httpURLConnection, C.toString(), (JSONArray) C);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C3655r(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new C3572j("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C3655r> m12329c(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) throws com.facebook.C3572j, org.json.JSONException {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0051
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
            goto L_0x0052
        L_0x0034:
            r4 = move-exception
            com.facebook.r r5 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
            goto L_0x0051
        L_0x0043:
            r4 = move-exception
            com.facebook.r r5 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
        L_0x0051:
            r5 = r9
        L_0x0052:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0097
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0097
        L_0x005e:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0096
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x0085, j -> 0x0076 }
            com.facebook.r r3 = m12328b(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x0085, j -> 0x0076 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0085, j -> 0x0076 }
            goto L_0x0093
        L_0x0076:
            r3 = move-exception
            com.facebook.r r4 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L_0x0093
        L_0x0085:
            r3 = move-exception
            com.facebook.r r4 = new com.facebook.r
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0096:
            return r1
        L_0x0097:
            com.facebook.j r7 = new com.facebook.j
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>((java.lang.String) r8)
            goto L_0x00a0
        L_0x009f:
            throw r7
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3655r.m12329c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: d */
    static List<C3655r> m12330d(InputStream inputStream, HttpURLConnection httpURLConnection, C3652q qVar) throws C3572j, JSONException, IOException {
        String c0 = C3481f0.m11621c0(inputStream);
        C3561x.m11894h(C3752u.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(c0.length()), c0);
        return m12331e(c0, httpURLConnection, qVar);
    }

    /* renamed from: e */
    static List<C3655r> m12331e(String str, HttpURLConnection httpURLConnection, C3652q qVar) throws C3572j, JSONException, IOException {
        List<C3655r> c = m12329c(httpURLConnection, qVar, new JSONTokener(str).nextValue());
        C3561x.m11894h(C3752u.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", qVar.mo12375v(), Integer.valueOf(str.length()), c);
        return c;
    }

    /* renamed from: f */
    static List<C3655r> m12332f(HttpURLConnection httpURLConnection, C3652q qVar) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            if (C3642m.m12295u()) {
                if (httpURLConnection.getResponseCode() >= 400) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
                return m12330d(inputStream2, httpURLConnection, qVar);
            }
            Log.e(f13569g, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
            throw new C3572j("GraphRequest can't be used when Facebook SDK isn't fully initialized");
        } catch (C3572j e) {
            C3561x.m11894h(C3752u.REQUESTS, "Response", "Response <Error>: %s", e);
            return m12327a(qVar, httpURLConnection, e);
        } catch (Exception e2) {
            C3561x.m11894h(C3752u.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m12327a(qVar, httpURLConnection, new C3572j((Throwable) e2));
        } finally {
            C3481f0.m11630h(inputStream2);
        }
    }

    /* renamed from: g */
    public final FacebookRequestError mo12380g() {
        return this.f13573d;
    }

    /* renamed from: h */
    public final JSONObject mo12381h() {
        return this.f13571b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f13570a;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = C3791bd.UNKNOWN_CONTENT_TYPE;
        }
        return "{Response: " + " responseCode: " + str + ", graphObject: " + this.f13571b + ", error: " + this.f13573d + "}";
    }

    C3655r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, (JSONObject) null, jSONArray, (FacebookRequestError) null);
    }

    C3655r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, facebookRequestError);
    }

    C3655r(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f13575f = graphRequest;
        this.f13570a = httpURLConnection;
        this.f13574e = str;
        this.f13571b = jSONObject;
        this.f13572c = jSONArray;
        this.f13573d = facebookRequestError;
    }
}
