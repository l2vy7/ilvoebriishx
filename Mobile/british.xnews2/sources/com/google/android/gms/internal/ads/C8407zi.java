package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.zi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8407zi {

    /* renamed from: a */
    private static final C7980ni f42471a = C7980ni.m35164b("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f42472b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C8157si, List<C7980ni>> f42473c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f42474d;

    /* renamed from: e */
    private static final SparseIntArray f42475e;

    /* renamed from: f */
    private static final Map<String, Integer> f42476f;

    /* renamed from: g */
    private static int f42477g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f42474d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f42475e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);
        HashMap hashMap = new HashMap();
        f42476f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", Integer.valueOf(C6540C.DEFAULT_BUFFER_SEGMENT_SIZE));
        hashMap.put("L156", 262144);
        hashMap.put("L180", Integer.valueOf(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES));
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static int m40353a() throws C8228ui {
        if (f42477g == -1) {
            int i = 0;
            C7980ni c = m40355c(MimeTypes.VIDEO_H264, false);
            if (c != null) {
                MediaCodecInfo.CodecProfileLevel[] g = c.mo33705g();
                int length = g.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = g[i].level;
                    int i4 = 9437184;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case C6540C.DEFAULT_BUFFER_SEGMENT_SIZE:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, C7836jm.f33934a >= 21 ? 345600 : 172800);
            }
            f42477g = i;
        }
        return f42477g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m40354b(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r12.split(r0)
            r1 = 0
            r2 = r0[r1]
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case 3006243: goto L_0x0032;
                case 3006244: goto L_0x0028;
                case 3199032: goto L_0x001e;
                case 3214780: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r3 = "hvc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x001e:
            java.lang.String r3 = "hev1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r3 = "avc2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 3
            goto L_0x003d
        L_0x0032:
            java.lang.String r3 = "avc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 2
            goto L_0x003d
        L_0x003c:
            r2 = -1
        L_0x003d:
            r3 = 4
            java.lang.String r7 = "MediaCodecUtil"
            r8 = 0
            if (r2 == 0) goto L_0x00ed
            if (r2 == r6) goto L_0x00ed
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x004a
            return r8
        L_0x004a:
            int r2 = r0.length
            java.lang.String r9 = "Ignoring malformed AVC codec string: "
            if (r2 >= r5) goto L_0x0064
            int r0 = r12.length()
            if (r0 == 0) goto L_0x005a
            java.lang.String r12 = r9.concat(r12)
            goto L_0x005f
        L_0x005a:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r9)
        L_0x005f:
            android.util.Log.w(r7, r12)
            goto L_0x00ec
        L_0x0064:
            r10 = r0[r6]     // Catch:{ NumberFormatException -> 0x00d8 }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x00d8 }
            r11 = 6
            if (r10 != r11) goto L_0x008c
            r2 = r0[r6]     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.String r1 = r2.substring(r1, r5)     // Catch:{ NumberFormatException -> 0x00d8 }
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00d8 }
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ NumberFormatException -> 0x00d8 }
            int r0 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00d8 }
            goto L_0x00a2
        L_0x008c:
            if (r2 < r4) goto L_0x00c4
            r1 = r0[r6]     // Catch:{ NumberFormatException -> 0x00d8 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00d8 }
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x00d8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00d8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00d8 }
        L_0x00a2:
            android.util.SparseIntArray r0 = f42474d
            int r1 = r1.intValue()
            int r0 = r0.get(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.SparseIntArray r1 = f42475e
            int r12 = r12.intValue()
            int r12 = r1.get(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r0, r12)
            goto L_0x00ec
        L_0x00c4:
            int r0 = r12.length()     // Catch:{ NumberFormatException -> 0x00d8 }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = r9.concat(r12)     // Catch:{ NumberFormatException -> 0x00d8 }
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r0 = new java.lang.String     // Catch:{ NumberFormatException -> 0x00d8 }
            r0.<init>(r9)     // Catch:{ NumberFormatException -> 0x00d8 }
        L_0x00d4:
            android.util.Log.w(r7, r0)     // Catch:{ NumberFormatException -> 0x00d8 }
            goto L_0x00ec
        L_0x00d8:
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00e4
            java.lang.String r12 = r9.concat(r12)
            goto L_0x00e9
        L_0x00e4:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r9)
        L_0x00e9:
            android.util.Log.w(r7, r12)
        L_0x00ec:
            return r8
        L_0x00ed:
            int r1 = r0.length
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            if (r1 >= r3) goto L_0x0107
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00fd
            java.lang.String r12 = r2.concat(r12)
            goto L_0x0102
        L_0x00fd:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
        L_0x0102:
            android.util.Log.w(r7, r12)
            goto L_0x018c
        L_0x0107:
            java.util.regex.Pattern r1 = f42472b
            r3 = r0[r6]
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r3 = r1.matches()
            if (r3 != 0) goto L_0x0129
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0120
            java.lang.String r12 = r2.concat(r12)
            goto L_0x0125
        L_0x0120:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
        L_0x0125:
            android.util.Log.w(r7, r12)
            goto L_0x018c
        L_0x0129:
            java.lang.String r12 = r1.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0137
            r5 = 1
            goto L_0x013f
        L_0x0137:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0173
        L_0x013f:
            java.util.Map<java.lang.String, java.lang.Integer> r12 = f42476f
            r0 = r0[r4]
            java.lang.Object r12 = r12.get(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L_0x0169
            java.lang.String r12 = r1.group(r6)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "Unknown HEVC level string: "
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0160
            java.lang.String r12 = r0.concat(r12)
            goto L_0x0165
        L_0x0160:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
        L_0x0165:
            android.util.Log.w(r7, r12)
            goto L_0x018c
        L_0x0169:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.<init>(r0, r12)
            goto L_0x018c
        L_0x0173:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "Unknown HEVC profile string: "
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0184
            java.lang.String r12 = r0.concat(r12)
            goto L_0x0189
        L_0x0184:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
        L_0x0189:
            android.util.Log.w(r7, r12)
        L_0x018c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8407zi.m40354b(java.lang.String):android.util.Pair");
    }

    /* renamed from: c */
    public static C7980ni m40355c(String str, boolean z) throws C8228ui {
        List<C7980ni> d = m40356d(str, z);
        if (d.isEmpty()) {
            return null;
        }
        return d.get(0);
    }

    /* renamed from: d */
    public static synchronized List<C7980ni> m40356d(String str, boolean z) throws C8228ui {
        C8265vi viVar;
        synchronized (C8407zi.class) {
            C8157si siVar = new C8157si(str, z);
            HashMap<C8157si, List<C7980ni>> hashMap = f42473c;
            List<C7980ni> list = hashMap.get(siVar);
            if (list != null) {
                return list;
            }
            int i = C7836jm.f33934a;
            if (i >= 21) {
                viVar = new C8371yi(z);
            } else {
                viVar = new C8335xi((C8299wi) null);
            }
            List<C7980ni> e = m40357e(siVar, viVar);
            if (z && e.isEmpty() && i >= 21 && i <= 23) {
                e = m40357e(siVar, new C8335xi((C8299wi) null));
                if (!e.isEmpty()) {
                    String str2 = e.get(0).f36018a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<C7980ni> unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(siVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x01be A[Catch:{ Exception -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01fa A[SYNTHETIC, Splitter:B:142:0x01fa] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0224 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.C7980ni> m40357e(com.google.android.gms.internal.ads.C8157si r18, com.google.android.gms.internal.ads.C8265vi r19) throws com.google.android.gms.internal.ads.C8228ui {
        /*
            r1 = r18
            r2 = r19
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0270 }
            r3.<init>()     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = r1.f38972a     // Catch:{ Exception -> 0x0270 }
            int r5 = r19.zza()     // Catch:{ Exception -> 0x0270 }
            boolean r6 = r19.zzd()     // Catch:{ Exception -> 0x0270 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x026f
            android.media.MediaCodecInfo r9 = r2.zzb(r8)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0270 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0270 }
            if (r0 != 0) goto L_0x0264
            java.lang.String r11 = ".secure"
            if (r6 != 0) goto L_0x0030
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x0270 }
            if (r0 == 0) goto L_0x0030
            goto L_0x0264
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.C7836jm.f33934a     // Catch:{ Exception -> 0x0270 }
            r12 = 21
            if (r0 >= r12) goto L_0x0066
            java.lang.String r12 = "CIPAACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "CIPMP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "CIPVorbisDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "CIPAMRNBDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "AACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "MP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
        L_0x0066:
            r12 = 18
            if (r0 >= r12) goto L_0x0072
            java.lang.String r13 = "OMX.SEC.MP3.Decoder"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
        L_0x0072:
            if (r0 >= r12) goto L_0x0086
            java.lang.String r12 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 == 0) goto L_0x0086
            java.lang.String r12 = "a70"
            java.lang.String r13 = com.google.android.gms.internal.ads.C7836jm.f33935b     // Catch:{ Exception -> 0x0270 }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
        L_0x0086:
            r12 = 16
            if (r0 != r12) goto L_0x00f4
            java.lang.String r13 = "OMX.qcom.audio.decoder.mp3"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r13 == 0) goto L_0x00f4
            java.lang.String r13 = "dlxu"
            java.lang.String r14 = com.google.android.gms.internal.ads.C7836jm.f33935b     // Catch:{ Exception -> 0x0270 }
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "protou"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "ville"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "villeplus"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "villec2"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "gee"
            boolean r13 = r14.startsWith(r13)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "C6602"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "C6603"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "C6606"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "C6616"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "L36h"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = "SO-02E"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0270 }
            if (r13 != 0) goto L_0x0264
        L_0x00f4:
            if (r0 != r12) goto L_0x0120
            java.lang.String r12 = "OMX.qcom.audio.decoder.aac"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r12 == 0) goto L_0x0120
            java.lang.String r12 = "C1504"
            java.lang.String r13 = com.google.android.gms.internal.ads.C7836jm.f33935b     // Catch:{ Exception -> 0x0270 }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "C1505"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "C1604"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
            java.lang.String r12 = "C1605"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x0270 }
            if (r12 != 0) goto L_0x0264
        L_0x0120:
            java.lang.String r12 = "jflte"
            r13 = 19
            if (r0 > r13) goto L_0x0160
            java.lang.String r14 = "OMX.SEC.vp8.dec"
            boolean r14 = r14.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = "samsung"
            java.lang.String r15 = com.google.android.gms.internal.ads.C7836jm.f33936c     // Catch:{ Exception -> 0x0270 }
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x0270 }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = com.google.android.gms.internal.ads.C7836jm.f33935b     // Catch:{ Exception -> 0x0270 }
            java.lang.String r15 = "d2"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0270 }
            if (r15 != 0) goto L_0x0264
            java.lang.String r15 = "serrano"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0270 }
            if (r15 != 0) goto L_0x0264
            boolean r15 = r14.startsWith(r12)     // Catch:{ Exception -> 0x0270 }
            if (r15 != 0) goto L_0x0264
            java.lang.String r15 = "santos"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0270 }
            if (r15 != 0) goto L_0x0264
            java.lang.String r15 = "t0"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x0270 }
            if (r14 != 0) goto L_0x0264
        L_0x0160:
            if (r0 > r13) goto L_0x0172
            java.lang.String r0 = com.google.android.gms.internal.ads.C7836jm.f33935b     // Catch:{ Exception -> 0x0270 }
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x0270 }
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0270 }
            if (r0 != 0) goto L_0x0264
        L_0x0172:
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0270 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0270 }
            r14 = 0
        L_0x0178:
            if (r14 >= r13) goto L_0x0264
            r15 = r12[r14]     // Catch:{ Exception -> 0x0270 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0270 }
            if (r0 == 0) goto L_0x0255
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x01ec }
            boolean r7 = r2.mo35428a(r4, r0)     // Catch:{ Exception -> 0x01ec }
            int r2 = com.google.android.gms.internal.ads.C7836jm.f33934a     // Catch:{ Exception -> 0x01ec }
            r16 = r5
            r5 = 22
            r17 = r9
            r9 = 1
            if (r2 > r5) goto L_0x01bb
            java.lang.String r2 = com.google.android.gms.internal.ads.C7836jm.f33937d     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r2.equals(r5)     // Catch:{ Exception -> 0x01b9 }
            if (r5 != 0) goto L_0x01a7
            java.lang.String r5 = "Nexus 10"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01bb
        L_0x01a7:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b9 }
            if (r2 != 0) goto L_0x01b7
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01bb
        L_0x01b7:
            r2 = 1
            goto L_0x01bc
        L_0x01b9:
            r0 = move-exception
            goto L_0x01f1
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            if (r6 == 0) goto L_0x01c5
            boolean r5 = r1.f38973b     // Catch:{ Exception -> 0x01b9 }
            if (r5 == r7) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r5 = 0
            goto L_0x01cc
        L_0x01c5:
            if (r6 != 0) goto L_0x01d7
            boolean r5 = r1.f38973b     // Catch:{ Exception -> 0x01b9 }
            if (r5 != 0) goto L_0x01d7
            goto L_0x01c3
        L_0x01cc:
            com.google.android.gms.internal.ads.ni r0 = com.google.android.gms.internal.ads.C7980ni.m35163a(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x01d5 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x025a
        L_0x01d5:
            r0 = move-exception
            goto L_0x01f2
        L_0x01d7:
            r5 = 0
            if (r6 != 0) goto L_0x025a
            if (r7 == 0) goto L_0x025a
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r7 = r7.concat(r11)     // Catch:{ Exception -> 0x01d5 }
            com.google.android.gms.internal.ads.ni r0 = com.google.android.gms.internal.ads.C7980ni.m35163a(r7, r4, r0, r2, r9)     // Catch:{ Exception -> 0x01d5 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d5 }
            return r3
        L_0x01ec:
            r0 = move-exception
            r16 = r5
            r17 = r9
        L_0x01f1:
            r5 = 0
        L_0x01f2:
            int r2 = com.google.android.gms.internal.ads.C7836jm.f33934a     // Catch:{ Exception -> 0x0270 }
            r7 = 23
            java.lang.String r9 = "MediaCodecUtil"
            if (r2 > r7) goto L_0x0224
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x0270 }
            if (r2 != 0) goto L_0x0224
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0270 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0270 }
            int r0 = r0 + 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0270 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = "Skipping codec "
            r2.append(r0)     // Catch:{ Exception -> 0x0270 }
            r2.append(r10)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = " (failed to query capabilities)"
            r2.append(r0)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0270 }
            android.util.Log.e(r9, r0)     // Catch:{ Exception -> 0x0270 }
            goto L_0x025a
        L_0x0224:
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0270 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0270 }
            int r1 = r1 + 25
            int r2 = r15.length()     // Catch:{ Exception -> 0x0270 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0270 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x0270 }
            r2.append(r10)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x0270 }
            r2.append(r15)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0270 }
            android.util.Log.e(r9, r1)     // Catch:{ Exception -> 0x0270 }
            throw r0     // Catch:{ Exception -> 0x0270 }
        L_0x0255:
            r16 = r5
            r17 = r9
            r5 = 0
        L_0x025a:
            int r14 = r14 + 1
            r2 = r19
            r5 = r16
            r9 = r17
            goto L_0x0178
        L_0x0264:
            r16 = r5
            r5 = 0
            int r8 = r8 + 1
            r2 = r19
            r5 = r16
            goto L_0x0014
        L_0x026f:
            return r3
        L_0x0270:
            r0 = move-exception
            com.google.android.gms.internal.ads.ui r1 = new com.google.android.gms.internal.ads.ui
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x0279
        L_0x0278:
            throw r1
        L_0x0279:
            goto L_0x0278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8407zi.m40357e(com.google.android.gms.internal.ads.si, com.google.android.gms.internal.ads.vi):java.util.List");
    }
}
