
package com.cruat.gik.parser;

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
    "activityInfo"
})
public class Activity {

    @JsonProperty("timestampMs")
    private String timestampMs;
    @JsonProperty("activityInfo")
    private List<ActivityInfo> activityInfo = new ArrayList<>();
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

    @JsonProperty("activityInfo")
    public List<ActivityInfo> getActivityInfo() {
        return activityInfo;
    }

    @JsonProperty("activityInfo")
    public void setActivityInfo(List<ActivityInfo> activity) {
        this.activityInfo = activity;
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
