package org.Baseclass;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;







public class ReportBaseClass 
{
	
	public static  void Jsonreport(String Json) 
	{
      File f = new File("C:\\Users\\sures\\eclipse-workspace\\workspace2\\CucumberBDD01\\Reports");
      Configuration con = new Configuration(f, "CucumberBDD01");
      con.addClassifications("Browser", "chrome");
      con.addClassifications("platform", "windows");
      con.addClassifications("bulid", "Adactian");
      
      
      List<String> li = new ArrayList<String>();
      li.add(Json);
      ReportBuilder re = new ReportBuilder(li, con);
      re.generateReports();
       
 
      
      
	}

}
