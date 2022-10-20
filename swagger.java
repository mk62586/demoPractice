class AddingLoop{
public static void main(String []args){
int num = 1;
for(int  i =1;i<=100;i++){
num+=i;
}

System.out.println("The sum value of number is "+num);
}
}


@Configuration
public class OpenApiSwaggerConfig {

	@Bean
	public OpenAPI springShopOpenAPI(
			@Value("${server.context-path}") String contextPath) {
		return new OpenAPI().addServersItem(new Server().url(contextPath))
				.info(new Info().title("Api Documentation").version("1.0"))
				.components(new Components().addSecuritySchemes("basicScheme",
						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")));
	}
	@Bean
	public ForwardedHeaderFilter forwardedHeaderFilter() {
		return new ForwardedHeaderFilter();
	  }
    }

<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.2.32</version>
		</dependency>