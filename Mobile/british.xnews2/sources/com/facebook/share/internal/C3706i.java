package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C3572j;
import com.facebook.internal.C3481f0;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.i */
/* compiled from: WebDialogParameters */
public class C3706i {
    /* renamed from: a */
    public static Bundle m12501a(ShareLinkContent shareLinkContent) {
        Bundle c = m12503c(shareLinkContent);
        C3481f0.m11619b0(c, "href", shareLinkContent.mo12471a());
        C3481f0.m11617a0(c, "quote", shareLinkContent.mo12484e());
        return c;
    }

    /* renamed from: b */
    public static Bundle m12502b(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle c = m12503c(shareOpenGraphContent);
        C3481f0.m11617a0(c, "action_type", shareOpenGraphContent.mo12531e().mo12522f());
        try {
            JSONObject h = C3704h.m12498h(C3704h.m12499i(shareOpenGraphContent), false);
            if (h != null) {
                C3481f0.m11617a0(c, "action_properties", h.toString());
            }
            return c;
        } catch (JSONException e) {
            throw new C3572j("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    /* renamed from: c */
    public static Bundle m12503c(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.mo12472b();
        if (b != null) {
            C3481f0.m11617a0(bundle, "hashtag", b.mo12473a());
        }
        return bundle;
    }
}
