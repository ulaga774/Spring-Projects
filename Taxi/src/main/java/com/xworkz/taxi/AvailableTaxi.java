package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(value = "/find")
public class AvailableTaxi extends HttpServlet {
	
	TaxiDto dto = new TaxiDto();
	TaxiService service = new TaxiServiceImpl();
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();	
		writer.println("-------------------------------ReadAll------------------------------------");
		writer.println("<!DOCTYPE html>\r\n"
                + "<html lang=\"en\">\r\n"
                + "<head>\r\n"
                + "  <meta charset=\"UTF-8\">\r\n"
                + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
                + "  <title>Document</title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <form action=\"find\" method=\"get\">\r\n"
                + "        <table>\r\n"
                + "            <tr>\r\n"
                + "              <th>Taxi ID</th>\r\n"
                + "              <th>TaxiNo</th>\r\n"
                + "              <th>Location</th>\r\n"
                +"  			 <th>Earnings</th>\r\n "
                +"<th>NoOfTrips</th>\r\n"
                +"<th>Available</th>\r\n"
                + "            </tr>");

        List<TaxiDto> read = service.readAll();
        
        for (TaxiDto dtos : read) {
            writer.println("            <tr>");
            writer.println("              <td>" + dtos.getId() + "</td>");
            writer.println("              <td>" + dtos.getTaxiNo() + "</td>");
            writer.println("              <td>" + dtos.getLocation() + "</td>");
            writer.println("              <td>" + dtos.getEarnings() + "</td>");
            writer.println("              <td>" + dtos.getNoOfTrips() + "</td>");
            writer.println("              <td>" + dtos.isAvailable() + "</td>");
            writer.println("            </tr>");
        }

        writer.println("          </table>\r\n"
                + "    </form>\r\n"
                + "</body>\r\n"
                + "</html>");
		
//		writer.println("----------Read All---------------");
//		List<TaxiDto> read = service.readAll();
//		for (TaxiDto dtos : read) {
//			writer.println(dtos);
//
//		}
		writer.println("-------------------------------Available------------------------------------");
		writer.println("<!DOCTYPE html>\r\n"
                + "<html lang=\"en\">\r\n"
                + "<head>\r\n"
                + "  <meta charset=\"UTF-8\">\r\n"
                + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
                + "  <title>Document</title>\r\n"
                + "</head>\r\n"
                + "<body>\r\n"
                + "    <form action=\"find\" method=\"get\">\r\n"
                + "        <table>\r\n"
                + "            <tr>\r\n"
                + "              <th>Taxi ID</th>\r\n"
                + "              <th>TaxiNo</th>\r\n"
                + "              <th>Location</th>\r\n"
                +"  			 <th>Earnings</th>\r\n "
                +"<th>NoOfTrips</th>\r\n"
                +"<th>Available</th>\r\n"
                + "            </tr>");
		
	

        List<TaxiDto> found = service.findAllTaxiIsAvailable();
       
        	for (TaxiDto dtos : found) {
        		 if(dtos.isAvailable() == true) {
                writer.println("            <tr>");
                writer.println("              <td>" + dtos.getId() + "</td>");
                writer.println("              <td>" + dtos.getTaxiNo() + "</td>");
                writer.println("              <td>" + dtos.getLocation() + "</td>");
                writer.println("              <td>" + dtos.getEarnings() + "</td>");
                writer.println("              <td>" + dtos.getNoOfTrips() + "</td>");
                writer.println("              <td>" + dtos.isAvailable() + "</td>");
                writer.println("            </tr>");
            }	
        
        	
        }

        writer.println("          </table>\r\n"
                + "    </form>\r\n"
                + "</body>\r\n"
                + "</html>");
        
        
        req.getRequestDispatcher("/book.jsp").forward(req, resp);
//		List<TaxiDto> find = service.findAllTaxiIsAvailable();
//		for (TaxiDto taxiDto : find) {
//			if (taxiDto.isAvailable() == true) {
//				writer.println(taxiDto);
//
//			}
//			if (taxiDto.isAvailable() == false) {
//				System.out.println("-------------------------this flase------------");
//				writer.println(taxiDto);
//			}
//
//		}

	}

}
