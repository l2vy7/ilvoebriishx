package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C3652q;
import com.facebook.internal.C3473c0;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3558v;
import com.facebook.internal.C3561x;
import com.google.android.exoplayer2.C6540C;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: n */
    public static final String f12759n = "GraphRequest";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f12760o;

    /* renamed from: p */
    private static String f12761p;

    /* renamed from: q */
    private static Pattern f12762q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f12763r;

    /* renamed from: a */
    private AccessToken f12764a;

    /* renamed from: b */
    private C3656s f12765b;

    /* renamed from: c */
    private String f12766c;

    /* renamed from: d */
    private JSONObject f12767d;

    /* renamed from: e */
    private String f12768e;

    /* renamed from: f */
    private String f12769f;

    /* renamed from: g */
    private boolean f12770g;

    /* renamed from: h */
    private Bundle f12771h;

    /* renamed from: i */
    private C3360f f12772i;

    /* renamed from: j */
    private String f12773j;

    /* renamed from: k */
    private Object f12774k;

    /* renamed from: l */
    private String f12775l;

    /* renamed from: m */
    private boolean f12776m;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new C3354a();

        /* renamed from: b */
        private final String f12777b;

        /* renamed from: c */
        private final RESOURCE f12778c;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        static class C3354a implements Parcelable.Creator<ParcelableResourceWithMimeType> {
            C3354a() {
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (C3355a) null);
            }

            /* renamed from: b */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C3355a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        public String mo11260a() {
            return this.f12777b;
        }

        /* renamed from: b */
        public RESOURCE mo11261b() {
            return this.f12778c;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12777b);
            parcel.writeParcelable(this.f12778c, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f12777b = str;
            this.f12778c = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f12777b = parcel.readString();
            this.f12778c = parcel.readParcelable(C3642m.m12279e().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    static class C3355a implements C3360f {

        /* renamed from: a */
        final /* synthetic */ C3361g f12779a;

        C3355a(C3361g gVar) {
            this.f12779a = gVar;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            C3361g gVar = this.f12779a;
            if (gVar != null) {
                gVar.mo7381a(rVar.mo12381h(), rVar);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    class C3356b implements C3360f {

        /* renamed from: a */
        final /* synthetic */ C3360f f12780a;

        C3356b(C3360f fVar) {
            this.f12780a = fVar;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            JSONObject h = rVar.mo12381h();
            JSONObject optJSONObject = h != null ? h.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString(SessionDescription.ATTR_TYPE) : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (!(optString == null || optString2 == null)) {
                        C3752u uVar = C3752u.GRAPH_API_DEBUG_INFO;
                        if (optString2.equals("warning")) {
                            uVar = C3752u.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C3481f0.m11604O(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        C3561x.m11893g(uVar, GraphRequest.f12759n, optString);
                    }
                }
            }
            C3360f fVar = this.f12780a;
            if (fVar != null) {
                fVar.mo7382b(rVar);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$c */
    static class C3357c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f12782b;

        /* renamed from: c */
        final /* synthetic */ C3652q f12783c;

        C3357c(ArrayList arrayList, C3652q qVar) {
            this.f12782b = arrayList;
            this.f12783c = qVar;
        }

        public void run() {
            Iterator it = this.f12782b.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((C3360f) pair.first).mo7382b((C3655r) pair.second);
            }
            for (C3652q.C3653a a : this.f12783c.mo12374u()) {
                a.mo11869a(this.f12783c);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    class C3358d implements C3362h {

        /* renamed from: a */
        final /* synthetic */ ArrayList f12784a;

        C3358d(ArrayList arrayList) {
            this.f12784a = arrayList;
        }

        /* renamed from: a */
        public void mo11269a(String str, String str2) throws IOException {
            this.f12784a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, C6540C.UTF8_NAME)}));
        }
    }

    /* renamed from: com.facebook.GraphRequest$e */
    private static class C3359e {

        /* renamed from: a */
        private final GraphRequest f12786a;

        /* renamed from: b */
        private final Object f12787b;

        public C3359e(GraphRequest graphRequest, Object obj) {
            this.f12786a = graphRequest;
            this.f12787b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo11270a() {
            return this.f12786a;
        }

        /* renamed from: b */
        public Object mo11271b() {
            return this.f12787b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$f */
    public interface C3360f {
        /* renamed from: b */
        void mo7382b(C3655r rVar);
    }

    /* renamed from: com.facebook.GraphRequest$g */
    public interface C3361g {
        /* renamed from: a */
        void mo7381a(JSONObject jSONObject, C3655r rVar);
    }

    /* renamed from: com.facebook.GraphRequest$h */
    private interface C3362h {
        /* renamed from: a */
        void mo11269a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.GraphRequest$i */
    public interface C3363i extends C3360f {
        /* renamed from: a */
        void mo11272a(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$j */
    private static class C3364j implements C3362h {

        /* renamed from: a */
        private final OutputStream f12788a;

        /* renamed from: b */
        private final C3561x f12789b;

        /* renamed from: c */
        private boolean f12790c = true;

        /* renamed from: d */
        private boolean f12791d = false;

        public C3364j(OutputStream outputStream, C3561x xVar, boolean z) {
            this.f12788a = outputStream;
            this.f12789b = xVar;
            this.f12791d = z;
        }

        /* renamed from: b */
        private RuntimeException m11318b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo11269a(String str, String str2) throws IOException {
            mo11276f(str, (String) null, (String) null);
            mo11279i("%s", str2);
            mo11281k();
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, str2);
            }
        }

        /* renamed from: c */
        public void mo11273c(String str, Object... objArr) throws IOException {
            if (!this.f12791d) {
                if (this.f12790c) {
                    this.f12788a.write("--".getBytes());
                    this.f12788a.write(GraphRequest.f12760o.getBytes());
                    this.f12788a.write("\r\n".getBytes());
                    this.f12790c = false;
                }
                this.f12788a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f12788a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), C6540C.UTF8_NAME).getBytes());
        }

        /* renamed from: d */
        public void mo11274d(String str, Bitmap bitmap) throws IOException {
            mo11276f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f12788a);
            mo11279i("", new Object[0]);
            mo11281k();
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, "<Image>");
            }
        }

        /* renamed from: e */
        public void mo11275e(String str, byte[] bArr) throws IOException {
            mo11276f(str, str, "content/unknown");
            this.f12788a.write(bArr);
            mo11279i("", new Object[0]);
            mo11281k();
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: f */
        public void mo11276f(String str, String str2, String str3) throws IOException {
            if (!this.f12791d) {
                mo11273c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo11273c("; filename=\"%s\"", str2);
                }
                mo11279i("", new Object[0]);
                if (str3 != null) {
                    mo11279i("%s: %s", RtspHeaders.CONTENT_TYPE, str3);
                }
                mo11279i("", new Object[0]);
                return;
            }
            this.f12788a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: g */
        public void mo11277g(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo11276f(str, str, str2);
            if (this.f12788a instanceof C3755x) {
                ((C3755x) this.f12788a).mo12615d(C3481f0.m11656u(uri));
                i = 0;
            } else {
                i = C3481f0.m11640m(C3642m.m12279e().getContentResolver().openInputStream(uri), this.f12788a) + 0;
            }
            mo11279i("", new Object[0]);
            mo11281k();
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: h */
        public void mo11278h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo11276f(str, str, str2);
            OutputStream outputStream = this.f12788a;
            if (outputStream instanceof C3755x) {
                ((C3755x) outputStream).mo12615d(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C3481f0.m11640m(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f12788a) + 0;
            }
            mo11279i("", new Object[0]);
            mo11281k();
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: i */
        public void mo11279i(String str, Object... objArr) throws IOException {
            mo11273c(str, objArr);
            if (!this.f12791d) {
                mo11273c("\r\n", new Object[0]);
            }
        }

        /* renamed from: j */
        public void mo11280j(String str, Object obj, GraphRequest graphRequest) throws IOException {
            OutputStream outputStream = this.f12788a;
            if (outputStream instanceof C3758z) {
                ((C3758z) outputStream).mo12614c(graphRequest);
            }
            if (GraphRequest.m11251I(obj)) {
                mo11269a(str, GraphRequest.m11255M(obj));
            } else if (obj instanceof Bitmap) {
                mo11274d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo11275e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo11277g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo11278h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo11261b();
                String a = parcelableResourceWithMimeType.mo11260a();
                if (b instanceof ParcelFileDescriptor) {
                    mo11278h(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo11277g(str, (Uri) b, a);
                } else {
                    throw m11318b();
                }
            } else {
                throw m11318b();
            }
        }

        /* renamed from: k */
        public void mo11281k() throws IOException {
            if (!this.f12791d) {
                mo11279i("--%s", GraphRequest.f12760o);
                return;
            }
            this.f12788a.write("&".getBytes());
        }

        /* renamed from: l */
        public void mo11282l(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            OutputStream outputStream = this.f12788a;
            if (!(outputStream instanceof C3758z)) {
                mo11269a(str, jSONArray.toString());
                return;
            }
            C3758z zVar = (C3758z) outputStream;
            mo11276f(str, (String) null, (String) null);
            mo11273c("[", new Object[0]);
            int i = 0;
            for (GraphRequest c : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                zVar.mo12614c(c);
                if (i > 0) {
                    mo11273c(",%s", jSONObject.toString());
                } else {
                    mo11273c("%s", jSONObject.toString());
                }
                i++;
            }
            mo11273c("]", new Object[0]);
            C3561x xVar = this.f12789b;
            if (xVar != null) {
                xVar.mo12082c("    " + str, jSONArray.toString());
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f12760o = sb.toString();
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (C3656s) null, (C3360f) null);
    }

    /* renamed from: C */
    private static String m11246C() {
        if (f12763r == null) {
            f12763r = String.format("%s.%s", new Object[]{"FBAndroidSDK", "5.15.3"});
            String a = C3558v.m11884a();
            if (!C3481f0.m11604O(a)) {
                f12763r = String.format(Locale.ROOT, "%s/%s", new Object[]{f12763r, a});
            }
        }
        return f12763r;
    }

    /* renamed from: E */
    private static boolean m11247E(C3652q qVar) {
        for (C3652q.C3653a aVar : qVar.mo12374u()) {
            if (aVar instanceof C3652q.C3654b) {
                return true;
            }
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).mo11253s() instanceof C3363i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m11248F(C3652q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f12771h.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m11250H(graphRequest.f12771h.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m11249G(String str) {
        Matcher matcher = f12762q.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m11250H(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static boolean m11251I(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* renamed from: J */
    public static GraphRequest m11252J(AccessToken accessToken, String str, C3360f fVar) {
        return new GraphRequest(accessToken, str, (Bundle) null, (C3656s) null, fVar);
    }

    /* renamed from: K */
    public static GraphRequest m11253K(AccessToken accessToken, C3361g gVar) {
        return new GraphRequest(accessToken, "me", (Bundle) null, (C3656s) null, new C3355a(gVar));
    }

    /* renamed from: L */
    public static GraphRequest m11254L(AccessToken accessToken, String str, JSONObject jSONObject, C3360f fVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, C3656s.POST, fVar);
        graphRequest.mo11244Y(jSONObject);
        return graphRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static String m11255M(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11256N(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C3362h r8) throws java.io.IOException {
        /*
            boolean r0 = m11249G(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            m11257O(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m11256N(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$h):void");
    }

    /* renamed from: O */
    private static void m11257O(String str, Object obj, C3362h hVar, boolean z) throws IOException {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m11257O(String.format("%s[%s]", new Object[]{str, next}), jSONObject.opt(next), hVar, z);
                }
            } else if (jSONObject.has(TtmlNode.ATTR_ID)) {
                m11257O(str, jSONObject.optString(TtmlNode.ATTR_ID), hVar, z);
            } else if (jSONObject.has("url")) {
                m11257O(str, jSONObject.optString("url"), hVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                m11257O(str, jSONObject.toString(), hVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m11257O(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), hVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            hVar.mo11269a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            hVar.mo11269a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: P */
    private static void m11258P(C3652q qVar, C3561x xVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C3364j jVar = new C3364j(outputStream, xVar, z);
        if (i == 1) {
            GraphRequest q = qVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : q.f12771h.keySet()) {
                Object obj = q.f12771h.get(str);
                if (m11250H(obj)) {
                    hashMap.put(str, new C3359e(q, obj));
                }
            }
            if (xVar != null) {
                xVar.mo12080a("  Parameters:\n");
            }
            m11261S(q.f12771h, jVar, q);
            if (xVar != null) {
                xVar.mo12080a("  Attachments:\n");
            }
            m11260R(hashMap, jVar);
            JSONObject jSONObject = q.f12767d;
            if (jSONObject != null) {
                m11256N(jSONObject, url.getPath(), jVar);
                return;
            }
            return;
        }
        String r = m11283r(qVar);
        if (!C3481f0.m11604O(r)) {
            jVar.mo11269a("batch_app_id", r);
            HashMap hashMap2 = new HashMap();
            m11262T(jVar, qVar, hashMap2);
            if (xVar != null) {
                xVar.mo12080a("  Attachments:\n");
            }
            m11260R(hashMap2, jVar);
            return;
        }
        throw new C3572j("App ID was not specified at the request or Settings.");
    }

    /* renamed from: Q */
    static void m11259Q(C3652q qVar, List<C3655r> list) {
        int size = qVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest q = qVar.get(i);
            if (q.f12772i != null) {
                arrayList.add(new Pair(q.f12772i, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C3357c cVar = new C3357c(arrayList, qVar);
            Handler t = qVar.mo12373t();
            if (t == null) {
                cVar.run();
            } else {
                t.post(cVar);
            }
        }
    }

    /* renamed from: R */
    private static void m11260R(Map<String, C3359e> map, C3364j jVar) throws IOException {
        for (String next : map.keySet()) {
            C3359e eVar = map.get(next);
            if (m11250H(eVar.mo11271b())) {
                jVar.mo11280j(next, eVar.mo11271b(), eVar.mo11270a());
            }
        }
    }

    /* renamed from: S */
    private static void m11261S(Bundle bundle, C3364j jVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m11251I(obj)) {
                jVar.mo11280j(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: T */
    private static void m11262T(C3364j jVar, Collection<GraphRequest> collection, Map<String, C3359e> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest U : collection) {
            U.m11263U(jSONArray, map);
        }
        jVar.mo11282l("batch", jSONArray, collection);
    }

    /* renamed from: U */
    private void m11263U(JSONArray jSONArray, Map<String, C3359e> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f12768e;
        if (str != null) {
            jSONObject.put(MediationMetaData.KEY_NAME, str);
            jSONObject.put("omit_response_on_success", this.f12770g);
        }
        String str2 = this.f12769f;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String z = mo11259z();
        jSONObject.put("relative_url", z);
        jSONObject.put("method", this.f12765b);
        AccessToken accessToken = this.f12764a;
        if (accessToken != null) {
            C3561x.m11895j(accessToken.mo11191r());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f12771h.keySet()) {
            Object obj = this.f12771h.get(str3);
            if (m11250H(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C3359e(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f12767d != null) {
            ArrayList arrayList2 = new ArrayList();
            m11256N(this.f12767d, z, new C3358d(arrayList2));
            jSONObject.put(TtmlNode.TAG_BODY, TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.facebook.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.facebook.y} */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.io.OutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m11264V(com.facebook.C3652q r13, java.net.HttpURLConnection r14) throws java.io.IOException, org.json.JSONException {
        /*
            com.facebook.internal.x r6 = new com.facebook.internal.x
            com.facebook.u r0 = com.facebook.C3752u.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m11248F(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.s r3 = r3.f12765b
            goto L_0x001e
        L_0x001c:
            com.facebook.s r3 = com.facebook.C3656s.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m11265X(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo12080a(r7)
            java.lang.String r7 = r13.mo12375v()
            java.lang.String r8 = "Id"
            r6.mo12082c(r8, r7)
            java.lang.String r7 = "URL"
            r6.mo12082c(r7, r4)
            java.lang.String r7 = r14.getRequestMethod()
            java.lang.String r8 = "Method"
            r6.mo12082c(r8, r7)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo12082c(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo12082c(r7, r8)
            int r7 = r13.mo12377y()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo12377y()
            r14.setReadTimeout(r7)
            com.facebook.s r7 = com.facebook.C3656s.POST
            if (r3 != r7) goto L_0x006d
            r0 = 1
        L_0x006d:
            if (r0 != 0) goto L_0x0073
            r6.mo12083d()
            return
        L_0x0073:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c9 }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00c9 }
            r1.<init>(r14)     // Catch:{ all -> 0x00c9 }
            if (r5 == 0) goto L_0x008c
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0089 }
            r14.<init>(r1)     // Catch:{ all -> 0x0089 }
            r0 = r14
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            r0 = r1
            goto L_0x00ca
        L_0x008c:
            r0 = r1
        L_0x008d:
            boolean r14 = m11247E(r13)     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x00b7
            com.facebook.x r14 = new com.facebook.x     // Catch:{ all -> 0x00c9 }
            android.os.Handler r1 = r13.mo12373t()     // Catch:{ all -> 0x00c9 }
            r14.<init>(r1)     // Catch:{ all -> 0x00c9 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r14
            r12 = r5
            m11258P(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c9 }
            int r1 = r14.mo12616e()     // Catch:{ all -> 0x00c9 }
            java.util.Map r10 = r14.mo12617f()     // Catch:{ all -> 0x00c9 }
            com.facebook.y r14 = new com.facebook.y     // Catch:{ all -> 0x00c9 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c9 }
            r7 = r14
            r8 = r0
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c9 }
            goto L_0x00b8
        L_0x00b7:
            r14 = r0
        L_0x00b8:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m11258P(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c6 }
            r14.close()
            r6.mo12083d()
            return
        L_0x00c6:
            r13 = move-exception
            r0 = r14
            goto L_0x00ca
        L_0x00c9:
            r13 = move-exception
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m11264V(com.facebook.q, java.net.HttpURLConnection):void");
    }

    /* renamed from: X */
    private static void m11265X(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
            return;
        }
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, m11285x());
    }

    /* renamed from: d */
    private void m11269d() {
        if (this.f12764a != null) {
            if (!this.f12771h.containsKey("access_token")) {
                String r = this.f12764a.mo11191r();
                C3561x.m11895j(r);
                this.f12771h.putString("access_token", r);
            }
        } else if (!this.f12776m && !this.f12771h.containsKey("access_token")) {
            String f = C3642m.m12280f();
            String l = C3642m.m12286l();
            if (C3481f0.m11604O(f) || C3481f0.m11604O(l)) {
                C3481f0.m11609T(f12759n, "Warning: Request without access token missing application ID or client token.");
            } else {
                this.f12771h.putString("access_token", f + "|" + l);
            }
        }
        this.f12771h.putString("sdk", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        this.f12771h.putString("format", "json");
        if (C3642m.m12298x(C3752u.GRAPH_API_DEBUG_INFO)) {
            this.f12771h.putString("debug", "info");
        } else if (C3642m.m12298x(C3752u.GRAPH_API_DEBUG_WARNING)) {
            this.f12771h.putString("debug", "warning");
        }
    }

    /* renamed from: e */
    private String m11270e(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f12765b == C3656s.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f12771h.keySet()) {
            Object obj = this.f12771h.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m11251I(obj)) {
                buildUpon.appendQueryParameter(str2, m11255M(obj).toString());
            } else if (this.f12765b == C3656s.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: e0 */
    static final boolean m11271e0(GraphRequest graphRequest) {
        String D = graphRequest.mo11242D();
        if (C3481f0.m11604O(D)) {
            return true;
        }
        if (D.startsWith("v")) {
            D = D.substring(1);
        }
        String[] split = D.split("\\.");
        if (split.length >= 2 && Integer.parseInt(split[0]) > 2) {
            return true;
        }
        if (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static HttpURLConnection m11272f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, m11246C());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: f0 */
    public static HttpURLConnection m11273f0(C3652q qVar) {
        URL url;
        m11274g0(qVar);
        try {
            if (qVar.size() == 1) {
                url = new URL(qVar.get(0).mo11241B());
            } else {
                url = new URL(C3473c0.m11576c());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m11272f(url);
                m11264V(qVar, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e) {
                C3481f0.m11642n(httpURLConnection);
                throw new C3572j("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new C3572j("could not construct URL for request", (Throwable) e2);
        }
    }

    /* renamed from: g0 */
    static final void m11274g0(C3652q qVar) {
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (C3656s.GET.equals(graphRequest.mo11257w()) && m11271e0(graphRequest)) {
                Bundle y = graphRequest.mo11258y();
                if (!y.containsKey("fields") || C3481f0.m11604O(y.getString("fields"))) {
                    C3561x.m11892f(C3752u.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo11256u());
                }
            }
        }
    }

    /* renamed from: h */
    public static C3655r m11275h(GraphRequest graphRequest) {
        List<C3655r> l = m11278l(graphRequest);
        if (l != null && l.size() == 1) {
            return l.get(0);
        }
        throw new C3572j("invalid state: expected a single response");
    }

    /* renamed from: j */
    public static List<C3655r> m11276j(C3652q qVar) {
        C3489g0.m11686h(qVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m11273f0(qVar);
            return m11282p(httpURLConnection, qVar);
        } catch (Exception e) {
            List<C3655r> a = C3655r.m12327a(qVar.mo12376x(), httpURLConnection, new C3572j((Throwable) e));
            m11259Q(qVar, a);
            return a;
        } finally {
            C3481f0.m11642n(httpURLConnection);
        }
    }

    /* renamed from: k */
    public static List<C3655r> m11277k(Collection<GraphRequest> collection) {
        return m11276j(new C3652q(collection));
    }

    /* renamed from: l */
    public static List<C3655r> m11278l(GraphRequest... graphRequestArr) {
        C3489g0.m11687i(graphRequestArr, "requests");
        return m11277k(Arrays.asList(graphRequestArr));
    }

    /* renamed from: m */
    public static C3651p m11279m(C3652q qVar) {
        C3489g0.m11686h(qVar, "requests");
        C3651p pVar = new C3651p(qVar);
        pVar.executeOnExecutor(C3642m.m12288n(), new Void[0]);
        return pVar;
    }

    /* renamed from: n */
    public static C3651p m11280n(Collection<GraphRequest> collection) {
        return m11279m(new C3652q(collection));
    }

    /* renamed from: o */
    public static C3651p m11281o(GraphRequest... graphRequestArr) {
        C3489g0.m11687i(graphRequestArr, "requests");
        return m11280n(Arrays.asList(graphRequestArr));
    }

    /* renamed from: p */
    public static List<C3655r> m11282p(HttpURLConnection httpURLConnection, C3652q qVar) {
        List<C3655r> f = C3655r.m12332f(httpURLConnection, qVar);
        C3481f0.m11642n(httpURLConnection);
        int size = qVar.size();
        if (size == f.size()) {
            m11259Q(qVar, f);
            C3427b.m11468h().mo11863f();
            return f;
        }
        throw new C3572j(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(f.size()), Integer.valueOf(size)}));
    }

    /* renamed from: r */
    private static String m11283r(C3652q qVar) {
        String g;
        if (!C3481f0.m11604O(qVar.mo12369r())) {
            return qVar.mo12369r();
        }
        Iterator it = qVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f12764a;
            if (accessToken != null && (g = accessToken.mo11181g()) != null) {
                return g;
            }
        }
        if (!C3481f0.m11604O(f12761p)) {
            return f12761p;
        }
        return C3642m.m12280f();
    }

    /* renamed from: v */
    private String m11284v() {
        if (f12762q.matcher(this.f12766c).matches()) {
            return this.f12766c;
        }
        return String.format("%s/%s", new Object[]{this.f12775l, this.f12766c});
    }

    /* renamed from: x */
    private static String m11285x() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{f12760o});
    }

    /* renamed from: A */
    public final Object mo11240A() {
        return this.f12774k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final String mo11241B() {
        String str;
        String str2;
        String str3 = this.f12773j;
        if (str3 != null) {
            return str3.toString();
        }
        if (mo11257w() != C3656s.POST || (str2 = this.f12766c) == null || !str2.endsWith("/videos")) {
            str = C3473c0.m11576c();
        } else {
            str = C3473c0.m11577d();
        }
        String format = String.format("%s/%s", new Object[]{str, m11284v()});
        m11269d();
        return m11270e(format, Boolean.FALSE);
    }

    /* renamed from: D */
    public final String mo11242D() {
        return this.f12775l;
    }

    /* renamed from: W */
    public final void mo11243W(C3360f fVar) {
        if (C3642m.m12298x(C3752u.GRAPH_API_DEBUG_INFO) || C3642m.m12298x(C3752u.GRAPH_API_DEBUG_WARNING)) {
            this.f12772i = new C3356b(fVar);
        } else {
            this.f12772i = fVar;
        }
    }

    /* renamed from: Y */
    public final void mo11244Y(JSONObject jSONObject) {
        this.f12767d = jSONObject;
    }

    /* renamed from: Z */
    public final void mo11245Z(C3656s sVar) {
        if (this.f12773j == null || sVar == C3656s.GET) {
            if (sVar == null) {
                sVar = C3656s.GET;
            }
            this.f12765b = sVar;
            return;
        }
        throw new C3572j("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: a0 */
    public final void mo11246a0(Bundle bundle) {
        this.f12771h = bundle;
    }

    /* renamed from: b0 */
    public final void mo11247b0(boolean z) {
        this.f12776m = z;
    }

    /* renamed from: c0 */
    public final void mo11248c0(Object obj) {
        this.f12774k = obj;
    }

    /* renamed from: d0 */
    public final void mo11249d0(String str) {
        this.f12775l = str;
    }

    /* renamed from: g */
    public final C3655r mo11250g() {
        return m11275h(this);
    }

    /* renamed from: i */
    public final C3651p mo11251i() {
        return m11281o(this);
    }

    /* renamed from: q */
    public final AccessToken mo11252q() {
        return this.f12764a;
    }

    /* renamed from: s */
    public final C3360f mo11253s() {
        return this.f12772i;
    }

    /* renamed from: t */
    public final JSONObject mo11254t() {
        return this.f12767d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f12764a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f12766c);
        sb.append(", graphObject: ");
        sb.append(this.f12767d);
        sb.append(", httpMethod: ");
        sb.append(this.f12765b);
        sb.append(", parameters: ");
        sb.append(this.f12771h);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final String mo11256u() {
        return this.f12766c;
    }

    /* renamed from: w */
    public final C3656s mo11257w() {
        return this.f12765b;
    }

    /* renamed from: y */
    public final Bundle mo11258y() {
        return this.f12771h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo11259z() {
        if (this.f12773j == null) {
            String format = String.format("%s/%s", new Object[]{C3473c0.m11576c(), m11284v()});
            m11269d();
            Uri parse = Uri.parse(m11270e(format, Boolean.TRUE));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C3572j("Can't override URL for a batch request");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C3656s sVar) {
        this(accessToken, str, bundle, sVar, (C3360f) null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C3656s sVar, C3360f fVar) {
        this(accessToken, str, bundle, sVar, fVar, (String) null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C3656s sVar, C3360f fVar, String str2) {
        this.f12770g = true;
        this.f12776m = false;
        this.f12764a = accessToken;
        this.f12766c = str;
        this.f12775l = str2;
        mo11243W(fVar);
        mo11245Z(sVar);
        if (bundle != null) {
            this.f12771h = new Bundle(bundle);
        } else {
            this.f12771h = new Bundle();
        }
        if (this.f12775l == null) {
            this.f12775l = C3642m.m12290p();
        }
    }
}
