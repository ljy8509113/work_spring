package model;

public class Job {
	private String jobId;
	private String jobTitle;
	private Integer minSalary;
	private Integer maxSalary;
	
	public Job() {
		
	}
	
	public Job(String jobId, String jobTitle, Integer minSalary, Integer maxSalary) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Integer getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}
	public Integer getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((maxSalary == null) ? 0 : maxSalary.hashCode());
		result = prime * result + ((minSalary == null) ? 0 : minSalary.hashCode());
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
		Job other = (Job) obj;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (maxSalary == null) {
			if (other.maxSalary != null)
				return false;
		} else if (!maxSalary.equals(other.maxSalary))
			return false;
		if (minSalary == null) {
			if (other.minSalary != null)
				return false;
		} else if (!minSalary.equals(other.minSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Job [jobId=");
		builder.append(jobId);
		builder.append(", jobTitle=");
		builder.append(jobTitle);
		builder.append(", minSalary=");
		builder.append(minSalary);
		builder.append(", maxSalary=");
		builder.append(maxSalary);
		builder.append("]");
		return builder.toString();
	}
	
	
}
