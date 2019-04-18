
package com.cruat.gik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestampMs",
    "latitudeE7",
    "longitudeE7",
    "accuracy",
    "activity"
})
public class Location {

    @JsonProperty("timestampMs")
    private String timestampMs;
    @JsonProperty("latitudeE7")
    private Integer latitudeE7;
    @JsonProperty("longitudeE7")
    private Integer longitudeE7;
    @JsonProperty("accuracy")
    private Integer accuracy;
    @JsonProperty("activity")
    private List<Activity> activity = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("timestampMs")
    public String getTimestampMs() {
        return timestampMs;
    }

    @JsonProperty("timestampMs")
    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
    }

    @JsonProperty("latitudeE7")
    public Integer getLatitudeE7() {
        return latitudeE7;
    }

    @JsonProperty("latitudeE7")
    public void setLatitudeE7(Integer latitudeE7) {
        this.latitudeE7 = latitudeE7;
    }

    @JsonProperty("longitudeE7")
    public Integer getLongitudeE7() {
        return longitudeE7;
    }

    @JsonProperty("longitudeE7")
    public void setLongitudeE7(Integer longitudeE7) {
        this.longitudeE7 = longitudeE7;
    }

    @JsonProperty("accuracy")
    public Integer getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    @JsonProperty("activity")
    public List<Activity> getActivity() {
        return activity;
    }

    @JsonProperty("activity")
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
