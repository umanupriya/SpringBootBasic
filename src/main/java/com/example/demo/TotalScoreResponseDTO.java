// This class id callded Model class

package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availabilityDate",
    "dueDate",
    "updatedAt",
    "pointsPossible",
    "courseSectionId",
    "status",
    "title",
    "assetId"
})
public class TotalScoreResponseDTO {

    @JsonProperty("availabilityDate")
    private Integer availabilityDate;
    @JsonProperty("dueDate")
    private Integer dueDate;
    @JsonProperty("updatedAt")
    private Integer updatedAt;
    @JsonProperty("pointsPossible")
    private Double pointsPossible;
    @JsonProperty("courseSectionId")
    private String courseSectionId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("title")
    private String title;
    @JsonProperty("assetId")
    private String assetId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("availabilityDate")
    public Integer getAvailabilityDate() {
        return availabilityDate;
    }

    @JsonProperty("availabilityDate")
    public void setAvailabilityDate(Integer availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    @JsonProperty("dueDate")
    public Integer getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(Integer dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("updatedAt")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("pointsPossible")
    public Double getPointsPossible() {
        return pointsPossible;
    }

    @JsonProperty("pointsPossible")
    public void setPointsPossible(Double pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    @JsonProperty("courseSectionId")
    public String getCourseSectionId() {
        return courseSectionId;
    }

    @JsonProperty("courseSectionId")
    public void setCourseSectionId(String courseSectionId) {
        this.courseSectionId = courseSectionId;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("assetId")
    public String getAssetId() {
        return assetId;
    }

    @JsonProperty("assetId")
    public void setAssetId(String assetId) {
        this.assetId = assetId;
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
