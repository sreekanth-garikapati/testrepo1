
package com.sreekanth.postalcode.controller.resource;

import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Record {

    @JsonProperty("officename")
    private String officename;
    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("officetype")
    private String officetype;
    @JsonProperty("deliverystatus")
    private String deliverystatus;
    @JsonProperty("divisionname")
    private String divisionname;
    @JsonProperty("regionname")
    private String regionname;
    @JsonProperty("circlename")
    private String circlename;
    @JsonProperty("taluk")
    private String taluk;
    @JsonProperty("districtname")
    private String districtname;
    @JsonProperty("statename")
    private String statename;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("officename")
    public String getOfficename() {
        return officename;
    }

    @JsonProperty("officename")
    public void setOfficename(String officename) {
        this.officename = officename;
    }

    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @JsonProperty("officetype")
    public String getOfficetype() {
        return officetype;
    }

    @JsonProperty("officetype")
    public void setOfficetype(String officetype) {
        this.officetype = officetype;
    }

    @JsonProperty("deliverystatus")
    public String getDeliverystatus() {
        return deliverystatus;
    }

    @JsonProperty("deliverystatus")
    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    @JsonProperty("divisionname")
    public String getDivisionname() {
        return divisionname;
    }

    @JsonProperty("divisionname")
    public void setDivisionname(String divisionname) {
        this.divisionname = divisionname;
    }

    @JsonProperty("regionname")
    public String getRegionname() {
        return regionname;
    }

    @JsonProperty("regionname")
    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    @JsonProperty("circlename")
    public String getCirclename() {
        return circlename;
    }

    @JsonProperty("circlename")
    public void setCirclename(String circlename) {
        this.circlename = circlename;
    }

    @JsonProperty("taluk")
    public String getTaluk() {
        return taluk;
    }

    @JsonProperty("taluk")
    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    @JsonProperty("districtname")
    public String getDistrictname() {
        return districtname;
    }

    @JsonProperty("districtname")
    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    @JsonProperty("statename")
    public String getStatename() {
        return statename;
    }

    @JsonProperty("statename")
    public void setStatename(String statename) {
        this.statename = statename;
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
