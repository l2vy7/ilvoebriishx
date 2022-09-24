package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C4979h;
import com.ironsource.sdk.p294h.C11715c;
import com.ironsource.sdk.p294h.C11717e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IronSourceStorageUtils {

    /* renamed from: a */
    private static C11717e f52482a;

    /* renamed from: a */
    private static void m51946a(File file) {
        if (file != null) {
            deleteFolder(m51947b(file).getPath());
        }
    }

    /* renamed from: b */
    private static File m51947b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("supersonicads");
        sb.append(str);
        return new File(sb.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        String name;
        Object c;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    Object c2 = m51948c(file2);
                    if (c2 instanceof JSONArray) {
                        name = "files";
                        c = m51948c(file2);
                    } else if (c2 instanceof JSONObject) {
                        name = file2.getName();
                        c = m51948c(file2);
                    }
                    jSONObject.put(name, c);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(C11715c cVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        if (cVar == null || !cVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = cVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject3 = new JSONObject();
        for (File path : listFiles) {
            C11715c cVar2 = new C11715c(path.getPath());
            if (cVar2.isFile()) {
                str = cVar2.getName();
                jSONObject2 = cVar2.mo45026a();
                if (jSONObject.has(str)) {
                    jSONObject2 = SDKUtils.mergeJSONObjects(jSONObject2, jSONObject.getJSONObject(str));
                }
            } else if (cVar2.isDirectory()) {
                str = cVar2.getName();
                jSONObject2 = buildFilesMapOfDirectory(cVar2, jSONObject);
            }
            jSONObject3.put(str, jSONObject2);
        }
        return jSONObject3;
    }

    /* renamed from: c */
    private static Object m51948c(File file) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObject.put(file2.getName(), m51948c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObject.put("files", jSONArray);
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCacheDirectories(Context context) {
        m51946a(C4979h.m22826s(context));
        m51946a(C4979h.m22829u(context));
    }

    public static synchronized boolean deleteFile(C11715c cVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (!cVar.exists()) {
                return false;
            }
            boolean delete = cVar.delete();
            return delete;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        m51946a(C4979h.m22827t(context));
        m51946a(C4979h.m22830v(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            z = deleteFolderContentRecursive(file) && file.delete();
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        if (SDKUtils.isExternalStorageAvailable()) {
            C11717e eVar = f52482a;
            File t = (eVar == null || !eVar.mo45033a()) ? C4979h.m22827t(context) : C4979h.m22826s(context);
            if (t != null && t.canWrite()) {
                return t.getPath();
            }
        }
        C11717e eVar2 = f52482a;
        return ((eVar2 == null || !eVar2.mo45033a()) ? C4979h.m22830v(context) : C4979h.m22829u(context)).getPath();
    }

    public static ArrayList<C11715c> getFilesInFolderRecursive(C11715c cVar) {
        if (cVar == null || !cVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<C11715c> arrayList = new ArrayList<>();
        File[] listFiles = cVar.listFiles();
        if (listFiles != null) {
            for (File path : listFiles) {
                C11715c cVar2 = new C11715c(path.getPath());
                if (cVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(cVar2));
                }
                if (cVar2.isFile()) {
                    arrayList.add(cVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b = m51947b(new File(getDiskCacheDirPath(context)));
        if (!b.exists()) {
            b.mkdir();
        }
        return b.getPath();
    }

    public static long getTotalSizeOfDir(C11715c cVar) {
        long totalSizeOfDir;
        long j = 0;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File path : listFiles) {
                C11715c cVar2 = new C11715c(path.getPath());
                if (cVar2.isFile()) {
                    totalSizeOfDir = cVar2.length();
                } else if (cVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(cVar2);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, C11717e eVar) {
        f52482a = eVar;
        if (eVar != null && eVar.f52437a.optBoolean("deleteCacheDir", false)) {
            deleteCacheDirectories(context);
        }
        C11717e eVar2 = f52482a;
        if (eVar2 != null && eVar2.f52437a.optBoolean("deleteFilesDir", false)) {
            deleteFilesDirectories(context);
        }
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(C11715c cVar) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(10);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
