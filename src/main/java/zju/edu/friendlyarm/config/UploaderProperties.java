package zju.edu.friendlyarm.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Ma on 20191209
 */
@Data
@ConfigurationProperties("uploader")
public class UploaderProperties {

    private String copyImagesTo;

    private String cronExpression;
}
