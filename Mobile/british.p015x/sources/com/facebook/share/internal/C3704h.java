package com.facebook.share.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C3572j;
import com.facebook.C3656s;
import com.facebook.GraphRequest;
import com.facebook.internal.C3455a;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3563z;
import com.facebook.share.internal.C3701f;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.widget.LikeView;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.h */
/* compiled from: ShareInternalUtility */
public final class C3704h {

    /* renamed from: com.facebook.share.internal.h$a */
    /* compiled from: ShareInternalUtility */
    static class C3705a implements C3701f.C3702a {
        C3705a() {
        }

        /* renamed from: a */
        public JSONObject mo12436a(SharePhoto sharePhoto) {
            Uri e = sharePhoto.mo12550e();
            if (C3481f0.m11606Q(e)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", e.toString());
                    return jSONObject;
                } catch (JSONException e2) {
                    throw new C3572j("Unable to attach images", (Throwable) e2);
                }
            } else {
                throw new C3572j("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* renamed from: a */
    private static C3455a m12491a(int i, int i2, Intent intent) {
        UUID q = C3563z.m11925q(intent);
        if (q == null) {
            return null;
        }
        return C3455a.m11529a(q, i);
    }

    /* renamed from: b */
    public static Pair<String, String> m12492b(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    /* renamed from: c */
    public static LikeView.C3748g m12493c(LikeView.C3748g gVar, LikeView.C3748g gVar2) {
        if (gVar == gVar2) {
            return gVar;
        }
        LikeView.C3748g gVar3 = LikeView.C3748g.UNKNOWN;
        if (gVar == gVar3) {
            return gVar2;
        }
        if (gVar2 == gVar3) {
            return gVar;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m12494d(int i, int i2, Intent intent, C3703g gVar) {
        m12491a(i, i2, intent);
        return false;
    }

    /* renamed from: e */
    public static GraphRequest m12495e(AccessToken accessToken, Uri uri, GraphRequest.C3360f fVar) throws FileNotFoundException {
        if (C3481f0.m11603N(uri)) {
            return m12496f(accessToken, new File(uri.getPath()), fVar);
        }
        if (C3481f0.m11601L(uri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, C3656s.POST, fVar);
        }
        throw new C3572j("The image Uri must be either a file:// or content:// Uri");
    }

    /* renamed from: f */
    public static GraphRequest m12496f(AccessToken accessToken, File file, GraphRequest.C3360f fVar) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, C3656s.POST, fVar);
    }

    /* renamed from: g */
    public static JSONArray m12497g(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m12497g((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m12498h((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: h */
    public static JSONObject m12498h(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m12498h((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m12497g((JSONArray) obj, true);
                }
                Pair<String, String> b = m12492b(string);
                String str = (String) b.first;
                String str2 = (String) b.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C3572j("Failed to create json object from share content");
        }
    }

    /* renamed from: i */
    public static JSONObject m12499i(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return C3701f.m12487b(shareOpenGraphContent.mo12531e(), new C3705a());
    }
}
