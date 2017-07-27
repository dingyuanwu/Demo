package wdy.album.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyHabits扫描接口
 * @author dingyuan
 *
 */
@Configuration
@AutoConfigureAfter(MyHabitsConfig.class)
public class MyHabitsMapperScannerConfig {

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("wdy.album.mapper");
		return mapperScannerConfigurer;
	}
}
