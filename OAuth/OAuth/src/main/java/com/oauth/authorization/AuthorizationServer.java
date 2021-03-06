package com.oauth.authorization;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {

	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
	    clients.inMemory()
	            .withClient("client").secret("{noop}pass")
	            .authorizedGrantTypes("authorization_code", "client_credentials", "password")
	            .scopes("all")
	            .redirectUris("http://localhost:8080/hello");
	}
}
