package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.C11812c1;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a */
    public transient Bitmap f54523a;

    /* renamed from: b */
    public transient Bitmap f54524b;

    /* renamed from: c */
    public transient Bitmap f54525c = null;
    private int height = 1;
    private String imageFallbackUrl = "";
    private String imageUrlSecured = "";
    private String name;
    private int width = 1;

    private ImageResourceConfig() {
    }

    /* renamed from: a */
    public Bitmap mo46135a(Context context) {
        if (this.f54525c == null) {
            Bitmap bitmap = this.f54523a;
            this.f54525c = bitmap;
            if (bitmap == null) {
                if (this.f54524b == null) {
                    this.f54524b = C11812c1.m52082a(context, this.imageFallbackUrl);
                }
                this.f54525c = this.f54524b;
            }
        }
        return this.f54525c;
    }

    /* renamed from: b */
    public void mo46138b(int i) {
        this.width = i;
    }

    /* renamed from: c */
    public String mo46140c() {
        return this.name;
    }

    /* renamed from: d */
    public int mo46141d() {
        return this.width;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
        if (this.width != imageResourceConfig.width || this.height != imageResourceConfig.height || !C5015nb.m22922a(this.imageUrlSecured, imageResourceConfig.imageUrlSecured) || !C5015nb.m22922a(this.imageFallbackUrl, imageResourceConfig.imageFallbackUrl) || !C5015nb.m22922a(this.name, imageResourceConfig.name)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: b */
    public String mo46137b() {
        String str = this.imageUrlSecured;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public void mo46139b(String str) {
        this.imageFallbackUrl = str;
    }

    /* renamed from: a */
    public int mo46134a() {
        return this.height;
    }

    /* renamed from: a */
    public void mo46136a(int i) {
        this.height = i;
    }

    /* renamed from: a */
    public static ImageResourceConfig m53156a(String str) {
        ImageResourceConfig imageResourceConfig = new ImageResourceConfig();
        imageResourceConfig.name = str;
        return imageResourceConfig;
    }
}
