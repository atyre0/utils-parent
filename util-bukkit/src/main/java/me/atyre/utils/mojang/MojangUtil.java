package me.atyre.utils.mojang;

import me.atyre.utils.RequestUtil;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class MojangUtil {
    public static String getUUID(String playerName) {
        String uuid = null;

        try {
            uuid = (String) RequestUtil.get(new URL("https://api.mojang.com/users/profiles/minecraft/" + playerName), "id");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return uuid;
    }

    public static UUID formatToUUID(String trimmedUUID) {
        StringBuilder uuid = new StringBuilder(trimmedUUID);

        try {
            uuid.insert(20, "-");
            uuid.insert(16, "-");
            uuid.insert(12, "-");
            uuid.insert(8, "-");
        } catch (StringIndexOutOfBoundsException e){
            throw new IllegalArgumentException();
        }

        return UUID.fromString(uuid.toString());
    }

    public static String getTextureValueOfUUID(String uuidString) {
        String textureValue = null;

        try {
            JSONArray array = (JSONArray) RequestUtil.get(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuidString + "?unsigned=false"), "properties");
            JSONObject object = array.getJSONObject(0);
            textureValue = object.getString("value");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return textureValue;
    }

    public static String getSignatureOfUUID(String uuidString) {
        String signature = null;

        try {
            JSONArray array = (JSONArray) RequestUtil.get(new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuidString + "?unsigned=false"), "properties");
            JSONObject object = array.getJSONObject(0);
            signature = object.getString("signature");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return signature;
    }
}
