package ar.carlosarielpaz.Portfolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "education")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED", nullable = false)
	private Integer id;

	@Column(name = "institute", length = 50, nullable = false)
	private String institute;

	@Column(name = "title", length = 50, nullable = false)
	private String title;

	@Column(name = "description", length = 255, nullable = false)
	private String description;

	@Column(name = "period", length = 50, nullable = false)
	private String period;

	@Column(name = "image", length = 255, nullable = false)
	private String image;

	public Education() {
	}

	public Education(Integer id, String institute, String title, String description, String period, String image) {
		super();
		this.id = id;
		this.institute = institute;
		this.title = title;
		this.description = description;
		this.period = period;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}