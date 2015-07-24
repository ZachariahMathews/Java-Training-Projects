package calculationdemo.util;

import java.util.List;

public class CalculationForm {

	public static String getCalculationForm(List<Calculation> cal){
		int i=0;
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Calculation</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Calculate:</h1>");
		sb.append("<form action=\"CalculationServlet\"></br>");
		sb.append("Number 1:<input type=\"text\" name=\"num1\" value=\"\"></br>");
		sb.append("Number 2:<input type=\"text\" name=\"num2\" value=\"\"></br>");
		sb.append("<select name=\"op\">");
		sb.append("<option value=\"+\">+</option>");
		sb.append("<option value=\"-\">-</option>");
		sb.append("<option value=\"*\">*</option>");
		sb.append("<option value=\"/\">/</option>");
		sb.append("</select>");
		sb.append("<input type=\"submit\" value=\"Calculate\">");
		sb.append("</form>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td>SNo</td>");
		sb.append("<td>Number 1</td>");
		sb.append("<td>number 2</td>");
		sb.append("<td>Operation</td>");
		sb.append("<td>Result</td>");
		sb.append("</tr>");
		if(cal!=null)
		for(Calculation c:cal){
			if(c!=null){
				
				sb.append("<tr>");
				sb.append("<td>"+(i++)+"</td>");
				sb.append("<td>"+c.getNum1()+"</td>");
				sb.append("<td>"+c.getNum2()+"</td>");
				sb.append("<td>"+c.getOp()+"</td>");
				sb.append("<td>"+c.getResult()+"</td>");
				sb.append("</tr>");
			}
		}
		sb.append("</table>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
}
