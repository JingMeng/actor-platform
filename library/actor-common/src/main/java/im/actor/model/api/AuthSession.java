package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.model.droidkit.bser.Bser;
import im.actor.model.droidkit.bser.BserParser;
import im.actor.model.droidkit.bser.BserObject;
import im.actor.model.droidkit.bser.BserValues;
import im.actor.model.droidkit.bser.BserWriter;
import im.actor.model.droidkit.bser.DataInput;
import im.actor.model.droidkit.bser.DataOutput;
import im.actor.model.droidkit.bser.util.SparseArray;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import static im.actor.model.droidkit.bser.Utils.*;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;

public class AuthSession extends BserObject {

    private int id;
    private AuthHolder authHolder;
    private int appId;
    private String appTitle;
    private String deviceTitle;
    private int authTime;
    private String authLocation;
    private Double latitude;
    private Double longitude;

    public AuthSession(int id, @NotNull AuthHolder authHolder, int appId, @NotNull String appTitle, @NotNull String deviceTitle, int authTime, @NotNull String authLocation, @Nullable Double latitude, @Nullable Double longitude) {
        this.id = id;
        this.authHolder = authHolder;
        this.appId = appId;
        this.appTitle = appTitle;
        this.deviceTitle = deviceTitle;
        this.authTime = authTime;
        this.authLocation = authLocation;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public AuthSession() {

    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public AuthHolder getAuthHolder() {
        return this.authHolder;
    }

    public int getAppId() {
        return this.appId;
    }

    @NotNull
    public String getAppTitle() {
        return this.appTitle;
    }

    @NotNull
    public String getDeviceTitle() {
        return this.deviceTitle;
    }

    public int getAuthTime() {
        return this.authTime;
    }

    @NotNull
    public String getAuthLocation() {
        return this.authLocation;
    }

    @Nullable
    public Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public Double getLongitude() {
        return this.longitude;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.id = values.getInt(1);
        this.authHolder = AuthHolder.parse(values.getInt(2));
        this.appId = values.getInt(3);
        this.appTitle = values.getString(4);
        this.deviceTitle = values.getString(5);
        this.authTime = values.getInt(6);
        this.authLocation = values.getString(7);
        this.latitude = values.optDouble(8);
        this.longitude = values.optDouble(9);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.id);
        if (this.authHolder == null) {
            throw new IOException();
        }
        writer.writeInt(2, this.authHolder.getValue());
        writer.writeInt(3, this.appId);
        if (this.appTitle == null) {
            throw new IOException();
        }
        writer.writeString(4, this.appTitle);
        if (this.deviceTitle == null) {
            throw new IOException();
        }
        writer.writeString(5, this.deviceTitle);
        writer.writeInt(6, this.authTime);
        if (this.authLocation == null) {
            throw new IOException();
        }
        writer.writeString(7, this.authLocation);
        if (this.latitude != null) {
            writer.writeDouble(8, this.latitude);
        }
        if (this.longitude != null) {
            writer.writeDouble(9, this.longitude);
        }
    }

    @Override
    public String toString() {
        String res = "struct AuthSession{";
        res += "id=" + this.id;
        res += ", authHolder=" + this.authHolder;
        res += ", appId=" + this.appId;
        res += ", appTitle=" + this.appTitle;
        res += ", deviceTitle=" + this.deviceTitle;
        res += ", authTime=" + this.authTime;
        res += "}";
        return res;
    }

}
