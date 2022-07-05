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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.StringWriter;

//@Configuration
//@Qualifier("FeignConfigurationAuth")
public class FeignConfigurationAuth{
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;


    @Bean
    public Contract useFeignAnnotations() {
        return new Contract.Default();
    }
}

