package ar.carlosarielpaz.Portfolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED", nullable = false)
	private Integer id;

	@Column(name = "name", length = 50, nullable = false)
	private String name;

	@Column(name = "description", length = 255, nullable = false)
	private String description;

	@Column(name = "link", length = 255, nullable = false)
	private String link;

	@Column(name = "period", length = 50, nullable = false)
	private String period;

	@Column(name = "image", length = 255, nullable = false)
	private String image;

	public Project() {
	}

	public Project(Integer id, String name, String description, String link, String period, String image) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.link = link;
		this.period = period;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
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