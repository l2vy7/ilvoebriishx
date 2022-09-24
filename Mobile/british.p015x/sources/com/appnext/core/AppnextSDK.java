package com.appnext.core;

import android.content.Context;
import com.appnext.core.p035ra.services.C3235a;
import java.util.ArrayList;

public class AppnextSDK {
    public static void sendRA(Context context, ArrayList<String> arrayList) {
        C3235a.m10897s(context.getApplicationContext()).mo10853d(arrayList);
    }
}
