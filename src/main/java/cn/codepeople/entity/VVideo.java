package cn.codepeople.entity;

import java.util.Date;

public class VVideo {
    private String id;

    private Date updateTime;

    private Date createtime;

    private String createuserid;

    private String updateuserid;

    private String createusername;

    private String updateusername;

    private Boolean deleted;

    private String videoname;

    private Boolean enabled;

    private Long sortnumber;

    private Boolean online;

    private String groupid;

    private String cameratype;

    private String encoderuuid;

    private String memo;

    private String typeid;

    private String typename;

    private String operatorshorthand;

    private Date faulttime;

    private Date reporttime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getUpdateusername() {
        return updateusername;
    }

    public void setUpdateusername(String updateusername) {
        this.updateusername = updateusername == null ? null : updateusername.trim();
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getSortnumber() {
        return sortnumber;
    }

    public void setSortnumber(Long sortnumber) {
        this.sortnumber = sortnumber;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getCameratype() {
        return cameratype;
    }

    public void setCameratype(String cameratype) {
        this.cameratype = cameratype == null ? null : cameratype.trim();
    }

    public String getEncoderuuid() {
        return encoderuuid;
    }

    public void setEncoderuuid(String encoderuuid) {
        this.encoderuuid = encoderuuid == null ? null : encoderuuid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getOperatorshorthand() {
        return operatorshorthand;
    }

    public void setOperatorshorthand(String operatorshorthand) {
        this.operatorshorthand = operatorshorthand == null ? null : operatorshorthand.trim();
    }

    public Date getFaulttime() {
        return faulttime;
    }

    public void setFaulttime(Date faulttime) {
        this.faulttime = faulttime;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }
}