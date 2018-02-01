package org.yunyisite.domain;

import java.util.Date;

public class Attachfile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.Id
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.AttachName
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String attachname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.StoreLocation
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String storelocation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.Type
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.ResourceId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String resourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.DownloadCount
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private Long downloadcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.CreateTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.Definition1
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String definition1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AttachFile.Definition2
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    private String definition2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.Id
     *
     * @return the value of AttachFile.Id
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.Id
     *
     * @param id the value for AttachFile.Id
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.AttachName
     *
     * @return the value of AttachFile.AttachName
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getAttachname() {
        return attachname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.AttachName
     *
     * @param attachname the value for AttachFile.AttachName
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setAttachname(String attachname) {
        this.attachname = attachname == null ? null : attachname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.StoreLocation
     *
     * @return the value of AttachFile.StoreLocation
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getStorelocation() {
        return storelocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.StoreLocation
     *
     * @param storelocation the value for AttachFile.StoreLocation
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setStorelocation(String storelocation) {
        this.storelocation = storelocation == null ? null : storelocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.Type
     *
     * @return the value of AttachFile.Type
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.Type
     *
     * @param type the value for AttachFile.Type
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.ResourceId
     *
     * @return the value of AttachFile.ResourceId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getResourceid() {
        return resourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.ResourceId
     *
     * @param resourceid the value for AttachFile.ResourceId
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.DownloadCount
     *
     * @return the value of AttachFile.DownloadCount
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Long getDownloadcount() {
        return downloadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.DownloadCount
     *
     * @param downloadcount the value for AttachFile.DownloadCount
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setDownloadcount(Long downloadcount) {
        this.downloadcount = downloadcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.CreateTime
     *
     * @return the value of AttachFile.CreateTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.CreateTime
     *
     * @param createtime the value for AttachFile.CreateTime
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.Definition1
     *
     * @return the value of AttachFile.Definition1
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getDefinition1() {
        return definition1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.Definition1
     *
     * @param definition1 the value for AttachFile.Definition1
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setDefinition1(String definition1) {
        this.definition1 = definition1 == null ? null : definition1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AttachFile.Definition2
     *
     * @return the value of AttachFile.Definition2
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public String getDefinition2() {
        return definition2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AttachFile.Definition2
     *
     * @param definition2 the value for AttachFile.Definition2
     *
     * @mbggenerated Mon Dec 18 16:24:35 CST 2017
     */
    public void setDefinition2(String definition2) {
        this.definition2 = definition2 == null ? null : definition2.trim();
    }
}