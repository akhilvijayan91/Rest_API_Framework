package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {
	RequestSpecification req;
	public RequestSpecification requestSpecification()
	{
	 req=new RequestSpecBuilder().setBaseUri("http://216.10.245.166/").addQueryParam("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
			setContentType(ContentType.JSON).build();
	 return req;
	}

}
