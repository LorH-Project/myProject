package org.demo.bedprojectbefore.pojo;

import java.util.Date;

public class sms_message {
    private int messageId;
    private String content;
    private String usersIds;
    private String phones;
    private Date ctime;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsersIds() {
        return usersIds;
    }

    public void setUsersIds(String usersIds) {
        this.usersIds = usersIds;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public sms_message() {
    }

    public sms_message(int messageId, String content, String usersIds, String phones, Date ctime) {
        this.messageId = messageId;
        this.content = content;
        this.usersIds = usersIds;
        this.phones = phones;
        this.ctime = ctime;
    }
}
