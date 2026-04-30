package academy;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	private static final String ACADEMY = "DSA";
	private static final int NUMBER = 14;
	private static int serialNum = 20261000;
	private String name;
	private int stdNum;
	private int java;
	private int database;
	private int web;
	private int sum;
	private double avg;
	
	public Student(String name, int java, int database, int web) {
		this.name = name;
		this.java = java;
		this.database = database;
		this.web = web;
		serialNum++;
		this.stdNum = serialNum;
		sum = java+database+web;
		this.avg = ((double)sum/3);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdNum() {
		return stdNum;
	}
	public int getJava() {
		return java;
	}
	public int getDatabase() {
		return database;
	}
	public int getWeb() {
		return web;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	
	public void edit(int j, int d, int w) {
		this.java = j;
		this.database = d;
		this.web = w;
		this.sum = java+database+web;
		this.avg = (sum/3);
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return stdNum == student.stdNum;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(stdNum);
	}
	
	
	@Override
	public String toString() {
		return String.format("[%s-%dth] 이름: %s, 학번: %d / 점수: JAVA(%3d), DB(%3d), WEB(%3d) / 총점(%d), 평균(%.1f)"
		,this.ACADEMY,this.NUMBER,this.name,this.stdNum,this.java,this.database,this.web,this.sum,this.avg);
	}
	
	@Override
	public int compareTo(Student s) {
		int result = s.name.compareTo(this.name);
		return result;
	}
}
