
package com.sreekanth.postalcode.controller.resource;

import com.fasterxml.jackson.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalCodeSearchResponse {

    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private Integer updated;
    @JsonProperty("title")
    private String title;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("source")
    private String source;
    @JsonProperty("org_type")
    private String orgType;
    @JsonProperty("org")
    @Valid
    private List<String> org = null;
    @JsonProperty("sector")
    @Valid
    private List<String> sector = null;
    @JsonProperty("visualizable")
    private String visualizable;
    @JsonProperty("index_name")
    private String indexName;
    @JsonProperty("catalog_uuid")
    private String catalogUuid;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("limit")
    private String limit;
    @JsonProperty("offset")
    private String offset;
    @JsonProperty("fields")
    @Valid
    private List<Field> fields = null;
    @JsonProperty("records")
    @Valid
    private List<Record> records = null;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public Integer getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("org_type")
    public String getOrgType() {
        return orgType;
    }

    @JsonProperty("org_type")
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @JsonProperty("org")
    public List<String> getOrg() {
        return org;
    }

    @JsonProperty("org")
    public void setOrg(List<String> org) {
        this.org = org;
    }

    @JsonProperty("sector")
    public List<String> getSector() {
        return sector;
    }

    @JsonProperty("sector")
    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    @JsonProperty("visualizable")
    public String getVisualizable() {
        return visualizable;
    }

    @JsonProperty("visualizable")
    public void setVisualizable(String visualizable) {
        this.visualizable = visualizable;
    }

    @JsonProperty("index_name")
    public String getIndexName() {
        return indexName;
    }

    @JsonProperty("index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @JsonProperty("catalog_uuid")
    public String getCatalogUuid() {
        return catalogUuid;
    }

    @JsonProperty("catalog_uuid")
    public void setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("limit")
    public String getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public String getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(String offset) {
        this.offset = offset;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @JsonProperty("records")
    public List<Record> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
