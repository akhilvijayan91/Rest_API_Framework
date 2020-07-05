package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.Add_Place_API_RQ;
import pojo.Location_Child_Add_Place_RQ;

public class TestData_Builder {
	
	public Add_Place_API_RQ addPlaceAPIBuilder()
	{
		Add_Place_API_RQ addplace= new Add_Place_API_RQ();
		addplace.setAccuracy(80);
		addplace.setAddress("29, side layout, cohen 09");
		addplace.setLanguage("French-IN");
		addplace.setWebsite("http://google.com");
		addplace.setName("House of dead");
		addplace.setPhone_number("(+91) 983 893 3937");
		List<String> myList=new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shoe new");
		addplace.setTypes(myList);
		Location_Child_Add_Place_RQ loc=new Location_Child_Add_Place_RQ();
		loc.setLat(-38.383487);
		loc.setLng(30.427369);
		addplace.setLocation(loc);
		return addplace;
	}

}
