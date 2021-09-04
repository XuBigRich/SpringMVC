package vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private BigDecimal eid;
	private String ename;
	private String sex;
	private Date hire;
	private Double sar;
	private BigDecimal did;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String ename, String sex, Date hire, Double sar, BigDecimal did) {
		this.ename = ename;
		this.sex = sex;
		this.hire = hire;
		this.sar = sar;
		this.did = did;
	}

	// Property accessors

	public BigDecimal getEid() {
		return this.eid;
	}

	public void setEid(BigDecimal eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getHire() {
		return this.hire;
	}

	public void setHire(Date hire) {
		this.hire = hire;
	}

	public Double getSar() {
		return this.sar;
	}

	public void setSar(Double sar) {
		this.sar = sar;
	}

	public BigDecimal getDid() {
		return this.did;
	}

	public void setDid(BigDecimal did) {
		this.did = did;
	}

}