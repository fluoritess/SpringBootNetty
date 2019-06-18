package com.example.springbootnetty.po;

import java.util.Date;

public class friendsRequest {
    private String id;

    private String sendUserId;

    private String acceptUserId;

    private Date requestDateTime;

    public friendsRequest(String id, String sendUserId, String acceptUserId, Date requestDateTime) {
        this.id = id;
        this.sendUserId = sendUserId;
        this.acceptUserId = acceptUserId;
        this.requestDateTime = requestDateTime;
    }

    public friendsRequest() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId == null ? null : acceptUserId.trim();
    }

    public Date getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
    }
}