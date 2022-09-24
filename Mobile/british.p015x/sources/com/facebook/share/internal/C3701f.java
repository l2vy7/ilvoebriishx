package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
/* compiled from: OpenGraphJSONUtility */
public final class C3701f {

    /* renamed from: com.facebook.share.internal.f$a */
    /* compiled from: OpenGraphJSONUtility */
    public interface C3702a {
        /* renamed from: a */
        JSONObject mo12436a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    private static JSONArray m12486a(List list, C3702a aVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object d : list) {
            jSONArray.put(m12489d(d, aVar));
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static JSONObject m12487b(ShareOpenGraphAction shareOpenGraphAction, C3702a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphAction.mo12544e()) {
            jSONObject.put(next, m12489d(shareOpenGraphAction.mo12540a(next), aVar));
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m12488c(ShareOpenGraphObject shareOpenGraphObject, C3702a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphObject.mo12544e()) {
            jSONObject.put(next, m12489d(shareOpenGraphObject.mo12540a(next), aVar));
        }
        return jSONObject;
    }

    /* renamed from: d */
    public static Object m12489d(Object obj, C3702a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo12436a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m12488c((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m12486a((List) obj, aVar);
            }
            throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
        }
    }
}
