package in.keepgrowing.springbootswaggeruibasicauth.shared.config.openapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "openapi")
@ConstructorBinding
@AllArgsConstructor
@Getter
public class OpenApiProperties {

    private final String projectTitle;
    private final String projectDescription;
    private final String projectVersion;
	public String getProjectTitle() {
		return projectTitle;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public String getProjectVersion() {
		return projectVersion;
	}
	public OpenApiProperties(String projectTitle, String projectDescription, String projectVersion) {
		super();
		this.projectTitle = projectTitle;
		this.projectDescription = projectDescription;
		this.projectVersion = projectVersion;
	}
	
}