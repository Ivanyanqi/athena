package cn.ivan.athenamonitor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * @author yanqi
 * @date 2019-11-02 21:48
 */
@Configuration
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     *  参考官方文档配置
     */
    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
        successHandler.setTargetUrlParameter("redirectTo");
        httpSecurity.authorizeRequests()
                .antMatchers("/assets/**").permitAll()
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").successHandler(successHandler)
                .and().logout().logoutUrl("/logout")
                .and().httpBasic()
                .and().csrf().disable();
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                .ignoringAntMatchers("/instances"); //不尽兴 csrf （跨站请求攻击）防御

    }
}
