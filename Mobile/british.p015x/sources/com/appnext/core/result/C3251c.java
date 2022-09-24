package com.appnext.core.result;

import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.SettingsManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.result.c */
public interface C3251c {
    JSONObject getConfigParams() throws JSONException;

    String getPlacementId();

    AppnextAd getSelectedAd();

    /* renamed from: t */
    String mo10353t();

    /* renamed from: u */
    String mo10354u();

    /* renamed from: v */
    String mo10355v();

    /* renamed from: w */
    SettingsManager mo10356w();

    /* renamed from: x */
    C3148Ad mo10357x();

    /* renamed from: y */
    C3249a mo10358y();
}
