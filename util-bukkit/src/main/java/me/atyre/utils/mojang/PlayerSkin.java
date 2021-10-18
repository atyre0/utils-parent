package me.atyre.utils.mojang;

import lombok.Getter;

public class PlayerSkin {
    @Getter private final String playerName;
    @Getter private String textureValue;
    @Getter private String signatureValue;

    public PlayerSkin(String playerName) {
        this.playerName = playerName;

        String uuidString = MojangUtil.getUUID(playerName);

        if (uuidString != null) {
            this.textureValue = MojangUtil.getTextureValueOfUUID(uuidString);
            this.signatureValue = MojangUtil.getSignatureOfUUID(uuidString);
        } else {
            this.textureValue = null;
            this.signatureValue = null;
        }
    }
}
