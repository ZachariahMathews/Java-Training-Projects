package calculationdemo.util;

import java.util.List;

public class CalculationForm {

	public static String getCalculationForm(int num1,int num2){
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Calculation</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Calculate:</h1>");
		sb.append("<form action=\"CalculationServlet\"></br>");
		sb.append("Number 1:<input type=\"text\" name=\"num1\" value=\""+num1+"\"></br>");
		sb.append("Number 2:<input type=\"text\" name=\"num2\" value=\""+num2+"\"></br>");
		sb.append("<select name=\"op\">");
		sb.append("<option value=\"+\">+</option>");
		sb.append("<option value=\"-\">-</option>");
		sb.append("<option value=\"*\">*</option>");
		sb.append("<option value=\"/\">/</option>");
		sb.append("</select>");
		sb.append("<input type=\"submit\" value=\"Calculate\">");
		sb.append("</form>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
}
