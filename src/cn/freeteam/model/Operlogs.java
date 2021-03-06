package cn.freeteam.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operlogs implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operLogs.id
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    private String id;
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operLogs.loginName
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operLogs.operTime
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    private Date opertime;
    private String opertimeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operLogs.content
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operLogs.ip
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    private String ip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operLogs.id
     *
     * @return the value of operLogs.id
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operLogs.id
     *
     * @param id the value for operLogs.id
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operLogs.loginName
     *
     * @return the value of operLogs.loginName
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operLogs.loginName
     *
     * @param loginname the value for operLogs.loginName
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operLogs.operTime
     *
     * @return the value of operLogs.operTime
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public Date getOpertime() {
        return opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operLogs.operTime
     *
     * @param opertime the value for operLogs.operTime
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operLogs.content
     *
     * @return the value of operLogs.content
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operLogs.content
     *
     * @param content the value for operLogs.content
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operLogs.ip
     *
     * @return the value of operLogs.ip
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column operLogs.ip
     *
     * @param ip the value for operLogs.ip
     *
     * @mbggenerated Fri Dec 16 16:07:41 CST 2011
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

	public String getOpertimeStr() {
		if (opertime!=null) {
			return sdf.format(opertime);
		}
		return opertimeStr;
	}

	public void setOpertimeStr(String opertimeStr) {
		this.opertimeStr = opertimeStr;
	}
}