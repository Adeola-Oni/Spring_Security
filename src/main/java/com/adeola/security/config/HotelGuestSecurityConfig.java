package com.adeola.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class HotelGuestSecurityConfig extends WebSecurityConfigurerAdapter{
	/**
	 *  /home     (does not require authentication)
	 *  /about    (does not require authentication)
	 *  /booking  (requires authentication)
	 *  /balance  (requires authentication)
	 */
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/balance").authenticated()
			.antMatchers("/booking").authenticated()
		    .antMatchers("/about").permitAll()
		    .antMatchers("/home").permitAll();
		http.formLogin();
		http.httpBasic();
		
	}
	
//	@Override 
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication()
//			.withUser("admin").password("6789").authorities("admin").and()
//			.withUser("Adeola").password("1234").authorities("read").and()
//			.passwordEncoder(NoOpPasswordEncoder.getInstance());
//	}

	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//		UserDetails userA = User.withUsername("admin").password("6789").authorities("admin").build();
//		UserDetails userB = User.withUsername("Adeola").password("1234").authorities("admin").build();
//		userDetailsService.createUser(userA);
//		userDetailsService.createUser(userB);
//		auth.userDetailsService(userDetailsService);
//	}
	
//	@Bean
//	public UserDetailsService userDetailsService(DataSource datasource) {
//		return new JdbcUserDetailsManager(datasource);
//	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}



