package com.tm.filedcl.domain.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tm
 * @since 2019-06-28
 */
public class ZipFileDcl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pk uuid
     */
	private Integer id;
	private String fydm;
    /**
     * 代码表：ts_dm:kind=’dataly’  01:TDH  （缺省）其他待扩
     */
	private String ly;
    /**
     * 代码表：ts_dm:kind=’datalb’
     */
	private String lb;
    /**
     * 代码表：ts_dm:kind=’datalx’ 分类统计用
     */
	private String lx;
    /**
     * 接收时间  （数据库入库时间）yyyyMMdd hh:mm:ss
     */
	private String jssj;
    /**
     * 基于文件名获取的数据生成时间，用于后续比较同一业务的报送时间先后顺序
     */
	private String wjsj;
    /**
     * 0:已接收（初值）1:已正常处理2.接收失败3:内容异常4:文件丢失
     */
	private String zt;
    /**
     * 数据来源表 来源哪个日表
     */
	private String tabmc;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}

	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}

	public String getLb() {
		return lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getJssj() {
		return jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public String getWjsj() {
		return wjsj;
	}

	public void setWjsj(String wjsj) {
		this.wjsj = wjsj;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getTabmc() {
		return tabmc;
	}

	public void setTabmc(String tabmc) {
		this.tabmc = tabmc;
	}

	@Override
	public String toString() {
		return "ZipFileDcl{" +
			", id=" + id +
			", fydm=" + fydm +
			", ly=" + ly +
			", lb=" + lb +
			", lx=" + lx +
			", jssj=" + jssj +
			", wjsj=" + wjsj +
			", zt=" + zt +
			", tabmc=" + tabmc +
			"}";
	}
}
