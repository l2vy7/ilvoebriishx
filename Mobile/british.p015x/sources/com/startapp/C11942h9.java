package com.startapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.h9 */
/* compiled from: Sta */
public class C11942h9 {

    /* renamed from: a */
    public HashMap<Integer, SensorEvent> f53043a = new HashMap<>();

    /* renamed from: a */
    public JSONArray mo45407a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent next : this.f53043a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = next.sensor;
            jSONObject2.put(MediationMetaData.KEY_NAME, sensor.getName());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put(MediationMetaData.KEY_VERSION, sensor.getVersion());
            jSONObject2.put("maximum range", (double) sensor.getMaximumRange());
            jSONObject2.put("power", (double) sensor.getPower());
            jSONObject2.put("resolution", (double) sensor.getResolution());
            jSONObject2.put("accuracy", next.accuracy);
            jSONObject2.put("timestamp", next.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            for (float f : next.values) {
                jSONArray2.put((double) f);
            }
            jSONObject2.put("values", jSONArray2);
            jSONObject.put(String.valueOf(sensor.getType()), jSONObject2);
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
