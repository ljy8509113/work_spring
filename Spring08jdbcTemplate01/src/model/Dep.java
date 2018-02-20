package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dep implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deptno;
	private String dname;
	private String loc;
	private List<Emp> employeeList = new ArrayList<>();
	
	public Dep() {
	}
	
	public Dep(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Emp> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptno == null) ? 0 : deptno.hashCode());
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((employeeList == null) ? 0 : employeeList.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Dep other = (Dep) obj;
		if(this.deptno != null && other.deptno == this.deptno)
			return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dep [deptno=");
		builder.append(deptno);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", loc=");
		builder.append(loc);
		builder.append(", employeeList=");
		builder.append(employeeList);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
