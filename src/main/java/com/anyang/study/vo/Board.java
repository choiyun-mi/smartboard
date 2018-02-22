package com.anyang.study.vo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bno;
    String title;
    String content;
    User user;
    Date regDate;
    Date modifyDate;
    int viewCnt;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", regDate=" + regDate +
                ", modifyDate=" + modifyDate +
                ", viewCnt=" + viewCnt +
                '}';
    }
}
