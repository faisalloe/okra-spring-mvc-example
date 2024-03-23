# okta-spring-mvc-example
Okta spring mvc login using OIDC
Simple Spring MVC + Spring Security to configure Okta authentication
#Okta Dev account

# Go the following link and create free okta developer account

https://dev-77520048-admin.okta.com/admin/getting-started

Create okta application with OIDC Authentication.
Client Credentials > Client Authentication > ✓ Client secret
Grant type > Client acting on behalf of itself ✓ Client credentials

Retrieve your client id, client secret, issuer uri and put it in applicaiton.properties

# Add your application urls in okta application configuration.

sign-in redirect uri.
http://localhost:8080/okta-spring_mvc_example_war/login/oauth2/code/okta

sign-out redirect uri
http://localhost:8080/spring_mvc_example_war/

# Reference is taken from following url but example code is broken
https://developer.okta.com/blog/2018/09/12/secure-java-ee-rest-api