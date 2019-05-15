package cn.sarariman.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity  //启动SpringSecurity过滤器链
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    //该方法的作用就是代替之前配置：<security:authentication-manager>
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("eric").password("123456").authorities("PRODUCT_ADD","PRODUCT_UPDATE");
    }

    //该方法的作用就是代替之前配置：<security:http>
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/product/add").hasAuthority("PRODUCT_ADD")
                .antMatchers("/product/update").hasAuthority("PRODUCT_UPDATE")
                .antMatchers("/product/list").hasAuthority("PRODUCT_LIST")
                .antMatchers("/product/delete").hasAuthority("PRODUCT_DELETE")
                .antMatchers("/login").permitAll()
                .antMatchers("/**")
                .fullyAuthenticated()
                .and()
                .formLogin().loginPage("/login")
                .and()
                .csrf().disable();
    }
}
