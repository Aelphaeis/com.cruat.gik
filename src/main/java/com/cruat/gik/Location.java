
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
    "itudeE7",
    "accuracy",
    "activity"
})
public class Location {

    @JsonProperty("timestampMs")
    private String timestampMs;
    @JsonProperty("latitudeE7")
    private Long latitudeE7;
    @JsonProperty("itudeE7")
    private Long itudeE7;
    @JsonProperty("accuracy")
    private Long accuracy;
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
    public Long getLatitudeE7() {
        return latitudeE7;
    }

    @JsonProperty("latitudeE7")
    public void setLatitudeE7(Long latitudeE7) {
        this.latitudeE7 = latitudeE7;
    }

    @JsonProperty("itudeE7")
    public Long getitudeE7() {
        return itudeE7;
    }

    @JsonProperty("itudeE7")
    public void setitudeE7(Long itudeE7) {
        this.itudeE7 = itudeE7;
    }

    @JsonProperty("accuracy")
    public Long getAccuracy() {
        return accuracy;
    }

    @JsonProperty("accuracy")
    public void setAccuracy(Long accuracy) {
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
