package uk.co.mruoc.lambda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class ScheduledEventRequest {

    private String account = EMPTY;
    private String region = EMPTY;
    private Detail detail;
    private String detailType = EMPTY;
    private String source = EMPTY;
    private LocalDateTime time;
    private String id = EMPTY;
    private List<String> resources = new ArrayList<>();

    public String getAccount() {
        return account;
    }

    public String getRegion() {
        return region;
    }

    public Detail getDetail() {
        return detail;
    }

    public String getDetailType() {
        return detailType;
    }

    public String getSource() {
        return source;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getId() {
        return id;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

}
