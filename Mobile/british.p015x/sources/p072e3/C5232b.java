package p072e3;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e3.b */
/* compiled from: ParameterComponent */
public final class C5232b {

    /* renamed from: a */
    public final String f22763a;

    /* renamed from: b */
    public final String f22764b;

    /* renamed from: c */
    public final List<C5233c> f22765c;

    /* renamed from: d */
    public final String f22766d;

    public C5232b(JSONObject jSONObject) throws JSONException {
        this.f22763a = jSONObject.getString(MediationMetaData.KEY_NAME);
        this.f22764b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C5233c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f22765c = arrayList;
        this.f22766d = jSONObject.optString("path_type", "absolute");
    }
}
