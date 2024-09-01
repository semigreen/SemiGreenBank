package indi.wisdom.smbk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author wisdomking
 * @Date 2024/9/1
 */
@SpringBootApplication
public class SmbkApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SmbkApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SmbkApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
