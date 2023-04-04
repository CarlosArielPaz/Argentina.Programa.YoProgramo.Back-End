package ar.carlosarielpaz.Portfolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT UNSIGNED", nullable = false)
	private Integer id;

	@Column(name = "username", length = 50, nullable = false)
	private String username;

	@Column(name = "password", length = 50, nullable = false)
	private String password;

	@Column(name = "name", length = 50, nullable = false)
	private String name;

	@Column(name = "description", length = 255, nullable = false)
	private String description;

	@Column(name = "web", length = 255, nullable = false)
	private String web;

	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "version", length = 50, nullable = false)
	private String version;

	@Column(name = "imageProfile", length = 255, nullable = false)
	private String imageProfile;

	@Column(name = "imageBackground", length = 255, nullable = false)
	private String imageBackground;

	public User() {
	}

	public User(Integer id, String name, String description, String web, String email, String version,
			String imageProfile, String imageBackground) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.web = web;
		this.email = email;
		this.version = version;
		this.imageProfile = imageProfile;
		this.imageBackground = imageBackground;
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

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getImageProfile() {
		return imageProfile;
	}

	public void setImageProfile(String imageProfile) {
		this.imageProfile = imageProfile;
	}

	public String getImageBackground() {
		return imageBackground;
	}

	public void setImageBackground(String imageBackground) {
		this.imageBackground = imageBackground;
	}
}