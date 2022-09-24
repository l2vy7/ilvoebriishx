package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p289d.C11675b;

@Deprecated
public class SSAFactory {
    public static C11695f getPublisherInstance(Activity activity) {
        return C11675b.m51709a((Context) activity);
    }

    public static C11695f getPublisherTestInstance(Activity activity, int i) {
        return C11675b.m51710a((Context) activity, i);
    }
}
