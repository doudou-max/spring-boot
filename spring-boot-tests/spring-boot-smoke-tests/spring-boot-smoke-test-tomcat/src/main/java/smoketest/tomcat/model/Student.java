package smoketest.tomcat.model;

/**
 * @author: doudou
 * @since: 2021-10-21
 */
public class Student {

	private Long id;

	private String name;

	private String happy;

	public Student() {
	}

	public Student(Long id, String name, String happy) {
		this.id = id;
		this.name = name;
		this.happy = happy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}
}
