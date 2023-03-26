package ar.carlosarielpaz.Portfolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED", nullable = false)
	private Integer id;

	@Column(name = "title", length = 50, nullable = false)
	private String title;

	@Column(name = "percentage", columnDefinition = "TINYINT UNSIGNED", nullable = false)
	private Integer percentage;

	@Column(name = "image", length = 255, nullable = false)
	private String image;

	public Skill() {
	}

	public Skill(Integer id, String title, Integer percentage, String image) {
		this.id = id;
		this.title = title;
		this.percentage = percentage;
		this.image = image;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}