package am.concur.users.users.configuration;

import feign.Contract;
import feign.Logger;
import feign.Request;
import feign.Response;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.StringWriter;

@Configuration
public class FeignConfiguration {
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    Encoder feignFormEncoder(ObjectFactory converters) {
        return new SpringFormEncoder(new SpringEncoder(converters));
    }

    @Bean
    public  Logger logger()  {
        return new FeignLogger();
    }

    @Bean
    public Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
}


class FeignLogger extends Logger {

    private org.apache.logging.log4j.Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void log(String s, String s1, Object... objects) {

    }

    @Override
    protected Response logAndRebufferResponse(String configKey, Level logLevel, Response response, long elapsedTime) throws IOException {
        Response responseClient = super.logAndRebufferResponse(configKey, logLevel, response, elapsedTime);
        Request requestClient=responseClient.request();
        StringWriter writer = new StringWriter();
        IOUtils.copy(responseClient.body().asInputStream(), writer, "UTF-8");
        String responses=writer.toString();
        logger.info("--CONNECTION-CONCUR-USERS-MS -- Request: [ httpMethod: [{}] - url: [{}] body: [{}] headers: [{}] ] -- Response [ status: [{}] - body: [{}] ]",
                requestClient.httpMethod().name(), requestClient.url(),  requestClient.body(), requestClient.headers(), responseClient.status(), responses);
        return responseClient;
    }
}


