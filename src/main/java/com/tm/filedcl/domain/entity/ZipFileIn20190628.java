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
public class ZipFileIn20190628 implements Serializable {

    private static final long serialVersionUID = 1L;

	private String id;
	private String fydm;
    /**
     * 代码表：ts_dm:kind=’dataly’ 01:TDH  （缺省）其他待扩
     */
	private String ly;
    /**
     * 代表表：ts_dm:kind=’datalb’
     */
	private String lb;
    /**
     * 代码表：ts_dm:kind=’datalx’ 分类统计用
     */
	private String lx;
    /**
     * 写入库的时间 yyyyMMdd hh:mm:ss
     */
	private String jssj;
    /**
     * 基于文件名获取的数据生成时间，用于后续比较同一业务的报送时间先后顺序
     */
	private String wjsj;
    /**
     * 文件大小
     */
	private Integer wjdx;
    /**
     * 内含文件数量 文件处理（解压）时回写，缺省0，统计用
     */
	private Integer wjsl;
    /**
     * 0:已接收（初值） 1:已正常处理 2.接收失败3:内容异常4:文件丢失
     */
	private String zt;
    /**
     * 对应数据处理时间 yyyyMMdd hh:mm:ss
     */
	private String clsj;
    /**
     * 文件名（带扩展名）
     */
	private String wjmc;
    /**
     * 本地绝对路径 ftp相对路径
     */
	private String wjwz;
    /**
     * 1本地文件2 ftp3数据库4 hdfs
     */
	private Integer cffs;
    /**
     * 文件内容
     */
	private String nr;
    /**
     * 描述存储 ftp名称 hds标识等
     */
	private String bs;
    /**
     * 删除标志 释放物理空间
     */
	private String scbz;
    /**
     * 文件删除时间
     */
	private String wjscsj;
    /**
     * Md5校验信息
     */
	private String md5str;


	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Integer getWjdx() {
		return wjdx;
	}

	public void setWjdx(Integer wjdx) {
		this.wjdx = wjdx;
	}

	public Integer getWjsl() {
		return wjsl;
	}

	public void setWjsl(Integer wjsl) {
		this.wjsl = wjsl;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getClsj() {
		return clsj;
	}

	public void setClsj(String clsj) {
		this.clsj = clsj;
	}

	public String getWjmc() {
		return wjmc;
	}

	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}

	public String getWjwz() {
		return wjwz;
	}

	public void setWjwz(String wjwz) {
		this.wjwz = wjwz;
	}

	public Integer getCffs() {
		return cffs;
	}

	public void setCffs(Integer cffs) {
		this.cffs = cffs;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	public String getScbz() {
		return scbz;
	}

	public void setScbz(String scbz) {
		this.scbz = scbz;
	}

	public String getWjscsj() {
		return wjscsj;
	}

	public void setWjscsj(String wjscsj) {
		this.wjscsj = wjscsj;
	}

	public String getMd5str() {
		return md5str;
	}

	public void setMd5str(String md5str) {
		this.md5str = md5str;
	}

	@Override
	public String toString() {
		return "ZipFileIn20190628{" +
			", id=" + id +
			", fydm=" + fydm +
			", ly=" + ly +
			", lb=" + lb +
			", lx=" + lx +
			", jssj=" + jssj +
			", wjsj=" + wjsj +
			", wjdx=" + wjdx +
			", wjsl=" + wjsl +
			", zt=" + zt +
			", clsj=" + clsj +
			", wjmc=" + wjmc +
			", wjwz=" + wjwz +
			", cffs=" + cffs +
			", nr=" + nr +
			", bs=" + bs +
			", scbz=" + scbz +
			", wjscsj=" + wjscsj +
			", md5str=" + md5str +
			"}";
	}
}
