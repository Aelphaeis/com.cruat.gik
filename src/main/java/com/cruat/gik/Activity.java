
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
    "activity"
})
public class Activity {

    @JsonProperty("timestampMs")
    private String timestampMs;
    @JsonProperty("activity")
    private List<ActivityInfo> activity = new ArrayList<ActivityInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timestampMs")
    public String getTimestampMs() {
        return timestampMs;
    }

    @JsonProperty("timestampMs")
    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
    }

    @JsonProperty("activity")
    public List<ActivityInfo> getActivity() {
        return activity;
    }

    @JsonProperty("activity")
    public void setActivity(List<ActivityInfo> activity) {
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
